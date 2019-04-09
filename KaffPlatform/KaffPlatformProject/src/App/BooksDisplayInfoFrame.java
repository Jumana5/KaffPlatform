package App;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.wb.swt.SWTResourceManager;

import Dialogs.Right;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Combo;

public class BooksDisplayInfoFrame {
// just test 2
	protected Shell shell;
	private Table booksTable;
	private Text bookIDTxt;
	private Text bookTitleTxt;
	private Text bookTypeTxt;
	private Text bookEdition;
	private Text bookPriceTxt;
	private Combo comboBookLevel;
	Group groupAvailable;
	Button buttonNotAva;
	Button buttonAva, 	saleButton, borrowBtn, freeButton;
	Button backBtn,  editBtn, cancelBtn, deleteBtn;

	/**
	 * Launch the application.
	 * 
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
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\logo small.png"));
		shell.setBackgroundImage(null);
		// shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setSize(1200, 700);
		shell.setText("عرض  معلومات الكتب");

		Label headerLabel = new Label(shell, SWT.NONE);
		headerLabel.setImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\KaffPlatformheader.jpg"));
		headerLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		headerLabel.setBounds(610, 0, 574, 50);

		Label booksLabel = new Label(shell, SWT.NONE);
		booksLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		booksLabel.setFont(SWTResourceManager.getFont("B Badr", 14, SWT.NORMAL));
		booksLabel.setForeground(SWTResourceManager.getColor(210, 105, 30));
		booksLabel.setAlignment(SWT.CENTER);
		booksLabel.setBounds(33, 71, 607, 59);
		booksLabel.setText("جدول معلومات الكتب");

		ViewForm viewForm = new ViewForm(shell, SWT.NONE);
		viewForm.setBounds(33, 136, 625, 498);

		booksTable = new Table(viewForm, SWT.BORDER | SWT.FULL_SELECTION | SWT.VIRTUAL);
		viewForm.setContent(booksTable);
		booksTable.setHeaderVisible(true);
		booksTable.setLinesVisible(true);
		fillTable();

		Button AvailableBooksButton = new Button(viewForm, SWT.NONE);
		viewForm.setTopLeft(AvailableBooksButton);
		AvailableBooksButton.setText("عرض الكتب المتاحة");

		Button SoldBooksButton = new Button(viewForm, SWT.NONE);
		viewForm.setTopCenter(SoldBooksButton);
		SoldBooksButton.setText("عرض جميع الكتب");

		Button borrowedBooksButton = new Button(viewForm, SWT.NONE);
		viewForm.setTopRight(borrowedBooksButton);
		borrowedBooksButton.setText("عرض الكتب المعارة");

		bookIDTxt = new Text(shell, SWT.BORDER);
		bookIDTxt.setBounds(863, 190, 119, 24);

		Label bookIDLabel = new Label(shell, SWT.NONE);
		bookIDLabel.setText("رمز الكتاب");
		bookIDLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		bookIDLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		bookIDLabel.setBounds(1007, 187, 119, 32);

		bookTitleTxt = new Text(shell, SWT.BORDER);
		bookTitleTxt.setBounds(715, 228, 267, 24);

		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setText("عنوان الكتاب");
		label_1.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_1.setBounds(1007, 228, 119, 28);

		bookEdition = new Text(shell, SWT.BORDER);
		bookEdition.setBounds(863, 274, 119, 24);

		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setText("إصدار الكتاب");
		label_2.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_2.setBounds(1007, 271, 119, 28);

		groupAvailable = new Group(shell, SWT.NONE);
		groupAvailable.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		groupAvailable.setBounds(715, 320, 267, 35);

		buttonAva = new Button(groupAvailable, SWT.RADIO);
		buttonAva.setText("متوفر");
		buttonAva.setSelection(true);
		buttonAva.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		buttonAva.setBounds(42, 10, 73, 21);

		buttonNotAva = new Button(groupAvailable, SWT.RADIO);
		buttonNotAva.setText("غير متوفر");
		buttonNotAva.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		buttonNotAva.setBounds(148, 10, 98, 21);

		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setText("المستوى");
		label_3.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_3.setBounds(1007, 383, 64, 27);

		comboBookLevel = new Combo(shell, SWT.NONE);
		comboBookLevel.setItems(new String[] { "3", "4", "5", "6", "7", "8", "9", "10" });
		comboBookLevel.setBounds(918, 387, 64, 25);
		comboBookLevel.select(0);

		Group groupBookType = new Group(shell, SWT.NONE);
		groupBookType.setBounds(743, 439, 334, 24);

		freeButton = new Button(groupBookType, SWT.RADIO);
		freeButton.setText("مجاناً");
		freeButton.setSelection(true);
		freeButton.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		freeButton.setBounds(21, 0, 73, 21);

		borrowBtn = new Button(groupBookType, SWT.RADIO);
		borrowBtn.setText("إعارة");
		borrowBtn.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		borrowBtn.setBounds(130, 0, 73, 21);

		
	
		saleButton = new Button(groupBookType, SWT.RADIO);
		saleButton.setText("للبيع");
		saleButton.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		saleButton.setBounds(233, 0, 80, 21);

		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setText("السعر");
		label_4.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_4.setBounds(1007, 484, 119, 28);

		bookPriceTxt = new Text(shell, SWT.BORDER);
		bookPriceTxt.setBounds(918, 487, 64, 24);

		 backBtn = new Button(shell, SWT.NONE);
		backBtn.setText("رجوع");
		backBtn.setForeground(SWTResourceManager.getColor(255, 255, 255));
		backBtn.setFont(SWTResourceManager.getFont("Dubai", 13, SWT.BOLD));
		backBtn.setBackground(SWTResourceManager.getColor(128, 128, 128));
		backBtn.setBounds(1026, 551, 76, 35);
		
		editBtn = new Button(shell, SWT.NONE);
		editBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//set row with the data in the text fields... 
				
			}
		});
		editBtn.setText("تعديل");
		editBtn.setForeground(SWTResourceManager.getColor(255, 255, 255));
		editBtn.setFont(SWTResourceManager.getFont("Dubai", 13, SWT.BOLD));
		editBtn.setBackground(SWTResourceManager.getColor(128, 128, 128));
		editBtn.setBounds(839, 551, 76, 35);

		cancelBtn = new Button(shell, SWT.NONE);
		cancelBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// make all text fields empty
				bookIDTxt.setText("");
				bookTitleTxt.setText("");
				bookEdition.setText("");
				comboBookLevel.select(0);
				bookPriceTxt.setText("0.0");
			}
		});
		cancelBtn.setText("إلغاء");
		cancelBtn.setForeground(SWTResourceManager.getColor(255, 255, 255));
		cancelBtn.setFont(SWTResourceManager.getFont("Dubai", 13, SWT.BOLD));
		cancelBtn.setBackground(SWTResourceManager.getColor(128, 128, 128));
		cancelBtn.setBounds(743, 551, 76, 35);

		Label label_5 = new Label(shell, SWT.NONE);
		label_5.setText("تعديل معلــــــومات الكتاب");
		label_5.setForeground(SWTResourceManager.getColor(0, 0, 0));
		label_5.setFont(SWTResourceManager.getFont("Dubai", 16, SWT.BOLD));
		label_5.setBackground(SWTResourceManager.getColor(255, 255, 255));
		label_5.setAlignment(SWT.CENTER);
		label_5.setBounds(725, 115, 412, 50);

		Label label_6 = new Label(shell, SWT.NONE);
		label_6.setImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\KaffPlatformheader.jpg"));
		label_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_6.setBounds(150, 0, 469, 50);

		Label label_7 = new Label(shell, SWT.NONE);
		label_7.setImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\bin\\KaffPlatformheader.jpg"));
		label_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_7.setBounds(0, 0, 469, 50);

		 deleteBtn = new Button(shell, SWT.NONE);
		
		deleteBtn.setText("حذف");
		deleteBtn.setForeground(SWTResourceManager.getColor(255, 255, 255));
		deleteBtn.setFont(SWTResourceManager.getFont("Dubai", 13, SWT.BOLD));
		deleteBtn.setBackground(SWTResourceManager.getColor(128, 128, 128));
		deleteBtn.setBounds(933, 551, 76, 35);

	}

	private void fillTable() {
		/*
		 * bookStatement.setString(1, bookTitle); bookStatement.setInt(2, bookLevel);
		 * bookStatement.setString(3, type); bookStatement.setDouble(4, price);
		 * bookStatement.setBoolean(5, available); bookStatement.setString(6, edition);
		 */

		String bookQuery = "select * from kaff.book";

		TableColumn bookIDCol = new TableColumn(booksTable, SWT.LEFT);
		TableColumn bookTitleCol = new TableColumn(booksTable, SWT.LEFT);
		TableColumn bookLevelCol = new TableColumn(booksTable, SWT.LEFT);

		TableColumn bookTypeCol = new TableColumn(booksTable, SWT.LEFT);
		TableColumn bookPriceCol = new TableColumn(booksTable, SWT.LEFT);
		TableColumn bookAvaCol = new TableColumn(booksTable, SWT.LEFT);
		TableColumn bookEdCol = new TableColumn(booksTable, SWT.LEFT);
		TableColumn bookOwnerCol = new TableColumn(booksTable, SWT.LEFT);

		bookIDCol.setText("رمز الكتاب");
		bookTitleCol.setText("عنوان الكتاب");
		bookLevelCol.setText("المستوى");
		bookTypeCol.setText("النوع");
		bookAvaCol.setText("الإتاحة");
		bookPriceCol.setText("سعر الكتاب");
		bookEdCol.setText("الإصدار");
		bookOwnerCol.setText("صاحبة الكتاب");

		bookIDCol.setWidth(70);
		bookTitleCol.setWidth(100);
		bookLevelCol.setWidth(50);
		bookTypeCol.setWidth(70);
		bookPriceCol.setWidth(80);
		bookAvaCol.setWidth(60);
		bookEdCol.setWidth(70);
		bookOwnerCol.setWidth(100);

		booksTable.setItemCount(8);

		booksTable.addListener(SWT.SetData, new Listener() {
			public void handleEvent(Event event) {
				TableItem item = (TableItem) event.item;

				try {
					Database.openConnection();
					ResultSet resultSet = Database.getStatment().executeQuery(bookQuery);
					int count = resultSet.getMetaData().getColumnCount();

					while (resultSet.next()) {
						// Create a new TableItem for each entry in the result set (each row)
						item = new TableItem(booksTable, SWT.NONE);
						item.setText(new String[] { resultSet.getString(1), resultSet.getString(2),
								resultSet.getString(3), resultSet.getString(4), resultSet.getString(5),
								resultSet.getString(6), resultSet.getString(7), resultSet.getString(8) });
					}
					
					Database.closeConnection();

				} catch (SQLException e) {
					System.out.println("Cannot connect to databse server.");
					e.printStackTrace();
				}
			}
		});
		try {

			booksTable.addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event e) {
					String bookID = "";
					TableItem[] selection = booksTable.getSelection();
					for (int i = 0; i < selection.length; i++) {
						bookID += selection[i].getText() + " ";
						System.out.println(selection[i]);
					}
					System.out.println(bookID);
					FillTextFields(bookID);
//				bookIDTxt.setText(selection[0].getText());
//				bookTitleTxt.setText(selection[1].getText());
//				bookEdition.setText(selection[2].getText());
//				bookPriceTxt.setText(selection[3].getText());

				}
			});
		} catch (IndexOutOfBoundsException ioe) {
			System.out.println("Array of out of bound...");
		}

		// TableItem
//		bookStatement.setString(1, bookTitle);
//		bookStatement.setInt(2, bookLevel);
//		bookStatement.setString(3, type);
//		bookStatement.setDouble(4, price);
//		bookStatement.setBoolean(5, available);
//		bookStatement.setString(6, edition);
	}

	protected void FillTextFields(String bookID) {

		String bookQuery = "SELECT * FROM kaff.book WHERE bookID = ?";
		String ownerQuery = "SELECT userName FROM kaff.user WHERE userID = ?";
		String deleteBookQuery = "DELETE FROM kaff.book WHERE bookID = ?";
		String updateQuery = "Update kaff.book set bookTitle = ? , "
				+ "bookLevel = ?, bookType = ?, bookPrice = ?, available = ?, edition = ?, ownerID = ?, where bookId = ?";
		

		try {
			Database.openConnection();
			PreparedStatement bookStatement = Database.getConnection().prepareStatement(bookQuery);
			PreparedStatement deleteStatement = Database.getConnection().prepareStatement(deleteBookQuery);
			PreparedStatement ownerStatement = Database.getConnection().prepareStatement(ownerQuery);
			PreparedStatement updateBook = Database.getConnection().prepareStatement(updateQuery);
			bookStatement.setString(1, bookID);
			deleteStatement.setString(1, bookID);
			bookStatement.executeQuery();
			ResultSet resultSet = bookStatement.getResultSet();
			bookIDTxt.setText(bookID);
			/*
			 * bookTitle bookLevel bookType bookPrice available edition ownerID
			 */
			while (resultSet.next()) {
				bookTitleTxt.setText((String) resultSet.getString("bookTitle"));
				int level = Integer.parseInt(resultSet.getString("bookLevel"));
				comboBookLevel.select(level);
				String type = resultSet.getString("bookType");
				if(type.equals("مجاناً"))
					freeButton.setSelection(true);
				else if(type.equals("للبيع"))
					saleButton.setSelection(true);
				else if (type.equals("إعارة"))
					borrowBtn.setSelection(true);
				
				bookPriceTxt.setText(resultSet.getString("bookPrice"));
				String ava = resultSet.getString("available");
				if(ava.equals("1"))
					buttonAva.setSelection(true);
				else
					buttonNotAva.setSelection(true);
					
				bookEdition.setText(resultSet.getString("edition"));
				
			}
			
			deleteBtn.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					try {
						ResultSet re = deleteStatement.executeQuery(deleteBookQuery);
						Right r = new Right();
						r.open();
					} catch (SQLException e1) {
						//add log
						System.out.println("Error deleting the row...");
					}
				}
			});
			
			editBtn.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					try {
						ResultSet re = deleteStatement.executeQuery(deleteBookQuery);
						Right r = new Right();
						r.open();
					} catch (SQLException e1) {
						//add log
						System.out.println("Error deleting the row...");
					}
				}
				
			});
			
			Database.closeConnection();

		} catch (SQLException sqle) {
			System.out.println("get username error...");
		}
	}

}
