package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes12.dex */
public final class A2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f75488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B2 f75489c;

    public A2(B2 b22, Context context, Intent intent) {
        this.f75489c = b22;
        this.f75487a = context;
        this.f75488b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f75489c.f75567a.consume(this.f75487a, this.f75488b);
    }
}
