package java_enum;
//java 枚举

//enum 声明为枚举类型
//枚举与类接口具有相同的地位。
public enum Enum {


    SPRING, SUMMER,AUTUMN,WINTER;



    public static  void main(String args[]){


        System.out.println(Enum.SPRING.name()); //显示枚举变量的名字
        System.out.println(Enum.SPRING.ordinal());//显示枚举变量的编号
        System.out.println(Enum.WINTER.name());
        System.out.println(Enum.WINTER.ordinal());

    }

}
