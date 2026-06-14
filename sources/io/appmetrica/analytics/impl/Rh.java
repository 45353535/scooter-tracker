package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Rh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5252li f76356b;

    public Rh(C5252li c5252li, String str) {
        this.f76356b = c5252li;
        this.f76355a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76356b;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).setUserProfileID(this.f76355a);
    }
}
