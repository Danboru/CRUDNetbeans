package crud;

import crud.Form.TidakMampu_Form;

public class Main {
    
    public static void main(String[] args) {
        
        try{
            TidakMampu_Form form = new TidakMampu_Form();
            form.setVisible(true);
            
        }catch(Exception ex){
            
            System.out.println(ex.toString());
        }        
    }
}
