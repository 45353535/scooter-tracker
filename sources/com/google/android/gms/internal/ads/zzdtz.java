package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdtz extends zzcwf {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdmc zze;
    private final zzdiq zzf;
    private final zzdbs zzg;
    private final zzdcz zzh;
    private final zzcxa zzi;
    private final zzcaw zzj;
    private final zzfvr zzk;
    private final zzfje zzl;
    private final zzdxz zzm;
    private boolean zzn;

    zzdtz(zzcwe zzcweVar, Context context, @Nullable zzcjl zzcjlVar, zzdmc zzdmcVar, zzdiq zzdiqVar, zzdbs zzdbsVar, zzdcz zzdczVar, zzcxa zzcxaVar, zzfir zzfirVar, zzfvr zzfvrVar, zzfje zzfjeVar, zzdxz zzdxzVar) {
        super(zzcweVar);
        this.zzn = false;
        this.zzc = context;
        this.zze = zzdmcVar;
        this.zzd = new WeakReference(zzcjlVar);
        this.zzf = zzdiqVar;
        this.zzg = zzdbsVar;
        this.zzh = zzdczVar;
        this.zzi = zzcxaVar;
        this.zzk = zzfvrVar;
        zzcas zzcasVar = zzfirVar.zzl;
        this.zzj = new zzcbq(zzcasVar != null ? zzcasVar.zza : "", zzcasVar != null ? zzcasVar.zzb : 1);
        this.zzl = zzfjeVar;
        this.zzm = zzdxzVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcjl zzcjlVar = (zzcjl) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhE)).booleanValue()) {
                if (!this.zzn && zzcjlVar != null) {
                    zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdty
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
    public final boolean zza(boolean z10, @Nullable Activity activity) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdmc zzdmcVar = this.zze;
        if (!com.google.android.gms.ads.internal.util.zzs.zzT(zzdmcVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzS(this.zzc, this.zzb, this.zzm);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbi)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc)) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzg.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbj)).booleanValue()) {
                        this.zzk.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        if (this.zzn) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The rewarded ad have been showed.");
            this.zzg.zzc(zzfkm.zzd(10, null, null));
            return false;
        }
        this.zzn = true;
        zzdiq zzdiqVar = this.zzf;
        zzdiqVar.zza();
        Context context = activity;
        if (activity == null) {
            context = this.zzc;
        }
        try {
            zzdmcVar.zza(z10, context, this.zzg);
            zzdiqVar.zzb();
            return true;
        } catch (zzdmb e10) {
            this.zzg.zzd(e10);
            return false;
        }
    }

    public final boolean zzb() {
        return this.zzn;
    }

    public final zzcaw zzc() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzi.zzl();
    }

    public final boolean zzf() {
        zzcjl zzcjlVar = (zzcjl) this.zzd.get();
        return (zzcjlVar == null || zzcjlVar.zzaB()) ? false : true;
    }

    public final Bundle zzg() {
        return this.zzh.zzb();
    }

    public final zzfje zzh() {
        return this.zzl;
    }
}
