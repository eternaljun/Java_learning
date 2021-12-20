package part1.chapter16.mymodapp.appsrc.appstart.appstart.mymodappdemo;

import part1.chapter16.mymodapp.appsrc.appfuncs.appfuncs.simplefuncs.SimpleMathFuncs;

// Продемонстрировать простое модульное приложение
public class MyModAppDemo {
    public static void main(String[] args) {
        if (SimpleMathFuncs.isFactor(2,10)) {
            System.out.println("2 - множитель 10");
        }
        System.out.println("Наименьший общий множитель 35 и 105 - " + SimpleMathFuncs.lcf(35,105));
        System.out.println("Наибольший общий множитель 35 и 105 - " + SimpleMathFuncs.gcf(35,105));
    }
}
