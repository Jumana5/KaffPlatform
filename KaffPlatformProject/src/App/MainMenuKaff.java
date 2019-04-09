package App;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;

public class MainMenuKaff {

	protected Shell shell;

	public static void main(String[] args) {
		try {
			MainMenuKaff window = new MainMenuKaff();
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
		files.openFile();
		files.addRecords("main menu has opened");
		System.out.println("main menu has opened");
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
		shell.setSize(616, 454);
		shell.setText("منصة كاف");

		Composite background = new Composite(shell, SWT.NONE);
		background.setLocation(0, 0);
		background.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		background.setSize(600, 418);

		Label KaffLogo = new Label(background, SWT.NONE);
		KaffLogo.setBackgroundImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\منصة كاف.jpg"));
		KaffLogo.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		KaffLogo.setImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\Desktop\\iau\\\u0645\u0646\u0635\u0629 \u0643\u0627\u0641.jpg"));
		KaffLogo.setBounds(104, 25, 381, 246);

		Button searchButton = new Button(background, SWT.NONE);
		searchButton.addSelectionListener(new SelectionAdapter() {

			@Override

			public void widgetSelected(SelectionEvent e) {

				SearchFrame sf = new SearchFrame();
				files.addRecords("Search button has clicked");
				System.out.println("Search button has clicked");
				shell.close();
				sf.open();
			}

		});
		searchButton.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		searchButton.setBounds(136, 326, 131, 49);
		searchButton.setText("\u0627\u0644\u0628\u062D\u062B");

		Button signInButton = new Button(background, SWT.NONE);
		signInButton.addSelectionListener(new SelectionAdapter() {

			@Override

			public void widgetSelected(SelectionEvent e) {

				// show sign in frame

				SignInFrame sif = new SignInFrame();
				files.addRecords("SignIn button has clicked");
				System.out.println("SignIn button has clicked");
				shell.close();
				sif.open();

			}

		});
		signInButton.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		signInButton.setText("\u062A\u0633\u062C\u064A\u0644 \u0627\u0644\u062F\u062E\u0648\u0644");
		signInButton.setBounds(330, 326, 137, 49);

		Label welcomeLabel = new Label(background, SWT.NONE);
		welcomeLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		welcomeLabel.setForeground(SWTResourceManager.getColor(210, 105, 30));
		welcomeLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		welcomeLabel.setAlignment(SWT.CENTER);
		welcomeLabel.setBounds(136, 286, 331, 34);
		welcomeLabel.setText(
				"\u0645\u0631\u062D\u0628\u0627\u064B \u0628\u0643\u0645 \u0641\u064A \u0645\u0646\u0635\u0629 \u0643\u0627\u0641!");
		
		Button button = new Button(background, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				files.closeFile();
				shell.close();
				System.exit(0);
			}
		});
		button.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\signout small.png"));
		button.setBounds(10, 10, 43, 40);

	}
}
