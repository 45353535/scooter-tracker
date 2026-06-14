package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaqv {
    private final Bundle zza;

    public zzaqv(Bundle bundle) {
        this.zza = bundle;
    }

    public final String zza() {
        return this.zza.getString(Constants.INSTALL_REFERRER);
    }

    public final long zzb() {
        return this.zza.getLong("referrer_click_timestamp_seconds");
    }

    public final long zzc() {
        return this.zza.getLong("install_begin_timestamp_seconds");
    }

    public final boolean zzd() {
        return this.zza.getBoolean("google_play_instant");
    }

    public final long zze() {
        return this.zza.getLong("referrer_click_timestamp_server_seconds");
    }

    public final long zzf() {
        return this.zza.getLong("install_begin_timestamp_server_seconds");
    }

    public final String zzg() {
        return this.zza.getString("install_version");
    }
}
