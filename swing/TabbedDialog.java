import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

public class TabbedDialog extends JDialog {
	public TabbedDialog(Window owner) {
		super(owner);
		initComponents();
	}

	private void initComponents() {
		// Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		dialogPane = new JPanel();
		contentPane = new JPanel();
		tabbedPane = new JTabbedPane();
		tab1Panel = new Tab1Panel();
		tab2Panel = new Tab2Panel();
		buttonBar = new JPanel();
		okButton = new JButton();
		cancelButton = new JButton();
		descLabel = new JLabel();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		Container contentPane2 = getContentPane();
		contentPane2.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(Borders.DIALOG_BORDER);
			dialogPane.setLayout(new BorderLayout());

			//======== contentPane ========
			{
				contentPane.setLayout(new BorderLayout());

				//======== tabbedPane ========
				{
					tabbedPane.addTab("tab 1", tab1Panel);
					tabbedPane.addTab("tab 2", tab2Panel);
				}
				contentPane.add(tabbedPane, BorderLayout.CENTER);
			}
			dialogPane.add(contentPane, BorderLayout.CENTER);

			//======== buttonBar ========
			{
				buttonBar.setBorder(Borders.BUTTON_BAR_GAP_BORDER);
				buttonBar.setLayout(new FormLayout(
					"$glue, $button, $rgap, $button",
					"pref"));

				//---- okButton ----
				okButton.setText("OK");
				buttonBar.add(okButton, cc.xy(2, 1));

				//---- cancelButton ----
				cancelButton.setText("Cancel");
				buttonBar.add(cancelButton, cc.xy(4, 1));
			}
			dialogPane.add(buttonBar, BorderLayout.SOUTH);
		}
		contentPane2.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());

		//---- descLabel ----
		descLabel.setText("<html>This example demonstrates JFormDesigner's advanced code generation. It is possible to let JFormDesigner generate nested classes for components. In this example, each tab has its own nested class. Components with classes are marked with a round green overlay icon in the \"Structure\" view. You can set the class name in the \"Code Generation\" category in the \"Properties\" view.</html>");
		descLabel.setBackground(Color.white);
		descLabel.setOpaque(true);
		descLabel.setVerticalAlignment(SwingConstants.TOP);
		// End of component initialization  //GEN-END:initComponents
	}

	// Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel dialogPane;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private Tab1Panel tab1Panel;
	private Tab2Panel tab2Panel;
	private JPanel buttonBar;
	private JButton okButton;
	private JButton cancelButton;
	private JLabel descLabel;
	// End of variables declaration  //GEN-END:variables

	private class Tab1Panel extends JPanel {
		private Tab1Panel() {
			initComponents();
		}

		private void initComponents() {
			// Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
			label2 = new JLabel();
			textField1 = new JTextField();
			CellConstraints cc = new CellConstraints();

			//======== this ========
			setBorder(Borders.TABBED_DIALOG_BORDER);
			setLayout(new FormLayout(
				"default, $lcgap, default:grow",
				"2*(default, $lgap), default"));

			//---- label2 ----
			label2.setText("text");
			add(label2, cc.xy(1, 1));
			add(textField1, cc.xy(3, 1));
			// End of component initialization  //GEN-END:initComponents
		}

		// Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
		private JLabel label2;
		private JTextField textField1;
		// End of variables declaration  //GEN-END:variables
	}

	private class Tab2Panel extends JPanel {
		private Tab2Panel() {
			initComponents();
		}

		private void initComponents() {
			// Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
			label3 = new JLabel();
			checkBox1 = new JCheckBox();
			CellConstraints cc = new CellConstraints();

			//======== this ========
			setBorder(Borders.TABBED_DIALOG_BORDER);
			setLayout(new FormLayout(
				"default, $lcgap, default",
				"2*(default, $lgap), default"));

			//---- label3 ----
			label3.setText("text");
			add(label3, cc.xy(1, 1));

			//---- checkBox1 ----
			checkBox1.setText("text");
			add(checkBox1, cc.xy(3, 1));
			// End of component initialization  //GEN-END:initComponents
		}

		// Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
		private JLabel label3;
		private JCheckBox checkBox1;
		// End of variables declaration  //GEN-END:variables
	}
}
