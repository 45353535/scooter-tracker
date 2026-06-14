package com.google.android.gms.internal.ads;

import com.ironsource.D5;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzgxa {
    private static final zzgxa zza;
    private static final zzgxa zzb;
    private static final zzgxa zzc;

    static {
        Character chValueOf = Character.valueOf(D5.T);
        zza = new zzgwx("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", chValueOf);
        zzb = new zzgwx("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", chValueOf);
        new zzgwz("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", chValueOf);
        new zzgwz("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", chValueOf);
        zzc = new zzgww("base16()", "0123456789ABCDEF");
    }

    zzgxa() {
    }

    public static zzgxa zzl() {
        return zza;
    }

    public static zzgxa zzm() {
        return zzb;
    }

    public static zzgxa zzn() {
        return zzc;
    }

    abstract void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    abstract int zzb(byte[] bArr, CharSequence charSequence) throws zzgwy;

    abstract int zzd(int i10);

    abstract int zzf(int i10);

    CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzgxa zzh();

    public abstract zzgxa zzi();

    public final String zzj(byte[] bArr, int i10, int i11) {
        zzgrc.zzo(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzd(i11));
        try {
            zza(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzf = zzf(charSequenceZzg.length());
            byte[] bArr = new byte[iZzf];
            int iZzb = zzb(bArr, charSequenceZzg);
            if (iZzb == iZzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZzb];
            System.arraycopy(bArr, 0, bArr2, 0, iZzb);
            return bArr2;
        } catch (zzgwy e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
