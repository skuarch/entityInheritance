/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.entityInheritance;

import group.entityInheritance.entity.EmailNotification;

/**
 *
 * @author skuarch
 */
public interface NotificationSender {
    
    Class<EmailNotification> appliesTo();
    void send(EmailNotification notification);
    
}
