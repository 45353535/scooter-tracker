package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f64356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f64357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdUnitConfig f64358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f64359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Point f64360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f64361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f64362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f64363i;

    public ca(Context context, AdPreferences preferences, AdPreferences.Placement placement, lb httpClient, lb networkApiExecutor, lb eventTracer, lb motionProcessor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(networkApiExecutor, "networkApiExecutor");
        Intrinsics.checkNotNullParameter(eventTracer, "eventTracer");
        Intrinsics.checkNotNullParameter(motionProcessor, "motionProcessor");
        this.f64362h = 1;
    }
}
