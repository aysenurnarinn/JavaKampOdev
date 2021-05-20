package kamp;

public class Instructor extends User {
	
	
	int numberVideo;

	public Instructor() {
		super();
	}

	public Instructor(int numberVideo) {
		super();
		this.numberVideo = numberVideo;
	}

	public int getNumberVideo() {
		return numberVideo;
	}

	public void setNumberVideo(int numberVideo) {
		this.numberVideo = numberVideo;
	}
}
