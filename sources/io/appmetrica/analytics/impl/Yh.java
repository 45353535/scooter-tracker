package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* JADX INFO: loaded from: classes12.dex */
public final class Yh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f76713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5252li f76714b;

    public Yh(C5252li c5252li, ReporterConfig reporterConfig) {
        this.f76714b = c5252li;
        this.f76713a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76714b;
        ReporterConfig reporterConfig = this.f76713a;
        C5533x0 c5533x0 = c5252li.f77709a;
        Context context = c5252li.f77712d;
        c5533x0.getClass();
        C5508w0.a(context).f().a(reporterConfig);
    }
}
