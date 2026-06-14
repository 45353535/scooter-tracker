package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzgwx extends zzgwz {
    private zzgwx(zzgwv zzgwvVar, Character ch2) {
        super(zzgwvVar, ch2);
        zzgrc.zza(zzgwvVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzgrc.zzo(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & 255;
            int i15 = bArr[i12 + 1] & 255;
            int i16 = bArr[i12 + 2] & 255;
            zzgwv zzgwvVar = this.zzb;
            int i17 = (i15 << 8) | (i14 << 16) | i16;
            appendable.append(zzgwvVar.zza(i17 >>> 18));
            appendable.append(zzgwvVar.zza((i17 >>> 12) & 63));
            appendable.append(zzgwvVar.zza((i17 >>> 6) & 63));
            appendable.append(zzgwvVar.zza(i17 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            zze(appendable, bArr, i12, i11 - i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    final int zzb(byte[] bArr, CharSequence charSequence) throws zzgwy {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgwv zzgwvVar = this.zzb;
        if (!zzgwvVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(length2).length() + 21);
            sb2.append("Invalid input length ");
            sb2.append(length2);
            throw new zzgwy(sb2.toString());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceZzg.length()) {
            int i12 = i11 + 1;
            int iZzc = (zzgwvVar.zzc(charSequenceZzg.charAt(i10 + 1)) << 12) | (zzgwvVar.zzc(charSequenceZzg.charAt(i10)) << 18);
            bArr[i11] = (byte) (iZzc >>> 16);
            int i13 = i10 + 2;
            if (i13 < charSequenceZzg.length()) {
                int i14 = i10 + 3;
                int iZzc2 = iZzc | (zzgwvVar.zzc(charSequenceZzg.charAt(i13)) << 6);
                int i15 = i11 + 2;
                bArr[i12] = (byte) ((iZzc2 >>> 8) & 255);
                if (i14 < charSequenceZzg.length()) {
                    i10 += 4;
                    i11 += 3;
                    bArr[i15] = (byte) ((iZzc2 | zzgwvVar.zzc(charSequenceZzg.charAt(i14))) & 255);
                } else {
                    i11 = i15;
                    i10 = i14;
                }
            } else {
                i10 = i13;
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    final zzgxa zzc(zzgwv zzgwvVar, Character ch2) {
        return new zzgwx(zzgwvVar, ch2);
    }

    zzgwx(String str, String str2, Character ch2) {
        this(new zzgwv(str, str2.toCharArray()), ch2);
    }
}
