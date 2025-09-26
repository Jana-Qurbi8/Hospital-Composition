
package test1;

/**
 *
 * @author JanaQ
 */
public class patients {
    private String name;
    private int id;
    private int age;

    public patients() {
    }

    public patients(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void print(){
        System.out.println("Name :" + name +", ID :"+ id +", age:"+ age);
    
    }
    
     public patients copy(){
    patients p = new patients();
    p.name = this.name;
    p.id=this.id;
    p.age=this.age;
        return p;
    
        }
    
    
    
}
