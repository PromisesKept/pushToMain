package org.utils.Stupid;

public class Document {
    public Document(Long personId, String title, String payload) {
        this.personId = personId;
        this.title = title;
        this.payload = payload;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    private Long personId;
    private String title;
    private String payload;
}
