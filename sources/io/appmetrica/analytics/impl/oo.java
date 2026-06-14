package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* JADX INFO: loaded from: classes12.dex */
public final class oo implements Ra {
    @Override // io.appmetrica.analytics.impl.Ra
    @Nullable
    public final String a(@NonNull Context context) {
        IdentifiersResult identifiersResultQ = new C4965af(C5112g7.a(context.getApplicationContext()).a()).q();
        if (TextUtils.isEmpty(identifiersResultQ.f78675id)) {
            return null;
        }
        return identifiersResultQ.f78675id;
    }
}
