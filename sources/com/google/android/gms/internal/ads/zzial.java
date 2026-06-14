package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzial extends zziak {
    private final byte[] zzb;

    zzial(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    final byte zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzc() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zzian zzd(int i10, int i11) {
        byte[] bArr = this.zzb;
        int iZzC = zzian.zzC(i10, i11, bArr.length);
        return iZzC == 0 ? zzian.zza : new zziah(bArr, i10, iZzC);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzian
    final void zzg(zziae zziaeVar) throws IOException {
        byte[] bArr = this.zzb;
        zziaeVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final String zzh(Charset charset) {
        return new String(this.zzb, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzi() {
        return zzier.zza(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final boolean zzj(zzian zzianVar) {
        return zzianVar instanceof zzial ? Arrays.equals(this.zzb, ((zzial) zzianVar).zzb) : zzianVar instanceof zziah ? zzk(zzianVar, 0, this.zzb.length) : zzianVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zziak
    final boolean zzk(zzian zzianVar, int i10, int i11) {
        if (i11 > zzianVar.zzc()) {
            byte[] bArr = this.zzb;
            int length = String.valueOf(i11).length();
            int length2 = bArr.length;
            StringBuilder sb2 = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= zzianVar.zzc()) {
            if (zzianVar instanceof zzial) {
                return zzian.zzD(this.zzb, 0, ((zzial) zzianVar).zzb, i10, i11);
            }
            if (!(zzianVar instanceof zziah)) {
                return zzianVar.zzd(i10, i12).equals(zzd(0, i11));
            }
            zziah zziahVar = (zziah) zzianVar;
            return zzian.zzD(this.zzb, 0, zziahVar.zzn(), zziahVar.zzo() + i10, i11);
        }
        int iZzc = zzianVar.zzc();
        int length3 = String.valueOf(i10).length();
        StringBuilder sb3 = new StringBuilder(length3 + 24 + String.valueOf(i11).length() + 2 + String.valueOf(iZzc).length());
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
        return zzice.zzc(i10, this.zzb, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zziaq zzm() {
        byte[] bArr = this.zzb;
        return zziaq.zzG(bArr, 0, bArr.length, true);
    }

    final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }
}
