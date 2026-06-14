package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzijz {
    public static final zzijz zzj = new zzijz(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzijz zzk = new zzijz(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzijz zzl = new zzijz(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzijz zzm = new zzijz(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;

    public zzijz(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.zza = d14;
        this.zzb = d15;
        this.zzc = d16;
        this.zzd = d10;
        this.zze = d11;
        this.zzf = d12;
        this.zzg = d13;
        this.zzh = d17;
        this.zzi = d18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzijz.class != obj.getClass()) {
            return false;
        }
        zzijz zzijzVar = (zzijz) obj;
        return Double.compare(zzijzVar.zzd, this.zzd) == 0 && Double.compare(zzijzVar.zze, this.zze) == 0 && Double.compare(zzijzVar.zzf, this.zzf) == 0 && Double.compare(zzijzVar.zzg, this.zzg) == 0 && Double.compare(zzijzVar.zzh, this.zzh) == 0 && Double.compare(zzijzVar.zzi, this.zzi) == 0 && Double.compare(zzijzVar.zza, this.zza) == 0 && Double.compare(zzijzVar.zzb, this.zzb) == 0 && Double.compare(zzijzVar.zzc, this.zzc) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zza);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zzb);
        long j11 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.zzc);
        long j12 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.zzd);
        long j13 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.zze);
        long j14 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.zzf);
        long j15 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.zzg);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.zzh);
        long j16 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.zzi);
        return (((((((((((((((((int) j10) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j16)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zzj)) {
            return "Rotate 0°";
        }
        if (equals(zzk)) {
            return "Rotate 90°";
        }
        if (equals(zzl)) {
            return "Rotate 180°";
        }
        if (equals(zzm)) {
            return "Rotate 270°";
        }
        double d10 = this.zza;
        double d11 = this.zzb;
        double d12 = this.zzc;
        double d13 = this.zzd;
        double d14 = this.zze;
        double d15 = this.zzf;
        double d16 = this.zzg;
        double d17 = this.zzh;
        double d18 = this.zzi;
        StringBuilder sb2 = new StringBuilder(260);
        sb2.append("Matrix{u=");
        sb2.append(d10);
        sb2.append(", v=");
        sb2.append(d11);
        sb2.append(", w=");
        sb2.append(d12);
        sb2.append(", a=");
        sb2.append(d13);
        sb2.append(", b=");
        sb2.append(d14);
        sb2.append(", c=");
        sb2.append(d15);
        sb2.append(", d=");
        sb2.append(d16);
        sb2.append(", tx=");
        sb2.append(d17);
        sb2.append(", ty=");
        sb2.append(d18);
        sb2.append("}");
        return sb2.toString();
    }
}
