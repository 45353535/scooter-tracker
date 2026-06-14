package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* JADX INFO: loaded from: classes7.dex */
final class zzev extends zzdm {
    private zzev() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zze(@Nullable zze zzeVar) {
        OnAdInspectorClosedListener onAdInspectorClosedListenerZzA = zzex.zzb().zzA();
        if (onAdInspectorClosedListenerZzA != null) {
            onAdInspectorClosedListenerZzA.onAdInspectorClosed(zzeVar == null ? null : new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
        }
    }

    /* synthetic */ zzev(byte[] bArr) {
    }
}
