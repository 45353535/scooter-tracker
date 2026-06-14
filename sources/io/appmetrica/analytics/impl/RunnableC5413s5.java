package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5413s5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5145he f78214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5438t5 f78215b;

    public RunnableC5413s5(C5438t5 c5438t5, InterfaceC5145he interfaceC5145he) {
        this.f78215b = c5438t5;
        this.f78214a = interfaceC5145he;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f78215b) {
            try {
                C5438t5 c5438t5 = this.f78215b;
                Object obj = c5438t5.f78258a;
                if (obj == null) {
                    c5438t5.f78259b.add(this.f78214a);
                } else {
                    this.f78214a.consume(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
