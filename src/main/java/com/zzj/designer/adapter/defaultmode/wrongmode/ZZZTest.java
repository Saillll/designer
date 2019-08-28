package com.zzj.designer.adapter.defaultmode.wrongmode;

public class ZZZTest {
    public static void main(String[] args) {

        /**
         * 错误的用法，详见{@link AdapterThree}
         */
        TargetThree targetThree = new TargetThree(new AdapterThree());
        targetThree.doSomething();
        targetThree.doOne();
        targetThree.doThree();
        System.out.println("--------------------------");

        TargetTwo targetTwo = new TargetTwo(new AdapterTwo());
        targetTwo.doSomething();
        targetTwo.doThree();

//        TargetThree targetThreeAbstract = new TargetThree(new AdapterHolder() {
//            @Override
//            public void doSomething() {
//                System.out.println("This is targetThreeAbstract.doSomething");
//            }
//
//            @Override
//            public void doOne() {
//                System.out.println("This is targetThreeAbstract.doOne");
//            }
//
//            @Override
//            public void doThree() {
//                System.out.println("This is targetThreeAbstract.doThree");
//            }
//        });
//        targetThreeAbstract.doSomething();
//        targetThreeAbstract.doOne();
//        targetThreeAbstract.doThree();


    }
}
