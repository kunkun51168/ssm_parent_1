package com.kunkun.controller;


import com.kunkun.pojo.Items;
import com.kunkun.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {


    @Autowired
    private ItemsService itemsService;

    // 查询所有
    @RequestMapping("/list")
    public String findAll(Model model){
        // 调用service
        List<Items> list = itemsService.findAll();
        // 传给页面
        model.addAttribute("items",list);
        return "items";
    }



    // 添加
    @RequestMapping("/save")
    public String save(Items items){
        // 调用service保存
        itemsService.save(items);
        // 返回controller的list方法查询
        return "redirect:/items/list";
    }


}
