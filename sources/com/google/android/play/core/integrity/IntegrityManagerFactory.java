package com.google.android.play.core.integrity;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public class IntegrityManagerFactory {
    @NonNull
    public static IntegrityManager create(Context context) {
        return z.a(context).a();
    }

    @NonNull
    public static StandardIntegrityManager createStandard(Context context) {
        return ax.a(context).a();
    }
}
