package App;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Table;
import org.eclipse.wb.swt.SWTResourceManager;

public class BooksDisplayInfoFrame {

	protected Shell shell;
	private Table booksTable;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BooksDisplayInfoFrame window = new BooksDisplayInfoFrame();
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
		shell.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\Desktop\\iau\\منصة كاف.jpg"));
		shell.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\al5an\\Desktop\\iau\\Level 6\\Kaff Project\\Background.jpeg"));
		//shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setSize(591, 647);
		shell.setText("عرض  معلومات الكتب");
		
		Label headerLabel = new Label(shell, SWT.NONE);
		headerLabel.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\Desktop\\iau\\KaffPlatformheader.jpg"));
		headerLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		headerLabel.setBounds(0, 0, 607, 50);
		
		Slider slider = new Slider(shell, SWT.NONE);
		slider.setBounds(96, 553, 396, 22);
		
		Label booksLabel = new Label(shell, SWT.NONE);
		booksLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		booksLabel.setFont(SWTResourceManager.getFont("B Badr", 14, SWT.NORMAL));
		booksLabel.setForeground(SWTResourceManager.getColor(210, 105, 30));
		booksLabel.setAlignment(SWT.CENTER);
		booksLabel.setBounds(0, 92, 585, 38);
		booksLabel.setText("معلومات الكتب");
		
		Button backButton = new Button(shell, SWT.NONE);
		backButton.setFont(SWTResourceManager.getFont("B Badr", 9, SWT.NORMAL));
		backButton.setBounds(501, 56, 55, 26);
		backButton.setText("\u0631\u062C\u0648\u0639");
		
		ViewForm viewForm = new ViewForm(shell, SWT.NONE);
		viewForm.setBounds(33, 136, 523, 411);
		
		booksTable = new Table(viewForm, SWT.BORDER | SWT.FULL_SELECTION);
		viewForm.setContent(booksTable);
		booksTable.setHeaderVisible(true);
		booksTable.setLinesVisible(true);
		
		Button AvailableBooksButton = new Button(viewForm, SWT.NONE);
		viewForm.setTopLeft(AvailableBooksButton);
		AvailableBooksButton.setText("الكتب المتاحة");
		
		Button SoldBooksButton = new Button(viewForm, SWT.NONE);
		viewForm.setTopCenter(SoldBooksButton);
		SoldBooksButton.setText("الكتب المباعة");
		
		Button borrowedBooksButton = new Button(viewForm, SWT.NONE);
		viewForm.setTopRight(borrowedBooksButton);
		borrowedBooksButton.setText("الكتب المعارة");

	

	}

}
