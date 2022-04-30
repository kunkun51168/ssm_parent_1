package com.kunkun.test;

import com.kunkun.dao.ItemsDao;
import com.kunkun.pojo.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class serviceTest {



    @Test
    public void testService(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsDao bean = app.getBean(ItemsDao.class);
        System.out.println(bean.findAll());


    }
}
