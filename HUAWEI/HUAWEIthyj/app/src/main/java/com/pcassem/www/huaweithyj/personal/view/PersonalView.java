package com.pcassem.www.huaweithyj.personal.view;

import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.ServiceEntity;
import com.pcassem.www.huaweithyj.entity.UserEntity;

public interface PersonalView {

    void onSuccess(ResultEntity<UserEntity> userEntity);

    void onSuccessOut(ResultEntity userEntity);

    void onError();
}
