package io.appmetrica.analytics.impl;

import android.app.Activity;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5080f1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f77141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f77142b;

    public RunnableC5080f1(C5409s1 c5409s1, Activity activity) {
        this.f77142b = c5409s1;
        this.f77141a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1 c5409s1 = this.f77142b;
        C4997bl c4997bl = c5409s1.f78203h;
        Activity activity = this.f77141a;
        Pa pa2 = c5409s1.d().f78069a;
        if (activity != null) {
            c4997bl.f76924f.a(activity);
        }
        if (c4997bl.f76923e.a(activity, EnumC5333p.RESUMED)) {
            pa2.a(activity);
        }
    }
}
