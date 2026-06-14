package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class m1 {
    public static void a(zzlj zzljVar, zzpq zzpqVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    public static void b(zzlj zzljVar, zzli zzliVar, zzyn zzynVar, zzaac[] zzaacVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    public static void c(zzlj zzljVar, zzpq zzpqVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    public static void d(zzlj zzljVar, zzpq zzpqVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    public static long e(zzlj zzljVar, zzpq zzpqVar) {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    public static boolean f(zzlj zzljVar, zzpq zzpqVar) {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    public static boolean g(zzlj zzljVar, zzli zzliVar) {
        long j10 = zzliVar.zzd;
        throw null;
    }

    public static boolean h(zzlj zzljVar, zzli zzliVar) {
        zzbf zzbfVar = zzliVar.zzb;
        throw null;
    }

    public static boolean i(zzlj zzljVar, zzpq zzpqVar, zzbf zzbfVar, zzwk zzwkVar, long j10) {
        zzee.zzc("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
