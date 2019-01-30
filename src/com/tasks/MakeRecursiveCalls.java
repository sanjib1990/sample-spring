package com.tasks;

import com.interfaces.RecursiveCall;
import org.springframework.stereotype.Service;

@Service
public class MakeRecursiveCalls implements RecursiveCall
{
    private int count = 0;

    public void process()
    {
        this.count++;
    }

    public int getCount()
    {
        return this.count;
    }
}
