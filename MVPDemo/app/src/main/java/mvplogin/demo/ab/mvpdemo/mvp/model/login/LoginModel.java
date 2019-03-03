package mvplogin.demo.ab.mvpdemo.mvp.model.login;

import android.os.Parcel;
import android.os.Parcelable;

import mvplogin.demo.ab.mvpdemo.auxillary.ResultCodes;
import mvplogin.demo.ab.mvpdemo.auxillary.ValidationUtils;

public class LoginModel implements ILoginModel {

    private String mEmail, mPassword;


    public LoginModel(String mEmail, String mPassword){

        this.mEmail=mEmail;
        this.mPassword=mPassword;

    }


    protected LoginModel(Parcel in) {
        mEmail = in.readString();
        mPassword = in.readString();
    }



    @Override
    public String getUsername() {
        return mEmail;
    }

    @Override
    public String getPassword() {
        return mPassword;
    }

    @Override
    public boolean isDetailsValid() {
        boolean ret= true;

if(!ValidationUtils.isValidEmai(mEmail))

    ret=false;

if (!ValidationUtils.isValidPassword(mPassword))
    ret=false;



        return ret;
    }
}
