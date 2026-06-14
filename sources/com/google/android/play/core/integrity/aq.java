package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes9.dex */
final class aq extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f28658b;

    aq(String str, y yVar) {
        this.f28657a = str;
        this.f28658b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i10) {
        return this.f28658b.a(activity, i10);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f28657a;
    }
}
