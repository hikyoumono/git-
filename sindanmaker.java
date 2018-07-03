import javax.swing.*;

public class sindanmaker extends JFrame implements ActionListener{
int syukei = 0;
//集計する項目を増やす可能性有り
public static void main(String[] args){
sindanmaker zi = new sindanmaker();
zi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
zi.setBounds(200, 10, 1000, 700);
zi.setTitle("game");
zi.setVisible(true);
}

public sindanmaker(){
//scene1
JPanel scene1 = new JPanel();
JLabel jl = JLabel("質問");
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
button1.addActionListener(this);
scene1.add(jl);
scene1.add(button1);
add(scene1);

//scene2
JPanel scene2 = new JPanel();

add(scene2);
}

//後でoverrideするかも
public void actionPerformed(ActionEvent e){
//if文の中身は最終的にメソッドにして選択肢を並び替える予定

if(e.getSource() == button1){
//今の閉じる
//次の画面開く
syukei += 1;
}else if(e.getSource() == button2){
//今の画面を閉じる
//次の画面を開く
syukei += 2;
}else if(e.getSource() == button3){
//今の画面を閉じる
//次の画面を開く
syukei += 3;
}else if(e.getSource() == button4){
//今の画面を閉じる
//次の画面を開く
syukei += 4;
}
}

}