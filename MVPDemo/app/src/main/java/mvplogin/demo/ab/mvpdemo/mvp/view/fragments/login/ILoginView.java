package mvplogin.demo.ab.mvpdemo.mvp.view.fragments.login;

import mvplogin.demo.ab.mvpdemo.auxillary.ResultCodes;

public interface ILoginView {

    void onLoginSuccess(int resultCode, Object responseObj);
    void onLoginFailure( int resultCode);

}
