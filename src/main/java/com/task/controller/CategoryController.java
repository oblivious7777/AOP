package com.task.controller;


import org.apache.log4j.Logger;
import org.json.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.task.model.Category;
import com.task.service.CategoryService;
import com.task.units.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


/**
简单的部署于web的增删改查
起始页面是http://localhost/task2/list
 运行信息与resources/log内
 */

//controller类，负责对web的接口
@Controller
@RequestMapping(value = "",method = RequestMethod.GET)
class CategoryController {

    @Autowired
    CategoryService categoryService;
    //设置log4j
    static Logger logger = Logger.getLogger(CategoryController.class);
    /*
    基于PageHelper进行分页查询
    total为总页码
     */
    @RequestMapping(value ="", method = RequestMethod.GET)
    public String getCategory(Page page , Model model){
        PageHelper.offsetPage(page.getStart(),5);
        List<Category> cs= categoryService.list();
        int total = (int) new PageInfo<Category>(cs).getTotal();
        logger.debug(total+"total信息");
        page.caculateLast(total);
        logger.debug(cs+"cs信息");
        model.addAttribute("list",cs);
        logger.debug("list");
        return "theList";
    }
    /*
    添加接口
    使用POST
    在jsp中输入category的数据
     */
    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    public String addCategory(Category category){
        categoryService.add(category);
        return "theAdd";
    }
    /*
    删除接口
    使用DELETE
     */
    @RequestMapping(value="del/{id}" ,method = RequestMethod.DELETE)
    public String delCategory(@PathVariable(value = "id") Integer id) {
        categoryService.del(id);
        return "success";
    }
    /*
    修改语句
     */
    @RequestMapping(value="/upd",method = RequestMethod.POST)
    public String updCategory(Category category){
        categoryService.upd(category);
        return "theUpd";
    }
    /*
    根据ID查询一条数据
     */
    @RequestMapping(value = "selI/{id}", method = RequestMethod.POST)
    public String queryOne(@PathVariable(value = "id") Integer id,Model model) {
        List<Category> cs= categoryService.selId(id);
        model.addAttribute("getName",cs);
        return "theSel";
    }



    /**
     *
     * 使用@ResponseBody标签输入输出json
     *
     */
    @RequestMapping(value ="listCategory", method = RequestMethod.GET)
    public @ResponseBody List<Category> listCategory(Model model){
        List<Category> cs= categoryService.list();
        model.addAttribute("listCategory",cs);
        return cs;
    }

    @RequestMapping(value ="addCategory", method = RequestMethod.POST)
    public @ResponseBody List<Category>  adCategory (Category category){
        categoryService.add(category);
        List<Category> cs= categoryService.list();
        return cs;//仅作查询
    }



}

