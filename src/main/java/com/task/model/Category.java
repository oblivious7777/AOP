package com.task.model;

//创建category对象
public class Category {

    private int id;
    private String home;//班级
    private int no;//学号
    private String EntranceTime;//入学时间
    private String name;//姓名
    private String sex;//性别
    private int age;//年龄
    private int qq;//qq
    private String school;//学校
    private String city;//城市
    private String motto;//格言
//id,home,no,EntranceTime,name,sex,age,qq,school,city,motto
//#{id},#{home},#{no},#{EntranceTime},#{name},#{sex},#{qq},#{school},#{city},#{motto}

    //id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    //home
    public String getHome() {
        return home;
    }
    public void setHome(String home) {
        this.home = home;
    }


    //No
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no =  no;
    }


    //EntranceTime
    public String getEntranceTime() {
        return EntranceTime;
    }
    public void setEntranceTime(String EntranceTime) {
        this.EntranceTime = EntranceTime;
    }


    //Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    //Sex
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }


    //Age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age =  age;
    }


    //qq
    public int getqq() {
        return qq;
    }
    public void setqq(int qq) {
        this.qq =  qq;
    }


    //School
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }


    //City
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city =city;
    }


    // Motto
    public String getMotto() {
        return motto;
    }
    public void setMotto(String motto) {
        this.motto =motto;
    }


    //重写toString
    @Override
    public String toString() {
        return "学员信息 [Id=" + id + ", Home=" + home + ",No="+no+ ",EntranceTime="+EntranceTime+ ",Name="+name+ ",Sex="+sex+ ",Age="+age+ ",qq="+qq+ ",School="+school+ ",City="+city+ ",Motto="+motto+"]";
    }
}
