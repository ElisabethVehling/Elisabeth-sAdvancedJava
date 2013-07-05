import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;


public class Rawr extends JFrame implements ActionListener  {

	ChatClient client;
	JTextArea pane;
	JTextField field;
	private JScrollPane scroll;


	public static void main(String[] args){
		new Rawr();
	}

	public Rawr() {

		super("Rawr Instant Messenger");
		setSize(new Dimension(400,600));
		setLayout(new BorderLayout());

		client = new ChatClient();

		initialize();

		Timer t = new Timer();
		t.scheduleAtFixedRate(new UpdateTask(), 0, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void initialize() {
		pane = new JTextArea(30,30);
		scroll = new JScrollPane(pane);
		add(scroll, BorderLayout.CENTER);


		field = new JTextField(20);
		field.addActionListener(this);
		add(field, BorderLayout.SOUTH);
	}

	public void update() {
		String update = client.getUpdate();
		while (! update.equals("")){
			String contents = pane.getText();
			pane.setText(update + contents);
			update= client.getUpdate();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== field) {
			String message = field.getText();
			if (! message.equals("")) {
				client.submit(message);
			}
			field.setText("");
			//tell my model to submit
		}
	}
	class UpdateTask extends TimerTask {
		public void run(){
			update();
		}

	}
}
