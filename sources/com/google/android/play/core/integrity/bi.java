package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
class bi extends com.google.android.play.integrity.internal.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TaskCompletionSource f28696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f28697c;

    bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.f28697c = bnVar;
        this.f28696b = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void b(Bundle bundle) throws RemoteException {
        this.f28697c.f28710f.v(this.f28696b);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void c(Bundle bundle) throws RemoteException {
        this.f28697c.f28710f.v(this.f28696b);
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void d(Bundle bundle) throws RemoteException {
        this.f28697c.f28710f.v(this.f28696b);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void e(Bundle bundle) throws RemoteException {
        this.f28697c.f28710f.v(this.f28696b);
    }
}
