package docView;
import java.awt.BorderLayout;  
import java.awt.Container;  
  
import javax.swing.JFrame;  
  
import com.hg.xdoc.XDocViewer;  

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {  
	            JFrame f = new JFrame("XDOC�ĵ��Ķ���");  
	            Container p = f.getContentPane();  
	            //ʵ����XDoc�Ķ���  
	            XDocViewer v = new XDocViewer();  
	            //���뵽�����  
	            p.add(v, BorderLayout.CENTER);  
	            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	            f.setSize(800, 600);  
	            f.setVisible(true);  
	            f.setExtendedState(JFrame.MAXIMIZED_BOTH);  
	            //ָ��url���ļ�  
	            v.open("d:/1.doc");  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	}

}
