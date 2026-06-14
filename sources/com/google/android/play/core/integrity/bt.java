package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes9.dex */
final class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f28721a;

    bt(bn bnVar) {
        this.f28721a = bnVar;
    }

    final /* synthetic */ Task a(long j10, long j11, int i10, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f28721a.d(standardIntegrityTokenRequest.a(), j10, j11, 0);
    }
}
