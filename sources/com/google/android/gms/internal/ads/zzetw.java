package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.common.util.concurrent.ListenableFuture;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzetw implements zzfax {
    private final Context zza;
    private final zzgzy zzb;

    zzetw(zzgzy zzgzyVar, Context context) {
        this.zzb = zzgzyVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzor)).booleanValue()) {
            return zzgzo.zza(new zzetx(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? zzgzo.zza(new zzetx(null, false)) : this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzetv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new zzetx(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, CommonUrlParts.LIMIT_AD_TRACKING, 0) == 1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 61;
    }
}
