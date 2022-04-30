package com.kunkun.service;

import com.kunkun.pojo.Items;

import java.util.List;

public interface ItemsService {

    List<Items> findAll();

    void save(Items items);


}
