package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes9.dex */
final class br extends StandardIntegrityManager.StandardIntegrityToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f28717b;

    br(String str, y yVar) {
        this.f28716a = str;
        this.f28717b = yVar;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final Task<Integer> showDialog(Activity activity, int i10) {
        return this.f28717b.a(activity, i10);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f28716a;
    }
}
