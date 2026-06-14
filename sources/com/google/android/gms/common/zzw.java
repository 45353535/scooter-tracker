package com.google.android.gms.common;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes7.dex */
final class zzw {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    /* synthetic */ zzw(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, byte[] bArr) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z13;
    }

    final boolean zza() {
        return this.zzc;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    final zzp zzb(Context context) {
        return new zzp(this.zza, this.zzb, false, ObjectWrapper.wrap(context), false, true, false);
    }
}
