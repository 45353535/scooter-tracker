package com.google.android.gms.internal.fido;

import com.ironsource.D5;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbf {
    private static final zzbf zza;
    private static final zzbf zzb;
    private static final zzbf zzc;
    private static final zzbf zzd;
    private static final zzbf zze;

    static {
        Character chValueOf = Character.valueOf(D5.T);
        zza = new zzbd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", chValueOf);
        zzb = new zzbd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", chValueOf);
        zzc = new zzbe("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", chValueOf);
        zzd = new zzbe("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", chValueOf);
        zze = new zzbc("base16()", "0123456789ABCDEF");
    }

    zzbf() {
    }

    public static zzbf zzd() {
        return zze;
    }

    abstract void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    abstract int zzb(int i10);

    public final String zze(byte[] bArr, int i10, int i11) {
        zzam.zze(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzb(i11));
        try {
            zza(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
