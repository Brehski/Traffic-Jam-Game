import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
/**
 * Write a description of class Frame here.
 * 
 * @author Daniel Wong
 * @version 1.1
 */
public class Frame extends JFrame
{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private boolean isWon;
    private Board board;
    private ImageIcon left;
    private ImageIcon right;
    private ImageIcon empty;
    public JPanel ROCKSPANEL;

    /**
     * Constructor for objects of class Frame
     */
    public Frame()
    {
        this.board = new Board();
        board.initializeBoard();
        isWon = false;

        this.left = new ImageIcon("TJman_Left.gif");
        this.right = new ImageIcon("TJman_right.gif");
        this.empty = new ImageIcon("empty.gif");
        createButtons();
        createOtherButtons();
        //this.ROCKSPANEL = createButtons();
        setButtonImages();
        //this.add(ROCKSPANEL, BorderLayout.NORTH);
        setSize(900, 200);
    }

    public void setButtonImages()
    {
        if (board.getRock(1).info == 1)
        {
            this.button1.setIcon(right);
        }
        else if (board.getRock(1).info == -1)
        {
            this.button1.setIcon(left);
        }
        else
        {
            this.button1.setIcon(empty);
        }

        if (board.getRock(2).info == 1)
        {
            this.button2.setIcon(right);
        }
        else if (board.getRock(2).info == -1)
        {
            this.button2.setIcon(left);
        }
        else
        {
            this.button2.setIcon(empty);
        }

        if (board.getRock(3).info == 1)
        {
            this.button3.setIcon(right);
        }
        else if (board.getRock(3).info == -1)
        {
            this.button3.setIcon(left);
        }
        else
        {
            this.button3.setIcon(empty);
        }

        if (board.getRock(4).info == 1)
        {
            this.button4.setIcon(right);
        }
        else if (board.getRock(4).info == -1)
        {
            this.button4.setIcon(left);
        }
        else
        {
            this.button4.setIcon(empty);
        }

        if (board.getRock(5).info == 1)
        {
            this.button5.setIcon(right);
        }
        else if (board.getRock(5).info == -1)
        {
            this.button5.setIcon(left);
        }
        else
        {
            this.button5.setIcon(empty);
        }

        if (board.getRock(6).info == 1)
        {
            this.button6.setIcon(right);
        }
        else if (board.getRock(6).info == -1)
        {
            this.button6.setIcon(left);
        }
        else
        {
            this.button6.setIcon(empty);
        }

        if (board.getRock(7).info == 1)
        {
            this.button7.setIcon(right);
        }
        else if (board.getRock(7).info == -1)
        {
            this.button7.setIcon(left);
        }
        else
        {
            this.button7.setIcon(empty);
        }

        if (board.getRock(8).info == 1)
        {
            this.button8.setIcon(right);
        }
        else if (board.getRock(8).info == -1)
        {
            this.button8.setIcon(left);
        }
        else
        {
            this.button8.setIcon(empty);
        }

        if (board.getRock(9).info == 1)
        {
            this.button9.setIcon(right);
        }
        else if (board.getRock(9).info == -1)
        {
            this.button9.setIcon(left);
        }
        else
        {
            this.button9.setIcon(empty);
        }

        if (board.getRock(10).info == 1)
        {
            this.button10.setIcon(right);
        }
        else if (board.getRock(10).info == -1)
        {
            this.button10.setIcon(left);
        }
        else
        {
            this.button10.setIcon(empty);
        }

        if (board.getRock(11).info == 1)
        {
            this.button11.setIcon(right);
        }
        else if (board.getRock(11).info == -1)
        {
            this.button11.setIcon(left);
        }
        else
        {
            this.button11.setIcon(empty);
        }
    }

    public void createButtons()
    {
        JPanel panel = new JPanel();
        panel.setSize(900, 100);

        this.button1 = new JButton();
        this.button2 = new JButton();
        this.button3 = new JButton();
        this.button4 = new JButton();
        this.button5 = new JButton();
        this.button6= new JButton();
        this.button7= new JButton();
        this.button8= new JButton( );
        this.button9 = new JButton();
        this.button10 = new JButton();
        this.button11= new JButton();

        
        this.button1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    moveMade(1);
                    ROCKSPANEL.repaint();
                }

            });

        this.button2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    moveMade(2);
                    ROCKSPANEL.repaint();
                }

            });

        this.button3.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    moveMade(3);
                    ROCKSPANEL.repaint();
                }

            });
        this.button4.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    moveMade(4);
                    ROCKSPANEL.repaint();
                }

            });
        this.button5.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    moveMade(5);
                    ROCKSPANEL.repaint();
                }

            });
        this.button6.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    moveMade(6);
                    validate();
                    ROCKSPANEL.validate();
                    ROCKSPANEL.repaint();
                }

            });
        this.button7.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    moveMade(7);
                    ROCKSPANEL.repaint();
                }

            });
        this.button8.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    moveMade(8);

                }

            });
        this.button9.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    moveMade(9);

                }

            });

        this.button10.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    moveMade(10);

                }

            });

        this.button11.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    moveMade(11);

                }

            });
            
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);
        panel.add(button11);

        this.add(panel, BorderLayout.NORTH);
        //return panel;
    }
    
    public void createOtherButtons()
    {
        JPanel panel = new JPanel();
        JButton restartButton = new JButton("Restart");
        JButton helpButton = new JButton("Help");
        JButton quitButton = new JButton("Quit");
        
        
        restartButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event)
                {
                    board.initializeBoard();
                    setButtonImages();
                    validate();
                    repaint();
                }

            });
            
        helpButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event)
                {
                    
                    JOptionPane.showMessageDialog(null, "Move all of the people on the opposite side! Click Restart when you are stuck, and click Quit when you are done!", "Help", 1);
                }

            });
        quitButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event)
                {
                    System.exit(1);
                }

            });
            
        panel.add(restartButton);
        panel.add(helpButton);
        panel.add(quitButton);
        this.add(panel, BorderLayout.SOUTH);
    }

    public void moveMade(int move)
    {
        int direction = board.getRock(move).info;
        if (direction == 1)
        {
            board.moveValidRight(move);
        }
        // if the piece is to the left
        else if (direction == -1)
        {
            board.moveValidLeft(move);
        }
        
        if (board.isWon())
        {
            JOptionPane.showMessageDialog(null, "Congratulations, you win!", "You win!", 1);
        }
        setButtonImages();
        validate();
        repaint();
    }

}
