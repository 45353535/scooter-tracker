package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbrq implements zzboh {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbsk zzb;
    final /* synthetic */ zzbrg zzc;
    final /* synthetic */ zzbsl zzd;

    zzbrq(zzbsl zzbslVar, long j10, zzbsk zzbskVar, zzbrg zzbrgVar) {
        this.zza = j10;
        this.zzb = zzbskVar;
        this.zzc = zzbrgVar;
        Objects.requireNonNull(zzbslVar);
        this.zzd = zzbslVar;
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
    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 42);
        sb2.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb2.append(jCurrentTimeMillis);
        sb2.append(" ms.");
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbsl zzbslVar = this.zzd;
        synchronized (zzbslVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbsk zzbskVar = this.zzb;
            if (zzbskVar.zzi() != -1 && zzbskVar.zzi() != 1) {
                zzbslVar.zzl(0);
                zzbrg zzbrgVar = this.zzc;
                zzbrgVar.zzm("/log", zzbog.zzg);
                zzbrgVar.zzm("/result", zzbog.zzo);
                zzbskVar.zzf(zzbrgVar);
                zzbslVar.zzj(zzbskVar);
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
