package iphone.telephone.device;

import iphone.telephone.Contact;

public interface TelephoneDevice {

    void call(Contact contact);

    void answer();

    void startVoiceMail();
}
