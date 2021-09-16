package io.hs.entity;

/**
 * @author clm
 * @Date 2021/8/27 12:50
 */
public class Medicine {
    String name;
    String aimDisease;
    BadReaction badReaction;


    class BadReaction{
        String symptom;
        String precaution;
        String prescription;
        int level;

        public String getSymptom() {
            return symptom;
        }

        public void setSymptom(String symptom) {
            this.symptom = symptom;
        }

        public String getPrecaution() {
            return precaution;
        }

        public void setPrecaution(String precaution) {
            this.precaution = precaution;
        }

        public String getPrescription() {
            return prescription;
        }

        public void setPrescription(String prescription) {
            this.prescription = prescription;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }
    }
}
