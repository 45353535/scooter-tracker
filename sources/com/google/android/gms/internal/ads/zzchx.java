package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class zzchx extends zzchr implements zzhz {
    private static final AtomicInteger zzo = new AtomicInteger(0);
    private String zzd;
    private final zzcgd zze;
    private boolean zzf;
    private final zzchw zzg;
    private final zzcha zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzchx(zzcge zzcgeVar, zzcgd zzcgdVar) {
        super(zzcgeVar);
        this.zze = zzcgdVar;
        this.zzg = new zzchw();
        this.zzh = new zzcha();
        this.zzk = new Object();
        this.zzl = (String) zzgra.zzd(zzcgeVar != null ? zzcgeVar.zzn() : null).zza("");
        this.zzm = zzcgeVar != null ? zzcgeVar.zzp() : 0;
        zzo.incrementAndGet();
    }

    public static int zzr() {
        return zzo.get();
    }

    protected static final String zzv(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzx() {
        int iZza = (int) this.zzg.zza();
        int iZza2 = (int) this.zzh.zza(this.zzi);
        int iPosition = this.zzi.position();
        int iRound = Math.round(iZza2 * (iPosition / iZza));
        int iZzP = zzcfv.zzP();
        int iZzQ = zzcfv.zzQ();
        String str = this.zzd;
        zzn(str, zzv(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzP, iZzQ);
    }

    @Override // com.google.android.gms.internal.ads.zzchr, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzo.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zza(zzhb zzhbVar, zzhf zzhfVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzb(zzhb zzhbVar, zzhf zzhfVar, boolean z10) {
        if (zzhbVar instanceof zzhm) {
            this.zzg.zzb((zzhm) zzhbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzc(zzhb zzhbVar, zzhf zzhfVar, boolean z10, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzd(zzhb zzhbVar, zzhf zzhfVar, boolean z10) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fa, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // com.google.android.gms.internal.ads.zzchr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchx.zze(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzl() {
        this.zzf = true;
    }

    public final String zzs() {
        return this.zzd;
    }

    public final boolean zzt() {
        return this.zzn;
    }

    public final ByteBuffer zzu() {
        synchronized (this.zzk) {
            try {
                ByteBuffer byteBuffer = this.zzi;
                if (byteBuffer != null && !this.zzj) {
                    byteBuffer.flip();
                    this.zzj = true;
                }
                this.zzf = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.zzi;
    }
}
