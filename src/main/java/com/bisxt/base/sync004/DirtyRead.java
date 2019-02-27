package com.bisxt.base.sync004;

/**
 * Created by luwan on 2019/1/13.
 */
public class DirtyRead {

    private String name="张三";

    private Integer age=18;

    public DirtyRead() {
    }

    public DirtyRead(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public synchronized void getValue() {
        System.out.println("小伙子的名字是:"+this.name+"小伙子的年龄为:"+this.age);
    }

    public synchronized void setValue(String username, Integer age) {
        this.name = name;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.age = age;

        System.out.println("setValue最终结果：username = " + username + " , password = " + age);
    }

    public static void main(String[] args) {
        DirtyRead read=new DirtyRead();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                read.setValue("李四",22);
            }
        });

        t1.start();
        try {
            Thread.sleep(1000);
            read.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
