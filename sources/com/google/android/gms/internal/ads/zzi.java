package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class zzi {
    public static final zzi zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;

    @Nullable
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzh zzhVar = new zzh();
        zzhVar.zza(1);
        zzhVar.zzb(2);
        zzhVar.zzc(3);
        zza = zzhVar.zzg();
        zzh zzhVar2 = new zzh();
        zzhVar2.zza(1);
        zzhVar2.zzb(1);
        zzhVar2.zzc(2);
        zzhVar2.zzg();
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ zzi(int i10, int i11, int i12, byte[] bArr, int i13, int i14, byte[] bArr2) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = bArr;
        this.zzf = i13;
        this.zzg = i14;
    }

    public static boolean zza(@Nullable zzi zziVar) {
        if (zziVar == null) {
            return true;
        }
        int i10 = zziVar.zzb;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = zziVar.zzc;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = zziVar.zzd;
        if ((i12 != -1 && i12 != 3) || zziVar.zze != null) {
            return false;
        }
        int i13 = zziVar.zzg;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = zziVar.zzf;
        return i14 == -1 || i14 == 8;
    }

    public static int zzb(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzc(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzh(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 22);
        sb2.append("Undefined color space ");
        sb2.append(i10);
        return sb2.toString();
    }

    private static String zzi(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return com.taurusx.tax.f.y.f66052c;
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 25);
        sb2.append("Undefined color transfer ");
        sb2.append(i10);
        return sb2.toString();
    }

    private static String zzj(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 22);
        sb2.append("Undefined color range ");
        sb2.append(i10);
        return sb2.toString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzi.class == obj.getClass()) {
            zzi zziVar = (zzi) obj;
            if (this.zzb == zziVar.zzb && this.zzc == zziVar.zzc && this.zzd == zziVar.zzd && Arrays.equals(this.zze, zziVar.zze) && this.zzf == zziVar.zzf && this.zzg == zziVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzh;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((this.zzb + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzc) * 31) + this.zzd) * 31) + Arrays.hashCode(this.zze)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string;
        int i10 = this.zzf;
        int i11 = this.zzd;
        int i12 = this.zzc;
        String strZzh = zzh(this.zzb);
        String strZzj = zzj(i12);
        String strZzi = zzi(i11);
        String string2 = "NA";
        if (i10 != -1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 8);
            sb2.append(i10);
            sb2.append("bit Luma");
            string = sb2.toString();
        } else {
            string = "NA";
        }
        int i13 = this.zzg;
        if (i13 != -1) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 10);
            sb3.append(i13);
            sb3.append("bit Chroma");
            string2 = sb3.toString();
        }
        boolean z10 = this.zze != null;
        StringBuilder sb4 = new StringBuilder(strZzh.length() + 12 + strZzj.length() + 2 + strZzi.length() + 2 + String.valueOf(z10).length() + 2 + string.length() + 2 + string2.length() + 1);
        sb4.append("ColorInfo(");
        sb4.append(strZzh);
        sb4.append(", ");
        sb4.append(strZzj);
        sb4.append(", ");
        sb4.append(strZzi);
        sb4.append(", ");
        sb4.append(z10);
        sb4.append(", ");
        sb4.append(string);
        sb4.append(", ");
        sb4.append(string2);
        sb4.append(")");
        return sb4.toString();
    }

    public final zzh zzd() {
        return new zzh(this, null);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }

    public final String zzg() {
        String str;
        String string;
        if (zzf()) {
            Object[] objArr = {zzh(this.zzb), zzj(this.zzc), zzi(this.zzd)};
            String str2 = zzfj.zza;
            str = String.format(Locale.US, "%s/%s/%s", objArr);
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            int i10 = this.zzf;
            int i11 = this.zzg;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length());
            sb2.append(i10);
            sb2.append("/");
            sb2.append(i11);
            string = sb2.toString();
        } else {
            string = "NA/NA";
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 1 + string.length());
        sb3.append(str);
        sb3.append("/");
        sb3.append(string);
        return sb3.toString();
    }
}
