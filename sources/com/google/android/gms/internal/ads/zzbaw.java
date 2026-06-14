package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbaw extends zzbby {
    public zzbaw(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i10, int i11) {
        super(zzbakVar, "YcvOy2Y9scoLzd9aO/r1q51CuRDPgptfjUczBG/4u9TSMf5O8lCrtIMZ2+ctDcs+", "6V7/ExCl9vngHnxEtX1goXpmDP9bA02eRvmHfr0qsgM=", zzawgVar, i10, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i10 = 1;
        zzawg zzawgVar = this.zzd;
        zzawgVar.zzaf(3);
        try {
            if (true == ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue()) {
                i10 = 2;
            }
            zzawgVar.zzaf(i10);
        } catch (InvocationTargetException e10) {
            if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e10;
            }
        }
    }
}
