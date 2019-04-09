package App;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.ViewForm;

public class UsersDisplayInfoFrame {

	protected Shell shell;
	private Table userTable;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UsersDisplayInfoFrame window = new UsersDisplayInfoFrame();
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
		//shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setSize(591, 647);
		shell.setText("عرض  معلومات المستخدمين");
		
		Label headerLabel = new Label(shell, SWT.NONE);
		headerLabel.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\Desktop\\iau\\KaffPlatformheader.jpg"));
		headerLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		headerLabel.setBounds(0, 0, 607, 50);
		
		Slider slider = new Slider(shell, SWT.NONE);
		slider.setBounds(96, 553, 396, 22);
		
		Label usersInfoLabel = new Label(shell, SWT.NONE);
		usersInfoLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		usersInfoLabel.setFont(SWTResourceManager.getFont("B Badr", 14, SWT.NORMAL));
		usersInfoLabel.setForeground(SWTResourceManager.getColor(210, 105, 30));
		usersInfoLabel.setAlignment(SWT.CENTER);
		usersInfoLabel.setBounds(0, 92, 585, 38);
		usersInfoLabel.setText("\u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0627\u0644\u0645\u0633\u062A\u062E\u062F\u0645\u064A\u0646");
		
		Button button = new Button(shell, SWT.NONE);
		button.setFont(SWTResourceManager.getFont("B Badr", 9, SWT.NORMAL));
		button.setBounds(491, 60, 65, 26);
		button.setText("\u0631\u062C\u0648\u0639");
		
		ViewForm viewForm = new ViewForm(shell, SWT.NONE);
		viewForm.setBounds(33, 136, 523, 411);
		
		userTable = new Table(viewForm, SWT.BORDER | SWT.FULL_SELECTION);
		viewForm.setContent(userTable);
		userTable.setHeaderVisible(true);
		userTable.setLinesVisible(true);
		
		Button borrowersButton = new Button(viewForm, SWT.NONE);
		viewForm.setTopLeft(borrowersButton);
		borrowersButton.setText("المستعيرين");
		
		Button allUsersButton = new Button(viewForm, SWT.NONE);
		viewForm.setTopCenter(allUsersButton);
		allUsersButton.setText("الجميع");

	}
}
