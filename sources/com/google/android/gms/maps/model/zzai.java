package com.google.android.gms.maps.model;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.maps.zzay;

/* JADX INFO: loaded from: classes8.dex */
final class zzai extends zzay {
    final /* synthetic */ TileProvider zza;

    zzai(TileOverlayOptions tileOverlayOptions, TileProvider tileProvider) {
        this.zza = tileProvider;
    }

    @Override // com.google.android.gms.internal.maps.zzaz
    @Nullable
    public final Tile zzb(int i10, int i11, int i12) {
        return this.zza.getTile(i10, i11, i12);
    }
}
