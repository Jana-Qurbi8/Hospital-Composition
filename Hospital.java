
package test1;

/**
 *
 * @author JanaQ
 */
public class Hospital {
    int size;
    private patients [] patient;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        this.patient = new patients[size];
    }

    public patients[] getPatient() {
        return patient;
    }

    public void setPatient(patients[] patient) {
        this.patient = patient;
    }

    public void print(){
    
    
    System.out.println("size :"+ size);
    
    for(int i=0;i<patient.length;i++){
        if (patient[i]!=null){
        patient[i].print();
    }
    
    }
    }
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
