package io.hs.entity;

/**
 * @author clm
 * @Date 2021/8/27 12:47
 */
public class AdvInfo {
    String patientCondition;
    String recCondition;
    String chestRes;
    String lungRes;
    String mMRCRes;

    public String getPatientCondition() {
        return patientCondition;
    }

    public void setPatientCondition(String patientCondition) {
        this.patientCondition = patientCondition;
    }

    public String getRecCondition() {
        return recCondition;
    }

    public void setRecCondition(String recCondition) {
        this.recCondition = recCondition;
    }

    public String getChestRes() {
        return chestRes;
    }

    public void setChestRes(String chestRes) {
        this.chestRes = chestRes;
    }

    public String getLungRes() {
        return lungRes;
    }

    public void setLungRes(String lungRes) {
        this.lungRes = lungRes;
    }

    public String getmMRCRes() {
        return mMRCRes;
    }

    public void setmMRCRes(String mMRCRes) {
        this.mMRCRes = mMRCRes;
    }
}
