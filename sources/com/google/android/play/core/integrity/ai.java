package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class ai extends com.google.android.play.integrity.internal.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f28639b = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f28640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ aj f28641d;

    ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f28641d = ajVar;
        this.f28640c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.p
    public final void b(Bundle bundle) {
        this.f28641d.f28646e.v(this.f28640c);
        this.f28639b.d("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f28641d.f28645d.a(bundle);
        if (apiExceptionA != null) {
            this.f28640c.trySetException(apiExceptionA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f28640c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f28641d.f28643b, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f28640c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
