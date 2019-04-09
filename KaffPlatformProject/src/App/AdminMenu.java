package App;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;

public class AdminMenu {

	protected Shell shell;

	public static void main(String[] args) {
		try {
			AdminMenu window = new AdminMenu();
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
		Monitor primary = display.getPrimaryMonitor();
		Rectangle bounds = primary.getBounds();
		Rectangle rect = shell.getBounds();
		int x = bounds.x + (bounds.width - rect.width) / 2;
		int y = bounds.y + (bounds.height - rect.height) / 2;

		/** set the new location */
		shell.setLocation(x, y);
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
		shell.setImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\logo very small.png"));
		shell.setBackground(SWTResourceManager.getColor(255, 255, 255));
		shell.setSize(587, 364);
		shell.setText("\u0645\u0646\u0635\u0629 \u0643\u0627\u0641");

		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				SignInFrame SF = new SignInFrame();

				shell.close();
				files.addRecords("Back to Signin Frame");
				System.out.println("Back to Signin Frame");
				files.addRecords("Admin menu frame has closed");
				System.out.println("Admin menu frame has closed");
				SF.open();
			}
		});
		button.setImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\signout small.png"));
		button.setBounds(0, 47, 43, 40);

		Button btnNewButton_3 = new Button(shell, SWT.NONE);
		btnNewButton_3.setImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\logo for header button.png"));
		btnNewButton_3
				.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\KaffPlatformheader.jpg"));
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				MainMenuKaff main = new MainMenuKaff();
				shell.close();
				files.addRecords("Admin menu  frame has closed");
				System.out.println("Admin menu  frame has closed");
				main.open();
			}
		});
		btnNewButton_3.setBounds(503, 0, 58, 40);

		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBackgroundImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\KaffPlatformheader.jpg"));
		lblNewLabel_1.setBounds(0, 0, 571, 50);

		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setForeground(SWTResourceManager.getColor(255, 69, 0));
		lblNewLabel.setFont(SWTResourceManager.getFont("Dubai", 20, SWT.BOLD));
		lblNewLabel.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblNewLabel.setBounds(132, 62, 283, 57);
		lblNewLabel.setText("\u0642\u0627\u0626\u0645\u0629 \u0645\u0646\u0635\u0629 \u0643\u0627\u0641");

		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("B Badr", 14, SWT.BOLD));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				AddBookKaff addbook = new AddBookKaff();
				files.addRecords("Add book frame has opened");
				System.out.println("Search button has clicked");
				shell.close();
				addbook.open();

			}
		});
		btnNewButton.setBounds(144, 146, 270, 32);
		btnNewButton.setText("إضافة كتاب جديد");

		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setFont(SWTResourceManager.getFont("B Badr", 14, SWT.BOLD));
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				BooksDisplayInfoFrame update = new BooksDisplayInfoFrame();
				shell.close();
				update.open();
			}
		});
		btnNewButton_1.setBounds(144, 203, 270, 32);
		btnNewButton_1.setText("عرض وتعديل معلومات الكتب");

		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.setFont(SWTResourceManager.getFont("B Badr", 14, SWT.BOLD));
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				UsersDisplayInfoFrame UsersDisplayInfoFrame = new UsersDisplayInfoFrame();
				shell.close();
				UsersDisplayInfoFrame.open();
			}
		});
		btnNewButton_2.setBounds(144, 258, 270, 32);
		btnNewButton_2.setText("عرض وتعديل معلومات المستخدمين");

	}
}
