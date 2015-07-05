/**
 * <p>Title: Student.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Jul 5, 2015
 * @version 
 */
package com.mybatis.entity.po;

/**
 * @author 马金健
 *
 */
public class Student {
	
	private long id;
	private String username;
	private String password;

	/**
	 * <p>Project: MyBatis-2015-07-05-01</p>
	 * <p>Package: com.mybatis.entity.po</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Jul 5, 2015 10:19:21 AM
	 * @version 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * <p>Project: MyBatis-2015-07-05-01</p>
	 * <p>Package: com.mybatis.entity.po</p>
	 * <p>Title: </p>
	 * <p>Description: </p>
	 * <p>@Param </p>
	 * <p>@return </p>
	 * @author 马金健
	 * @since JDK 1.7.55 
	 * @date Jul 5, 2015 10:20:29 AM
	 * @version 
	 */
	public Student(long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", password="
				+ password + "]";
	}

}
