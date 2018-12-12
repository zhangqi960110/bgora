package com.pcassem.www.huaweithyj.work.widget;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.work.CompletedActivity;
import com.pcassem.www.huaweithyj.work.CompletingActivity;
import com.pcassem.www.huaweithyj.work.FaultConsultationActivity;
import com.pcassem.www.huaweithyj.work.OvertimeActivity;
import com.pcassem.www.huaweithyj.work.ProductListActivity;
import com.pcassem.www.huaweithyj.work.SignInActivity;

public class WorkFragment extends Fragment implements View.OnClickListener {


    private LinearLayout mLlProductList;
    private LinearLayout mLlCompleted;
    private LinearLayout mLlSignIn;
    private LinearLayout mLlOvertime;
    private LinearLayout mLlCompleting;
    private LinearLayout mLlFaultConsultation;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_work, container, false);
        initView(view);
        initEvent();
        return view;
    }

    private void initView(View view) {
        //        startSign = view.findViewById(R.id.sign);
        mLlProductList = view.findViewById(R.id.ll_product_list);
        mLlCompleted = view.findViewById(R.id.ll_completed);
        mLlSignIn = view.findViewById(R.id.ll_sign_in);
        mLlOvertime = view.findViewById(R.id.ll_overtime);
        mLlCompleting = view.findViewById(R.id.ll_completing);
        mLlFaultConsultation = view.findViewById(R.id.ll_fault_consultation);
    }

    private void initEvent() {
        mLlProductList.setOnClickListener(this);
        mLlCompleted.setOnClickListener(this);
        mLlSignIn.setOnClickListener(this);
        mLlOvertime.setOnClickListener(this);
        mLlCompleting.setOnClickListener(this);
        mLlFaultConsultation.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_product_list:
                Intent intent3 = new Intent(getActivity(), ProductListActivity.class);
                startActivity(intent3);
                break;
            case R.id.ll_completed:
                Intent intent4 = new Intent(getActivity(), CompletedActivity.class);
                startActivity(intent4);
                break;
            case R.id.ll_sign_in:
                Intent intent5 = new Intent(getActivity(), SignInActivity.class);
                startActivity(intent5);
                break;
            case R.id.ll_overtime:
                Intent intent6 = new Intent(getActivity(), OvertimeActivity.class);
                startActivity(intent6);
                break;
            case R.id.ll_completing:
                Intent intent7 = new Intent(getActivity(), CompletingActivity.class);
                startActivity(intent7);
                break;
            case R.id.ll_fault_consultation:
                Intent intent8 = new Intent(getActivity(), FaultConsultationActivity.class);
                startActivity(intent8);
                break;
        }
    }
}
