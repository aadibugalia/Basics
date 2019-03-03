package mvplogin.demo.ab.mvpdemo.auxillary;

import android.view.View;

public class ValidationUtils {

    public static boolean isValidEmai(String mEmail) {
        boolean ret = false;
if(mEmail!=null && mEmail.trim().length()>5)
    ret=true;

        return ret;
    }

    public static boolean isValidPassword(String mPassword) {
        boolean ret = false;
        if(mPassword!=null && mPassword.trim().length()==6)
            ret=true;

        return ret;
    }


    public static boolean viewNullCheck(View mView) {
        boolean ret = false;

        if (mView != null)
            ret = true;


        return ret;
    }
}
