/**
 * <p>Title: MyBatisUtils.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: </p>
 * @author 马金健
 * @date Jul 5, 2015
 * @version 
 */
package com.mybatis.utils;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
 * @author 马金健
 *
 */
public class MyBatisUtils {
	
	public static SqlSessionFactory getSessionFactory(){
		String resource = "conf.xml";
		InputStream inputStream = MyBatisUtils.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sessionFactory;
	}
	
	public static SqlSession getSqlSession(final SqlSessionFactory sessionFactory){
		return sessionFactory.openSession(true);
	}

	public static void closeSession(){
		MyBatisUtils.getSqlSession(MyBatisUtils.getSessionFactory()).close();
	}
	
	public static int insert(final String statement, final Object object){
		SqlSession session = MyBatisUtils.getSqlSession(MyBatisUtils.getSessionFactory());
		return session.insert(statement, object);
	}
	
	public static int delete(final String statement, final long id){
		SqlSession session = MyBatisUtils.getSqlSession(MyBatisUtils.getSessionFactory());
		return session.delete(statement, id);
	}
	
	public static int update(final String statement, final Object object){
		SqlSession session = MyBatisUtils.getSqlSession(MyBatisUtils.getSessionFactory());
		return session.update(statement, object);
	}
	
	public static Object getOne(final String statement, final long id){
		SqlSession session = MyBatisUtils.getSqlSession(MyBatisUtils.getSessionFactory());
		return session.selectOne(statement, id);
	}
	
	public static <T> List<T> getAll(final String statement){
		SqlSession session = MyBatisUtils.getSqlSession(MyBatisUtils.getSessionFactory());
		return session.selectList(statement);
		
	}
}
