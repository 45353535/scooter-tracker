package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaop implements zzaon {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzagh zzb;

    @Nullable
    private final zzaqf zzd;
    private final String zze;

    @Nullable
    private final zzer zzf;

    @Nullable
    private final zzape zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzaoo zzi = new zzaoo(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    zzaop(@Nullable zzaqf zzaqfVar, String str) {
        zzer zzerVar;
        this.zzd = zzaqfVar;
        this.zze = str;
        if (zzaqfVar != null) {
            this.zzg = new zzape(178, 128);
            zzerVar = new zzer();
        } else {
            zzerVar = null;
            this.zzg = null;
        }
        this.zzf = zzerVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        zzgm.zzj(this.zzh);
        this.zzi.zza();
        zzape zzapeVar = this.zzg;
        if (zzapeVar != null) {
            zzapeVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zza = zzaqbVar.zzc();
        this.zzb = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        zzaqf zzaqfVar = this.zzd;
        if (zzaqfVar != null) {
            zzaqfVar.zza(zzaexVar, zzaqbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j10, int i10) {
        this.zzn = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018b  */
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
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzer r29) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaop.zzd(com.google.android.gms.internal.ads.zzer):void");
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
    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z10) {
        zzagh zzaghVar = this.zzb;
        zzaghVar.getClass();
        if (z10) {
            boolean z11 = this.zzq;
            long j10 = this.zzj - this.zzo;
            zzaghVar.zze(this.zzp, z11 ? 1 : 0, (int) j10, 0, null);
        }
    }
}
