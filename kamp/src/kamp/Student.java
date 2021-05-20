package kamp;

public class Student extends User {

	double monitoringTime;

	public Student() {
		super();
	}

	public Student(double monitoringTime) {
		super();
		this.monitoringTime = monitoringTime;
	}

	public double getMonitoringTime() {
		return monitoringTime;
	}

	public void setMonitoringTime(double monitoringTime) {
		this.monitoringTime = monitoringTime;
	}

}
