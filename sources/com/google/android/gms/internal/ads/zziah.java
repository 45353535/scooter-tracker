package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
final class zziah extends zziak {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    zziah(byte[] bArr, int i10, int i11) {
        super(null);
        zzian.zzC(i10, i10 + i11, bArr.length);
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zza(int i10) {
        zzian.zzB(i10, this.zzd);
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    final byte zzb(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zzian zzd(int i10, int i11) {
        int iZzC = zzian.zzC(i10, i11, this.zzd);
        return iZzC == 0 ? zzian.zza : new zziah(this.zzb, this.zzc + i10, iZzC);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, this.zzc + i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb, this.zzc, this.zzd).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzian
    final void zzg(zziae zziaeVar) throws IOException {
        zziaeVar.zza(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final String zzh(Charset charset) {
        return new String(this.zzb, this.zzc, this.zzd, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzi() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        return zzier.zzb(bArr, i10, this.zzd + i10);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final boolean zzj(zzian zzianVar) {
        return ((zzianVar instanceof zzial) || (zzianVar instanceof zziah)) ? zzk(zzianVar, 0, this.zzd) : zzianVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zziak
    final boolean zzk(zzian zzianVar, int i10, int i11) {
        if (i11 > zzianVar.zzc()) {
            int i12 = this.zzd;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 18 + String.valueOf(i12).length());
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(i12);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i13 = i10 + i11;
        if (i13 <= zzianVar.zzc()) {
            if (zzianVar instanceof zzial) {
                return zzian.zzD(this.zzb, this.zzc, ((zzial) zzianVar).zzn(), i10, i11);
            }
            if (zzianVar instanceof zziah) {
                zziah zziahVar = (zziah) zzianVar;
                return zzian.zzD(this.zzb, this.zzc, zziahVar.zzb, zziahVar.zzc + i10, i11);
            }
            zzian zzianVarZzd = zzianVar.zzd(i10, i13);
            int i14 = this.zzc;
            return zzianVarZzd.equals(zzd(i14, i11 + i14));
        }
        int iZzc = zzianVar.zzc();
        int length = String.valueOf(i10).length();
        StringBuilder sb3 = new StringBuilder(length + 24 + String.valueOf(i11).length() + 2 + String.valueOf(iZzc).length());
        sb3.append("Ran off end of other: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        sb3.append(", ");
        sb3.append(iZzc);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final int zzl(int i10, int i11, int i12) {
        return zzice.zzc(i10, this.zzb, this.zzc + i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zziaq zzm() {
        return zziaq.zzG(this.zzb, this.zzc, this.zzd, true);
    }

    final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }

    final /* synthetic */ int zzo() {
        return this.zzc;
    }
}
