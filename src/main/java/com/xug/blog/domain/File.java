//package com.zyq.blog.domain;
//
//import org.bson.types.Binary;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import java.util.Date;
//
//
///**
// * @ClassName File
// * @Description mongodb 文档类
// * @Since 2018/12/7 8:36
// * @Author zhouyq
// */
//@Document
//public class File {
//
//	@Id
//	private String id;
//	private String name;
//	private String contentType;
//	private long size;
//	private Date uploadDate;
//	private String md5;
//	private Binary content;//文件内容
//	private String path;//文件路径
//
//	public String getPath() {
//		return path;
//	}
//
//	public void setPath(String path) {
//		this.path = path;
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getContentType() {
//		return contentType;
//	}
//
//	public void setContentType(String contentType) {
//		this.contentType = contentType;
//	}
//
//	public long getSize() {
//		return size;
//	}
//
//	public void setSize(long size) {
//		this.size = size;
//	}
//
//	public Date getUploadDate() {
//		return uploadDate;
//	}
//
//	public void setUploadDate(Date uploadDate) {
//		this.uploadDate = uploadDate;
//	}
//
//	public String getMd5() {
//		return md5;
//	}
//
//	public void setMd5(String md5) {
//		this.md5 = md5;
//	}
//
//	public Binary getContent() {
//		return content;
//	}
//
//	public void setContent(Binary content) {
//		this.content = content;
//	}
//
//	protected File() {
//	}
//
//	public File(String name, String contentType, long size, Binary content) {
//		this.name = name;
//		this.contentType = contentType;
//		this.size = size;
//		this.uploadDate = new Date();
//		this.content = content;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null || getClass() != obj.getClass()) {
//			return false;
//		}
//		File fileInfo = (File) obj;
//		return java.util.Objects.equals(size, fileInfo.size)
//				&& java.util.Objects.equals(name, fileInfo.name)
//				&& java.util.Objects.equals(contentType, fileInfo.contentType)
//				&& java.util.Objects.equals(uploadDate, fileInfo.uploadDate)
//				&& java.util.Objects.equals(md5, fileInfo.md5)
//				&& java.util.Objects.equals(id, fileInfo.id);
//	}
//
//	@Override
//	public int hashCode() {
//		return java.util.Objects.hash(name, contentType, size, uploadDate, md5, id);
//	}
//
//	@Override
//	public String toString() {
//		return "File{"
//				+ "name='" + name + '\''
//				+ ", contentType='" + contentType + '\''
//				+ ", size=" + size
//				+ ", uploadDate=" + uploadDate
//				+ ", md5='" + md5 + '\''
//				+ ", id='" + id + '\''
//				+ '}';
//	}
//}
