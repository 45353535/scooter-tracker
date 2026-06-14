package com.mobilefuse.sdk.device;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"userAgentInfo", "Lcom/mobilefuse/sdk/device/UserAgentInfo;", "getUserAgentInfo", "()Lcom/mobilefuse/sdk/device/UserAgentInfo;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class UserAgentInfoKt {

    @NotNull
    private static final UserAgentInfo userAgentInfo = new UserAgentInfo(DeviceCache.INSTANCE.getMfSharedPrefs());

    @NotNull
    public static final UserAgentInfo getUserAgentInfo() {
        return userAgentInfo;
    }
}
