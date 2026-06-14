package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzep extends zzes {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    zzep(byte[] bArr, int i10, int i11) {
        super(null);
        zzev.zzj(i10, i10 + i11, bArr.length);
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final byte zza(int i10) {
        int i11 = this.zzd;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.zzb[this.zzc + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    final byte zzb(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    protected final int zzd(int i10, int i11, int i12) {
        return zzga.zzb(i10, this.zzb, this.zzc, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    public final zzev zzf(int i10, int i11) {
        int iZzj = zzev.zzj(i10, i11, this.zzd);
        return iZzj == 0 ? zzev.zza : new zzep(this.zzb, this.zzc + i10, iZzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    final void zzg(zzem zzemVar) throws IOException {
        ((zzez) zzemVar).zzc(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzev
    protected final boolean zzh(zzev zzevVar) {
        boolean z10 = zzevVar instanceof zzet;
        if (!z10 && !(zzevVar instanceof zzep)) {
            return zzevVar.zzh(this);
        }
        int i10 = this.zzd;
        if (i10 > zzevVar.zze()) {
            throw new IllegalArgumentException("Length too large: " + i10 + i10);
        }
        if (i10 > zzevVar.zze()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i10 + ", " + zzevVar.zze());
        }
        if (z10) {
            return zzev.zzl(this.zzb, this.zzc, ((zzet) zzevVar).zzb, 0, i10);
        }
        if (zzevVar instanceof zzep) {
            zzep zzepVar = (zzep) zzevVar;
            return zzev.zzl(this.zzb, this.zzc, zzepVar.zzb, zzepVar.zzc, i10);
        }
        zzev zzevVarZzf = zzevVar.zzf(0, i10);
        int i11 = this.zzc;
        return zzevVarZzf.equals(zzf(i11, i10 + i11));
    }
}
