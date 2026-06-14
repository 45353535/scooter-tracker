package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC4994bi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f76915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5252li f76916c;

    public RunnableC4994bi(C5252li c5252li, String str, byte[] bArr) {
        this.f76916c = c5252li;
        this.f76914a = str;
        this.f76915b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76916c;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).setSessionExtra(this.f76914a, this.f76915b);
    }
}
