package com.inmobi.media;

import android.database.sqlite.SQLiteException;
import com.inmobi.adquality.models.AdQualityResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3861lh implements M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdQualityResult f38984a;

    public C3861lh(AdQualityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f38984a = result;
    }

    @Override // com.inmobi.media.M0
    public final Object a() {
        boolean z10;
        try {
            z10 = true;
            eg.h.b(null, new C3836kh(this, null), 1, null);
        } catch (SQLiteException unused) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
