package mvplogin.demo.ab.mvpdemo.mvp.view.fragments.login;

import android.arch.lifecycle.Lifecycle;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatTextView;
import android.util.EventLogTags;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import mvplogin.demo.ab.mvpdemo.R;
import mvplogin.demo.ab.mvpdemo.auxillary.ResultCodes;
import mvplogin.demo.ab.mvpdemo.auxillary.ValidationUtils;
import mvplogin.demo.ab.mvpdemo.mvp.presenter.login.LoginPresenter;
import mvplogin.demo.ab.mvpdemo.mvp.view.fragments.profile.ProfileFragment;


public class LoginFragment extends Fragment implements ILoginView, View.OnClickListener {


    private LoginPresenter mLoginPresenter;
    private EditText mEmailEditText, mPasswordEditText;
    private Button mLoginButton;

    @Override
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.login_fragment, container,false);
        mEmailEditText = (EditText) v.findViewById(R.id.email_Entry_LoginFragment);
        mPasswordEditText = (EditText) v.findViewById(R.id.password_Entry_LoginFragment);
        mLoginButton = (Button) v.findViewById(R.id.loginButton_loginfragment);
        mLoginButton.setOnClickListener(this);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mLoginPresenter = new LoginPresenter(LoginFragment.this);


    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onLoginSuccess(int resultCode, Object responseObj) {

        showToast(getActivity().getResources().getString(R.string.login_success_general));
    }

    @Override
    public void onLoginFailure(int resultCode) {

        if (resultCode == ResultCodes.VIEW_NULL) {
            showToast(getActivity().getResources().getString(R.string.login_fail_general));


        } else if (resultCode == ResultCodes.LOGIN_EMAIL_PASS_NOT_GOOD) {
            showToast(getActivity().getResources().getString(R.string.login_fail_general));

        }


    }

    private void showToast(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.loginButton_loginfragment:

                if (mLoginPresenter == null)
                    mLoginPresenter = new LoginPresenter(LoginFragment.this);


                if (!ValidationUtils.viewNullCheck(mEmailEditText) || !ValidationUtils.viewNullCheck(mPasswordEditText)) {
                    onLoginFailure(ResultCodes.VIEW_NULL);
                    break;
                }

                mLoginPresenter.attempLogin(mEmailEditText.getText().toString(), mPasswordEditText.getText().toString());

                break;
        }

    }
}
