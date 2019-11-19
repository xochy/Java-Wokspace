package cap02.estaticas;

public final class TestStatic{

    private int a = 0;

    public void unMethod(){
     
        System.out.println("Este es un método");
    }
    
    public static void main(String[] args) {
        
        TestStatic t = new TestStatic();
        System.out.println("a vale: " + t.a);
        t.unMethod();
    }
}