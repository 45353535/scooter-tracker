package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class w extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f28790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ t f28791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ae f28792e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ae aeVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t tVar) {
        super(taskCompletionSource);
        this.f28792e = aeVar;
        this.f28790c = taskCompletionSource2;
        this.f28791d = tVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.f28792e.f28767f) {
            try {
                ae.o(this.f28792e, this.f28790c);
                if (this.f28792e.f28773l.getAndIncrement() > 0) {
                    this.f28792e.f28763b.d("Already connected to the service.", new Object[0]);
                }
                ae.q(this.f28792e, this.f28791d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
