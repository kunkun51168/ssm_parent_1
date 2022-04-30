package com.kunkun.dao;

import com.kunkun.pojo.Items;

import java.util.List;

public interface ItemsDao {

/*
    查询所有数据
 */
    List<Items> findAll();


/*
    添加数据
    添加数据

 */

    void save(Items items);

}
