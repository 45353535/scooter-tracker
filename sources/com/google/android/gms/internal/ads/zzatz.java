package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzatz implements zzaty {
    @Override // com.google.android.gms.internal.ads.zzaty
    public final byte zza(zzauk zzaukVar, int i10) {
        return zzaukVar.zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final zzauk zzb(zzauk zzaukVar, int i10, int i11) {
        byte[] bArr;
        int length;
        if (i10 < 0 || i10 > i11 || i11 > (length = (bArr = zzaukVar.zza).length) || i10 > i11 || i11 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new zzauk(zzauk.zzh(bArr, i10, i11 - i10));
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final zzaty zzc() {
        return new zzatz();
    }
}
