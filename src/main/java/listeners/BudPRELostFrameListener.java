package listeners;

import java.awt.TextComponent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import kalmanGUI.CovistoKalmanPanel;
import pluginTools.InteractiveBud;

public class BudPRELostFrameListener implements TextListener {

	public InteractiveBud parent;
	
	public BudPRELostFrameListener(final InteractiveBud parent) {
		
		this.parent = parent;
	}

	@Override
	public void textValueChanged(TextEvent e) {
		final TextComponent tc = (TextComponent)e.getSource();
	    String s = tc.getText();
	   
	    if (s.length() > 0)
	    	CovistoKalmanPanel.maxframegap = Integer.parseInt(s);
		
		
	}
	
}