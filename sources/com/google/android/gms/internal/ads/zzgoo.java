package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes8.dex */
final class zzgoo extends zzgpp {
    private IBinder zza;
    private String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private String zzf;
    private byte zzg;

    zzgoo() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpp
    public final zzgpp zza(IBinder iBinder) {
        if (iBinder == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.zza = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpp
    public final zzgpp zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpp
    public final zzgpp zzc(int i10) {
        this.zzc = i10;
        this.zzg = (byte) (this.zzg | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpp
    public final zzgpp zzd(float f10) {
        this.zzd = f10;
        this.zzg = (byte) (this.zzg | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpp
    public final zzgpp zze(int i10) {
        this.zzg = (byte) (this.zzg | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpp
    public final zzgpp zzf(int i10) {
        this.zzg = (byte) (this.zzg | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpp
    public final zzgpp zzg(int i10) {
        this.zze = i10;
        this.zzg = (byte) (this.zzg | Ascii.DLE);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpp
    public final zzgpp zzh(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpp
    public final zzgpq zzi() {
        IBinder iBinder;
        if (this.zzg == 31 && (iBinder = this.zza) != null) {
            return new zzgop(iBinder, this.zzb, this.zzc, this.zzd, 0, 0, null, this.zze, null, this.zzf, null, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" windowToken");
        }
        if ((this.zzg & 1) == 0) {
            sb2.append(" layoutGravity");
        }
        if ((this.zzg & 2) == 0) {
            sb2.append(" layoutVerticalMargin");
        }
        if ((this.zzg & 4) == 0) {
            sb2.append(" displayMode");
        }
        if ((this.zzg & 8) == 0) {
            sb2.append(" triggerMode");
        }
        if ((this.zzg & Ascii.DLE) == 0) {
            sb2.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
