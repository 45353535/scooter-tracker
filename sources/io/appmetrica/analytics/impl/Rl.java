package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* JADX INFO: loaded from: classes12.dex */
public final class Rl implements H6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f76374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sl f76375b;

    public Rl(Sl sl, StartupParamsCallback startupParamsCallback) {
        this.f76375b = sl;
        this.f76374a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.H6
    public final void a(int i10, Bundle bundle) {
        this.f76375b.b(bundle, this.f76374a);
    }
}
