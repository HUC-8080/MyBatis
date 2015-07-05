/**
 * <p>Title: StudentTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Jul 5, 2015
 * @version 
 */
package com.mybatis.entity.po;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.mybatis.utils.MyBatisUtils;

/**
 * @author 马金健
 *
 */
public class StudentTest {
	
	@Test
	public void testGetOne() throws IOException {
		String statement = "com.mybatis.entity.po.studentMapper"+".getStudent";
		System.out.println(MyBatisUtils.getOne(statement, 15));
		MyBatisUtils.closeSession();
	}
	
	@Test
	public void testInsert(){
		String statement = "com.mybatis.entity.po.studentMapper"+".insertStudent";
		Student student = new Student();
		student.setPassword("majinjian");
		student.setUsername("majinjian");
		System.out.println(MyBatisUtils.insert(statement, student));
		MyBatisUtils.closeSession();
	}
	
	@Test
	public void testDelete(){
		String statement = "com.mybatis.entity.po.studentMapper"+".deleteStudent";
		System.out.println(MyBatisUtils.delete(statement, 17));
		MyBatisUtils.closeSession();
	}
	
	@Test
	public void testUpdate(){
		String statement = "com.mybatis.entity.po.studentMapper"+".updateStudent";
		Student student = new Student();
		student.setId(19);
		student.setPassword("liujiao");
		student.setUsername("liujiao");
		System.out.println(MyBatisUtils.update(statement, student));
		MyBatisUtils.closeSession();
	}
	
	@Test
	public void testGetAll(){
		String statement = "com.mybatis.entity.po.studentMapper"+".allStudent";
		List<Student> students = MyBatisUtils.getAll(statement);
		for(Student student : students){
			System.out.println(student);
		}
	}
}
