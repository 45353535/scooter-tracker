package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyh;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes8.dex */
final class zzhad extends zzgyh.zzf implements Runnable {
    private final Runnable zza;

    zzhad(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th2) {
            zzb(th2);
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final String zzd() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 7);
        sb2.append("task=[");
        sb2.append(string);
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }
}
