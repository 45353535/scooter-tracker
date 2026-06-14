package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzpu extends ContentObserver {
    final /* synthetic */ zzpx zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpu(zzpx zzpxVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        Objects.requireNonNull(zzpxVar);
        this.zza = zzpxVar;
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        zzpx zzpxVar = this.zza;
        zzpxVar.zzf(zzps.zza(zzpxVar.zzg(), zzpxVar.zzj(), zzpxVar.zzh()));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}
