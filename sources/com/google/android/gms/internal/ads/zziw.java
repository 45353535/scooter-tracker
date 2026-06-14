package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zziw extends zzau {
    public final int zzc;

    @Nullable
    public final String zzd;
    public final int zze;

    @Nullable
    public final zzv zzf;
    public final int zzg;

    @Nullable
    public final zzwk zzh;
    final boolean zzi;

    private zziw(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, null, false);
    }

    public static zziw zza(IOException iOException, int i10) {
        return new zziw(0, iOException, i10);
    }

    public static zziw zzb(Throwable th2, String str, int i10, @Nullable zzv zzvVar, int i11, @Nullable zzwk zzwkVar, boolean z10, int i12) {
        if (zzvVar == null) {
            i11 = 4;
        }
        return new zziw(1, th2, null, i12, str, i10, zzvVar, i11, zzwkVar, z10);
    }

    public static zziw zzc(RuntimeException runtimeException, int i10) {
        return new zziw(2, runtimeException, i10);
    }

    @CheckResult
    final zziw zzd(@Nullable zzwk zzwkVar) {
        String message = getMessage();
        String str = zzfj.zza;
        return new zziw(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzwkVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zziw(int i10, @Nullable Throwable th2, @Nullable String str, int i11, @Nullable String str2, int i12, @Nullable zzv zzvVar, int i13, @Nullable zzwk zzwkVar, boolean z10) {
        String str3;
        int i14;
        String string;
        String str4;
        if (i10 == 0) {
            str3 = str2;
            i14 = i12;
            string = "Source error";
        } else if (i10 != 1) {
            string = "Unexpected runtime error";
            str3 = str2;
            i14 = i12;
        } else {
            String strValueOf = String.valueOf(zzvVar);
            String str5 = zzfj.zza;
            if (i13 == 0) {
                str4 = "NO";
            } else if (i13 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i13 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 14 + String.valueOf(i12).length() + 9 + strValueOf.length() + 19 + str4.length());
            str3 = str2;
            sb2.append(str3);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            sb2.append(strValueOf);
            sb2.append(", format_supported=");
            sb2.append(str4);
            string = sb2.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), th2, i11, i10, str3, i14, zzvVar, i13, zzwkVar, SystemClock.elapsedRealtime(), z10);
    }

    private zziw(String str, @Nullable Throwable th2, int i10, int i11, @Nullable String str2, int i12, @Nullable zzv zzvVar, int i13, @Nullable zzwk zzwkVar, long j10, boolean z10) {
        boolean z11;
        super(str, th2, i10, Bundle.EMPTY, j10);
        if (!z10) {
            z11 = true;
        } else if (i11 == 1) {
            i11 = 1;
            z11 = true;
        } else {
            z11 = false;
        }
        zzgrc.zza(z11);
        zzgrc.zza(th2 != null);
        this.zzc = i11;
        this.zzd = str2;
        this.zze = i12;
        this.zzf = zzvVar;
        this.zzg = i13;
        this.zzh = zzwkVar;
        this.zzi = z10;
    }
}
