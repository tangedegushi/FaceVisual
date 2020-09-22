package com.ubtrobot.facevisual.net.error;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * @auther tangedegushi
 * @creat 2020/8/28
 * @Decribe
 */
public abstract class CommonObserver<T> implements Observer<T> {

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onError(Throwable e) {
        ErrorHandle.DEFAULT_HANDLE.processError(ExceptionHandleUtil.handleException(e));
    }

    @Override
    public void onComplete() {

    }
}
