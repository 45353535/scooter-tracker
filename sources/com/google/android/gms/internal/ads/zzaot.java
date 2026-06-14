package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes8.dex */
final class zzaot {
    private final zzagh zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzaot(zzagh zzaghVar, boolean z10, boolean z11) {
        this.zza = zzaghVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new zzgn(bArr, 0, 0);
        this.zzh = false;
    }

    public final void zza(zzgl zzglVar) {
        this.zzb.append(zzglVar.zzd, zzglVar);
    }

    public final void zzb(zzgk zzgkVar) {
        this.zzc.append(zzgkVar.zza, zzgkVar);
    }

    public final void zzc() {
        this.zzh = false;
    }

    public final void zzd(long j10, int i10, long j11, boolean z10) {
        this.zze = i10;
        this.zzg = j11;
        this.zzf = j10;
        this.zzl = z10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zze(long j10, int i10, boolean z10) {
        boolean z11 = false;
        if (this.zze == 9) {
            if (z10 && this.zzh) {
                long j11 = this.zzf;
                int i11 = i10 + ((int) (j10 - j11));
                long j12 = this.zzj;
                if (j12 != -9223372036854775807L) {
                    long j13 = this.zzi;
                    if (j11 != j13) {
                        this.zza.zze(j12, this.zzk ? 1 : 0, (int) (j11 - j13), i11, null);
                    }
                }
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        boolean z12 = this.zzl;
        boolean z13 = this.zzk;
        int i12 = this.zze;
        if (i12 == 5 || (z12 && i12 == 1)) {
            z11 = true;
        }
        boolean z14 = z13 | z11;
        this.zzk = z14;
        this.zze = 24;
        return z14;
    }
}
