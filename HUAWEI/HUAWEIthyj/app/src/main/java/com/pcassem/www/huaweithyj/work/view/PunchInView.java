package com.pcassem.www.huaweithyj.work.view;

import com.pcassem.www.huaweithyj.entity.ResultEntity;

public interface PunchInView {

    void onSign(ResultEntity serviceEntity);

    void onError();
}
