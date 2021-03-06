package kr.or.yi.mybatis_c3p0_HGS;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.yi.mybatis_c3p0_HGS.dto.Title;
import kr.or.yi.mybatis_c3p0_HGS.service.TitleService;

public class TitleServiceTest {
	private static TitleService titleService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		titleService = new TitleService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		titleService = null;
	}

	@Test
	public void test() {
		Title title = new Title(1,"사장");
		int res = titleService.insertTitle(title);
		Assert.assertEquals(1, res);
	}

}
