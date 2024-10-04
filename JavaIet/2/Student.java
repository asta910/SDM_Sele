public class Student{
    private int id;
    private String name;
    private int m1; 
    private int m2;
    private int m3;
    public static int count;

    Student(){count++;};
    Student(int i,String n,int m1,int m2,int m3){
        this.id = i; this.name = n; this.m1 = m1; this.m2=m2;this.m3=m3;
        count++;
    };
    public int getCount(){
        return count;
    }    
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }    
    public int getMarks1(){
        return this.m1;
    }
    public int getMarks2(){
        return this.m2;
    }
    public int getMarks3(){
        return this.m3;
    }


    public void setId(int id){
        this.id = id;
    }
    public void setName(String s){
        this.name =s;
    }    
    public void setMarks1(int m){
        this.m1 = m;
    }
    public void setMarks2(int m){
        this.m2 = m;
    }
    public void setMarks3(int m){
        this.m3 = m;
    }


}