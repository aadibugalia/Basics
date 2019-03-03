package mvplogin.demo.ab.mvpdemo.mvp.presenter.login;

import mvplogin.demo.ab.mvpdemo.auxillary.ResultCodes;
import mvplogin.demo.ab.mvpdemo.mvp.model.login.LoginModel;
import mvplogin.demo.ab.mvpdemo.mvp.view.fragments.login.ILoginView;

public class LoginPresenter implements ILoginPresenter {

    ILoginView iLoginView;

    public LoginPresenter(ILoginView iLoginView) {

        this.iLoginView = iLoginView;
    }


    @Override
    public void attempLogin(String mEmail, String mPassword) {

        LoginModel mLoginModel = new LoginModel(mEmail, mPassword);
        if (mLoginModel.isDetailsValid())
            iLoginView.onLoginSuccess(ResultCodes.ALL_GOOD, mLoginModel);
        else
            iLoginView.onLoginFailure(ResultCodes.LOGIN_EMAIL_PASS_NOT_GOOD);


    }
}
