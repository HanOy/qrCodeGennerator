package com.jbs.qrCodeGenerator;

public enum QRCodeType {
	
	DEFAULT(8,'M','B',6),
	WITH_LOGO_LARGE(8,'M','B',4),
	WITH_LOGO_SMALL(8,'M','B',8);
	
	
	
	
	//二维码的版本（尺寸）
	private int version;
	//二维码排错率
	private char errorCorrect;
	//字符
	private char encodeMode;
	//LOGO与二维码图片的放缩比（二维码宽度/LOGO宽度）
	private int zoom;
	
	QRCodeType(){}
	
	private QRCodeType(int version, char errorCorrect, char encodeMode,int zoom) {
		this.version = version;
		this.errorCorrect = errorCorrect;
		this.encodeMode = encodeMode;
		this.zoom = zoom;
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
