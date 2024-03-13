public class AccessspecifierDemo{
    private int privar;
    public int pubvar;
    protected int provar; 
    public void setvar(int privalue,int pubvalue,int provalue){
        privar=privalue;
        pubvar=pubvalue;
        provar=provalue;
    }
    public void getvar(){
        System.out.println("private value"+privar);
        System.out.println("public value"+pubvar);
        System.out.println("protected value"+provar);
    }
    public static void main(String args[]){
        AccessspecifierDemo obj=new AccessspecifierDemo();
        obj.setvar(1,2,3);
        obj.getvar();
    }
}
