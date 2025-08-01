package java.App;
import Security.User;
import Security.UserRole;
import config.WeekDay;

public class App {
    public static void main(String[] args) throws Exception {
      // DemoWeekDay();
        DemoUser();
    }
    private static void DemoUser() {
        var Cesar= new model.Security.User( "Cesar", "1234", "Cesar@.com", true, UserRole.Admin);
        var Jose= new model.Security.User( "Jose", "1234", "Jose@.com", true, UserRole.Admin);
        var UserArray = new model.Security.User[] {Cesar, Jose};|

    
    for (int i = 0; i < UserArray.length; i++) {

        Var User = UserArray[i];

        switch (User.getRole()) {
            case ADMIN:
                System.out.printf("%s es el superusuario%n",User);
                
                break;
            Case CLIENT:
                System.out.printf("%s es el cliente preferido%n",User);
                break;
            
            Case PROViDER:
                System.out.printf("%s es el Proveedor por defecto%n",User);
                break;

            Case EMPLOYEE:
                System.out.printf("%s es el empleado por defecto%n",User);
                break;
            
            case USER:
                System.out.printf("%s que haces aqui?%n",User);
                break;  
            default:
               break;
          }
    }
    }
       

       private static void DemoWeekDay() {
           
       
        WeekDay day = null;
        day = WeekDay.MYDAY;
        System.out.println("");
        System.out.println("");
        System.out.println(day);
        System.out.println("");
        System.out.println(day.getNum());

        var AppointmnentDay = WeekDay.FRIDAY;
        System.out.println(AppointmnentDay);
    }
}
