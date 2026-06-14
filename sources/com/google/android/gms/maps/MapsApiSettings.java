package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zzcc;

/* JADX INFO: loaded from: classes8.dex */
public final class MapsApiSettings {
    private static final String zza = "MapsApiSettings";

    private MapsApiSettings() {
    }

    public static void addInternalUsageAttributionId(@NonNull Context context, @NonNull String str) {
        try {
            zzcc.zza(context, null).zzk(ObjectWrapper.wrap(context), str);
        } catch (RemoteException | GooglePlayServicesNotAvailableException e10) {
            Log.e(zza, "Failed to add internal usage attribution id.", e10);
        }
    }
}
