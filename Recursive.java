public class Recursive {
    private int a;
    private int b;
    public Recursive(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Recursive(){
        this.a = 1;
        this.b = 1;
    }
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public void recursiveOutput(int a, int b){
        if(a > b){
           for(int i = a; i >= b; i--){
               System.out.print(i + " ");
           }
        }
        else if(b > a){
            for(int i = a; i <= b; i++){
                System.out.print(i + " ");
            }
        }
        else{
            System.out.println(a);
        }
    }
    public void recursiveOutput(){
        if(this.a > this.b){
            for(int i = this.a; i >= this.b; i--){
                System.out.print(i + " ");
            }
        }
        else if(this.b > this.a){
            for(int i = this.a; i <= this.b; i++){
                System.out.print(i + " ");
            }
        }
        else{
            System.out.println(this.a);
        }
    }
}
