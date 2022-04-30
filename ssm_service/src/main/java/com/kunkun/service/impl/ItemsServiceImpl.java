package com.kunkun.service.impl;

import com.kunkun.dao.ItemsDao;
import com.kunkun.pojo.Items;
import com.kunkun.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {


    @Autowired
    private ItemsDao itemsDao;




    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    @Override
    public void save(Items items) {

        itemsDao.save(items);
    }
}
