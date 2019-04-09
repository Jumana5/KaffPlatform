package App;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.swt.widgets.Composite;
import java.util.Formatter;
import javax.swing.ImageIcon;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

import com.sun.deploy.uitoolkit.impl.fx.ui.resources.ResourceManager;

import javafx.scene.image.ImageView;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;

public class MainMenuKaff {
	// public static Formatter output;
	protected Shell shell;

	public static void main(String[] args) {
		try {
			MainMenuKaff window = new MainMenuKaff();
			window.open();
			files.openFile();
			files.addRecords("hello");
			files.closeFile();

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

	public void close() {
		files.closeFile();
		shell.close();
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setImage(SWTResourceManager.getImage("C:\\Users\\Admin\\eclipse-workspace\\clone\\KaffPlatform\\KaffPlatformProject\\img\\logo small.png"));
		shell.setSize(616, 450);
		shell.setText("منصة كاف");

		Composite background = new Composite(shell, SWT.NONE);
		background.setLocation(0, 0);
		background.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		background.setSize(600, 406);

		Label KaffLogo = new Label(background, SWT.NONE);
		KaffLogo.setImage(SWTResourceManager.getImage("C:\\Users\\Admin\\eclipse-workspace\\clone\\KaffPlatform\\KaffPlatformProject\\img\\main.jpg"));
		KaffLogo.setToolTipText("مرحياً !!");
		KaffLogo.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		KaffLogo.setBounds(107, 10, 418, 261);

		Button searchButton = new Button(background, SWT.NONE);
		searchButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				SearchFrame sf = new SearchFrame();
				sf.open();
			}
		});
		searchButton.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		searchButton.setBounds(136, 309, 131, 49);
		searchButton.setText("\u0627\u0644\u0628\u062D\u062B");

		Button signInButton = new Button(background, SWT.NONE);
		signInButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				// show sign in frame
				SignInFrame sif = new SignInFrame();
				sif.open();
			}
		});
		signInButton.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		signInButton.setText("\u062A\u0633\u062C\u064A\u0644 \u0627\u0644\u062F\u062E\u0648\u0644");
		signInButton.setBounds(330, 309, 137, 49);

		Label welcomeLabel = new Label(background, SWT.NONE);
		welcomeLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		welcomeLabel.setForeground(SWTResourceManager.getColor(210, 105, 30));
		welcomeLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		welcomeLabel.setAlignment(SWT.CENTER);
		welcomeLabel.setBounds(136, 269, 331, 34);
		welcomeLabel.setText(
				"\u0645\u0631\u062D\u0628\u0627\u064B \u0628\u0643\u0645 \u0641\u064A \u0645\u0646\u0635\u0629 \u0643\u0627\u0641!");

	}
	
}
 
