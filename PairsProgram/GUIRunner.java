package kunchaim;

import java.awt.*;

public class GUIRunner extends Canvas {
	private static final long serialVersionUID = 1L;
	
	static SystemManager sm = new SystemManager();
	static Frame fr = null;
	
	
	public static void main(String[] args) throws Exception {
		sm = ObjectConverter.getSystem();
		fr = new Frame(sm);
		fr.init();	
	}
	
}
