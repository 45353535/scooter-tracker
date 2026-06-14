package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbi;

/* JADX INFO: loaded from: classes7.dex */
public final class zzfb extends com.google.android.gms.ads.preload.zzb {
    public zzfb(Context context) {
        super(context, AdFormat.REWARDED);
    }

    @Nullable
    public final RewardedAd zza(String str) {
        zzcaz zzcazVarZzq;
        try {
            zzcazVarZzq = this.zza.zzq(str);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            zzcazVarZzq = null;
        }
        if (zzcazVarZzq == null) {
            return null;
        }
        return new zzcbi(zzj(), zzcazVarZzq);
    }
}
