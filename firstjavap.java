public class firstjavap{
    public static void main(String[] args)
    {
        System.out.println("this is a first programming ");
        System.out.println(6+3+6);
     Dog obj=new Dog();
        obj.skin();
     System.out.println(   num(4,5));
    }
  static  int num(int a, int  b ){
      int  c=a+b;
        return c;
    }
}
class Dog extends firstjavap{
    void skin(){
        System.out.println("dog has a not slim skin");
    }
    
    }
    
    