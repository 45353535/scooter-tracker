package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
final class zzct {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final zzcr zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private double zzq;

    public zzct(int i10, int i11, float f10, float f11, int i12, boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = i10 / i12;
        this.zzf = i10 / 400;
        int i13 = i10 / 65;
        this.zzg = i13;
        this.zzh = i13 + i13;
        this.zzi = z10 ? new zzcq(this) : new zzcs(this);
    }

    private final void zzo(int i10, int i11) {
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzk(i11);
        Object objZzr = zzcrVar.zzr();
        Object objZzq = zzcrVar.zzq();
        int i12 = this.zzk;
        int i13 = this.zzb;
        System.arraycopy(objZzr, i10 * i13, objZzq, i12 * i13, i11 * i13);
        this.zzk += i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017e A[EDGE_INSN: B:101:0x017e->B:59:0x017e BREAK  A[LOOP:3: B:13:0x0035->B:92:0x024c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024c A[LOOP:3: B:13:0x0035->B:92:0x024c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzp() {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzct.zzp():void");
    }

    public final int zza() {
        return this.zzj * this.zzb * this.zzi.zza();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        zzcr zzcrVar = this.zzi;
        int iRemaining = byteBuffer.remaining();
        int iZza = iRemaining / (this.zzb * zzcrVar.zza());
        zzcrVar.zzj(iZza);
        zzcrVar.zzn(byteBuffer, iRemaining);
        this.zzj += iZza;
        zzp();
    }

    public final void zzc(ByteBuffer byteBuffer) {
        zzgrc.zzi(this.zzk >= 0);
        int i10 = this.zzb;
        int iRemaining = byteBuffer.remaining();
        zzcr zzcrVar = this.zzi;
        int iMin = Math.min(iRemaining / (zzcrVar.zza() * i10), this.zzk);
        zzcrVar.zzo(byteBuffer, iMin);
        this.zzk -= iMin;
        System.arraycopy(zzcrVar.zzq(), iMin * i10, zzcrVar.zzq(), 0, this.zzk * i10);
    }

    public final void zzd() {
        int i10 = this.zzj;
        int i11 = this.zzo;
        int i12 = this.zzk;
        float f10 = this.zzc;
        float f11 = this.zzd;
        int i13 = i12 + ((int) ((((((((double) (i10 - i11)) / ((double) (f10 / f11))) + ((double) i11)) + this.zzq) + ((double) this.zzl)) / ((double) (this.zze * f11))) + 0.5d));
        this.zzq = 0.0d;
        int i14 = this.zzh;
        int i15 = i14 + i14;
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzj(i10 + i15);
        zzcrVar.zzm(i10 * this.zzb, i15);
        this.zzj += i15;
        zzp();
        if (this.zzk > i13) {
            this.zzk = Math.max(i13, 0);
        }
        this.zzj = 0;
        this.zzo = 0;
        this.zzl = 0;
    }

    public final void zze() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 0;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0.0d;
        this.zzi.zzg();
    }

    public final int zzf() {
        zzgrc.zzi(this.zzk >= 0);
        return this.zzk * this.zzb * this.zzi.zza();
    }

    final /* synthetic */ int zzg() {
        return this.zzb;
    }

    final /* synthetic */ int zzh() {
        return this.zzh;
    }

    final /* synthetic */ int zzi() {
        return this.zzj;
    }

    final /* synthetic */ int zzj() {
        return this.zzk;
    }

    final /* synthetic */ int zzk() {
        return this.zzl;
    }

    final /* synthetic */ int zzl() {
        return this.zzm;
    }

    final /* synthetic */ int zzm() {
        return this.zzn;
    }

    final /* synthetic */ int zzn() {
        return this.zzp;
    }
}
