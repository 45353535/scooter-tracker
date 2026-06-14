package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzapi extends zzaeg {
    public zzapi(zzfg zzfgVar, long j10, long j11) {
        super(new zzaeb(), new zzaph(zzfgVar, null), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    static /* synthetic */ int zzh(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
