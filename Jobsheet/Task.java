import javax.swing.*;

public class WisataKuliner {
    public static void main(String[] args) {
        JFrame frame = new JFrame("wisata kuliner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JLabel label1 = new JLabel("pilih satu:");
        frame.add(label1);

        JRadioButton soto = new JRadioButton("soto", true);
        JRadioButton rawon = new JRadioButton("rawon");
        JRadioButton sopBuntut = new JRadioButton("sop buntut");
        JRadioButton rujak = new JRadioButton("rujak");

        ButtonGroup group = new ButtonGroup();
        group.add(soto);
        group.add(rawon);
        group.add(sopBuntut);
        group.add(rujak);

        frame.add(soto);
        frame.add(rawon);
        frame.add(sopBuntut);
        frame.add(rujak);

        JLabel label2 = new JLabel("pilih beberapa:");
        frame.add(label2);

        JCheckBox bakso = new JCheckBox("bakso");
        JCheckBox kupang = new JCheckBox("kupang");
        JCheckBox tahuTek = new JCheckBox("tahu tek");
        JCheckBox rujakManis = new JCheckBox("rujak manis");

        frame.add(bakso);
        frame.add(kupang);
        frame.add(tahuTek);
        frame.add(rujakManis);

        frame.pack();
        frame.setVisible(true);
    }
}
