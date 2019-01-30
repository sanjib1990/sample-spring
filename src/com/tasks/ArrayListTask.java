package com.tasks;

import com.interfaces.Task;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTask implements Task
{
    private ArrayList<String> list;
    private ArrayList<User> userList;

    @Override
    public void run()
    {
        List<Boolean> truths = new ArrayList<Boolean>();
        System.out.println("IN ARRAY LIST TASK");
        this.setList();

        this.list.add("SANJIB");
        this.list.add("SANJIB1");
        this.list.add("SANJIB2");
        this.list.add("SANJIB3");
        this.list.add("SANJIB4");

        this.printElements();

        this.addInAnIndex(1, "SAMADDED");
        this.printElements();

        this.removeIndex(1);
        this.printElements();

        this.removeElement("SANJIB3");
        this.printElements();

        System.out.println("GET BY INDEX : " + this.list.get(0));
        System.out.println("GET THE TOTAL SIZE: " + this.list.size());

        this.clear();
        this.printElements();

        System.out.println("ARRAY LIST OF OBJECTS");
        this.setArrayListOfObjects();
        this.printUserList();

    }

    private void printUserList()
    {
        System.out.println("USER LIST IS: " + this.userList);
    }

    private void setArrayListOfObjects()
    {
        this.userList = new ArrayList<>();

        int i = 0;
        while (i < 9) {
            User user = new User();
            user.id = i + 1;
            user.email = "test@test"+ i +".com";
            user.name = "abc" + i;

            this.userList.add(user);
            i++;
        }
    }

    private void clear()
    {
        System.out.println("CLEAR ALL ELEMENTS");
        this.list.clear();
    }

    private void removeElement(String string)
    {
        System.out.println("REMOVEING BY STRING");
        this.list.remove(string);
    }

    private void removeIndex(int index)
    {
        System.out.println("REMOVE ELEMENT BY INDEX");
        this.list.remove(1);
    }

    private void addInAnIndex(int index, String string)
    {
        System.out.println("ADDING ELEMTN BY INDEX");
        this.list.set(index, string);
    }

    private void printElements()
    {
        System.out.println("THE ELEMENTS IN THE LIST ARE: " + this.list);
    }

    private void setList()
    {
        this.list = new ArrayList<String>();
    }

    private class User
    {
        public int id;
        public String name;
        public String email;
    }
}

