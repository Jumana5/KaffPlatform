package App;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;

public class ShowUserorBooksInfoFrame {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ShowUserorBooksInfoFrame window = new ShowUserorBooksInfoFrame();
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
		shell.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\al5an\\Desktop\\iau\\Level 6\\Kaff Project\\Background.jpeg"));

		shell.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\Desktop\\iau\\\u0645\u0646\u0635\u0629 \u0643\u0627\u0641.jpg"));
		shell.setSize(600, 410);
		shell.setText("اختيار العرض");
		
		Combo menuCombo = new Combo(shell, SWT.NONE);
		menuCombo.setItems(new String[] {"إضافة كتاب جديد", "عرض معلومات الكتب أو المستخدمين"});
		menuCombo.setFont(SWTResourceManager.getFont("B Badr", 14, SWT.NORMAL));
		menuCombo.setBackground(SWTResourceManager.getColor(255, 228, 196));
		menuCombo.setBounds(146, 55, 297, 47);
		menuCombo.select(1);
		
		Label headerLabel = new Label(shell, SWT.NONE);
		headerLabel.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\Desktop\\iau\\KaffPlatformheader.jpg"));
		headerLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		headerLabel.setBounds(0, 0, 607, 50);
		
		Button displayBooksButton = new Button(shell, SWT.NONE);
		displayBooksButton.setFont(SWTResourceManager.getFont("B Badr", 13, SWT.BOLD));
		displayBooksButton.setBounds(106, 175, 138, 78);
		displayBooksButton.setText("\u0639\u0631\u0636 \u0627\u0644\u0643\u062A\u0628");
		
		Button DisplayUsersButton = new Button(shell, SWT.NONE);
		DisplayUsersButton.setFont(SWTResourceManager.getFont("B Badr", 13, SWT.BOLD));
		DisplayUsersButton.setBounds(269, 175, 218, 78);
		DisplayUsersButton.setText("\u0639\u0631\u0636 \u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0627\u0644\u0645\u0633\u062A\u062E\u062F\u0645\u064A\u0646");
		
		Label SignOutLabel = new Label(shell, SWT.NONE);
		SignOutLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		SignOutLabel.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\Desktop\\iau\\Level 6\\Kaff Project\\signout small.png"));
		SignOutLabel.setBounds(0, 26, 40, 47);

	}


}
