package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class bg extends bm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f28686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f28687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f28688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f28689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ bn f28690h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, String str, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f28690h = bnVar;
        this.f28686d = str;
        this.f28687e = j10;
        this.f28688f = j11;
        this.f28689g = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        if (bn.k(this.f28690h)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f28690h;
            ((com.google.android.play.integrity.internal.i) bnVar.f28710f.e()).d(bn.a(bnVar, this.f28686d, this.f28687e, this.f28688f, 0), new bk(this.f28690h, this.f28689g, this.f28687e));
        } catch (RemoteException e10) {
            this.f28690h.f28705a.c(e10, "requestExpressIntegrityToken(%s, %s)", this.f28686d, Long.valueOf(this.f28687e));
            this.f28689g.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
