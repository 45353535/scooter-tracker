package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes9.dex */
final class az implements StandardIntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f28673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt f28674b;

    az(bn bnVar, bt btVar) {
        this.f28673a = bnVar;
        this.f28674b = btVar;
    }

    final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l10) {
        final long jB = prepareIntegrityTokenRequest.b();
        final long jLongValue = l10.longValue();
        prepareIntegrityTokenRequest.a();
        final bt btVar = this.f28674b;
        final int i10 = 0;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(jB, jLongValue, i10) { // from class: com.google.android.play.core.integrity.bs

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f28719b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f28720c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return this.f28718a.a(this.f28719b, this.f28720c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long jB = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.f28673a.e(jB, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f28671a.a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
