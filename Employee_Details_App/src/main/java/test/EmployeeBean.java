package test;

public class EmployeeBean {
	    private String eId;
	    private String eName;
	    private String eDesg;
	    private int bSal;
	    private float hra;
	    private float da;
	    private float totSal;

	    // Constructors
	    public EmployeeBean() {
	    }

	    public EmployeeBean
(String eId, String eName, String eDesg, int bSal, float hra, float da, float totSal) {
	        this.eId = eId;
	        this.eName = eName;
	        this.eDesg = eDesg;
	        this.bSal = bSal;
	        this.hra = hra;
	        this.da = da;
	        this.totSal = totSal;
	    }

	    // Getters and setters
	    public String geteId() {
	        return eId;
	    }

	    public void seteId(String eId) {
	        this.eId = eId;
	    }

	    public String geteName() {
	        return eName;
	    }

	    public void seteName(String eName) {
	        this.eName = eName;
	    }

	    public String geteDesg() {
	        return eDesg;
	    }

	    public void seteDesg(String eDesg) {
	        this.eDesg = eDesg;
	    }

	    public int getbSal() {
	        return bSal;
	    }

	    public void setbSal(int bSal) {
	        this.bSal = bSal;
	    }

	    public float getHra() {
	        return hra;
	    }

	    public void setHra(float hra) {
	        this.hra = hra;
	    }

	    public float getDa() {
	        return da;
	    }

	    public void setDa(float da) {
	        this.da = da;
	    }

	    public float getTotSal() {
	        return totSal;
	    }

	    public void setTotSal(float totSal) {
	        this.totSal = totSal;
	    }
	}


