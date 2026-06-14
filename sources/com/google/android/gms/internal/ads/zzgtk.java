package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzgtk extends zzgsw {
    final /* synthetic */ zzgtm zza;
    private final Object zzb;
    private int zzc;

    zzgtk(zzgtm zzgtmVar, int i10) {
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
        this.zzb = zzgtmVar.zzo(i10);
        this.zzc = i10;
    }

    private final void zza() {
        int i10 = this.zzc;
        if (i10 != -1) {
            zzgtm zzgtmVar = this.zza;
            if (i10 < zzgtmVar.size() && Objects.equals(this.zzb, zzgtmVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object getValue() {
        zzgtm zzgtmVar = this.zza;
        Map mapZzc = zzgtmVar.zzc();
        if (mapZzc != null) {
            return mapZzc.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return zzgtmVar.zzp(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgtm zzgtmVar = this.zza;
        Map mapZzc = zzgtmVar.zzc();
        if (mapZzc != null) {
            return mapZzc.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            zzgtmVar.put(this.zzb, obj);
            return null;
        }
        Object objZzp = zzgtmVar.zzp(i10);
        zzgtmVar.zzq(this.zzc, obj);
        return objZzp;
    }
}
