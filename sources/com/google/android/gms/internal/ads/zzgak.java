package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
class zzgak {
    static final String zza = new UUID(0, 0).toString();
    final zzgaj zzb;
    final zzgai zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    zzgak(Context context, String str, String str2, String str3) {
        this.zzb = zzgaj.zza(context);
        this.zzc = zzgai.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + str3.length());
            sb2.append(str);
            sb2.append(str2);
            sb2.append(str3);
            return UUID.nameUUIDFromBytes(sb2.toString().getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.zzh;
        String str5 = str2 == null ? "null" : "not null";
        int length = str5.length();
        String str6 = str3 == null ? "null" : "not null";
        StringBuilder sb3 = new StringBuilder(length + 120 + str6.length());
        sb3.append(str4);
        sb3.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb3.append(str5);
        sb3.append(", hashKey is ");
        sb3.append(str6);
        throw new IllegalArgumentException(sb3.toString());
    }

    final zzgah zza(@Nullable String str, @Nullable String str2, long j10, boolean z10) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String strZze = zze(true);
                    String strZzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (strZze != null && strZzc != null && !strZze.equals(zzh(str, str2, strZzc))) {
                        return zzb(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzgah();
        }
        boolean z11 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jZzd = zzd(z11);
        if (jZzd != -1) {
            if (jCurrentTimeMillis < jZzd) {
                this.zzb.zzb(z11 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jZzd + j10) {
                return zzb(str, str2);
            }
        }
        String strZze2 = zze(z11);
        return (strZze2 != null || z10) ? new zzgah(strZze2, zzd(z11)) : zzb(str, str2);
    }

    final zzgah zzb(String str, String str2) throws IOException {
        if (str == null) {
            return zzf(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.zzb.zzb("paid_3p_hash_key", string);
        return zzf(zzh(str, str2, string), true);
    }

    final void zzc(boolean z10) throws IOException {
        String str = z10 ? this.zzg : this.zzf;
        zzgaj zzgajVar = this.zzb;
        zzgajVar.zzf(str);
        zzgajVar.zzf(z10 ? this.zze : this.zzd);
    }

    final long zzd(boolean z10) {
        return this.zzb.zzd(z10 ? this.zzg : this.zzf, -1L);
    }

    final String zze(boolean z10) {
        return this.zzb.zzc(z10 ? this.zze : this.zzd, null);
    }

    final zzgah zzf(String str, boolean z10) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        zzgaj zzgajVar = this.zzb;
        zzgajVar.zzb(z10 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
        zzgajVar.zzb(z10 ? this.zze : this.zzd, str);
        return new zzgah(str, jCurrentTimeMillis);
    }

    final boolean zzg(boolean z10) {
        return this.zzb.zzg(this.zzd);
    }
}
