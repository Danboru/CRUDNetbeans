package crud;

import crud.Form.Main_Form;

public class Main_Activity {
    
    public static void main(String[] args) {
        
        try{
            Main_Form form = new Main_Form();
            form.setVisible(true);
            
        }catch(Exception ex){
            
            System.out.println(ex.toString());
        }        
    }
}
