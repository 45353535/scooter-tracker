package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdkn extends zzcwf {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdiq zze;
    private final zzdmc zzf;
    private final zzcxa zzg;
    private final zzfvr zzh;
    private final zzdbs zzi;
    private final zzcdz zzj;
    private final zzdxz zzk;
    private boolean zzl;

    zzdkn(zzcwe zzcweVar, Context context, zzcjl zzcjlVar, zzdiq zzdiqVar, zzdmc zzdmcVar, zzcxa zzcxaVar, zzfvr zzfvrVar, zzdbs zzdbsVar, zzcdz zzcdzVar, zzdxz zzdxzVar) {
        super(zzcweVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcjlVar);
        this.zze = zzdiqVar;
        this.zzf = zzdmcVar;
        this.zzg = zzcxaVar;
        this.zzh = zzfvrVar;
        this.zzi = zzdbsVar;
        this.zzj = zzcdzVar;
        this.zzk = zzdxzVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcjl zzcjlVar = (zzcjl) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhE)).booleanValue()) {
                if (!this.zzl && zzcjlVar != null) {
                    zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkm
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcjlVar.destroy();
                        }
                    });
                }
            } else if (zzcjlVar != null) {
                zzcjlVar.destroy();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(boolean r7, android.app.Activity r8) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdkn.zza(boolean, android.app.Activity):boolean");
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }
}
