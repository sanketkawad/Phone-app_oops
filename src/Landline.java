public class Landline implements Phone{


    private  String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isPowerOn = true;
        this.isRinging = false;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }



    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn == true)
            System.out.println("You are dialing "+phoneNo);
        else
            System.out.println("Phone not available .");
    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPowerOn && myPhoneNo.equals(phoneNo)){
            this.isRinging = true;
            System.out.println("Hey "+myPhoneNo+" get a call..");
        }else{
            System.out.println("Power off .");
        }
    }

    @Override
    public boolean answerCall() {
        if(isRinging == true){
            System.out.println("Call answered.");
            this.isRinging = false;
            return true;
        }
        return  false;

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
