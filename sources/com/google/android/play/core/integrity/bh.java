package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class bh extends bm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f28691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f28692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f28693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f28694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ bn f28695h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(bnVar, taskCompletionSource);
        this.f28695h = bnVar;
        this.f28691d = bundle;
        this.f28692e = activity;
        this.f28693f = taskCompletionSource2;
        this.f28694g = i10;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        if (bn.k(this.f28695h)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f28695h;
            com.google.android.play.integrity.internal.ae aeVar = bnVar.f28710f;
            ((com.google.android.play.integrity.internal.i) aeVar.e()).c(this.f28691d, bnVar.f28708d.a(this.f28692e, this.f28693f, aeVar));
        } catch (RemoteException e10) {
            this.f28695h.f28705a.c(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f28694g));
            this.f28693f.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
