package App;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.swt.widgets.Button;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import Dialogs.ErrorFrame;

public class SignInFrame {

	protected Shell shell;
	private Text usernameTxt;
	private Text passwordValue;

	public static void main(String[] args) {
		try {
			SignInFrame window = new SignInFrame();
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
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MainMenuKaff M = new MainMenuKaff();

				shell.close();
				files.addRecords("Back to mainmenu Frame");
				System.out.println("Back to mainmenu Frame");
				files.addRecords("Signin frame has closed");
				System.out.println("Signin frame has closed");
				M.open();
			}
		});
		button.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\signout small.png"));
		button.setBounds(10, 30, 43, 40);
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	boolean isCorrect;
	// int numberOfEntries=0;
	int currentEntrieIndex = 0;

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\logo very small.png"));
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setSize(603, 443);
		shell.setText("تسجيل الدخول");

		Label signInLabel = new Label(shell, SWT.CENTER);
		signInLabel.setForeground(SWTResourceManager.getColor(210, 105, 30));
		signInLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		signInLabel.setFont(SWTResourceManager.getFont("B Badr", 14, SWT.NORMAL));
		signInLabel.setBounds(111, 113, 347, 34);
		signInLabel.setText("..سجلي دخولك من هنا..");

		usernameTxt = new Text(shell, SWT.BORDER);
		usernameTxt.setBounds(111, 164, 247, 24);

		Label usernameLabel = new Label(shell, SWT.NONE);
		usernameLabel.setAlignment(SWT.RIGHT);
		usernameLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		usernameLabel.setFont(SWTResourceManager.getFont("B Badr", 10, SWT.NORMAL));
		usernameLabel.setBounds(364, 167, 94, 24);
		usernameLabel.setText("اسم المستخدم");

		Label passwordLabel = new Label(shell, SWT.NONE);
		passwordLabel.setAlignment(SWT.RIGHT);
		passwordLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		passwordLabel.setFont(SWTResourceManager.getFont("B Badr", 10, SWT.NORMAL));
		passwordLabel.setBounds(364, 206, 94, 24);
		passwordLabel.setText("الرقم السري");

		passwordValue = new Text(shell, SWT.BORDER);

		passwordValue.setBounds(111, 206, 247, 24);

		Button button = new Button(shell, SWT.NONE);
		button.setToolTipText("رجــوع");

		button.addSelectionListener(new SelectionAdapter() {

			@Override

			public void widgetSelected(SelectionEvent e) {

				// pressing the logo will take you to main menu, here it is sign
				// in or search menu

				MainMenuKaff mainSearchOrSignIn = new MainMenuKaff();
				files.addRecords("Signin  frame has closed");
				System.out.println("Signin  frame has closed");
				shell.close();
				mainSearchOrSignIn.open();

			}

		});
		// TestConnection test=new TestConnection();

		button.setImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\logo for header button.png"));

		button.setBounds(500, 0, 58, 43);
		button.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\KaffPlatformheader.jpg"));

		Button signInButton = new Button(shell, SWT.NONE);
		signInButton.addSelectionListener(new SelectionAdapter() {

			@Override

			public void widgetSelected(SelectionEvent e) {
				// check if username and password are correct, then show admin
				// menu or error message
				files.addRecords("Sing in successfully");
				System.out.println("Sing in successfully");
				String username = usernameTxt.getText();
				String password = passwordValue.getText();
				String signinQuery = "select adminID , adminPassword from kaff.admin where adminID= ? and adminPassword=?";
				try {
					Database.openConnection();

					PreparedStatement sign = Database.getConnection().prepareStatement(signinQuery);

					sign.setString(1, username);
					sign.setString(2, password);
					sign.executeQuery();
					ResultSet resultSign = sign.getResultSet();
					// ResultSetMetaData metadata=resultSign.getMetaData();
					// int numberOfEntries=metadata.getColumnCount();
					String IDDB = "";
					String PasswordDB = "";
					while (resultSign.next()) {
						IDDB = resultSign.getString("adminID");
						PasswordDB = resultSign.getString("adminPassword");
						System.out.println(IDDB);
						System.out.println(PasswordDB);
					}

					if (IDDB.equals(username) && PasswordDB.equals(password)) {
						AdminMenu mainmenu = new AdminMenu();
						System.out.println("new main");
						shell.close();
						mainmenu.open();
					} else {
						ErrorFrame error = new ErrorFrame();
						error.open();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});
		signInButton.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.BOLD));
		signInButton.setBounds(111, 260, 85, 26);
		signInButton.setText("دخول");

		Label noteLabel = new Label(shell, SWT.NONE);
		noteLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		noteLabel.setFont(SWTResourceManager.getFont("B Badr", 10, SWT.NORMAL));
		noteLabel.setBounds(111, 306, 347, 24);
		noteLabel.setText("في حال نسيتِ الرقم السري، نرجو التواصل مع وحدة الأنشطة في الكلية");

		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBackgroundImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\KaffPlatformheader.jpg"));
		lblNewLabel.setBounds(0, 0, 607, 50);
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNewLabel.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\Desktop\\iau\\KaffPlatformheader.jpg"));

	}
}
