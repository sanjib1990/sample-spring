package com.tasks;
import com.interfaces.IEvaluateRecursiveCall;
import com.interfaces.RecursiveCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluateRecursiveCall implements IEvaluateRecursiveCall
{
    @Autowired
    RecursiveCall call;

    private int count = 0;

    @Override
    public void evaluate()
    {
        if (count != 10) {
            count++;
            this.call.process();
            System.out.println("EVALUTE : " + this.count);
            System.out.println("MAKE CALL: " + this.call.getCount());
            this.evaluate();
        }
    }
}
