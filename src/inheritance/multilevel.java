package inheritance;

class multilevel{

    public static void main(String args[]){
        System.out.println("Hello World");
        multilevel obj = new multilevel();
        System.out.println(obj.func());
    }


    int func(){
        return 2;
    }
}