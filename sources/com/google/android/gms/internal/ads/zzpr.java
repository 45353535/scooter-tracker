package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.ironsource.C4240b4;
import j$.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
final class zzpr {
    public static final zzpr zza;
    public final int zzb;
    public final int zzc;

    @Nullable
    private final zzgup zzd;

    static {
        zzpr zzprVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzguo zzguoVar = new zzguo();
            for (int i10 = 1; i10 <= 10; i10++) {
                zzguoVar.zzf(Integer.valueOf(zzfj.zzB(i10)));
            }
            zzprVar = new zzpr(2, zzguoVar.zzi());
        } else {
            zzprVar = new zzpr(2, 10);
        }
        zza = zzprVar;
    }

    public zzpr(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpr)) {
            return false;
        }
        zzpr zzprVar = (zzpr) obj;
        return this.zzb == zzprVar.zzb && this.zzc == zzprVar.zzc && Objects.equals(this.zzd, zzprVar.zzd);
    }

    public final int hashCode() {
        zzgup zzgupVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgupVar == null ? 0 : zzgupVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int i10 = this.zzb;
        int length = String.valueOf(i10).length();
        int i11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 38 + String.valueOf(i11).length() + 15 + strValueOf.length() + 1);
        sb2.append("AudioProfile[format=");
        sb2.append(i10);
        sb2.append(", maxChannelCount=");
        sb2.append(i11);
        sb2.append(", channelMasks=");
        sb2.append(strValueOf);
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }

    public final boolean zza(int i10) {
        zzgup zzgupVar = this.zzd;
        if (zzgupVar == null) {
            return i10 <= this.zzc;
        }
        int iZzB = zzfj.zzB(i10);
        if (iZzB == 0) {
            return false;
        }
        return zzgupVar.contains(Integer.valueOf(iZzB));
    }

    public final int zzb(int i10, zzd zzdVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzps.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i11 = this.zzb;
        for (int i12 = 10; i12 > 0; i12--) {
            int iZzB = zzfj.zzB(i12);
            if (iZzB != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i10).setChannelMask(iZzB).build(), zzdVar.zza())) {
                return i12;
            }
        }
        return 0;
    }

    @RequiresApi(33)
    public zzpr(int i10, Set set) {
        this.zzb = i10;
        zzgup zzgupVarZzo = zzgup.zzo(set);
        this.zzd = zzgupVarZzo;
        zzgwt it = zzgupVarZzo.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
