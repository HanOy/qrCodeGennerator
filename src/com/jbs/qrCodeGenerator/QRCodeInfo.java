package com.jbs.qrCodeGenerator;

public class QRCodeInfo {
	//文本内容
	private String content;
	//生成的二维码路径
	private String imgPath;
	//LOGO文件的路径
	private String logoPath;
	//二维码的版本（尺寸）
	private int version;
	//二维码排错率
	private char errorCorrect;
	//字符
	private char encodeMode;
	//LOGO与二维码图片的放缩比（二维码宽度/LOGO宽度）
	private int zoom;
	
	public QRCodeInfo(){};
	
	
	
	public QRCodeInfo(String content, String imgPath, String logoPath,
			int version, char errorCorrect, char encodeMode, int zoom) {
		super();
		this.content = content;
		this.imgPath = imgPath;
		this.logoPath = logoPath;
		this.version = version;
		this.errorCorrect = errorCorrect;
		this.encodeMode = encodeMode;
		this.zoom = zoom;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public String getLogoPath() {
		return logoPath;
	}
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public char getErrorCorrect() {
		return errorCorrect;
	}
	public void setErrorCorrect(char errorCorrect) {
		this.errorCorrect = errorCorrect;
	}
	public char getEncodeMode() {
		return encodeMode;
	}
	public void setEncodeMode(char encodeMode) {
		this.encodeMode = encodeMode;
	}
	public int getZoom() {
		return zoom;
	}
	public void setZoom(int zoom) {
		this.zoom = zoom;
	}
}
