package com.pcassem.www.huaweithyj.work.view;

import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.SignInDetailsEntity;
import com.pcassem.www.huaweithyj.entity.SigninEntity;

public interface SignInView {

    void onSuccess(ResultEntity<SigninEntity> signinEntity);

    void onSuccessDetails(ResultEntity<SignInDetailsEntity> signinDetails);

    void onError();
}
