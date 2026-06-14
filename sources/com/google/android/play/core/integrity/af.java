package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class af extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ byte[] f28628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Long f28629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f28630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f28631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ aj f28632g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f28632g = ajVar;
        this.f28628c = bArr;
        this.f28629d = l10;
        this.f28630e = taskCompletionSource2;
        this.f28631f = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        try {
            ((com.google.android.play.integrity.internal.n) this.f28632g.f28646e.e()).d(aj.a(this.f28632g, this.f28628c, this.f28629d, null), new ai(this.f28632g, this.f28630e));
        } catch (RemoteException e10) {
            this.f28632g.f28642a.c(e10, "requestIntegrityToken(%s)", this.f28631f);
            this.f28630e.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
