package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class ag extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Bundle f28633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Activity f28634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f28635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f28636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ aj f28637g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(taskCompletionSource);
        this.f28637g = ajVar;
        this.f28633c = bundle;
        this.f28634d = activity;
        this.f28635e = taskCompletionSource2;
        this.f28636f = i10;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        try {
            com.google.android.play.integrity.internal.n nVar = (com.google.android.play.integrity.internal.n) this.f28637g.f28646e.e();
            Bundle bundle = this.f28633c;
            aj ajVar = this.f28637g;
            nVar.c(bundle, ajVar.f28644c.a(this.f28634d, this.f28635e, ajVar.f28646e));
        } catch (RemoteException e10) {
            this.f28637g.f28642a.c(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f28636f));
            this.f28635e.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
