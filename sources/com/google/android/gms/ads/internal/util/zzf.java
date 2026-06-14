package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzfyn;

/* JADX INFO: loaded from: classes7.dex */
public final class zzf extends zzfyn {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    protected final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzc();
            zzs.zzR(com.google.android.gms.ads.internal.zzt.zzh().zzp(), th2);
            throw th2;
        }
    }
}
