package com.pcassem.www.huaweithyj.personal.widget;


import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.main.LoginActivity;
import com.pcassem.www.huaweithyj.personal.ChangePasswordActivity;
import com.pcassem.www.huaweithyj.view.CommomDialog;

public class PersonalFragment extends Fragment implements View.OnClickListener {


    private LinearLayout llChangePassword;
    private TextView tvLogOut;
    private TextView tvHeader;
    private TextView tvUsername;
    private TextView tvPhone;

    private int userid;
    private String username;
    private String phone;


    private SharedPreferences sharedPreferences;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personal, container, false);
        initView(view);
        initEvent();
        return view;
    }

    private void initView(View view) {
        llChangePassword = view.findViewById(R.id.change_password);
        tvLogOut = view.findViewById(R.id.log_out);

        tvHeader = view.findViewById(R.id.header);
        tvUsername = view.findViewById(R.id.username);
        tvPhone = view.findViewById(R.id.phone);

        sharedPreferences = getContext().getSharedPreferences("thyj", Context.MODE_PRIVATE);
        userid = sharedPreferences.getInt("userud",-1);
        username = sharedPreferences.getString("username","");
        phone = sharedPreferences.getString("phone","");
        tvHeader.setText(username);
        tvUsername.setText(username);
        tvPhone.setText(phone);
    }

    private void initEvent() {
        llChangePassword.setOnClickListener(this);
        tvLogOut.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.change_password:
                Intent intent = new Intent(getActivity(), ChangePasswordActivity.class);
                startActivity(intent);
                break;
            case R.id.log_out:
                myDialog();
                break;
        }
    }

    private void myDialog() {
        new CommomDialog(getActivity(), R.style.commom_dialog, "确认退出登陆？", new CommomDialog.OnCloseListener() {
            @Override
            public void onClick(Dialog dialog, boolean confirm) {
                if (confirm) {
                    Intent intent = new Intent(getActivity(), LoginActivity.class);
                    startActivity(intent);
                    dialog.dismiss();
                    getActivity().finish();
                } else {
                    dialog.dismiss();
                }

            }
        }).setTitle("提示信息").show();
    }
}
