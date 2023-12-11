package mvc22f;

import javax.swing.*;

public final class PnlTask extends PnlAbsCtrl {
    private final JLabel jlTask = new JLabel("Set Task:");
    private final JLabel jlSpacer = new JLabel("        ");
    private final JComboBox<Task> jcbTask;
    public PnlTask(Model model) {
        super(model);
        jcbTask = new JComboBox<>(); // declare combo box
        for (Task task : Task.values()) { // populate combo box
            jcbTask.addItem(task);
        }
        jcbTask.addActionListener(ae -> selectTask()); // action listener

        add(jlTask); // usual stuff
        add(jlSpacer);
        add(jcbTask);
        System.out.println("In PnlTask c-tor");
    }
    private void selectTask(){
        Task task = jcbTask.getItemAt(jcbTask.getSelectedIndex());
        System.out.println("task: " + task);
        model.setTask(task);
        model.getView().repaint();
    }
}