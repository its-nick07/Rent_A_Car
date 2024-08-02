
package rent_a_car;

import java.sql.Connection;

public class Rent_A_Car {

    
    public static void main(String[] args) {
        // Connection conn = new DBConnection().connect();
        WelcomeForm newForm = new WelcomeForm();
        newForm.setVisible(true);
        LoginForm newLogin = new LoginForm();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                newForm.loadingNum.setText(Integer.toString(i)+"%");
                newForm.loadingBar.setValue(i);
                
                if (i==100) {
                    newForm.setVisible(false);
                    newLogin.setVisible(true);
                }
                
            }
        } catch (Exception e) {
        }
    }
    
}
