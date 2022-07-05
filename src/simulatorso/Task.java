package simulatorso;

public class Task implements Comparable<Task> {

    Integer ID;
    String HIP;
    Integer TTP, Q, P, STATUS, SUC1;
    String HISUC1;
    Integer TTSUC1, SUC2;
    String HISUC2;
    Integer TTSUC2;
    String HIBS;
    Integer TTBS;
    String HILS;
    Integer TTLS, RM;
    Boolean active, s1act, s2act;

    public Task(Integer ID, String HIP, Integer TTP, Integer Q, Integer P, Integer STATUS, Integer SUC1, String HISUC1, Integer TTSUC1, Integer SUC2, String HISUC2, Integer TTSUC2, String HIBS, Integer TTBS, String HILS, Integer TTLS, Integer RM, Boolean active, Boolean s1act, Boolean s2act) {
        this.ID = ID;
        this.HIP = HIP;
        this.TTP = TTP;
        this.Q = Q;
        this.P = P;
        this.STATUS = STATUS;
        this.SUC1 = SUC1;
        this.HISUC1 = HISUC1;
        this.TTSUC1 = TTSUC1;
        this.SUC2 = SUC2;
        this.HISUC2 = HISUC2;
        this.TTSUC2 = TTSUC2;
        this.HIBS = HIBS;
        this.TTBS = TTBS;
        this.HILS = HILS;
        this.TTLS = TTLS;
        this.RM = RM;
        this.active = active;
        this.s1act = s1act;
        this.s2act = s2act;
    }

    public Task(Integer ID, String HIP, Integer TTP, Integer Q, Integer P, Integer STATUS, Integer SUC1, String HISUC1, Integer TTSUC1, Integer SUC2, String HISUC2, Integer TTSUC2, String HIBS, Integer TTBS, String HILS, Integer TTLS, Integer RM, Boolean active) {
        this.ID = ID;
        this.HIP = HIP;
        this.TTP = TTP;
        this.Q = Q;
        this.P = P;
        this.STATUS = STATUS;
        this.SUC1 = SUC1;
        this.HISUC1 = HISUC1;
        this.TTSUC1 = TTSUC1;
        this.SUC2 = SUC2;
        this.HISUC2 = HISUC2;
        this.TTSUC2 = TTSUC2;
        this.HIBS = HIBS;
        this.TTBS = TTBS;
        this.HILS = HILS;
        this.TTLS = TTLS;
        this.RM = RM;
        this.active = active;
    }

    public Task(int ID, String HIP, int TTP, int Q, int P, int STATUS, int SUC1, String HISUC1, int TTSUC1, int SUC2, String HISUC2, int TTSUC2, String HIBS, int TTBS, String HILS, int TTLS, int RM) {
        this.ID = ID;
        this.HIP = HIP;
        this.TTP = TTP;
        this.Q = Q;
        this.P = P;
        this.STATUS = STATUS;
        this.SUC1 = SUC1;
        this.HISUC1 = HISUC1;
        this.TTSUC1 = TTSUC1;
        this.SUC2 = SUC2;
        this.HISUC2 = HISUC2;
        this.TTSUC2 = TTSUC2;
        this.HIBS = HIBS;
        this.TTBS = TTBS;
        this.HILS = HILS;
        this.TTLS = TTLS;
        this.RM = RM;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getHIP() {
        return HIP;
    }

    public void setHIP(String HIP) {
        this.HIP = HIP;
    }

    public int getTTP() {
        return TTP;
    }

    public void setTTP(int TTP) {
        this.TTP = TTP;
    }

    public int getQ() {
        return Q;
    }

    public void setQ(int Q) {
        this.Q = Q;
    }

    public int getP() {
        return P;
    }

    public void setP(int P) {
        this.P = P;
    }

    public int getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(int STATUS) {
        this.STATUS = STATUS;
    }

    public int getSUC1() {
        return SUC1;
    }

    public void setSUC1(int SUC1) {
        this.SUC1 = SUC1;
    }

    public String getHISUC1() {
        return HISUC1;
    }

    public void setHISUC1(String HISUC1) {
        this.HISUC1 = HISUC1;
    }

    public int getTTSUC1() {
        return TTSUC1;
    }

    public void setTTSUC1(int TTSUC1) {
        this.TTSUC1 = TTSUC1;
    }

    public int getSUC2() {
        return SUC2;
    }

    public void setSUC2(int SUC2) {
        this.SUC2 = SUC2;
    }

    public String getHISUC2() {
        return HISUC2;
    }

    public void setHISUC2(String HISUC2) {
        this.HISUC2 = HISUC2;
    }

    public int getTTSUC2() {
        return TTSUC2;
    }

    public void setTTSUC2(int TTSUC2) {
        this.TTSUC2 = TTSUC2;
    }

    public String getHIBS() {
        return HIBS;
    }

    public void setHIBS(String HIBS) {
        this.HIBS = HIBS;
    }

    public int getTTBS() {
        return TTBS;
    }

    public void setTTBS(int TTBS) {
        this.TTBS = TTBS;
    }

    public String getHILS() {
        return HILS;
    }

    public void setHILS(String HILS) {
        this.HILS = HILS;
    }

    public int getTTLS() {
        return TTLS;
    }

    public void setTTLS(int TTLS) {
        this.TTLS = TTLS;
    }

    public int getRM() {
        return RM;
    }

    public void setRM(int RM) {
        this.RM = RM;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getS1act() {
        return s1act;
    }

    public void setS1act(Boolean s1act) {
        this.s1act = s1act;
    }

    public Boolean getS2act() {
        return s2act;
    }

    public void setS2act(Boolean s2act) {
        this.s2act = s2act;
    }

    @Override
    public String toString() {
        return "Task{" + "ID=" + ID + ", HIP=" + HIP + ", TTP=" + TTP + ", Q=" + Q + ", P=" + P + ", STATUS=" + STATUS + ", SUC1=" + SUC1 + ", HISUC1=" + HISUC1 + ", TTSUC1=" + TTSUC1 + ", SUC2=" + SUC2 + ", HISUC2=" + HISUC2 + ", TTSUC2=" + TTSUC2 + ", HIBS=" + HIBS + ", TTBS=" + TTBS + ", HILS=" + HILS + ", TTLS=" + TTLS + ", RM=" + RM + ", active=" + active + ", s1act=" + s1act + ", s2act=" + s2act + '}';
    }

    @Override
    public int compareTo(Task t) {
        return P.compareTo(t.getP());
    }
}
