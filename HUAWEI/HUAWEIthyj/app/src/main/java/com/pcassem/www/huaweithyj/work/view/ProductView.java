package com.pcassem.www.huaweithyj.work.view;

import com.pcassem.www.huaweithyj.entity.ProductDetailsEntity;
import com.pcassem.www.huaweithyj.entity.ProductEntity;
import com.pcassem.www.huaweithyj.entity.ResultEntity;

public interface ProductView {

    void onSuccessDetails(ResultEntity<ProductDetailsEntity> productDetailsEntity);

    void onSuccess(ResultEntity<ProductEntity> productEntity);

    void onError();
}
