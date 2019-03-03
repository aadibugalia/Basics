package mvplogin.demo.ab.mvpdemo.mvp.model.login;

import mvplogin.demo.ab.mvpdemo.auxillary.ResultCodes;

public interface ILoginModel {

    String getUsername();
    String getPassword();
    boolean isDetailsValid();


}
