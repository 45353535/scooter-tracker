package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzaor {
    private final zzagh zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzaor(zzagh zzaghVar) {
        this.zza = zzaghVar;
    }

    public final void zza() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }

    public final void zzb(int i10, long j10) {
        boolean z10;
        this.zze = i10;
        this.zzd = false;
        if (i10 == 182) {
            z10 = true;
        } else if (i10 == 179) {
            i10 = 179;
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzb = z10;
        this.zzc = i10 == 182;
        this.zzf = 0;
        this.zzh = j10;
    }

    public final void zzc(byte[] bArr, int i10, int i11) {
        if (this.zzc) {
            int i12 = this.zzf;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.zzf = i12 + (i11 - i10);
            } else {
                this.zzd = ((bArr[i13] & 192) >> 6) == 0;
                this.zzc = false;
            }
        }
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
    public final void zzd(long j10, int i10, boolean z10) {
        zzgrc.zzi(this.zzh != -9223372036854775807L);
        if (this.zze == 182 && z10 && this.zzb) {
            this.zza.zze(this.zzh, this.zzd ? 1 : 0, (int) (j10 - this.zzg), i10, null);
        }
        if (this.zze != 179) {
            this.zzg = j10;
        }
    }
}
