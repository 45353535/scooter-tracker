package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.SieveCacheKt;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
final class zzaci implements zzadr {
    final /* synthetic */ zzaco zza;
    private zzguf zzb;

    @Nullable
    private zzv zzc;
    private long zzd;
    private long zze;
    private int zzf;

    public zzaci(zzaco zzacoVar, Context context, int i10) {
        Objects.requireNonNull(zzacoVar);
        this.zza = zzacoVar;
        zzfj.zzR(context);
        this.zzb = zzguf.zzi();
        this.zze = -9223372036854775807L;
        zzado zzadoVar = zzado.zzb;
    }

    private static final void zzy(zzv zzvVar) {
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzC(zzaco.zzC(zzvVar.zzE));
        zztVarZza.zzM();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zza() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzb() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzc(zzado zzadoVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzd(zzv zzvVar) throws zzadq {
        return this.zza.zzi(zzvVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzg(boolean z10) {
        this.zze = -9223372036854775807L;
        this.zza.zzm(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzh(boolean z10) {
        return this.zza.zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzi() {
        zzaco zzacoVar = this.zza;
        zzacoVar.zzA(this.zze);
        if (zzacoVar.zzy() >= zzacoVar.zzz()) {
            zzacoVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final Surface zzk() {
        zzgrc.zzi(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzl(zzacp zzacpVar) {
        this.zza.zzp(zzacpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzm(@FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        this.zza.zzq(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzn(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzguf.zzq(list);
        zzv zzvVar = this.zzc;
        if (zzvVar != null) {
            zzy(zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzo(long j10) {
        this.zzd = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzp(Surface surface, zzes zzesVar) {
        this.zza.zzc(surface, zzesVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzq() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzr(int i10) {
        this.zza.zzr(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzs(int i10, zzv zzvVar, long j10, int i11, List list) {
        zzgrc.zzi(false);
        this.zzb = zzguf.zzq(list);
        this.zzc = zzvVar;
        zzaco zzacoVar = this.zza;
        zzacoVar.zzA(-9223372036854775807L);
        zzy(zzvVar);
        long j11 = this.zze;
        boolean zZzt = zzacoVar.zzt();
        long j12 = SieveCacheKt.NodeMetaMask;
        if (zZzt) {
            if (j11 != -9223372036854775807L) {
                j12 = j11 + 1;
            }
        } else if (j11 != -9223372036854775807L) {
            return;
        }
        long j13 = j12;
        zzacoVar.zzw().zza(j13, new zzacn(j10 + this.zzd, i11, j13));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzt() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzw().zzc() == 0) {
            zzacoVar.zzo();
            return;
        }
        zzff zzffVar = new zzff(10);
        boolean z10 = true;
        while (zzacoVar.zzw().zzc() > 0) {
            zzacn zzacnVar = (zzacn) zzacoVar.zzw().zzd();
            zzacnVar.getClass();
            if (z10) {
                int i10 = zzacnVar.zzb;
                if (i10 == 0 || i10 == 1) {
                    zzacnVar = new zzacn(zzacnVar.zza, 0, zzacnVar.zzc);
                } else {
                    zzacoVar.zzo();
                }
            }
            zzffVar.zza(zzacnVar.zzc, zzacnVar);
            z10 = false;
        }
        zzacoVar.zzx(zzffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzu(long j10, zzadp zzadpVar) {
        int i10;
        zzgrc.zzi(false);
        long j11 = j10 + this.zzd;
        zzaco zzacoVar = this.zza;
        long jZzb = zzacoVar.zzv().zzb(j11);
        if (jZzb == -9223372036854775807L || zzacoVar.zzu() == -9223372036854775807L || jZzb >= zzacoVar.zzu() || (i10 = this.zzf) >= 2) {
            if (zzacoVar.zzs()) {
                throw null;
            }
            return false;
        }
        this.zzf = i10 + 1;
        zzadpVar.zzb();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzv(long j10, long j11) throws zzadq {
        this.zza.zzl(j10 + this.zzd, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzw(boolean z10) {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zzn(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzx() {
        this.zza.zzg();
    }
}
