package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3814jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yj f38833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fi f38834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3839kk f38835c;

    public C3814jk(Yj telemetryConfigMetaData, List samplingEvents) {
        Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        Intrinsics.checkNotNullParameter(samplingEvents, "samplingEvents");
        this.f38833a = telemetryConfigMetaData;
        double dRandom = Math.random();
        this.f38834b = new Fi(telemetryConfigMetaData, dRandom, samplingEvents);
        this.f38835c = new C3839kk(telemetryConfigMetaData, dRandom);
    }
}
