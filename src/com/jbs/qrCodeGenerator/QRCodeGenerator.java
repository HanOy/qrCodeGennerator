package com.jbs.qrCodeGenerator;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import com.swetake.util.Qrcode;

public class QRCodeGenerator {
 
    public static int createQRCode(QRCodeInfo info) {  
        try {  
        	Qrcode qrcodeHandler = new Qrcode();  
            //设置二维码排错率，可选L(7%)、M(15%)、Q(25%)、H(30%)，排错率越高可存储的信息越少，但对二维码清晰度的要求越小  
            qrcodeHandler.setQrcodeErrorCorrect(info.getErrorCorrect());  //M
            //N代表数字,A代表字符a-Z,B代表其他字符
            qrcodeHandler.setQrcodeEncodeMode(info.getEncodeMode()); //B
            // 设置设置二维码版本，取值范围1-40，值越大尺寸越大，可存储的信息越大  
            qrcodeHandler.setQrcodeVersion(info.getVersion()); 
            // 图片尺寸  
            int imgSize =67 + 12 * (info.getVersion() - 1) ;
  
            byte[] contentBytes = info.getContent().getBytes("UTF-8");  
            BufferedImage image = new BufferedImage(imgSize, imgSize, BufferedImage.TYPE_INT_RGB);  
            Graphics2D gs = image.createGraphics();  
  
            gs.setBackground(Color.WHITE);  
            gs.clearRect(0, 0, imgSize, imgSize);  
  
            // 设定图像颜色 > BLACK  
            gs.setColor(Color.BLACK);  
  
            // 设置偏移量 不设置可能导致解析出错  
            int pixoff = 2;  
            // 输出内容 > 二维码  
            if (contentBytes.length > 0 && contentBytes.length < 130) {
                boolean[][] codeOut = qrcodeHandler.calQrcode(contentBytes);
                for (int i = 0; i < codeOut.length; i++) {
                    for (int j = 0; j < codeOut.length; j++) {
                        if (codeOut[j][i]) {
                            gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
                        }
                    }
                }
            } else {  
                System.err.println("QRCode content bytes length = "  
                        + contentBytes.length + " not in [ 0,125]. ");  
                return -1;
            }  
            String logoPath = info.getLogoPath();
            if(logoPath != null && !logoPath.trim().equals("")){
	            Image logo = ImageIO.read(new File(logoPath));//实例化一个Image对象。
	            int zoom = info.getZoom();
	            int wLogo = logo.getWidth(null);
	            int hLogo = logo.getHeight(null);
	            int wImage = image.getWidth();
	            int hImage = image.getHeight();
	            int widthLogo = -1;
	            int heightLogo = -1;
	            //LOGO的宽大于高
	            if(wLogo>=hLogo){
	            	if(wLogo>(wImage*2/zoom)){
	            		widthLogo = wImage*2/zoom;
	            		heightLogo = hLogo*wImage*2/(zoom*wLogo);
	            	}else{
	            		widthLogo = wLogo;
	            		heightLogo = hLogo;
	            	}
	            //	widthLogo = wLogo>wImage*2/zoom?(wImage*2/zoom):wLogo;
	            //	heightLogo = hLogo>hImage*2/zoom?(hImage*2/zoom):hLogo;
	           	//--	heightLogo = logo.getHeight(null)>image.getHeight()*2/6?(image.getHeight()*2/6):logo.getWidth(null);
	            }else{
	            	if(hLogo>(hImage*2/zoom)){
	            		widthLogo = wLogo*(hImage*2/zoom)/hLogo;
	            		heightLogo = hImage*2/zoom;
	            	}else{
	            		widthLogo = wLogo;
	            		heightLogo = hLogo;
	            	}
	            	 
	            }
	   		   //logo放在中心
	            int x = (image.getWidth() - widthLogo) / 2;
	            int y = (image.getHeight() - heightLogo) / 2;
	            gs.drawImage(logo, x, y, widthLogo, heightLogo, null);
            }
            gs.dispose();  
            image.flush();  
  
            // 生成二维码QRCode图片  
       
            File imgFile = new File(info.getImgPath()); 
            if(!imgFile.exists()){
            	imgFile.createNewFile();
            }
            ImageIO.write(image, "png", imgFile);  
  
        } catch (Exception e) 
        {  
            e.printStackTrace();  
            return -100;
        }  
        
        return 0;
    }  


  /*  public static void main(String[] args) {
    String imgPath = "D:/二维码生成/logo_QRCode.png"; 
    String logoPath = "D:/二维码生成/jbs_logo2.jpg";
 //   String logoPath = null;
    String encoderContent = "http://www.eastall.com/zjddf/";
    CreateQRCode logo_Two_Code = new CreateQRCode();
    logo_Two_Code.createQRCode(encoderContent, imgPath, logoPath,8,'M','B');
    }*/
}