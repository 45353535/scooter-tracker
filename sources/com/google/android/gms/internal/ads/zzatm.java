package com.google.android.gms.internal.ads;

import com.ironsource.C4240b4;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes8.dex */
public final class zzatm extends zzijp {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzijz zzm;
    private long zzn;

    public zzatm() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzijz.zzj;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zzg + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + C4240b4.j.f42674e;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzijn
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zziju.zza(zzati.zzd(byteBuffer));
            this.zzh = zziju.zza(zzati.zzd(byteBuffer));
            this.zzi = zzati.zza(byteBuffer);
            this.zzj = zzati.zzd(byteBuffer);
        } else {
            this.zzg = zziju.zza(zzati.zza(byteBuffer));
            this.zzh = zziju.zza(zzati.zza(byteBuffer));
            this.zzi = zzati.zza(byteBuffer);
            this.zzj = zzati.zza(byteBuffer);
        }
        this.zzk = zzati.zze(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzati.zzb(byteBuffer);
        zzati.zza(byteBuffer);
        zzati.zza(byteBuffer);
        this.zzm = new zzijz(zzati.zze(byteBuffer), zzati.zze(byteBuffer), zzati.zze(byteBuffer), zzati.zze(byteBuffer), zzati.zzf(byteBuffer), zzati.zzf(byteBuffer), zzati.zzf(byteBuffer), zzati.zze(byteBuffer), zzati.zze(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzati.zza(byteBuffer);
    }
}
