package Dialogs;


import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

public class Thanks {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Thanks window = new Thanks();
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
		shell.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\Background.jpeg"));
		shell.setBackground(SWTResourceManager.getColor(255, 255, 255));
		shell.setImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\\u0646\u0646\u0635\u0647.png"));
		shell.setSize(475, 280);
		shell.setText("\u0645\u0646\u0635\u0629 \u0643\u0627\u0641");
		
		Label label = new Label(shell, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("DecoType Naskh Variants", 24, SWT.NORMAL));
		label.setBackground(SWTResourceManager.getColor(255, 255, 255));
		label.setAlignment(SWT.RIGHT);
		label.setBounds(98, 123, 169, 65);
		label.setText(" ! \u0634\u0643\u0631\u0627\u064B \u0644\u0643\u0650");
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setFont(SWTResourceManager.getFont("DecoType Naskh Variants", 16, SWT.NORMAL));
		label_1.setBackground(SWTResourceManager.getColor(255, 255, 255));
		label_1.setAlignment(SWT.RIGHT);
		label_1.setText(". \u0639\u0644\u0649 \u0627\u0633\u062A\u062E\u062F\u0627\u0645 \u0645\u0646\u0635\u0629 \u0643\u0627\u0641 ");
		label_1.setBounds(-41, 176, 237, 55);
		
		Label label_2 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		label_2.setBackground(SWTResourceManager.getColor(154, 205, 50));
		label_2.setBounds(348, 0, 12, 241);
		
		Label label_3 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_3.setBackground(SWTResourceManager.getColor(154, 205, 50));
		label_3.setBounds(0, 50, 342, 12);
		
		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\lkklll.png"));
		label_4.setBounds(174, 38, 187, 87);

	}
}
