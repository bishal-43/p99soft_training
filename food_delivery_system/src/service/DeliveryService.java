package service;

import model.DeliveryPartner;

public class DeliveryService {
    public void deliverItem(String orderId, DeliveryPartner partner){
        System.out.println("The order" + orderId + "has been out for delivery by " + partner);
    }
}
