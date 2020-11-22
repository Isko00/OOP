package lab3.Task5;

public class Time implements Comparable<Object> {
	private int hours, minutes, seconds;
	
	public Time(int seconds) throws ArithmeticException {
		if (seconds > 86400) throw new ArithmeticException("Wrong date!");
	    hours = seconds / 3600;
	    minutes = (seconds - (hours * 3600)) / 60;
	    this.seconds = seconds - (hours * 3600) - (minutes * 60);
	}
	
	public Time(int hours, int minutes, int seconds) throws ArithmeticException {
		if (0 > hours || hours > 24
				|| 0 > minutes || minutes > 60
				|| 0 > seconds || seconds > 60) {
			throw new ArithmeticException("Wrong date!");
		} else {
	        this.hours = hours;
	        this.minutes = minutes;
	        this.seconds = seconds;
		}
	}
	
	public Time() { this(1); }
	
	public int getHours() { return hours; }
	
	public int getMinutes() { return minutes; }
	
	public int getSeconds() { return seconds; }
	
	public int toSeconds() {
		return hours * 3600 + minutes * 60 + seconds;
	}
	
	public void setHours(int hours) { this.hours = hours; }
	
	public void setMinutes(int minutes) { this.minutes = minutes; }
	
	public void setSeconds(int seconds) { this.seconds = seconds; }
	
	public void setTimeBySeconds(int seconds) { 
	    hours = seconds / 3600;
	    minutes = (seconds - (hours * 3600)) / 60;
	    this.seconds = seconds - (hours * 3600) - (minutes * 60);
	}
	
	public String format(int i) { return ((i > 9) ? "" : "0") + i; }

    public void add(Time t) {
    	setTimeBySeconds(toSeconds() + t.toSeconds());
    }

	@Override
	public int hashCode() {
		return toSeconds();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (this.hashCode() == other.hashCode())
			return true;
		return false;
	}

    @Override
	public String toString() {
		return format(hours) + ":" + format(minutes) + ":" + format(seconds);
	}
    
    @Override
    public int compareTo(Object o) {
		Time t = (Time) o;	
        return (int) Math.signum(toSeconds() - t.toSeconds()); 
    }
}