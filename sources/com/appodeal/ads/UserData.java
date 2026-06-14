package com.appodeal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface UserData extends UserSettings {
    @Nullable
    String getAddress();

    @Nullable
    String getCity();

    @Nullable
    String getCountryId();

    @Nullable
    String getIp();

    @Nullable
    String getIpv6();

    @Nullable
    Float getLat();

    @Nullable
    Float getLon();

    @Nullable
    String getZip();
}
