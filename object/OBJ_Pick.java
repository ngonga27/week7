package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Pick extends SuperObject{

	public OBJ_Pick() {
		name = "Pick";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/pick.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
