package App;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

import Dialogs.Update;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Combobox {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Combobox window = new Combobox();
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
		shell.setSize(587, 364);
		shell.setText("\u0645\u0646\u0635\u0629 \u0643\u0627\u0641");
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				MainMenuKaff mainSearchOrSignIn = new MainMenuKaff();
				shell.close();

				mainSearchOrSignIn.open();
			}
		});
		button.setImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\signout small.png"));
		button.setBounds(0, 25, 43, 40);
		
		Button btnNewButton_3 = new Button(shell, SWT.NONE);
		btnNewButton_3.setImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\KaffPlatformheader.jpg"));
		btnNewButton_3.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\KaffPlatformheader.jpg"));
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				SignInFrame SignIn = new SignInFrame();
				shell.close();

				SignIn.open();
			}
		});
		btnNewButton_3.setBounds(503, 0, 58, 40);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\KaffPlatformheaderrr.jpg"));
		lblNewLabel_1.setBounds(0, 0, 571, 50);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setForeground(SWTResourceManager.getColor(255, 69, 0));
		lblNewLabel.setFont(SWTResourceManager.getFont("Dubai", 20, SWT.BOLD));
		lblNewLabel.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblNewLabel.setBounds(186, 59, 241, 32);
		lblNewLabel.setText("\u0642\u0627\u0626\u0645\u0629 \u0645\u0646\u0635\u0629 \u0643\u0627\u0641");
		
		Label label = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBackground(SWTResourceManager.getColor(154, 205, 50));
		label.setForeground(SWTResourceManager.getColor(34, 139, 34));
		label.setBounds(116, 97, 316, 8);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				AddBookKaff addbook=new AddBookKaff();
				shell.close();
				addbook.open();
				
			}
		});
		btnNewButton.setBounds(171, 146, 210, 32);
		btnNewButton.setText("إضافة كتاب جديد");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Update update=new Update();
				shell.close();
				update.open();
			}
		});
		btnNewButton_1.setBounds(171, 200, 210, 32);
		btnNewButton_1.setText("عرض وتعديل معلومات الكتب");
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				UsersDisplayInfoFrame UsersDisplayInfoFrame=new UsersDisplayInfoFrame();
				shell.close();
				UsersDisplayInfoFrame.open();
			}
		});
		btnNewButton_2.setBounds(171, 258, 210, 32);
		btnNewButton_2.setText("عرض وتعديل معلومات المستخدمين");

	}
}
