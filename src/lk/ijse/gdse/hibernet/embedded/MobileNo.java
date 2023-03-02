package lk.ijse.gdse.hibernet.embedded;

import javax.persistence.Embeddable;

@Embeddable
public class MobileNo {
    private String type;
    private String mobilNo;

    public MobileNo() {
    }

    public MobileNo(String type, String mobilNo) {
        this.type = type;
        this.mobilNo = mobilNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMobilNo() {
        return mobilNo;
    }

    public void setMobilNo(String mobilNo) {
        this.mobilNo = mobilNo;
    }
}
