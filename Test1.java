
package test1;

/**
 *
 * @author JanaQ
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
    patients p1 = new patients("Sara",1,30);
    patients p2 = new patients("Ali",2,45);

    patients list [] = new patients[5];
    list[0]=p1.copy();
    list[1]=p2.copy();

    Hospital h = new Hospital();
    h.setSize(2);
    h.setPatient(list);
    h.print();
    //h.getPatient()[0].print();
    //h.getPatient()[1].print();

    }
    
}
