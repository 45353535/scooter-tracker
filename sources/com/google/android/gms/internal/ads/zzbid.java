package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbid extends CustomTabsServiceConnection {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    @Nullable
    private Context zzc;

    @Nullable
    private zzdxz zzd;

    @Nullable
    private CustomTabsSession zze;

    @Nullable
    private CustomTabsClient zzf;

    private final void zzf(@Nullable Context context) {
        String packageName;
        if (this.zzf != null || context == null || (packageName = CustomTabsClient.getPackageName(context, null)) == null || packageName.equals(context.getPackageName())) {
            return;
        }
        CustomTabsClient.bindCustomTabsService(context, packageName, this);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull CustomTabsClient customTabsClient) {
        this.zzf = customTabsClient;
        customTabsClient.warmup(0L);
        this.zze = customTabsClient.newSession(new zzbia(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzdxz zzdxzVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdxzVar;
        zzf(context);
    }

    @Nullable
    public final CustomTabsSession zzb() {
        if (this.zze == null) {
            zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbic
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
        }
        return this.zze;
    }

    @VisibleForTesting
    public final void zzc(final int i10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfy)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbib
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(i10);
            }
        });
    }

    final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    final /* synthetic */ void zze(int i10) {
        zzdxz zzdxzVar = this.zzd;
        if (zzdxzVar != null) {
            zzdxy zzdxyVarZza = zzdxzVar.zza();
            zzdxyVarZza.zzc("action", "cct_nav");
            zzdxyVarZza.zzc("cct_navs", String.valueOf(i10));
            zzdxyVarZza.zzd();
        }
    }
}
