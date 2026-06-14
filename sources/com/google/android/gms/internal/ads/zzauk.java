package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class zzauk {
    public static final zzauk zzb = new zzauk(new byte[0]);
    public static final Comparator zzc = new zzauj();
    public final byte[] zza;

    public zzauk(byte[] bArr) {
        this.zza = bArr;
    }

    public static zzauk zze(byte[] bArr) {
        return new zzauk(zzh(bArr, 0, bArr.length));
    }

    public static zzauk zzf(String str) {
        return zze(str.getBytes(Charset.forName(zzaui.zza("Hn2H4l0="))));
    }

    public static int zzg(byte b10) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        return b10 & ((iArr[6] + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)) ^ (iArr[7] % 837626799));
    }

    public static byte[] zzh(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzauk) {
            return Arrays.equals(this.zza, ((zzauk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        String string = Arrays.toString(this.zza);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + ((i17 % 981766422) ^ i18));
        sb2.append(zzaui.zza("CVC1qiQNJHikW0iU1TIPZA=="));
        sb2.append(string);
        sb2.append(zzaui.zza("Ng=="));
        return sb2.toString();
    }

    public final byte[] zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        return length == 0 ? new byte[0] : zzh(bArr, 0, length);
    }

    public final byte zzb(int i10) {
        int i11 = ((((~2106914653) & 587408197) | 1537377410) + ((2106914653 & 536945509) | 443419704)) - 2137956065;
        int i12 = 2013725218 % 1633938701;
        int i13 = ((((~1287859999) & 62941354) | 437464817) + ((1287859999 & 1639989262) | 1644309956)) - 2060977796;
        int i14 = 1442767057 % 63299708;
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (((length - (i10 + 1)) | i10) >= 0) {
            return bArr[i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + (i11 ^ i12));
            sb2.append(zzaui.zza("Akelqh1fajntGgo="));
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + (i13 ^ i14) + String.valueOf(length).length());
        sb3.append(zzaui.zza("Akelqh1faDmxRUSK1T9GeQ=="));
        sb3.append(i10);
        sb3.append(zzaui.zza("Zwk="));
        sb3.append(length);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    public final String zzc() {
        Charset charsetForName = Charset.forName(zzaui.zza("Hn2H4l0="));
        byte[] bArr = this.zza;
        return new String(bArr, 0, bArr.length, charsetForName);
    }

    public final zzauk zzd(zzauk zzaukVar) {
        byte[] bArr = zzaukVar.zza;
        int length = bArr.length;
        byte[] bArr2 = this.zza;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return zze(bArr3);
    }
}
