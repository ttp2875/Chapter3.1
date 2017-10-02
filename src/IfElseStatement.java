import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;

public class IfElseStatement extends Application {

    @Override
    public void start(Stage primaryStage)  {
     TextInputDialog textInputDialog = new TextInputDialog("CSC200") ;
     Optional<String> input = textInputDialog.showAndWait();
     String option = input.get();

     if(option.equals("CSC200")) {
         System.out.println("You have select the CSC200 section. Enter a different numerous or characters for more information!");
     }  else {
         System.out.printf("Welcome %s \n","Tai");
         System.out.printf("Your current course grade is: %c \n" , 65);
         System.out.printf("Year of attended: %d \n", 1997);
         System.out.printf("Your current GPA is: %e \n", 3.5);
         System.out.printf("Average GPA of other colleges: %f \n", 3.65);


     }
    }
}