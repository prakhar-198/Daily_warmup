import java.awt.*;
import java.awt.event.*;

public class uiawt extends Frame {
    private Label nameLabel;
    private TextField nameTextField;
    private Label emailLabel;
    private TextField emailTextField;
    private Label eventLabel;
    private Choice eventChoice;
    private Button registerButton;

    public uiawt() {
        // Set frame properties
        setTitle("Event Registration");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Initialize UI components
        nameLabel = new Label("Name:");
        nameTextField = new TextField(20);
        emailLabel = new Label("Email:");
        emailTextField = new TextField(20);
        eventLabel = new Label("Event:");
        eventChoice = new Choice();
        eventChoice.add("Hackathon");
        eventChoice.add("Coding Competition");
        eventChoice.add("Tech Talk");
        registerButton = new Button("Register");

        // Add components to frame
        add(nameLabel);
        add(nameTextField);
        add(emailLabel);
        add(emailTextField);
        add(eventLabel);
        add(eventChoice);
        add(registerButton);

        // Add event listener for registerButton
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform registration logic here
                String name = nameTextField.getText();
                String email = emailTextField.getText();
                String event = eventChoice.getSelectedItem();
                System.out.println("Registered: Name=" + name + ", Email=" + email + ", Event=" + event);
                // Show success message or perform other actions as needed
            }
        });

        // Add window listener to handle closing the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        uiawt eventRegistrationUI = new uiawt();
        eventRegistrationUI.setVisible(true);
    }
}