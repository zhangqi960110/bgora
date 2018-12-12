package com.pcassem.www.huaweithyj.work.view;

import com.pcassem.www.huaweithyj.entity.DeviceEntity;
import com.pcassem.www.huaweithyj.entity.FaultDetailsEntity;
import com.pcassem.www.huaweithyj.entity.FaultEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;

public interface FaultView {

    void onDevice(ResultEntity<DeviceEntity> productEntity);

    void onFault(ResultEntity<FaultEntity> faultEntity);

    void onFaultDetails(ResultEntity<FaultDetailsEntity> faultDetails);

    void onError();
}
