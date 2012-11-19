package test;

import javax.swing.*;    //时钟
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Clock extends JFrame implements ActionListener
{      int x,y,x0,y0,r,h,olds_x,olds_y,oldm_x,oldm_y,oldh_x,oldh_y,ss,mm,hh,old_m,old_h,ang;
       final double RAD=Math.PI/180;   //度数转换成弧度的比例 
       //构造函数创建了一个窗体
       public Clock()
{   super("时钟");  //设置标题
           setSize(250,250);  //设置窗口尺寸
           setBackground(Color.CYAN);  //设置背景颜色
           setLocation(300,150);   //设置窗口位置坐标
           setResizable(false);  //使窗口可以最小化和关闭，但是不能任意改变大小
           setVisible(true);  //设置组建可见
           int delay = 100;  //设置延时
           //创建一个监听事件
           ActionListener drawClock = new ActionListener()
           {   public void actionPerformed(ActionEvent evt)  {  repaint(); }  }; 
  
           new Timer(delay,drawClock).start();   //创建时间计数器，每秒触发一次
       }
  
       public void actionPerformed(ActionEvent e){//实现ActionListener接口必须实现的方法
    	   }
       
   
       //绘制图形
       public void paint(Graphics g)
{
           Graphics2D g2D = (Graphics2D)g;
           Insets insets = getInsets();
           int L = insets.left/2,T = insets.top/2;
           h = getSize().height;
           g.setColor(Color.black);
           
           //画圆
           g2D.setStroke(new BasicStroke(4.0f));
           g.drawOval(L+40,T+40,h-80,h-80);
           r=h/2-40;
           x0=40+r-5+L;
           y0=40+r-5-T;
           ang=60;
           
           //绘制时钟上的12个数字
           for(int i=1;i<=12;i++){
               x=(int)((r-9)*Math.cos(RAD*ang)+x0);
               y=(int)((r-9)*Math.sin(RAD*ang)+y0);
               g.drawString(""+i,x,h-y);
               ang-=30;
           }
           
           //获得当前系统时间
           Calendar now= new GregorianCalendar();
           int nowh= now.get(Calendar.HOUR_OF_DAY);
           int nowm= now.get(Calendar.MINUTE);
           int nows= now.get(Calendar.SECOND);
           String st;
           if(nowh<10) st="0"+nowh;else st=""+nowh;
           if(nowm<10) st+=":0"+nowm;else st+=":"+nowm;
           if(nows<10) st+=":0"+nows;else st+=":"+nows;
           
           //在窗体上显示时间
           g.setColor(Color.white);//
           g.fillRect(L,T,50,28);//
           g.setColor(Color.black);//
           g.drawString(st,L+2,T+26);//
           
           //计算时间与度数的关系
           ss=90-nows*6;
           mm=90-nowm*6;
           hh=90-nowh*30-nowm/2;
           x0=r+40+L;
           y0=r+40+T;
           
           g2D.setStroke(new BasicStroke(1.0f));//秒针粗细
          //擦除秒针
           if(olds_x>0)
{
               g.setColor(getBackground());
               g.drawLine(x0,y0,olds_x,h-olds_y);
           }
           else
{
               old_m = mm;
               old_h = hh;
           }
         //绘制秒针
           x=(int)(r*0.9*Math.cos(RAD*ss))+x0;//长度
           y=(int)(r*0.9*Math.sin(RAD*ss))+y0-2*T;
           g.setColor(Color.black);//指针颜色
           g.drawLine(x0,y0,x,h-y);//轨迹
           olds_x=x;
           olds_y=y;
           
           g2D.setStroke(new BasicStroke(2.2f));//分针粗细
         //擦除分针
           if(old_m!=mm)
{
               g.setColor(getBackground());
               g.drawLine(x0,y0,oldm_x,h-oldm_y);
               }
           //绘制分针
           x=(int)(r*0.7*Math.cos(RAD*mm))+x0;//长度
           y=(int)(r*0.7*Math.sin(RAD*mm))+y0-2*T;
           g.setColor(Color.red);//颜色
           g.drawLine(x0,y0,x,h-y);
           oldm_x=x;
           oldm_y=y;
           old_m=mm;
           
           g2D.setStroke(new BasicStroke(3.4f));//时针粗细
           //擦除时针
           if(old_h!=hh)
{
               g.setColor(getBackground());
               g.drawLine(x0,y0,oldh_x,h-oldh_y);
               }
           //绘制时针
           x=(int)(r*0.5*Math.cos(RAD*hh))+x0;//长度
           y=(int)(r*0.5*Math.sin(RAD*hh))+y0-2*T;
           g.setColor(Color.red);//颜色
           g.drawLine(x0,y0,x,h-y);
           oldh_x=x;
           oldh_y=y;
           old_h=hh;
           }
   
       public static void main(String[] args){   Clock c = new Clock();  }       
   }

