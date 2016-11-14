package com.asimes.beans;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Asimes on 2016/11/14.
 */


public class TestBean {

    private ApplicationContext context;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("beans.xml");
    }

    @org.junit.Test
    public void test(){
        System.out.println("Hello");
    }

    @Test
    public void testInject(){
        Knight knight = new BraveKnight(new SlayDragonQuest(System.out));
        knight.embarkOnQuest();
    }


    @Test
    public void testBean(){
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }

    @After
    public void destory(){
    }
}
