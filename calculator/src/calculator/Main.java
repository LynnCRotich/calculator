
package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main extends JFrame{
      private JTextField afield;
      private JButton C,off,on,one,two,three,four,five,six,seven,eight,nine,zero,decimal,add,sub,multiply,div,equals,del;
      private String tmp1,tmp2,lanswer;
      private double answer = 0.0;
      private JPanel contentPanel;
      private JLabel lab1,lab2,lab3,lab4,lab5,lab6;
      private boolean equalsIsClicked = false, opChosen = false;
      char operation = ' ' ;
      
      public Main(){
    	  super("Calculator");
    	  
    	  afield = new JTextField(null, 25);
    	  afield.setEditable(false);
    	 
          lab1 = new JLabel(" ");
          lab2 = new JLabel(" ");
          C = new JButton("C");
          off = new JButton("Off");
          on = new JButton("On");
          seven = new JButton("7");
    	  eight = new JButton("8");
    	  nine = new JButton("9"); 
          add = new JButton("+");
    	  sub = new JButton("-");
          four = new JButton("4");
    	  five = new JButton("5");
    	  six = new JButton("6");
          multiply = new JButton("*");
    	  div = new JButton("/");
    	  one = new JButton("1");
    	  two = new JButton("2");
    	  three = new JButton("3");
          lab3 = new JLabel(" ");
          lab4 = new JLabel(" ");
    	  zero = new JButton("0");
          decimal = new JButton(".");
          lab5 = new JLabel(" ");
          del = new JButton("del");
    	  equals = new JButton("=");
          lab6 = new JLabel(" ");
          
          
          
          Dimension dim = new Dimension(55,25);
          
          C.setPreferredSize(dim);
          off.setPreferredSize(dim);
          on.setPreferredSize(dim);
          one.setPreferredSize(dim);
          two.setPreferredSize(dim);
          three.setPreferredSize(dim);
          four.setPreferredSize(dim);
          five.setPreferredSize(dim);
          six.setPreferredSize(dim);
          seven.setPreferredSize(dim);
          eight.setPreferredSize(dim);
          nine.setPreferredSize(dim);
          zero.setPreferredSize(dim);
          add.setPreferredSize(dim);
          sub.setPreferredSize(dim);
          multiply.setPreferredSize(dim);
          div.setPreferredSize(dim);
          equals.setPreferredSize(dim);
          decimal.setPreferredSize(dim);
          lab1.setPreferredSize(dim);
          lab2.setPreferredSize(dim);
          lab3.setPreferredSize(dim);
          lab4.setPreferredSize(dim);
          lab5.setPreferredSize(dim);
          lab6.setPreferredSize(dim);
          del.setPreferredSize(dim);
          
          Numbers n = new Numbers();
          Calculation c = new Calculation();
          
          one.addActionListener(n);two.addActionListener(n);three.addActionListener(n);four.addActionListener(n);
          five.addActionListener(n);six.addActionListener(n);seven.addActionListener(n);eight.addActionListener(n);
          nine.addActionListener(n);zero.addActionListener(n);decimal.addActionListener(n);del.addActionListener(n);
          on.addActionListener(n);off.addActionListener(n);
          
          add.addActionListener(c);sub.addActionListener(c);multiply.addActionListener(c);div.addActionListener(c);
          equals.addActionListener(c);C.addActionListener(c);
    	  
    	  contentPanel = new JPanel();
    	  contentPanel.setBackground(Color.PINK);
    	  contentPanel.setLayout(new FlowLayout());
          
    	  contentPanel.add(afield, BorderLayout.NORTH);
          contentPanel.add(lab1);contentPanel.add(lab2);contentPanel.add(C);contentPanel.add(off);
          contentPanel.add(on);contentPanel.add(seven);contentPanel.add(eight);
          contentPanel.add(nine);contentPanel.add(add);contentPanel.add(sub);contentPanel.add(four);
          contentPanel.add(five);contentPanel.add(six);contentPanel.add(multiply);contentPanel.add(div);
          contentPanel.add(one);contentPanel.add(two);contentPanel.add(three);contentPanel.add(lab3);
          contentPanel.add(lab4);contentPanel.add(zero);contentPanel.add(decimal);contentPanel.add(lab5);
          contentPanel.add(del);contentPanel.add(equals);contentPanel.add(lab6);
    	  this.setContentPane(contentPanel);
      }
      private class Numbers implements ActionListener{
         public void actionPerformed(ActionEvent event){
             JButton src = (JButton)event.getSource();
             
             if(event.getSource()==on)
             {
                 enable();
             }
             
             else if(event.getSource()==off)
             {
                 disable();
             }
             if(src.equals(one)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "1";
                   }else{
                       tmp1 = tmp1+ "1";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "1";
                   }else{
                       tmp2 = tmp2+ "1";
                   }
                }
             }
             
              if(src.equals(two)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "2";
                   }else{
                       tmp1 = tmp1+ "2";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "2";
                   }else{
                       tmp2 = tmp2+ "2";
                   }
                }
             }
              
               if(src.equals(three)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "3";
                   }else{
                       tmp1 = tmp1+ "3";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "3";
                   }else{
                       tmp2 = tmp2+ "3";
                   }
                }
             }
               
                if(src.equals(four)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "4";
                   }else{
                       tmp1 = tmp1+ "4";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "4";
                   }else{
                       tmp2 = tmp2+ "4";
                   }
                }
             }
                
                 if(src.equals(five)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "5";
                   }else{
                       tmp1 = tmp1+ "5";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "5";
                   }else{
                       tmp2 = tmp2+ "5";
                   }
                }
             }
                 
                  if(src.equals(six)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "6";
                   }else{
                       tmp1 = tmp1+ "6";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "6";
                   }else{
                       tmp2 = tmp2+ "6";
                   }
                }
             }
                  
                   if(src.equals(seven)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "7";
                   }else{
                       tmp1 = tmp1+ "7";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "7";
                   }else{
                       tmp2 = tmp2+ "7";
                   }
                }
             }
                   
                    if(src.equals(eight)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "8";
                   }else{
                       tmp1 = tmp1+ "8";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "8";
                   }else{
                       tmp2 = tmp2+ "8";
                   }
                }
             }
                    
                     if(src.equals(nine)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "9";
                   }else{
                       tmp1 = tmp1+ "9";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "9";
                   }else{
                       tmp2 = tmp2+ "9";
                   }
                }
             }
                     
                      if(src.equals(zero)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "0";
                   }else{
                       tmp1 = tmp1+ "0";
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "0";
                   }else{
                       tmp2 = tmp2+ "0";
                   }
                }
             }
                      
             if(src.equals(decimal)){
                if(opChosen==false){
                   if(tmp1==null){
                      tmp1 = "0.";
                   }else{
                       if(tmp1 != null){
                           if(tmp1.contains(".")){
                             System.out.println("You already have a decimal");
                           }else{
                             tmp1 += ".";
                           }
                      }
                
                   }
                }else{
                    if(tmp2==null){
                      tmp2 = "0.";
                   }else{
                       if(tmp2 != null){
                       if(tmp2.contains(".")){
                          System.out.println("You already have a decimal");
                       }else{
                         tmp1 += ".";
                       }
                     }
                  }
               }
             }
             
           if(src.equals(del)){
              if(opChosen==false){
                if(tmp1==null){
                   System.out.println("It cannot delete");
                }else{
                   tmp1 = tmp1.substring(0, tmp1.length()-1);
                }
              }else{
                if(tmp2==null){
                   System.out.println("It cannot delete");
                }else{
                   tmp2 = tmp2.substring(0, tmp2.length()-1);
                }
              }
           }
             if (equalsIsClicked==false){
              if (opChosen==false){
                 afield.setText(tmp1);
              }else{
                  afield.setText(tmp2);
              }     
                      
         }
     }
 }
      private class Calculation implements ActionListener{
         public void actionPerformed(ActionEvent event){
             JButton src = (JButton)event.getSource();
             
                 if(src.equals(add)){
                     if(tmp1==null){
                         System.out.println("Choose a number");
                     }else
                         if(tmp1 != null && tmp2 == null){
                           opChosen = true ;
                           operation = '+';
                         }else
                             if(tmp1 != null && tmp2 != null){
                               System.out.println("You can only enter two operations");
                             }
         }
                 
         
                 
                 if(src.equals(sub)){
                     if(tmp1==null){
                         System.out.println("Choose a number");
                     }else
                         if(tmp1 != null && tmp2 == null){
                           opChosen = true ;
                           operation = '-';
                         }else
                             if(tmp1 != null && tmp2 != null){
                               System.out.println("You can only enter two operations");
                             }
         }
                            
              if(src.equals(multiply)){
                     if(tmp1==null){
                         System.out.println("Choose a number");
                     }else
                         if(tmp1 != null && tmp2 == null){
                           opChosen = true ;
                           operation = '*';
                         }else
                             if(tmp1 != null && tmp2 != null){
                               System.out.println("You can only enter two operations");
                             }
         }
                                       
              if(src.equals(div)){
                     if(tmp1==null){
                         System.out.println("Choose a number ");
                     }else
                         if(tmp1 != null && tmp2 == null){
                           opChosen = true ;
                           operation = '/';
                         }else
                             if(tmp1 != null && tmp2 != null){
                               System.out.println("You can only enter two operations");
                             }
         }
                                                  
               if(src.equals(equals)){
                     if(tmp1==null){
                         System.out.println("Choose a number ");
                     }else
                         if(tmp1 != null && tmp2 == null){
                          System.out.println("Choose BOTH numbers");
                         }
                     if(tmp1 != null && tmp2 != null){
                       double d1 = 0.0 ,d2 = 0.0;
                       
                       d1 = Double.parseDouble (tmp1);
                       d2 = Double.parseDouble (tmp2);
                       
                       switch(operation){
                           case '+':
                             answer = d1 + d2 ;
                             break;
                           case '-':
                             answer = d1 - d2 ;
                             break;
                           case '*':
                             answer = d1 * d2 ;
                             break;
                           case '/':
                             answer = d1 / d2 ;
                             break;
                                   
                       }
                       
                       lanswer = Double.toString(answer);
                       afield.setText(lanswer);
                       
                       if(operation == '/' && d2 == 0.0){
                           afield.setText("DIVIDE BY 0 ERROR");
                       }
                     }
         }
               
               if(src.equals(C)){
                  tmp1 = null;
                  tmp2 = null;
                  equalsIsClicked = false;
                  opChosen = false;
                  operation= ' ';
                  afield.setText(null);
                  lanswer = null;
               }
         }
      }
      
      public void enable(){
          
          
            off.setEnabled(true);
            on.setEnabled(false);
            afield.setEnabled(true);
            zero.setEnabled(true);
            one.setEnabled(true);
            two.setEnabled(true);
            three.setEnabled(true);
            four.setEnabled(true);
            five.setEnabled(true);
            six.setEnabled(true);
            seven.setEnabled(true);
            eight.setEnabled(true);
            nine.setEnabled(true);
            add.setEnabled(true);
            sub.setEnabled(true);
            multiply.setEnabled(true);
            div.setEnabled(true);
            equals.setEnabled(true);
            del.setEnabled(true);
            C.setEnabled(true);
            decimal.setEnabled(true);
            
      }   
      
      public void disable(){
         
            afield.setText(" ");
            off.setEnabled(false);
            on.setEnabled(true);
            afield.setEnabled(false);
            zero.setEnabled(false);
            one.setEnabled(false);
            two.setEnabled(false);
            three.setEnabled(false);
            four.setEnabled(false);
            five.setEnabled(false);
            six.setEnabled(false);
            seven.setEnabled(false);
            eight.setEnabled(false);
            nine.setEnabled(false);
            add.setEnabled(false);
            sub.setEnabled(false);
            multiply.setEnabled(false);
            div.setEnabled(false);
            equals.setEnabled(false);
            del.setEnabled(false);
            C.setEnabled(false);
            decimal.setEnabled(false);
      }
}




