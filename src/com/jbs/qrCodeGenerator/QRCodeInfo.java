package com.jbs.qrCodeGenerator;

public class QRCodeInfo {
	//�ı�����
	private String content;
	//���ɵĶ�ά��·��
	private String imgPath;
	//LOGO�ļ���·��
	private String logoPath;
	//��ά��İ汾���ߴ磩
	private int version;
	//��ά���Ŵ���
	private char errorCorrect;
	//�ַ�
	private char encodeMode;
	//LOGO���ά��ͼƬ�ķ����ȣ���ά����/LOGO��ȣ�
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
