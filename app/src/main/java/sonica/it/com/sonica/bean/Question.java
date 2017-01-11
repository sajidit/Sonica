package sonica.it.com.sonica.bean;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by SajidA on 02/11/2016.
 */

public class Question extends RealmObject  implements Serializable {

    @PrimaryKey
    private String id;
    private String q;
    private String oA;
    private String oB;
    private String oC;
    private String oD;
    private String aN;
    private String level;
    private String type;
    private String explanation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getoA() {
        return oA;
    }

    public void setoA(String oA) {
        this.oA = oA;
    }

    public String getoB() {
        return oB;
    }

    public void setoB(String oB) {
        this.oB = oB;
    }

    public String getoC() {
        return oC;
    }

    public void setoC(String oC) {
        this.oC = oC;
    }

    public String getoD() {
        return oD;
    }

    public void setoD(String oD) {
        this.oD = oD;
    }

    public String getaN() {
        return aN;
    }

    public void setaN(String aN) {
        this.aN = aN;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

}
