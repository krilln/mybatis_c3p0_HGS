package kr.or.yi.mybatis_c3p0_HGS;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import kr.or.yi.mybatis_c3p0_HGS.jdbc.MyBatisSqlSessionFactory;

public class MyBatisSqlSessionFactoryTest {

private static final Log log = LogFactory.getLog(MyBatisSqlSessionFactoryTest.class);	
	
	@Test
	public void testOpenSession() {
		log.debug("testOpenSession()");
		
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		log.debug("session" + session);
		Assert.assertNotNull(session);
	}

}
