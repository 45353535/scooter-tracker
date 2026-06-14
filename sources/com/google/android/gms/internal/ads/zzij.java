package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import j$.util.Objects;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzij implements zzml, zzmn {
    private final int zzb;

    @Nullable
    private zzmo zzd;
    private int zze;
    private zzpq zzf;
    private zzdn zzg;
    private int zzh;

    @Nullable
    private zzyc zzi;

    @Nullable
    private zzv[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;

    @Nullable
    private zzwk zzq;

    @Nullable
    @GuardedBy("lock")
    private zzmm zzr;
    private final Object zza = new Object();
    private final zzlh zzc = new zzlh();
    private long zzm = Long.MIN_VALUE;
    private zzbf zzp = zzbf.zza;

    public zzij(int i10) {
        this.zzb = i10;
    }

    private final void zzac(long j10, boolean z10, boolean z11) throws zziw {
        this.zzn = false;
        this.zzl = j10;
        this.zzm = j10;
        if (!z11) {
            z11 = zzP(j10) != 0;
        }
        zzA(j10, z10, z11);
    }

    protected void zzA(long j10, boolean z10, boolean z11) throws zziw {
        throw null;
    }

    protected void zzB() throws zziw {
    }

    protected void zzC() {
    }

    protected void zzD() {
        throw null;
    }

    protected void zzE() {
    }

    protected void zzF() {
    }

    protected final long zzG() {
        return this.zzl;
    }

    protected final zzlh zzH() {
        zzlh zzlhVar = this.zzc;
        zzlhVar.zza = null;
        zzlhVar.zzb = null;
        return zzlhVar;
    }

    protected final zzv[] zzI() {
        zzv[] zzvVarArr = this.zzj;
        zzvVarArr.getClass();
        return zzvVarArr;
    }

    protected final zzmo zzJ() {
        zzmo zzmoVar = this.zzd;
        zzmoVar.getClass();
        return zzmoVar;
    }

    protected final zzpq zzK() {
        zzpq zzpqVar = this.zzf;
        zzpqVar.getClass();
        return zzpqVar;
    }

    protected final zzdn zzL() {
        zzdn zzdnVar = this.zzg;
        zzdnVar.getClass();
        return zzdnVar;
    }

    protected final zzbf zzM() {
        return this.zzp;
    }

    protected final zziw zzN(Throwable th2, @Nullable zzv zzvVar, boolean z10, int i10) {
        int iZzab = 4;
        if (zzvVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzab = zzab(zzvVar) & 7;
            } catch (zziw unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zziw.zzb(th2, zzS(), this.zze, zzvVar, iZzab, this.zzq, z10, i10);
    }

    protected final int zzO(zzlh zzlhVar, zzih zzihVar, int i10) {
        zzyc zzycVar = this.zzi;
        zzycVar.getClass();
        int iZzd = zzycVar.zzd(zzlhVar, zzihVar, i10);
        if (iZzd == -4) {
            if (zzihVar.zzb()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j10 = zzihVar.zze + this.zzk;
            zzihVar.zze = j10;
            this.zzm = Math.max(this.zzm, j10);
            return iZzd;
        }
        if (iZzd == -5) {
            zzv zzvVar = zzlhVar.zzb;
            zzvVar.getClass();
            long j11 = zzvVar.zzt;
            if (j11 != Long.MAX_VALUE) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzr(j11 + this.zzk);
                zzlhVar.zzb = zztVarZza.zzM();
                return -5;
            }
        }
        return iZzd;
    }

    protected final int zzP(long j10) {
        zzyc zzycVar = this.zzi;
        zzycVar.getClass();
        return zzycVar.zze(j10 - this.zzk);
    }

    protected final boolean zzQ() {
        if (zzcW()) {
            return this.zzn;
        }
        zzyc zzycVar = this.zzi;
        zzycVar.getClass();
        return zzycVar.zzb();
    }

    protected final void zzR() {
        zzmm zzmmVar;
        synchronized (this.zza) {
            zzmmVar = this.zzr;
        }
        if (zzmmVar != null) {
            zzmmVar.zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public /* synthetic */ long zzT(long j10, long j11) {
        return o1.a(this, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public /* synthetic */ boolean zzU(long j10) {
        return o1.b(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public /* synthetic */ void zzV(float f10, float f11) {
        o1.c(this, f10, f11);
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public /* synthetic */ void zzW() {
        o1.d(this);
    }

    @Override // com.google.android.gms.internal.ads.zzml, com.google.android.gms.internal.ads.zzmn
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final zzmn zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzc(int i10, zzpq zzpqVar, zzdn zzdnVar) {
        this.zze = i10;
        this.zzf = zzpqVar;
        this.zzg = zzdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzcT() throws zziw {
        zzgrc.zzi(this.zzh == 1);
        this.zzh = 2;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzcU(zzv[] zzvVarArr, zzyc zzycVar, long j10, long j11, zzwk zzwkVar) throws zziw {
        zzgrc.zzi(!this.zzn);
        this.zzi = zzycVar;
        this.zzq = zzwkVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j10;
        }
        this.zzj = zzvVarArr;
        this.zzk = j11;
        zzz(zzvVarArr, j10, j11, zzwkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzml
    @Nullable
    public final zzyc zzcV() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final boolean zzcW() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    @Nullable
    public zzlm zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final int zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzf(zzmo zzmoVar, zzv[] zzvVarArr, zzyc zzycVar, long j10, boolean z10, boolean z11, long j11, long j12, zzwk zzwkVar) throws zziw {
        zzgrc.zzi(this.zzh == 0);
        this.zzd = zzmoVar;
        this.zzq = zzwkVar;
        this.zzh = 1;
        zzy(z10, z11);
        zzcU(zzvVarArr, zzycVar, j11, j12, zzwkVar);
        zzac(j11, z10, true);
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final long zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzl() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final boolean zzm() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzn() throws IOException {
        zzyc zzycVar = this.zzi;
        zzycVar.getClass();
        zzycVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzo(zzbf zzbfVar) {
        if (Objects.equals(this.zzp, zzbfVar)) {
            return;
        }
        this.zzp = zzbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzp(long j10, boolean z10) throws zziw {
        zzac(j10, false, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzq() {
        zzgrc.zzi(this.zzh == 2);
        this.zzh = 1;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzr() {
        zzgrc.zzi(this.zzh == 1);
        zzlh zzlhVar = this.zzc;
        zzlhVar.zza = null;
        zzlhVar.zzb = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzD();
        this.zzq = null;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzs() {
        zzgrc.zzi(this.zzh == 0);
        zzlh zzlhVar = this.zzc;
        zzlhVar.zza = null;
        zzlhVar.zzb = null;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzt() {
        zzgrc.zzi(this.zzh == 0);
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public int zzu() throws zziw {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzv(zzmm zzmmVar) {
        synchronized (this.zza) {
            this.zzr = zzmmVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzw() {
        synchronized (this.zza) {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public void zzx(int i10, @Nullable Object obj) throws zziw {
    }

    protected void zzy(boolean z10, boolean z11) throws zziw {
    }

    protected void zzz(zzv[] zzvVarArr, long j10, long j11, zzwk zzwkVar) throws zziw {
    }
}
