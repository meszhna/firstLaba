package org.example.firstLaba;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Продолжать работу и оценивать качество кода (то есть с чем подходить сдавать, элемент самоконтроля) - здесь

public class AppTest
{
    @Test
    public void testAdd()
    {
        assertEquals(Calculator.addition(2,2),4);
    }
    @Test
    public void testMuliplication(){
        assertEquals(Calculator.multiplication(2,2),4);
    }
    @Test
    public void testDivision(){
        assertEquals(Calculator.division(8,4),2);
    }
    kk
}
