package RoboRace;

import java.awt.*;
import COSC3P40.graphics.ImageManager;

public class CardHalfTurn extends Card {
	
	public CardHalfTurn(int priority) {
		super(priority);
		image = ImageManager.getInstance().loadImage("Cards/Halfturn.png");
		Graphics g = image.getGraphics();
		g.drawString("Priority: "+ getPriority(),15,15);
		g.dispose();
	}

	public void execute(EventCounter counter, EventList events, Robot robot, Board board) {
            GameEvent event = new HalfturnEvent(counter, robot.getLocation());
            events.add(event);
            robot.halfturn();
            
	}
	
	public String toXMLString() {
		return "<halfturn priority=\"" + getPriority() + "\"/>";
	}
	
}