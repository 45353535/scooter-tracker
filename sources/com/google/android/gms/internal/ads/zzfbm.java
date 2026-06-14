package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfbm implements zzfax {
    private final zzgzy zza;
    private final Context zzb;

    public zzfbm(zzgzy zzgzyVar, Context context) {
        this.zza = zzgzyVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 39;
    }

    final /* synthetic */ zzfbk zzc() {
        boolean zIsActiveNetworkMetered;
        int i10;
        Context context = this.zzb;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzt.zzc();
        int i11 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzF(context, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i10 = type;
                i11 = iOrdinal;
            } else {
                i10 = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        } else {
            zIsActiveNetworkMetered = false;
            i10 = -2;
        }
        return new zzfbk(networkOperator, i10, com.google.android.gms.ads.internal.zzt.zzf().zzm(context), phoneType, zIsActiveNetworkMetered, i11);
    }
}
