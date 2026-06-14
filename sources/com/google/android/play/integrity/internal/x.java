package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes9.dex */
final class x extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f28793c;

    x(ae aeVar) {
        this.f28793c = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.f28793c.f28767f) {
            try {
                if (this.f28793c.f28773l.get() > 0 && this.f28793c.f28773l.decrementAndGet() > 0) {
                    this.f28793c.f28763b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                ae aeVar = this.f28793c;
                if (aeVar.f28775n != null) {
                    aeVar.f28763b.d("Unbind from service.", new Object[0]);
                    ae aeVar2 = this.f28793c;
                    aeVar2.f28762a.unbindService(aeVar2.f28774m);
                    this.f28793c.f28768g = false;
                    this.f28793c.f28775n = null;
                    this.f28793c.f28774m = null;
                }
                this.f28793c.x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
