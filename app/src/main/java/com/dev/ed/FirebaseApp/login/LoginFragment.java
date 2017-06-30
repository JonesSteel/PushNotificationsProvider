package com.dev.ed.FirebaseApp.login;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dev.ed.FirebaseApp.R;

public class LoginFragment extends Fragment{

    private TextInputEditText mEmail;
    private TextInputEditText mPassword;
    private Button mSigInButton;
    private View mLoginForm;
    private View mLoginProgress;
    private TextInputLayout mEmailError;
    private TextInputLayout mPasswordError;

    public static LoginFragment newInstance(String param1, String param2) {
        LoginFragment fragment = new LoginFragment();
        // Configuración de argumentos en caso de que los haya
        return fragment;
    }

    public LoginFragment(){
    }

    @Override
    public void onCreate(Bundle savedInstancestate) {
        super.onCreate(savedInstancestate);
        if (getArguments() != null) {
            // Extracción de argumentos en caso de que los haya
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_login, container, false);
        mLoginForm = root.findViewById(R.id.login_form);
        mLoginProgress = root.findViewById(R.id.login_progress);

        mEmail = (TextInputEditText) root.findViewById(R.id.tv_email);
        mPassword = (TextInputEditText) root.findViewById(R.id.tv_password);
        mEmailError = (TextInputLayout) root.findViewById(R.id.til_email_error);
        mPasswordError = (TextInputLayout) root.findViewById(R.id.til_password_error);

        mSigInButton = (Button) root.findViewById(R.id.b_sign_in);

        // Eventos
        mEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mEmailError.setError(null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mPasswordError.setError(null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mSigInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptLogin();
            }
        });
        return root;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach(){
        super.onDetach();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    private void attemptLogin() {
    }
}
