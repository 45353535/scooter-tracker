package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3832kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f38876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Za f38878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Dc f38879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3870m1 f38880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3878m9 f38881g;

    public C3832kd(Context context, G adContext, boolean z10, Za telemetryMetaData, Dc adTelemetryHelper, InterfaceC3870m1 adUnitCallback, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        Intrinsics.checkNotNullParameter(telemetryMetaData, "telemetryMetaData");
        Intrinsics.checkNotNullParameter(adTelemetryHelper, "adTelemetryHelper");
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f38875a = context;
        this.f38876b = adContext;
        this.f38877c = z10;
        this.f38878d = telemetryMetaData;
        this.f38879e = adTelemetryHelper;
        this.f38880f = adUnitCallback;
        this.f38881g = interfaceC3878m9;
    }
}
