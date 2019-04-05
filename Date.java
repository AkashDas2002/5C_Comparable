/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

    public int compareTo(Object otherObj) {
	double total = y + m * 0.01 + d * 0.0001;
	Date date = (Date) otherObj;
	double otherTotal = date.y + date.m * 0.01 + date.d * 0.0001;
	if (total > otherTotal) return 1;
	else if (total < otherTotal) return -1;
	else return 0;
    }
	    
}
