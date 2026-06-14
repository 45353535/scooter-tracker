package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfet extends zzfeb {
    public zzfet(Context context, Executor executor, zzcma zzcmaVar, zzfgj zzfgjVar, zzfer zzferVar, zzfjj zzfjjVar, VersionInfoParcel versionInfoParcel) {
        super(context, executor, zzcmaVar, zzfgjVar, zzferVar, zzfjjVar, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzfeb
    protected final /* bridge */ /* synthetic */ zzdal zzc(zzctu zzctuVar, zzdao zzdaoVar, zzdhf zzdhfVar) {
        zzctk zzctkVarZzk = this.zza.zzk();
        zzctkVarZzk.zzd(zzdaoVar);
        zzctkVarZzk.zze(zzdhfVar);
        return zzctkVarZzk;
    }
}
