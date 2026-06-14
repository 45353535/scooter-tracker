package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class zzu implements zzgqt {
    static final /* synthetic */ zzu zza = new zzu();

    private /* synthetic */ zzu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final /* synthetic */ Object apply(Object obj) {
        zzx zzxVar = (zzx) obj;
        int i10 = zzv.zzO;
        String str = zzxVar.zza;
        String str2 = zzxVar.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": ");
        sb2.append(str2);
        return sb2.toString();
    }
}
