package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes8.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzaco implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzadr zze;
    private final zzdn zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzact zzi;
    private zzff zzj = new zzff(10);
    private zzv zzk;
    private zzdx zzl;

    @Nullable
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    /* synthetic */ zzaco(zzacg zzacgVar, byte[] bArr) {
        this.zza = zzacgVar.zze();
        zzbs zzbsVarZzg = zzacgVar.zzg();
        zzbsVarZzg.getClass();
        this.zzb = zzbsVarZzg;
        this.zzc = new SparseArray();
        zzguf.zzi();
        this.zzd = zzacgVar.zzh();
        zzdn zzdnVarZzi = zzacgVar.zzi();
        this.zzf = zzdnVarZzi;
        this.zzh = zzacgVar.zzj() != -9223372036854775807L ? -zzacgVar.zzj() : -9223372036854775807L;
        zzact zzactVarZzk = zzacgVar.zzk();
        this.zzi = zzactVarZzk;
        this.zze = new zzabt(zzacgVar.zzf(), zzactVarZzk, zzdnVarZzi);
        new zzacf(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzM();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(@Nullable zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    final /* synthetic */ void zzA(long j10) {
        this.zzq = j10;
    }

    public final void zza(int i10) {
        this.zzr = 1;
    }

    public final zzadr zzb(int i10) {
        SparseArray sparseArray = this.zzc;
        if (zzfj.zza(sparseArray, 0)) {
            return (zzadr) sparseArray.get(0);
        }
        zzaci zzaciVar = new zzaci(this, this.zza, 0);
        this.zzg.add(zzaciVar);
        sparseArray.put(0, zzaciVar);
        return zzaciVar;
    }

    public final void zzc(Surface surface, zzes zzesVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzes) this.zzm.second).equals(zzesVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzesVar);
        zzesVar.zza();
        zzesVar.zzb();
    }

    public final void zzd() {
        zzes zzesVar = zzes.zza;
        zzesVar.zza();
        zzesVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdx zzdxVar = this.zzl;
        if (zzdxVar != null) {
            zzdxVar.zzm(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    final /* synthetic */ void zzh() {
        this.zzn--;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[Catch: zzdu -> 0x0033, TRY_LEAVE, TryCatch #1 {zzdu -> 0x0033, blocks: (B:7:0x0012, B:9:0x0017, B:11:0x001d, B:14:0x0025, B:18:0x0036, B:20:0x003c, B:23:0x0043, B:28:0x0064), top: B:40:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ boolean zzi(com.google.android.gms.internal.ads.zzv r12, int r13) throws com.google.android.gms.internal.ads.zzadq {
        /*
            r11 = this;
            r13 = 0
            r0 = 1
            int r1 = r11.zzo
            if (r1 != 0) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r13
        L9:
            com.google.android.gms.internal.ads.zzgrc.zzi(r1)
            com.google.android.gms.internal.ads.zzi r1 = r12.zzE
            com.google.android.gms.internal.ads.zzi r1 = zzC(r1)
            int r2 = r1.zzd     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            r3 = 7
            if (r2 != r3) goto L36
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            r4 = 34
            if (r2 >= r4) goto L23
            boolean r2 = com.google.android.gms.internal.ads.zzdv.zzd()     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            if (r2 != 0) goto L25
        L23:
            r2 = r3
            goto L36
        L25:
            com.google.android.gms.internal.ads.zzh r13 = r1.zzd()     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            r0 = 6
            r13.zzc(r0)     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            com.google.android.gms.internal.ads.zzi r1 = r13.zzg()     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
        L31:
            r4 = r1
            goto L67
        L33:
            r0 = move-exception
            r13 = r0
            goto L95
        L36:
            boolean r3 = com.google.android.gms.internal.ads.zzdv.zzc(r2)     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            if (r3 != 0) goto L5d
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            r4 = 29
            if (r3 >= r4) goto L43
            goto L5d
        L43:
            java.lang.String r1 = "PlaybackVidGraphWrapper"
            java.lang.String r3 = "Color transfer %d is not supported. Falling back to OpenGl tone mapping."
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            r0[r13] = r2     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            java.lang.String r13 = com.google.android.gms.internal.ads.zzfj.zza     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            java.util.Locale r13 = java.util.Locale.US     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            java.lang.String r13 = java.lang.String.format(r13, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            com.google.android.gms.internal.ads.zzee.zzc(r1, r13)     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            com.google.android.gms.internal.ads.zzi r1 = com.google.android.gms.internal.ads.zzi.zza     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            goto L31
        L5d:
            r13 = 2
            if (r2 == r13) goto L64
            r13 = 10
            if (r2 != r13) goto L31
        L64:
            com.google.android.gms.internal.ads.zzi r1 = com.google.android.gms.internal.ads.zzi.zza     // Catch: com.google.android.gms.internal.ads.zzdu -> L33
            goto L31
        L67:
            com.google.android.gms.internal.ads.zzdn r13 = r11.zzf
            android.os.Looper r0 = android.os.Looper.myLooper()
            r0.getClass()
            r1 = 0
            com.google.android.gms.internal.ads.zzdx r13 = r13.zzd(r0, r1)
            r11.zzl = r13
            com.google.android.gms.internal.ads.zzbs r2 = r11.zzb     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            android.content.Context r3 = r11.zza     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            com.google.android.gms.internal.ads.zzl r5 = com.google.android.gms.internal.ads.zzl.zzb     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            j$.util.Objects.requireNonNull(r13)     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            com.google.android.gms.internal.ads.zzach r7 = new com.google.android.gms.internal.ads.zzach     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            r7.<init>()     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            r8 = 0
            r10 = 0
            r6 = r11
            r2.zza(r3, r4, r5, r6, r7, r8, r10)     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
            throw r1     // Catch: com.google.android.gms.internal.ads.zzbo -> L8d
        L8d:
            r0 = move-exception
            r13 = r0
            com.google.android.gms.internal.ads.zzadq r0 = new com.google.android.gms.internal.ads.zzadq
            r0.<init>(r13, r12)
            throw r0
        L95:
            com.google.android.gms.internal.ads.zzadq r0 = new com.google.android.gms.internal.ads.zzadq
            r0.<init>(r13, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaco.zzi(com.google.android.gms.internal.ads.zzv, int):boolean");
    }

    final /* synthetic */ boolean zzj(boolean z10) {
        return this.zze.zzh(false);
    }

    final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    final /* synthetic */ void zzl(long j10, long j11) throws zzadq {
        this.zze.zzv(j10, j11);
    }

    final /* synthetic */ void zzm(boolean z10) {
        if (this.zzo == 1) {
            this.zzn++;
            zzadr zzadrVar = this.zze;
            zzadrVar.zzg(z10);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzacn zzacnVar = (zzacn) this.zzj.zzd();
                zzacnVar.getClass();
                zzadrVar.zzs(1, this.zzk, zzacnVar.zza, zzacnVar.zzb, zzguf.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z10) {
                this.zzq = -9223372036854775807L;
            }
            zzdx zzdxVar = this.zzl;
            zzdxVar.getClass();
            zzdxVar.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    final /* synthetic */ void zzn(boolean z10) {
        this.zze.zzw(z10);
    }

    final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    final /* synthetic */ void zzp(zzacp zzacpVar) {
        this.zze.zzl(zzacpVar);
    }

    final /* synthetic */ void zzq(float f10) {
        this.zzi.zzc(f10);
        this.zze.zzm(f10);
    }

    final /* synthetic */ void zzr(int i10) {
        this.zze.zzr(i10);
    }

    final /* synthetic */ boolean zzs() {
        int i10 = this.zzr;
        return i10 != -1 && i10 == 0;
    }

    final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    final /* synthetic */ long zzu() {
        return this.zzh;
    }

    final /* synthetic */ zzact zzv() {
        return this.zzi;
    }

    final /* synthetic */ zzff zzw() {
        return this.zzj;
    }

    final /* synthetic */ void zzx(zzff zzffVar) {
        this.zzj = zzffVar;
    }

    final /* synthetic */ long zzy() {
        return this.zzp;
    }

    final /* synthetic */ long zzz() {
        return this.zzq;
    }
}
