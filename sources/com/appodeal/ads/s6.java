package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.data.UserPersonalData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class s6 extends zc implements UserPersonalData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s6 f14457c = new s6();

    @Override // com.appodeal.ads.modules.common.internal.data.UserPersonalData
    public final JSONObject getCachedToken() {
        return v4.c();
    }

    @Override // com.appodeal.ads.modules.common.internal.data.UserPersonalData
    public final JSONObject getExtraData() {
        return ExtraData.INSTANCE.asJson();
    }

    @Override // com.appodeal.ads.modules.common.internal.data.UserPersonalData
    public final boolean wasAdIdGenerated() {
        return v4.f15145f.getIsAdvertisingIdWasGenerated();
    }
}
