import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

public class AddressPanel extends JPanel {
	public AddressPanel() {
		initComponents();
	}

	private void initComponents() {
		// Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		JLabel nameLabel = new JLabel();
		nametField = new JTextField();
		JLabel phoneLabel = new JLabel();
		phoneField = new JTextField();
		JLabel zipCityLabel = new JLabel();
		zipField = new JTextField();
		cityField = new JTextField();
		JLabel countryLabel = new JLabel();
		countryField = new JTextField();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setLayout(new FormLayout(
			"[50dlu,pref], $lcgap, 50dlu, $lcgap, 100dlu:grow",
			"6*(pref, $lgap), pref"));

		//---- nameLabel ----
		nameLabel.setText("Name:");
		add(nameLabel, cc.xy(1, 1));
		add(nametField, cc.xywh(3, 1, 3, 1));

		//---- phoneLabel ----
		phoneLabel.setText("Phone:");
		add(phoneLabel, cc.xy(1, 3));
		add(phoneField, cc.xywh(3, 3, 3, 1));

		//---- zipCityLabel ----
		zipCityLabel.setText("ZIP / City:");
		add(zipCityLabel, cc.xy(1, 5));
		add(zipField, cc.xy(3, 5));
		add(cityField, cc.xy(5, 5));

		//---- countryLabel ----
		countryLabel.setText("Country:");
		add(countryLabel, cc.xy(1, 7));
		add(countryField, cc.xywh(3, 7, 3, 1));
		// End of component initialization  //GEN-END:initComponents
	}

	// Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JTextField nametField;
	private JTextField phoneField;
	private JTextField zipField;
	private JTextField cityField;
	private JTextField countryField;
	// End of variables declaration  //GEN-END:variables
}
