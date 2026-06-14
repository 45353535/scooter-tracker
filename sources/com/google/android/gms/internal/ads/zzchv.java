package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzchv extends zzchr {
    public zzchv(zzcge zzcgeVar) {
        super(zzcgeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zze(String str) {
        String strZzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        zzcge zzcgeVar = (zzcge) this.zzc.get();
        if (zzcgeVar != null && strZzf != null) {
            zzcgeVar.zzt(strZzf, this);
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("VideoStreamNoopCache is doing nothing.");
        zzq(str, strZzf, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzl() {
    }
}
