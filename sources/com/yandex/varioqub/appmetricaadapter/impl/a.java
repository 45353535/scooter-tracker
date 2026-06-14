package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import io.appmetrica.analytics.StartupParamsCallback;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements StartupParamsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdapterIdentifiersCallback f68306a;

    public a(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f68306a = adapterIdentifiersCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        String str;
        AdapterIdentifiersCallback adapterIdentifiersCallback = this.f68306a;
        if (result == null || (str = result.deviceId) == null) {
            str = "";
        }
        adapterIdentifiersCallback.onSuccess(str);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        this.f68306a.onError(reason.value);
    }
}
