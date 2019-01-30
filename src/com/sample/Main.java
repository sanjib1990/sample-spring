package com.sample;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.enums.TypeEnum;
import com.tasks.ArrayListTask;
import com.utils.DateUtils;
import com.interfaces.IEvaluateRecursiveCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

public class Main
{
    public static void main(String[] args)
    {
        BigInteger a = BigInteger.valueOf(1);
        BigDecimal c = new BigDecimal(1);
        Double e = a.doubleValue();

        System.out.println(a.getClass().getName());
        System.out.println(c.getClass().getName());
        System.out.println(e.getClass().getName());
    }
}
