package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zziaw extends zziae {
    private static final boolean zza = zziem.zza();
    public static final /* synthetic */ int zzf = 0;
    Object zze;

    private zziaw() {
        throw null;
    }

    public static int zzA(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzB(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int zzC(zzidc zzidcVar) {
        int iZzbr = zzidcVar.zzbr();
        return zzA(iZzbr) + iZzbr;
    }

    static int zzz(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public final void zzD() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzH(int i10, int i11) throws IOException;

    public abstract void zzI(int i10, int i11) throws IOException;

    public abstract void zzJ(int i10, int i11) throws IOException;

    public abstract void zzK(int i10, int i11) throws IOException;

    public abstract void zzL(int i10, long j10) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i10, long j10) throws IOException;

    public abstract void zzi(int i10, boolean z10) throws IOException;

    public abstract void zzj(int i10, String str) throws IOException;

    public abstract void zzk(int i10, zzian zzianVar) throws IOException;

    public abstract void zzl(zzian zzianVar) throws IOException;

    abstract void zzm(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzn(int i10, zzidc zzidcVar) throws IOException;

    public abstract void zzo(int i10, zzian zzianVar) throws IOException;

    public abstract void zzp(zzidc zzidcVar) throws IOException;

    public abstract void zzq(byte b10) throws IOException;

    public abstract void zzr(int i10) throws IOException;

    public abstract void zzs(int i10) throws IOException;

    public abstract void zzt(int i10) throws IOException;

    public abstract void zzu(long j10) throws IOException;

    public abstract void zzv(long j10) throws IOException;

    public abstract void zzx(String str) throws IOException;

    public abstract void zzy() throws IOException;

    /* synthetic */ zziaw(byte[] bArr) {
    }
}
