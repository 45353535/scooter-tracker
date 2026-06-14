package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class zzbny implements zzgqt {
    static final /* synthetic */ zzbny zza = new zzbny();

    private /* synthetic */ zzbny() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final /* synthetic */ Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        zzboh zzbohVar = zzbog.zza;
        if (!((Boolean) zzbjd.zzi.zze()).booleanValue()) {
            return "failure_click_attok";
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "prepareClickUrl.attestation1");
        return "failure_click_attok";
    }
}
