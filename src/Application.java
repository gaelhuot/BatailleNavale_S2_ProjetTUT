import javax.swing.*;

public class Application {

	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable() {
									   public void run() {
										   Model model = new Model();
										   ControlGroup controler = new ControlGroup(model);
									   }
								   }
		);
	}
}
