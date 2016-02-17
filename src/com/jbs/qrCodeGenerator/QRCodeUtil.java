package com.jbs.qrCodeGenerator;

public class QRCodeUtil {

	public static void createQRCodeWithLogo(String content,String imagePath,String logoPath,QRCodeType type){
		QRCodeInfo info = new QRCodeInfo();
		info.setContent(content);
		info.setEncodeMode(type.getEncodeMode());
		info.setErrorCorrect(type.getErrorCorrect());
		info.setVersion(type.getVersion());
		info.setZoom(type.getZoom());
		info.setImgPath(imagePath);
		info.setLogoPath(logoPath);
		
		QRCodeGenerator.createQRCode(info);
	}
	
	public static void createQRCodeWithoutLogo(String content,String imagePath,QRCodeNoLogoType type){
		QRCodeInfo info = new QRCodeInfo();
		info.setContent(content);
		info.setEncodeMode(type.getEncodeMode());
		info.setErrorCorrect(type.getErrorCorrect());
		info.setVersion(type.getVersion());
		info.setImgPath(imagePath);
		info.setLogoPath(null);
		
		QRCodeGenerator.createQRCode(info);
	}
	public static void main(String[] args) {
		String content = "http://www.eastall.com/zjddf/";
		String imagePath1 = "D:/二维码生成/test_s.png";
		String imagePath2 = "D:/二维码生成/test_d.png";
		String imagePath3 = "D:/二维码生成/test_l.png";
		String imagePath5 = "D:/二维码生成/test_l.png";
		String imagePath4 = "D:/二维码生成/test_n.png";
		String logoPath = "D:/二维码生成/jbs_logo2.jpg";
		String logoPath2 = "D:/二维码生成/qq_icon.jpg";
		QRCodeUtil.createQRCodeWithLogo(content, imagePath1, logoPath, QRCodeType.WITH_LOGO_SMALL);
		QRCodeUtil.createQRCodeWithLogo(content, imagePath2, logoPath, QRCodeType.DEFAULT);
		QRCodeUtil.createQRCodeWithLogo(content, imagePath3, logoPath, QRCodeType.WITH_LOGO_LARGE);
		QRCodeUtil.createQRCodeWithLogo(content, imagePath5, logoPath2, QRCodeType.DEFAULT);
		QRCodeUtil.createQRCodeWithoutLogo(content, imagePath4,QRCodeNoLogoType.DEFAULT);
		
		
	}
}
