package demoproject;

/**
 *
 * @author JAMES
 */
public class User {
    String lname,a;
    int fname,id,b;
    public User(int fname,int b,String lname,int id,String a){
        this.fname = fname;
        this.b=b;
        this.lname = lname;
        this.id = id;
        this.a=a;

    }
    
    //getters
    public String getLname(){
        return this.lname;
    }
    public int getb(){
        return this.b;
    }
    
    public int getFname(){
        return this.fname;
    }
    public int getId(){
        return this.id;
    }
     public String geta(){
        return this.a;
    }
   
    
}
