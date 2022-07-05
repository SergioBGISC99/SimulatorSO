
package simulatorso;

public class Graphic {
    
    String TTP, HIP, TTPR, INTERVAL;
    int pos;

    public Graphic(String TTP, String HIP, String TTPR, String INTERVAL, int pos) {
        this.TTP = TTP;
        this.HIP = HIP;
        this.TTPR = TTPR;
        this.INTERVAL = INTERVAL;
        this.pos = pos;
    }

    public String getTTP() {
        return TTP;
    }

    public void setTTP(String TTP) {
        this.TTP = TTP;
    }

    public String getHIP() {
        return HIP;
    }

    public void setHIP(String HIP) {
        this.HIP = HIP;
    }

    public String getTTPR() {
        return TTPR;
    }

    public void setTTPR(String TTPR) {
        this.TTPR = TTPR;
    }

    public String getINTERVAL() {
        return INTERVAL;
    }

    public void setINTERVAL(String INTERVAL) {
        this.INTERVAL = INTERVAL;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    } 
}
