package com.google.android.gms.internal.ads;

import com.amazon.device.ads.DTBMetricsConfiguration;

/* JADX INFO: loaded from: classes8.dex */
public enum zzfsp {
    CTV("ctv"),
    MOBILE(DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY),
    OTHER("other");

    private final String zzd;

    zzfsp(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
