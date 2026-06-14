package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.maps.zzaz;

/* JADX INFO: loaded from: classes8.dex */
final class zzah implements TileProvider {
    final /* synthetic */ TileOverlayOptions zza;
    private final zzaz zzb;

    zzah(TileOverlayOptions tileOverlayOptions) {
        this.zza = tileOverlayOptions;
        this.zzb = tileOverlayOptions.zza;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    @Nullable
    public final Tile getTile(int i10, int i11, int i12) {
        try {
            return this.zzb.zzb(i10, i11, i12);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
