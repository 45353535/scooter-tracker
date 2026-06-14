package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbc;

/* JADX INFO: loaded from: classes8.dex */
final class zzi extends zzbc {
    final /* synthetic */ GoogleMap.OnMyLocationClickListener zza;

    zzi(GoogleMap googleMap, GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
        this.zza = onMyLocationClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbd
    public final void zzb(@NonNull Location location) throws RemoteException {
        this.zza.onMyLocationClick(location);
    }
}
