package com.jbs.qrCodeGenerator;

public enum QRCodeNoLogoType {
	
	DEFAULT(8,'M','B');

	//��ά��İ汾���ߴ磩
	private int version;
	//��ά���Ŵ���
	private char errorCorrect;
	//�ַ�
	private char encodeMode;
	
	
	QRCodeNoLogoType(){}
	
	private QRCodeNoLogoType(int version, char errorCorrect, char encodeMode) {
		this.version = version;
		this.errorCorrect = errorCorrect;
		this.encodeMode = encodeMode;
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
}
