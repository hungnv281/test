package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;

public class Track extends Object implements Playable{
	private String title;
	private  int length;
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	@Override
	public void play() throws PlayerException{
		if(this.getLength() > 0 ) {
			System.out.println(" Name of track : " + this.getTitle() );
			System.out.println("Length of track : " + this.getLength());
//			java.util.Iterator iter = tracks.iterator();
//			
		}
		else throw new PlayerException("ERROR: DVD length is non-positive!");
	}
	public Track() {
		
	}
	@Override
	public boolean equals(Object obj) {
		Track checkTrack = new Track();
		checkTrack = (Track)obj; 
		if (checkTrack == null ) {
			System.out.println("00000000");
			return false;
		} 
		if ((checkTrack.getLength() == this.length) &&(checkTrack.getTitle() == this.title)) {
			return true ;
		}
		return false;
	}
}
