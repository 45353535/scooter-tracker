package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class bk extends bi {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f28699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f28700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f28701f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j10) {
        super(bnVar, taskCompletionSource);
        this.f28701f = bnVar;
        this.f28699d = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");
        this.f28700e = j10;
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void c(Bundle bundle) throws RemoteException {
        super.c(bundle);
        this.f28699d.d("onRequestExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f28701f.f28709e.a(bundle);
        if (apiExceptionA != null) {
            this.f28696b.trySetException(apiExceptionA);
            return;
        }
        bj bjVar = new bj(this, this.f28701f.f28706b, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f28696b;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
