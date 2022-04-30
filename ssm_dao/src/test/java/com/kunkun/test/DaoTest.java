package com.kunkun.test;

import com.kunkun.dao.ItemsDao;
import com.kunkun.pojo.Items;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class DaoTest {




    @Test
    public void testDao(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao bean = context.getBean(ItemsDao.class);
        System.out.println(bean.findAll());

    }

        @Test
        public void testDao2() {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
            ItemsDao itemsDao = (ItemsDao)applicationContext.getBean("itemsDao");
            System.out.println("商品列表：：："+itemsDao.findAll());

            Items items = new Items();
            items.setName("娃哈哈3");
            items.setPrice(18888.8);
            items.setCreatetime(new Date());
            items.setPic("bbb");
            itemsDao.save(items);
        }


}
