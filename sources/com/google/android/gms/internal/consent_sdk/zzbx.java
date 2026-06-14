package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import androidx.annotation.UiThread;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
@UiThread
public final class zzbx extends WebView {
    private final Handler zza;
    private final zzcd zzb;
    private boolean zzc;

    public zzbx(zzbz zzbzVar, Handler handler, zzcd zzcdVar) {
        super(zzbzVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzcdVar;
    }

    static /* bridge */ /* synthetic */ boolean zzf(zzbx zzbxVar, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void zzc() {
        final zzcd zzcdVar = this.zzb;
        Objects.requireNonNull(zzcdVar);
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbu
            @Override // java.lang.Runnable
            public final void run() {
                zzcdVar.zzd();
            }
        });
    }

    public final void zzd(String str, String str2) {
        final String str3 = str + "(" + str2 + ");";
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbt
            @Override // java.lang.Runnable
            public final void run() {
                zzda.zza(this.zza, str3);
            }
        });
    }
}
