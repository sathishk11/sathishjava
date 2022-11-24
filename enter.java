class sat{
    float id_num; String name; String regax="^[a-zA-Z]+$";
    public void set(float id1, String n){
        this.id_num=id1;
        if(n.matches(regax))
        {this.name=n;
    }else{
            System.out.println("wrong name");
        }
    }
    public float get_name(){
        float A=id_num*id_num*3.14f;
        return A;
    }
    public String getmyname(){
        return name;
    }
}
public class enter {
    public static void main(String[] args) {
    sat a=new sat();
    a.set(2,"sathish1");
        System.out.println(a.get_name());
        System.out.println(a.getmyname());
    }
}
