package com.jbs.qrCodeGenerator;

public enum QRCodeType {
	
	DEFAULT(8,'M','B',6),
	WITH_LOGO_LARGE(8,'M','B',4),
	WITH_LOGO_SMALL(8,'M','B',8);
	
	
	
	
	//��ά��İ汾���ߴ磩
	private int version;
	//��ά���Ŵ���
	private char errorCorrect;
	//�ַ�
	private char encodeMode;
	//LOGO���ά��ͼƬ�ķ����ȣ���ά����/LOGO��ȣ�
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
