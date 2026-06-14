package com.adjust.sdk;

import com.adjust.sdk.network.IActivityPackageSender;

/* JADX INFO: loaded from: classes5.dex */
public interface IAttributionHandler {
    void checkSdkClickResponse(SdkClickResponseData sdkClickResponseData);

    void checkSessionResponse(SessionResponseData sessionResponseData);

    void getAttribution();

    void init(IActivityHandler iActivityHandler, boolean z10, IActivityPackageSender iActivityPackageSender);

    void pauseSending();

    void resumeSending();

    void teardown();
}
