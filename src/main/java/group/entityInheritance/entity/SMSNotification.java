package group.entityInheritance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sms_notification")
public class SMSNotification extends Notification {

    @Column(
            name = "phone_number",
            nullable = false
    )
    private String phoneNumber = "33333333";

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
