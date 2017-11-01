import com.task.dao.CategoryMapper;
import com.task.model.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {

    @Autowired
    //因idea检测不到Spring装配的CategoryMapper，需通过此标签声明
    @SuppressWarnings("SpringJavaAutowiringInspection")
    CategoryMapper categoryMapper;
    //查询
    @Test
    public  void List() {
        List<Category> cs = categoryMapper.list();
        for (Category c : cs) {
            System.out.println(c.toString());
        }
    }
    //添加
    @Test
    public  void Add()  {
        Category category = new Category();
        category.setHome("python");
        category.setNo((int)(Math.random()*(9999-1000+1))+1000);//随机四位数
        category.setEntranceTime("2017-8-8");
        category.setName("老王");
        category.setSex("男");
        category.setAge(19);
        category.setqq(251312747);
        category.setSchool("'北京大学'");
        category.setCity("佛山");
        category.setMotto("编不出来了");
        categoryMapper.add(category);
        System.out.print("你添加的是第"+category.getId()+"条数据");
    }
    //删除

    @Test
    public  void Del(){

        //Category category = new Category();
       // category.setId(39);
        if(categoryMapper.del(500)==1){
            System.out.print("True");
        }else{
            System.out.print("False");
        }

    }

    //改名字
    @Test
    public  void Upd(){
        Category category = new Category();
        category.setId(38);
        category.setName("盖伦");
        if(categoryMapper.upd(category)==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
    //根据姓名查人
    @Test
    public  void SelOfName(){
        Category category = new Category();
        category.setName("盖伦");
        List<Category> cs = categoryMapper.selName(category);
        for (Category c : cs) {
            System.out.println(c.toString());
        }
    }
    //根据ID查人
    @Test
    public  void SelOfId(){
        List<Category> cs = categoryMapper.selId(100);
        for (Category c : cs) {
            System.out.println(c.toString()); }
    }
    //根据学号查人
    @Test
    public  void SelOfNo(){
        Category category = new Category();
        category.setNo(4994);
        List<Category> cs = categoryMapper.selNo(category);
        for (Category c : cs) {
            System.out.println(c.toString()); }
    }

}