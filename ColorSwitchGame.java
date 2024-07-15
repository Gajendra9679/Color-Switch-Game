import java.awt.*;
import java.awt.event.*;

class ColorSwitchGame extends Frame
{
    TextField st1[] = new TextField[4];
    TextField st2[] = new TextField[4];
    TextField st3[] = new TextField[4];
    TextField st4[] = new TextField[4];
    TextField st5[] = new TextField[4]; 
    TextField tf1 = new TextField();
    Button btn1,btn2,btn3,btn4,btn5;
    Label res;

    int st1height = 420;
    int st2height = 420;
    int st3height = 420;
    int st4height = 420;
    int st5height = 420;
    Font f1 = new Font("Arial" , Font.BOLD , 28);
    Font f2 = new Font("Arial" , Font.BOLD , 23);
    Font f3 = new Font("Arial" , Font.BOLD , 40);

    public ColorSwitchGame()
    {
        setLayout(null);
        setBackground(new Color(255,165,0));

        Label lb = new Label("Selected Color :- ");
        lb.setBounds(250,100,220,40);
        lb.setFont(f1);
        add(lb);

        tf1 = new TextField(15);
        tf1.setBounds(490,100,200,40);
        tf1.setFont(f2);
        tf1.setEditable(false);
        add(tf1);

        

        for(int i = 0 ; i < 4; i++)
        {
            st1[i] = new TextField(12);
            st1[i].setBounds(150,st1height,150,40);
            st1[i].setFont(f2);
            st1[i].setEditable(false);
            add(st1[i]);
            st1height = st1height - 40;
        }

        btn1 = new  Button("Stack 1");
        btn1.setBounds(165,500,120,40);
        btn1.setFont(f2);
        add(btn1);

        st1[0].setText("Red");
        st1[1].setText("Green");
        st1[2].setText("Blue");
        st1[3].setText("Yellow");


        for(int i = 0 ; i < 4; i++)
        {
            st2[i] = new TextField(12);
            st2[i].setBounds(340,st2height,150,40);
            st2[i].setFont(f2);
            st2[i].setEditable(false);
            add(st2[i]);
            st2height = st2height - 40;
        }

        btn2 = new  Button("Stack 2");
        btn2.setBounds(355,500,120,40);
        btn2.setFont(f2);
        add(btn2);

        st2[0].setText("Blue");
        st2[1].setText("Red");
        st2[2].setText("Yellow");
        st2[3].setText("Green");


        for(int i = 0 ; i < 4; i++)
        {
            st3[i] = new TextField(12);
            st3[i].setBounds(530,st3height,150,40);
            st3[i].setFont(f2);
            st3[i].setEditable(false);
            add(st3[i]);
            st3height = st3height - 40;
        }

        btn3 = new  Button("Stack 3");
        btn3.setBounds(545,500,120,40);
        btn3.setFont(f2);
        add(btn3);

        st3[0].setText("Green");
        st3[1].setText("Yellow");
        st3[2].setText("Blue");
        st3[3].setText("Red");


        for(int i = 0 ; i < 4; i++)
        {
            st4[i] = new TextField(12);
            st4[i].setBounds(720,st4height,150,40);
            st4[i].setFont(f2);
            st4[i].setEditable(false);
            add(st4[i]);
            st4height = st4height - 40;
        }

        btn4 = new  Button("Stack 4");
        btn4.setBounds(735,500,120,40);
        btn4.setFont(f2);
        add(btn4);

        st4[0].setText("Yellow");
        st4[1].setText("Red");
        st4[2].setText("Blue");
        st4[3].setText("Green");

        for(int i = 0 ; i < 4; i++)
        {
            st5[i] = new TextField(12);
            st5[i].setBounds(910,st5height,150,40);
            st5[i].setFont(f2);
            st5[i].setEditable(false);
            add(st5[i]);
            st5height = st5height - 40;
        }
        btn5 = new  Button("Stack 5");
        btn5.setBounds(925,500,120,40);
        btn5.setFont(f2);
        add(btn5);

        res = new Label("");
        res.setBounds(200,650,600,40);
        res.setFont(f3);
        add(res);

        btn1.addActionListener(new Stack1());
        btn2.addActionListener(new Stack2());
        btn3.addActionListener(new Stack3());
        btn4.addActionListener(new Stack4());
        btn5.addActionListener(new Stack5());
    }

    public void checkWinner()
    {
        if((st1[0].getText().equals("Red") && st1[1].getText().equals("Red") && st1[2].getText().equals("Red") && st1[3].getText().equals("Red")) || (st1[0].getText().equals("Green") && st1[1].getText().equals("Green") && st1[2].getText().equals("Green") && st1[3].getText().equals("Green")) || (st1[0].getText().equals("Blue") && st1[1].getText().equals("Blue") && st1[2].getText().equals("Blue") && st1[3].getText().equals("Blue")) || (st1[0].getText().equals("Yellow") && st1[1].getText().equals("Yellow") && st1[2].getText().equals("Yellow") && st1[3].getText().equals("Yellow")) || (st1[0].getText().equals("") && st1[1].getText().equals("") && st1[2].getText().equals("") && st1[3].getText().equals("")))  
        {
            if((st2[0].getText().equals("Red") && st2[1].getText().equals("Red") && st2[2].getText().equals("Red") && st2[3].getText().equals("Red")) || (st2[0].getText().equals("Green") && st2[1].getText().equals("Green") && st2[2].getText().equals("Green") && st2[3].getText().equals("Green")) || (st2[0].getText().equals("Blue") && st2[1].getText().equals("Blue") && st2[2].getText().equals("Blue") && st2[3].getText().equals("Blue")) || (st2[0].getText().equals("Yellow") && st2[1].getText().equals("Yellow") && st2[2].getText().equals("Yellow") && st2[3].getText().equals("Yellow"))|| (st2[0].getText().equals("") && st2[1].getText().equals("") && st2[2].getText().equals("") && st2[3].getText().equals("")))  
            {
                if((st3[0].getText().equals("Red") && st3[1].getText().equals("Red") && st3[2].getText().equals("Red") && st3[3].getText().equals("Red")) || (st3[0].getText().equals("Green") && st3[1].getText().equals("Green") && st3[2].getText().equals("Green") && st3[3].getText().equals("Green")) || (st3[0].getText().equals("Blue") && st3[1].getText().equals("Blue") && st3[2].getText().equals("Blue") && st3[3].getText().equals("Blue")) || (st3[0].getText().equals("Yellow") && st3[1].getText().equals("Yellow") && st3[2].getText().equals("Yellow") && st3[3].getText().equals("Yellow"))|| (st3[0].getText().equals("") && st3[1].getText().equals("") && st3[2].getText().equals("") && st3[3].getText().equals("")))  
                {
                    if((st4[0].getText().equals("Red") && st4[1].getText().equals("Red") && st4[2].getText().equals("Red") && st4[3].getText().equals("Red")) || (st4[0].getText().equals("Green") && st4[1].getText().equals("Green") && st4[2].getText().equals("Green") && st4[3].getText().equals("Green")) || (st4[0].getText().equals("Blue") && st4[1].getText().equals("Blue") && st4[2].getText().equals("Blue") && st4[3].getText().equals("Blue")) || (st4[0].getText().equals("Yellow") && st4[1].getText().equals("Yellow") && st4[2].getText().equals("Yellow") && st4[3].getText().equals("Yellow"))|| (st4[0].getText().equals("") && st4[1].getText().equals("") && st4[2].getText().equals("") && st4[3].getText().equals("")))  
                    {
                        if((st1[0].getText().equals("Red") && st1[1].getText().equals("Red") && st1[2].getText().equals("Red") && st1[3].getText().equals("Red")) || (st5[0].getText().equals("Green") && st5[1].getText().equals("Green") && st5[2].getText().equals("Green") && st5[3].getText().equals("Green")) || (st5[0].getText().equals("Blue") && st5[1].getText().equals("Blue") && st5[2].getText().equals("Blue") && st5[3].getText().equals("Blue")) || (st1[0].getText().equals("Yellow") && st1[1].getText().equals("Yellow") && st1[2].getText().equals("Yellow") && st1[3].getText().equals("Yellow"))|| (st5[0].getText().equals("") && st1[5].getText().equals("") && st5[2].getText().equals("") && st5[3].getText().equals("")))  
                        {
                            res.setText("Level Succesfully Completed...!");
                        }
                    }
                }
            }   
        }
    }

    class Stack1 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s1 = tf1.getText();
            String s2;
            if(s1.isEmpty())
            {
                for(int i = 3 ; i >= 0 ; i--)
                {
                    s2 = st1[i].getText();
                    if(!s2.isEmpty())
                    {
                        tf1.setText(s2);
                        st1[i].setText("");
                        break;
                    }
                }
            }
            else
            {
                for(int i = 0 ; i<=3 ; i++)
                {
                    s2 = st1[i].getText();
                    if(s2.isEmpty())
                    {
                        st1[i].setText(s1);
                        tf1.setText("");
                        break;
                    } 
                }
            }
            checkWinner();
            checkWinner();
        }
    }

    class Stack2 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s1 = tf1.getText();
            String s2;
            if(s1.isEmpty())
            {
                for(int i = 3 ; i >= 0 ; i--)
                {
                    s2 = st2[i].getText();
                    if(!s2.isEmpty())
                    {
                        tf1.setText(s2);
                        st2[i].setText("");
                        break;
                    }
                }
            }
            else
            {
                for(int i = 0 ; i<=3 ; i++)
                {
                    s2 = st2[i].getText();
                    if(s2.isEmpty())
                    {
                        st2[i].setText(s1);
                        tf1.setText("");
                        break;
                    } 
                }
            }
            checkWinner();    
        }
    }

    class Stack3 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s1 = tf1.getText();
            String s2;
            if(s1.isEmpty())
            {
                for(int i = 3 ; i >= 0 ; i--)
                {
                    s2 = st3[i].getText();
                    if(!s2.isEmpty())
                    {
                        tf1.setText(s2);
                        st3[i].setText("");
                        break;
                    }
                }
            }
            else
            {
                for(int i = 0 ; i<=3 ; i++)
                {
                    s2 = st3[i].getText();
                    if(s2.isEmpty())
                    {
                        st3[i].setText(s1);
                        tf1.setText("");
                        break;
                    } 
                }
            }
            checkWinner();
        }
    }

    class Stack4 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s1 = tf1.getText();
            String s2;
            if(s1.isEmpty())
            {
                for(int i = 3 ; i >= 0 ; i--)
                {
                    s2 = st4[i].getText();
                    if(!s2.isEmpty())
                    {
                        tf1.setText(s2);
                        st4[i].setText("");
                        break;
                    }
                }
            }
            else
            {
                for(int i = 0 ; i<=3 ; i++)
                {
                    s2 = st4[i].getText();
                    if(s2.isEmpty())
                    {
                        st4[i].setText(s1);
                        tf1.setText("");
                        break;
                    } 
                }
            }
            checkWinner();

        }
    }

    class Stack5 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s1 = tf1.getText();
            String s2;
            if(s1.isEmpty())
            {
                for(int i = 3 ; i >= 0 ; i--)
                {
                    s2 = st5[i].getText();
                    if(!s2.isEmpty())
                    {
                        tf1.setText(s2);
                        st5[i].setText("");
                        break;
                    }
                }
            }
            else
            {
                for(int i = 0 ; i<=3 ; i++)
                {
                    s2 = st5[i].getText();
                    if(s2.isEmpty())
                    {
                        st5[i].setText(s1);
                        tf1.setText("");
                        break;
                    } 
                }
            }
            checkWinner();
        }
    }

    public static void main(String ar[])
    {
        ColorSwitchGame csg = new ColorSwitchGame();
        csg.setVisible(true);
        csg.setSize(1200,1000);
    }
}