package App;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AddBookKaff {

	protected Shell shell;
	private Text BookTitleTxt;
	private Text editionTxt;
	private Text priceTxtValue;
	private Text ownerIDValue;
	private Text nameTxt;
	private Text phoneTxt;
	private Text emailTxt;
	private Text bookIDTxt;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AddBookKaff window = new AddBookKaff();
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
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setSize(599, 779);
		shell.setText("إضافة كتاب جديد");

		Button logoBtn = new Button(shell, SWT.NONE);
		logoBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MainMenuKaff mm = new MainMenuKaff();
				shell.close();
				mm.open();
			}
		});
		logoBtn.setImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\img\\logo for header button.png"));
		logoBtn.setBounds(497, 0, 64, 50);

		Label headerLabel = new Label(shell, SWT.NONE);
		headerLabel.setImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\img\\KaffPlatformheader.jpg"));
		headerLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		headerLabel.setBounds(0, 0, 607, 50);

		Label bookInfoLabel = new Label(shell, SWT.NONE);
		bookInfoLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		bookInfoLabel.setForeground(SWTResourceManager.getColor(210, 105, 30));
		bookInfoLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.BOLD));
		bookInfoLabel.setAlignment(SWT.CENTER);
		bookInfoLabel.setBounds(177, 130, 192, 28);
		bookInfoLabel.setText("معلومات الكتاب");

		Label bookTitleLabel = new Label(shell, SWT.NONE);
		bookTitleLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		bookTitleLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		bookTitleLabel.setBounds(415, 203, 119, 28);
		bookTitleLabel.setText("عنوان الكتاب");

		BookTitleTxt = new Text(shell, SWT.BORDER);
		BookTitleTxt.setBounds(56, 206, 334, 24);

		Label bookIDLabel = new Label(shell, SWT.NONE);
		bookIDLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		bookIDLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		bookIDLabel.setBounds(415, 170, 119, 32);
		bookIDLabel.setText("رمز الكتاب");

		Label editionLabel = new Label(shell, SWT.NONE);
		editionLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		editionLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		editionLabel.setBounds(415, 235, 119, 28);
		editionLabel.setText("إصدار الكتاب");

		editionTxt = new Text(shell, SWT.BORDER);
		editionTxt.setBounds(271, 240, 119, 24);

		Label lvlLabel = new Label(shell, SWT.NONE);
		lvlLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lvlLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		lvlLabel.setText("المستوى");
		lvlLabel.setBounds(415, 269, 119, 27);

		Combo lvlBookCombo = new Combo(shell, SWT.NONE);
		lvlBookCombo.setItems(new String[] { "3", "4", "5", "6", "7", "8", "9", "10" });
		lvlBookCombo.setBounds(326, 272, 64, 25);
		lvlBookCombo.select(0);

		Label priceLabel = new Label(shell, SWT.NONE);
		priceLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		priceLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		priceLabel.setText("السعر");
		priceLabel.setBounds(415, 351, 119, 28);

		Group groupType = new Group(shell, SWT.NONE);
		groupType.setBounds(56, 320, 334, 24);

		Button button = new Button(groupType, SWT.RADIO);
		button.setSelection(true);
		button.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		button.setBounds(21, 0, 73, 21);
		button.setText("مجاناً");

		Button button_1 = new Button(groupType, SWT.RADIO);
		button_1.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		button_1.setBounds(130, 0, 73, 21);
		button_1.setText("إعارة");

		Button button_2 = new Button(groupType, SWT.RADIO);
		button_2.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		button_2.setBounds(233, 0, 80, 21);
		button_2.setText("للبيع");

		priceTxtValue = new Text(shell, SWT.BORDER);
		priceTxtValue.setBounds(326, 355, 64, 24);

		Label ownerInfoLabel = new Label(shell, SWT.NONE);
		ownerInfoLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		ownerInfoLabel.setForeground(SWTResourceManager.getColor(210, 105, 30));
		ownerInfoLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.BOLD));
		ownerInfoLabel.setText("معلومات صاحبة الكتاب");
		ownerInfoLabel.setAlignment(SWT.CENTER);
		ownerInfoLabel.setBounds(147, 400, 242, 28);

		Label ownerIDLabel = new Label(shell, SWT.NONE);
		ownerIDLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		ownerIDLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		ownerIDLabel.setBounds(415, 441, 119, 34);
		ownerIDLabel.setText("الرقم الأكاديمي");

		ownerIDValue = new Text(shell, SWT.BORDER);
		ownerIDValue.setBounds(204, 444, 186, 24);
		// need to check if the owner is already in the database...

		Label nameLabel = new Label(shell, SWT.NONE);
		nameLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		nameLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		nameLabel.setBounds(415, 481, 119, 28);
		nameLabel.setText("الاسم الثلاثي");

		nameTxt = new Text(shell, SWT.BORDER);
		nameTxt.setBounds(56, 485, 334, 24);

		Label phoneLabel = new Label(shell, SWT.NONE);
		phoneLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		phoneLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		phoneLabel.setText("رقم الجوال");
		phoneLabel.setBounds(415, 515, 119, 27);

		phoneTxt = new Text(shell, SWT.BORDER);
		phoneTxt.setBounds(204, 521, 186, 24);

		Label ownerLvlLabel = new Label(shell, SWT.NONE);
		ownerLvlLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		ownerLvlLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		ownerLvlLabel.setBounds(415, 548, 119, 31);
		ownerLvlLabel.setText("المستوى");

		Combo owneLvlCombo = new Combo(shell, SWT.NONE);
		owneLvlCombo.setItems(new String[] { "3", "4", "5", "6", "7", "8", "9", "10" });
		owneLvlCombo.setBounds(326, 554, 64, 25);
		owneLvlCombo.select(0);

		Label emailLabel = new Label(shell, SWT.NONE);
		emailLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		emailLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		emailLabel.setBounds(415, 583, 119, 38);
		emailLabel.setText("البريد الإلكتروني");

		emailTxt = new Text(shell, SWT.BORDER);
		emailTxt.setBounds(56, 586, 334, 24);

		Button addButton = new Button(shell, SWT.NONE);
		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				try {
					String bookQuery = "INSERT INTO kaff.BOOK(bookID, bookTitle,  price, level,available, type) VALUES (?, ?, ?, ?, ?, ?, ?)";
					String bookEdition = "INSERT INTO kaff.bookEdition(bookID, edition, year) VALUES (?, ?, ?)";
					String ownerQuery = "INSERT INTO kaff.user(userID, fname, mname, lastname, phone, level, personalEmail, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

					String bookID = bookIDTxt.getText();
					String bookTitle = BookTitleTxt.getText();
					int bookLevel = lvlBookCombo.getSelectionIndex();
					String type = groupType.getText();
					double price = Double.parseDouble(priceTxtValue.getText());
					boolean available = true;

					// must error handle
					String[] ed = editionTxt.getText().split(" ");
					String edition = ed[0];
					String year = ed[1];

					String ownerID = ownerIDValue.getText();

					// error handle if the user enters two names or just first name
					String[] name = nameTxt.getText().split(" ");
					String fname = "", mname = "", lname = "";
					System.out.println("name array" + name);
					if (name.length > 2) {
						fname = name[0];
						mname = name[1];
						lname = name[2];
					}
					String phone = phoneTxt.getText();
					int userLevel = owneLvlCombo.getSelectionIndex();
					String email = emailTxt.getText();

					Database.openConnection();
					PreparedStatement bookStatement = Database.getConnection().prepareStatement(bookQuery);

					bookStatement.setString(1, bookID);
					bookStatement.setString(2, bookTitle);
					bookStatement.setInt(3, bookLevel);
					bookStatement.setString(4, type);
					bookStatement.setDouble(5, price);
					bookStatement.setBoolean(6, available);

					int bookre = bookStatement.executeUpdate();

					bookStatement = Database.getConnection().prepareStatement(bookEdition);
					bookStatement.setString(1, bookID);
					bookStatement.setString(2, edition);
					bookStatement.setString(3, year);

					int edResult = bookStatement.executeUpdate();

					PreparedStatement ownerStatement = Database.getConnection().prepareStatement(ownerQuery);
					ownerStatement.setString(1, ownerID);
					ownerStatement.setString(2, fname);
					ownerStatement.setString(3, mname);
					ownerStatement.setString(4, lname);
					ownerStatement.setString(5, phone);
					ownerStatement.setInt(6, userLevel);
					ownerStatement.setString(7, ownerID + "iau.edu.sa");
					ownerStatement.setString(8, email);
					int ownRes = ownerStatement.executeUpdate();

					System.out.println("results: " + ownRes + " " + edResult + " bookre");
					// test result of excute Update
					if (ownRes != 0 && edResult != 0 && bookre != 0) {
						JOptionPane.showMessageDialog(null, "Data is updated");
					} else {
						JOptionPane.showMessageDialog(null, "Data is not updated");

					}

					Database.closeConnection();
				} catch (SQLException sql) {
					System.out.println(sql);
				}
			}
		});
		addButton.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		addButton.setBounds(54, 666, 85, 26);
		addButton.setText("إضافة");

		Button backButton = new Button(shell, SWT.NONE);
		backButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				AdminMenu am = new AdminMenu();
				shell.close();
				am.open();
			}
		});
		backButton.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		backButton.setBounds(150, 666, 85, 26);
		backButton.setText("رجوع");

		Label label = new Label(shell, SWT.NONE);
		label.setBounds(177, 72, 192, 21);
		label.setText("إضافة كتاب جديد");

		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBounds(22, 103, 167, 21);
		// get user name here to display
		String name = getUserName();
		label_1.setText("مرحباً ..." + name);

		bookIDTxt = new Text(shell, SWT.BORDER);
		bookIDTxt.setBounds(271, 170, 119, 24);

	}

	private String getUserName() {
		String usernameQuery = "SELECT adminName FROM kaff.admin WHERE adminID = ?";
		// String Query = "Select * from kaff.admin";
		String name = "";

		try {
			Database.openConnection();
			PreparedStatement bookStatement = Database.getConnection().prepareStatement(usernameQuery);
			// ResultSet resultSet = Database.getStatment().executeQuery(Query);

			// get admin id here, global variable?

			bookStatement.setString(1, "2180006622");
			bookStatement.executeQuery();
			ResultSet resultSet = bookStatement.getResultSet();
			while (resultSet.next())
				name = (String) resultSet.getString("adminName");
			Database.closeConnection();

		} catch (SQLException sqle) {
			System.out.println("get username error...");
		}
		return name;
	}
}
