package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3839kk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yj f38900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f38901b;

    public C3839kk(Yj telemetryConfigMetaData, double d10) {
        Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        this.f38900a = telemetryConfigMetaData;
        this.f38901b = d10;
    }

    public final int a(String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (this.f38901b >= this.f38900a.f38070g) {
            return 0;
        }
        Wj wj = Wj.f37959a;
        return 2;
    }
}
