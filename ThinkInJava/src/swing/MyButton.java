package swing;

import java.awt.AWTEvent;
import java.awt.Button;
import java.awt.event.MouseEvent;

public class MyButton extends Button {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Button friend = null;
	
	public void setFriend(Button friend) {
		this.friend = friend;
	}

	public MyButton(String s) {
		// TODO Auto-generated constructor stub
		super(s);
		enableEvents(AWTEvent.MOUSE_MOTION_EVENT_MASK);
	}
	
	@Override
	protected void processMouseMotionEvent(MouseEvent e) {
		// TODO Auto-generated method stub
		this.setVisible(false);
		friend.setVisible(true);
	}
	

}
