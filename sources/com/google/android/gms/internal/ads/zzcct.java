package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzcct implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzccw zza;
    private final String zzb;

    public zzcct(zzccw zzccwVar, String str) {
        Objects.requireNonNull(zzccwVar);
        this.zza = zzccwVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzccw zzccwVar = this.zza;
        synchronized (zzccwVar) {
            try {
                Iterator it = zzccwVar.zzd().iterator();
                while (it.hasNext()) {
                    ((zzccu) it.next()).zza(sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
