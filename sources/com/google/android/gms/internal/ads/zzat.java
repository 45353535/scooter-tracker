package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class zzat extends IOException {
    public final boolean zza;
    public final int zzb;

    protected zzat(@Nullable String str, @Nullable Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.zza = z10;
        this.zzb = i10;
    }

    public static zzat zza(@Nullable String str, @Nullable Throwable th2) {
        return new zzat(str, th2, true, 0);
    }

    public static zzat zzb(@Nullable String str, @Nullable Throwable th2) {
        return new zzat(str, th2, true, 1);
    }

    public static zzat zzc(@Nullable String str) {
        return new zzat(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        boolean z10 = this.zza;
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(strConcat.length() + 20 + String.valueOf(z10).length() + 11 + String.valueOf(i10).length() + 1);
        sb2.append(strConcat);
        sb2.append("{contentIsMalformed=");
        sb2.append(z10);
        sb2.append(", dataType=");
        sb2.append(i10);
        sb2.append("}");
        return sb2.toString();
    }
}
