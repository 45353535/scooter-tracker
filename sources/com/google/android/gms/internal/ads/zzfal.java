package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfal implements zzfax {
    private final zzgzy zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;

    @Nullable
    private final String zzd;

    zzfal(zzgzy zzgzyVar, Context context, VersionInfoParcel versionInfoParcel, @Nullable String str) {
        this.zza = zzgzyVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfak
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 35;
    }

    final /* synthetic */ zzfam zzc() {
        Context context = this.zzb;
        boolean zIsCallerInstantApp = Wrappers.packageManager(context).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzJ = com.google.android.gms.ads.internal.util.zzs.zzJ(context);
        String str = this.zzc.afmaVersion;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzK = com.google.android.gms.ads.internal.util.zzs.zzK();
        com.google.android.gms.ads.internal.zzt.zzc();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new zzfam(zIsCallerInstantApp, zZzJ, str, zZzK, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
