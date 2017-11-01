package com.task.service.impl;


import com.task.dao.CategoryMapper;
import com.task.model.Category;
import com.task.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl  implements CategoryService {
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    CategoryMapper categoryMapper;


    public List<Category> list(){
        return categoryMapper.list();
    }
    public void add( Category category){categoryMapper.add(category);}
    public int del(int id){return categoryMapper.del(id);}
    public  int upd(Category category){return categoryMapper.upd(category);}
    public List<Category> selName(Category category){return categoryMapper.selName(category);}
    public List<Category> selId(int id){return categoryMapper.selId(id);}
    public List<Category> selNo(Category category){return categoryMapper.selNo(category);}

}