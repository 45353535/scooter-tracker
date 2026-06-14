package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class bf extends bm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f28683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f28684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f28685f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, long j10, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f28685f = bnVar;
        this.f28683d = j10;
        this.f28684e = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        if (bn.k(this.f28685f)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f28685f;
            ((com.google.android.play.integrity.internal.i) bnVar.f28710f.e()).e(bn.b(bnVar, this.f28683d, 0), new bl(this.f28685f, this.f28684e));
        } catch (RemoteException e10) {
            this.f28685f.f28705a.c(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f28683d));
            this.f28684e.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
