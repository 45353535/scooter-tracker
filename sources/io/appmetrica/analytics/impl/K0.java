package io.appmetrica.analytics.impl;

import android.content.Intent;

/* JADX INFO: loaded from: classes12.dex */
public final class K0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f76011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76012b;

    public K0(C5409s1 c5409s1, Intent intent) {
        this.f76012b = c5409s1;
        this.f76011a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G7 g72 = this.f76012b.d().f78070b;
        Intent intent = this.f76011a;
        g72.getClass();
        if (intent != null) {
            g72.a(intent.getDataString(), false);
        }
    }
}
