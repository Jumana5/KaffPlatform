package App;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Monitor;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.graphics.Rectangle;

public class UsersDisplayInfoFrame {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Table table;
	private Button button_3;
	private Label headerLabel;

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
		Monitor primary = display.getPrimaryMonitor();
		Rectangle bounds = primary.getBounds();
		Rectangle rect = shell.getBounds();
		int x = bounds.x + (bounds.width - rect.width) / 2;
		int y = bounds.y + (bounds.height - rect.height) / 2;

		/** set the new location */
		shell.setLocation(x, y);
		
		Button button = new Button(shell, SWT.NONE);
		button.setText("إلغاء");
		button.setFont(SWTResourceManager.getFont("B Badr", 9, SWT.NORMAL));
		FormData fd_button = new FormData();
		fd_button.bottom = new FormAttachment(button_3, 0, SWT.BOTTOM);
		fd_button.top = new FormAttachment(button_3, 0, SWT.TOP);
		fd_button.left = new FormAttachment(text, 0, SWT.LEFT);
		fd_button.right = new FormAttachment(button_3, -6);
		button.setLayoutData(fd_button);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\KaffPlatformheader2.jpg"));
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.bottom = new FormAttachment(headerLabel, -24, SWT.BOTTOM);
		fd_lblNewLabel.top = new FormAttachment(headerLabel, 0, SWT.TOP);
		fd_lblNewLabel.right = new FormAttachment(headerLabel, -1);
		fd_lblNewLabel.left = new FormAttachment(0, 117);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
		
		Label label = new Label(shell, SWT.NONE);
		label.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\KaffPlatformheader2.jpg"));
		label.setLayoutData(new FormData());
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
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		// shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\logo small.png"));
		shell.setSize(1128, 636);
		shell.setText("عرض  معلومات المستخدمين");
		shell.setLayout(new FormLayout());

		headerLabel = new Label(shell, SWT.NONE);
		FormData fd_headerLabel = new FormData();
		fd_headerLabel.top = new FormAttachment(0);
		fd_headerLabel.left = new FormAttachment(0, 539);
		headerLabel.setLayoutData(fd_headerLabel);
		headerLabel.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\KaffPlatformheader.jpg"));
		headerLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		Label usersInfoLabel = new Label(shell, SWT.NONE);
		FormData fd_usersInfoLabel = new FormData();
		fd_usersInfoLabel.bottom = new FormAttachment(0, 137);
		fd_usersInfoLabel.right = new FormAttachment(0, 508);
		fd_usersInfoLabel.top = new FormAttachment(0, 101);
		fd_usersInfoLabel.left = new FormAttachment(0, 214);
		usersInfoLabel.setLayoutData(fd_usersInfoLabel);
		usersInfoLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		usersInfoLabel.setFont(SWTResourceManager.getFont("B Badr", 14, SWT.NORMAL));
		usersInfoLabel.setForeground(SWTResourceManager.getColor(210, 105, 30));
		usersInfoLabel.setAlignment(SWT.CENTER);
		usersInfoLabel.setText("عرض معلومات المستخدمين");

		button_3 = new Button(shell, SWT.NONE);
		FormData fd_button_3 = new FormData();
		fd_button_3.bottom = new FormAttachment(100, -77);
		button_3.setLayoutData(fd_button_3);
		button_3.setFont(SWTResourceManager.getFont("B Badr", 9, SWT.NORMAL));
		button_3.setText("\u0631\u062C\u0648\u0639");

		ViewForm viewForm = new ViewForm(shell, SWT.NONE);
		fd_button_3.left = new FormAttachment(viewForm, 114);
		FormData fd_viewForm = new FormData();
		fd_viewForm.bottom = new FormAttachment(0, 547);
		fd_viewForm.right = new FormAttachment(0, 687);
		fd_viewForm.top = new FormAttachment(0, 217);
		fd_viewForm.left = new FormAttachment(0, 33);
		viewForm.setLayoutData(fd_viewForm);

		String Query = "SELECT * FROM kaff.user";
		table = new Table(viewForm, SWT.BORDER | SWT.FULL_SELECTION);
		TableColumn column1 = new TableColumn(table, SWT.RIGHT);
		TableColumn column2 = new TableColumn(table, SWT.RIGHT);
		TableColumn column3 = new TableColumn(table, SWT.RIGHT);
		TableColumn column4 = new TableColumn(table, SWT.RIGHT);
		TableColumn column5 = new TableColumn(table, SWT.RIGHT);

		column1.setText("الرقم الأكاديمي");
		column2.setText("الاسم");
		column3.setText("رقم الهاتف");
		column4.setText("المستوى");
		column5.setText("البريد الإلكتروني");

		column1.setWidth(140);
		column2.setWidth(140);
		column3.setWidth(110);
		column4.setWidth(80);
		column5.setWidth(170);

		viewForm.setContent(table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		table.addListener(SWT.SetData, new Listener() {
			public void handleEvent(Event event) {
				TableItem item = (TableItem) event.item;
				try {
					Database.openConnection();
					ResultSet RS = Database.getStatment().executeQuery(Query);
					while (RS.next()) {
						item.setText(new String[] { RS.getString(1), (RS.getString(2) + " " + RS.getString(3) + " " + RS.getString(4)),
								RS.getString(5), RS.getString(6), RS.getString(7) });
					}
					Database.closeConnection();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});

		Button button_1 = new Button(shell, SWT.NONE);
		fd_button_3.top = new FormAttachment(button_1, 0, SWT.TOP);
		fd_button_3.right = new FormAttachment(button_1, -6);
		FormData fd_button_1 = new FormData();
		fd_button_1.bottom = new FormAttachment(100, -77);
		fd_button_1.left = new FormAttachment(viewForm, 201);
		button_1.setLayoutData(fd_button_1);
		button_1.setText("تعديل");

		Button button_2 = new Button(shell, SWT.NONE);
		fd_button_1.right = new FormAttachment(button_2, -6);
		FormData fd_button_2 = new FormData();
		fd_button_2.right = new FormAttachment(100, -56);
		fd_button_2.left = new FormAttachment(0, 975);
		fd_button_2.bottom = new FormAttachment(100, -77);
		button_2.setLayoutData(fd_button_2);
		button_2.setText("حذف");

		Label label = new Label(shell, SWT.NONE);
		FormData fd_label = new FormData();
		fd_label.right = new FormAttachment(0, 1040);
		fd_label.top = new FormAttachment(0, 66);
		fd_label.left = new FormAttachment(0, 765);
		label.setLayoutData(fd_label);
		label.setText("معلومات المستخدم");
		label.setForeground(SWTResourceManager.getColor(210, 105, 30));
		label.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.BOLD));
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label.setAlignment(SWT.CENTER);

		Label label_1 = new Label(shell, SWT.NONE);
		FormData fd_label_1 = new FormData();
		fd_label_1.bottom = new FormAttachment(0, 251);
		fd_label_1.right = new FormAttachment(0, 1090);
		fd_label_1.top = new FormAttachment(0, 217);
		fd_label_1.left = new FormAttachment(0, 952);
		label_1.setLayoutData(fd_label_1);
		label_1.setText("الرقم الأكاديمي");
		label_1.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		text = new Text(shell, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.right = new FormAttachment(0, 940);
		fd_text.top = new FormAttachment(0, 217);
		fd_text.left = new FormAttachment(0, 717);
		text.setLayoutData(fd_text);

		Label label_2 = new Label(shell, SWT.NONE);
		FormData fd_label_2 = new FormData();
		fd_label_2.bottom = new FormAttachment(0, 302);
		fd_label_2.right = new FormAttachment(0, 1096);
		fd_label_2.top = new FormAttachment(0, 274);
		fd_label_2.left = new FormAttachment(0, 958);
		label_2.setLayoutData(fd_label_2);
		label_2.setText("الاسم الثلاثي");
		label_2.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		text_1 = new Text(shell, SWT.BORDER);
		FormData fd_text_1 = new FormData();
		fd_text_1.right = new FormAttachment(0, 940);
		fd_text_1.top = new FormAttachment(0, 274);
		fd_text_1.left = new FormAttachment(0, 717);
		text_1.setLayoutData(fd_text_1);

		Label label_3 = new Label(shell, SWT.NONE);
		FormData fd_label_3 = new FormData();
		fd_label_3.bottom = new FormAttachment(0, 350);
		fd_label_3.right = new FormAttachment(0, 1090);
		fd_label_3.top = new FormAttachment(0, 323);
		fd_label_3.left = new FormAttachment(0, 952);
		label_3.setLayoutData(fd_label_3);
		label_3.setText("رقم الجوال");
		label_3.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		text_2 = new Text(shell, SWT.BORDER);
		FormData fd_text_2 = new FormData();
		fd_text_2.bottom = new FormAttachment(0, 350);
		fd_text_2.right = new FormAttachment(0, 940);
		fd_text_2.top = new FormAttachment(0, 323);
		fd_text_2.left = new FormAttachment(0, 717);
		text_2.setLayoutData(fd_text_2);

		Label label_4 = new Label(shell, SWT.NONE);
		FormData fd_label_4 = new FormData();
		fd_label_4.bottom = new FormAttachment(0, 402);
		fd_label_4.right = new FormAttachment(0, 1096);
		fd_label_4.top = new FormAttachment(0, 371);
		fd_label_4.left = new FormAttachment(0, 958);
		label_4.setLayoutData(fd_label_4);
		label_4.setText("المستوى");
		label_4.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		Combo combo = new Combo(shell, SWT.NONE);
		FormData fd_combo = new FormData();
		fd_combo.right = new FormAttachment(0, 940);
		fd_combo.top = new FormAttachment(0, 368);
		fd_combo.left = new FormAttachment(0, 848);
		combo.setLayoutData(fd_combo);
		combo.setItems(new String[] { "3", "4", "5", "6", "7", "8", "9", "10" });
		combo.select(0);

		Label label_5 = new Label(shell, SWT.NONE);
		fd_button_2.top = new FormAttachment(label_5, 33);
		FormData fd_label_5 = new FormData();
		fd_label_5.bottom = new FormAttachment(0, 456);
		fd_label_5.right = new FormAttachment(0, 1096);
		fd_label_5.top = new FormAttachment(0, 418);
		fd_label_5.left = new FormAttachment(0, 958);
		label_5.setLayoutData(fd_label_5);
		label_5.setText("البريد الإلكتروني");
		label_5.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		text_3 = new Text(shell, SWT.BORDER);
		FormData fd_text_3 = new FormData();
		fd_text_3.right = new FormAttachment(0, 940);
		fd_text_3.top = new FormAttachment(0, 418);
		fd_text_3.left = new FormAttachment(0, 717);
		text_3.setLayoutData(fd_text_3);
		
		Label label_6 = new Label(shell, SWT.NONE);
		FormData fd_label_6 = new FormData();
		fd_label_6.top = new FormAttachment(0);
		fd_label_6.left = new FormAttachment(0);
		label_6.setLayoutData(fd_label_6);

	}
}
