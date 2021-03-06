package Tiled;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class TiledObject {
	private JSONObject object;
	private int width, height;
	private int x, y;
	private int id, rotation;
	private String name;
	private boolean visible;
	
	public TiledObject(JSONObject TiledObject)
	{
		try {
			loadTileObject(TiledObject);
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	
	public void loadTileObject(JSONObject object) throws FileNotFoundException, IOException, ParseException {
		try {
			// take all needed information from object.
			this.object = object;
			name = (String) object.get("name");
			visible = (boolean) object.get("visible");
			width = ((Long)object.get("width")).intValue();
			height = ((Long)object.get("height")).intValue();
			id = ((Long)object.get("id")).intValue();
			x = ((Long)object.get("x")).intValue();
			y = ((Long)object.get("y")).intValue();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getName() {
		return name;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public int getID() {
		return id;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getRotation() {
		return rotation;
	}

	public boolean isVisible() {
		return visible;
	}
}
