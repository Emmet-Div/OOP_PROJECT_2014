import java.io.*;
import java.awt.*;
import javax.swing.*;

 
public class Player implements Serializable {//saves the file
	//attributes
	private int win=0;
	 private int loss=0; 
	private String name;
	
	public Player(String name){
		this.name=name;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){return name;
	}

	public void setWin(int win) {
		this.win=win;
	}

	public void setLosses(int loss){
		this.loss=loss;
	}

	public int getWin(){return win;
	}

	public int getLosses(){return loss;
	}

	public void wonG(int wins) {
		wins++;
		win+=wins;
	}
	
	public void lossG(int losses) {
		losses++;
		loss += losses;
	}

	public String toString(){
		return name + "\n " + win + " " + loss ;
	}
}//end of class