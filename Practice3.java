public class Practice3 extends Child{

    public static void main(String[] args) {
       /* String s="asdasdasdasdasdasda lslslsls aslasl ";
        char[] ch=s.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>0;--i){
            rev=rev+ch[i];

        }
        System.out.println(rev);
        List number = Arrays.asList(1,2,3,4,5);
        System.out.println(number);*/


        Parent p1=new Parent();
        Parent p2=new Child();
        Child p3=new Child();

        p1.m1();
        p2.m1();
        p3.m1();
    }

}
class Parent{
    public void m1(){
        System.out.println("calling parent method m1");
    }
}
class  Child extends Parent{

    public void m1(){
        System.out.println("Calling child method m2");
    }
}
