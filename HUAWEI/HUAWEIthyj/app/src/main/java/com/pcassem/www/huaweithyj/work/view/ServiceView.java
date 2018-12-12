package com.pcassem.www.huaweithyj.work.view;

import com.pcassem.www.huaweithyj.entity.ResultEntity;
import com.pcassem.www.huaweithyj.entity.ServiceEntity;

public interface ServiceView {

    void onSuccess(ResultEntity<ServiceEntity> serviceEntity);

    void onError();
}
