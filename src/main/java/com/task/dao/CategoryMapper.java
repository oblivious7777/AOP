package com.task.dao;


import com.task.model.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CategoryMapper {
    @Select("select * from   student")
    public List<Category> list();//查询

    @Insert("insert into student ( id,home,no,EntranceTime,name,sex,age,qq,school,city,motto) values (#{id},#{home},#{no},#{EntranceTime},#{name},#{sex},#{age},#{qq},#{school},#{city},#{motto})")
    @Options(useGeneratedKeys=true)//返回主键
    public void add( Category category);//添加

    @Delete("delete from student where id= #{id}")
    public int del(int id);//删除

    @Update("update student set name=#{name} where id=#{id}")
    public int upd(Category category);//改名字

    @Select("select * from   student  where name= #{name} ")
    public List<Category>  selName(Category category);//查名字

    @Select("select * from   student  where id= #{id} ")
    public List<Category> selId(int id);//查id

    @Select("select * from   student  where no= #{no} ")
    public List<Category> selNo(Category category);//查学号


}
