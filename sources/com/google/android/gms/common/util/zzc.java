package com.google.android.gms.common.util;

import android.os.StrictMode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes7.dex */
@RequiresApi(31)
final class zzc {
    @DoNotInline
    static StrictMode.VmPolicy.Builder zza(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
