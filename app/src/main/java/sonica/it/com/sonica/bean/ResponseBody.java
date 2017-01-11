package sonica.it.com.sonica.bean;

import java.util.List;

/**
 * Created by SajidA on 03/11/2016.
 */

public class ResponseBody {

    List<Question> items;
    String kind;
    String etag;

    public List<Question> getItems() {
        return items;
    }

    public void setItems(List<Question> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }
}
