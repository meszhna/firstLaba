package org.example.firstLaba;



//Задание 1: Добавить sl4j и избавиться от System.out.println
//Задание 2: добавить возможность выброса исключнения при  делении на 0 (использовать предыдущее задание)
//Подсказка к заданию 2: использовать Mockito (тестируем сами операции - то есть делаем stub/заглушку)

public class App 
{
    public static void main( String[] args )
    {
        //Начинать отсюда
        System.out.println(Calculator.addition(5,6));
        System.out.println(Calculator.multiplication(5,6) );
        System.out.println(Calculator.division(12,2) );
    }
}
