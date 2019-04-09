package Dialogs;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

public class Add {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Add window = new Add();
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
		lblNewLabel.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Downloads\\add.png"));
		lblNewLabel.setBounds(175, 13, 95, 90);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setAlignment(SWT.RIGHT);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Dubai", 19, SWT.BOLD));
		lblNewLabel_1.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblNewLabel_1.setBounds(157, 107, 85, 56);
		lblNewLabel_1.setText("!\u062A\u0640\u0645\r\n");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setAlignment(SWT.RIGHT);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Dubai", 18, SWT.NORMAL));
		lblNewLabel_2.setForeground(SWTResourceManager.getColor(119, 136, 153));
		lblNewLabel_2.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblNewLabel_2.setBounds(62, 145, 275, 44);
		lblNewLabel_2.setText(".\u062A\u0645\u062A \u0623\u0636\u0627\u0641\u0647 \u0627\u0644\u0643\u062A\u0627\u0628 \u0628\u0646\u062C\u0627\u062D");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Dubai", 22, SWT.BOLD));
		btnNewButton.setForeground(SWTResourceManager.getColor(255, 255, 255));
		btnNewButton.setBackground(SWTResourceManager.getColor(30, 144, 255));
		btnNewButton.setBounds(0, 217, 434, 44);
		btnNewButton.setText("\u0625\u0646\u0647\u0627\u0621");

	}

}
