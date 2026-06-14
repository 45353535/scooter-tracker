package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5469ub implements Function, Consumer {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5370qb apply(@NonNull File file) {
        String strA = Qa.a(file);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        try {
            return new C5370qb(strA);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void consume(@NonNull File file) {
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}
