package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzcbl;
import j$.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzaa extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbtt zzc;

    zzaa(zzaz zzazVar, Context context, String str, zzbtt zzbttVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbttVar;
        Objects.requireNonNull(zzazVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzm(this.zza, "rewarded");
        return new zzfq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        return zzcbl.zza(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc(zzcr zzcrVar) throws RemoteException {
        return zzcrVar.zzl(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
    }
}
