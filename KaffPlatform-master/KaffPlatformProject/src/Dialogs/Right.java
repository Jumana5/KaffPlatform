package Dialogs;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

public class Right {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Right window = new Right();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(255, 255, 255));
		shell.setImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\\u0646\u0646\u0635\u0647.png"));
		shell.setSize(450, 300);
		shell.setText("\u0645\u0646\u0635\u0629 \u0643\u0627\u0641");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\rightt.png"));
		lblNewLabel.setBounds(183, 36, 101, 85);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setAlignment(SWT.CENTER);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Dubai", 17, SWT.NORMAL));
		lblNewLabel_1.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblNewLabel_1.setBounds(18, 133, 401, 47);
		lblNewLabel_1.setText(".\u062A\u0645 \u062A\u0639\u062F\u064A\u0644 \u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0627\u0644\u0643\u062A\u0627\u0628 \u0628\u0646\u062C\u0627\u062D");
		
		Button button = new Button(shell, SWT.NONE);
		button.setFont(SWTResourceManager.getFont("Dubai", 20, SWT.BOLD));
		button.setBackground(SWTResourceManager.getColor(50, 205, 50));
		button.setForeground(SWTResourceManager.getColor(255, 255, 255));
		button.setBounds(0, 219, 434, 42);
		button.setText("\u0625\u0646\u0647\u0627\u0621");

	}

}
