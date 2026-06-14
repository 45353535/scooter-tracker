package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5149hi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f77310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f77311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5252li f77312c;

    public RunnableC5149hi(C5252li c5252li, String str, String str2) {
        this.f77312c = c5252li;
        this.f77310a = str;
        this.f77311b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f77312c;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).putAppEnvironmentValue(this.f77310a, this.f77311b);
    }
}
