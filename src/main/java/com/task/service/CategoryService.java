package com.task.service;

import com.task.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category>list();
    public void add( Category category);
    public int del(int id);
    public int upd(Category category);
    List<Category> selName(Category category);
    List<Category> selId(int id);
    List<Category> selNo(Category category);
}
