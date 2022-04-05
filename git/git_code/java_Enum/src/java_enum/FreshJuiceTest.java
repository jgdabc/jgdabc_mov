package java_enum;
class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM , LARGE } //枚举方法
    FreshJuiceSize size;
}

public class FreshJuiceTest {
    public static void main(String[] args){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM  ;
        System.out.println(juice.size);
    }
}
