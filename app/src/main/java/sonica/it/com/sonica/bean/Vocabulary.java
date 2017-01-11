package sonica.it.com.sonica.bean;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by SajidA on 09/11/2016.
 */

public class Vocabulary extends RealmObject implements Serializable {

    private Integer wordid;
    private String lemma;
    private String definition;
    private String pos;

    public Integer getWordid() {
        return wordid;
    }

    public void setWordid(Integer wordid) {
        this.wordid = wordid;
    }

    public String getLemma() {
        return lemma;
    }

    public void setLemma(String lemma) {
        this.lemma = lemma;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
}
