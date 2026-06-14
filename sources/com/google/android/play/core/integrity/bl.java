package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class bl extends bi {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f28702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f28703e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f28703e = bnVar;
        this.f28702d = new com.google.android.play.integrity.internal.s("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void e(Bundle bundle) throws RemoteException {
        super.e(bundle);
        this.f28702d.d("onWarmUpExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f28703e.f28709e.a(bundle);
        if (apiExceptionA != null) {
            this.f28696b.trySetException(apiExceptionA);
        } else {
            this.f28696b.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
