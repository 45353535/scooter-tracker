package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes12.dex */
public final class E1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f75695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f75697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L1 f75698d;

    public E1(L1 l12, Intent intent, int i10, int i11) {
        this.f75698d = l12;
        this.f75695a = intent;
        this.f75696b = i10;
        this.f75697c = i11;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f75698d.f76044b.a(this.f75695a, this.f75696b, this.f75697c);
    }
}
