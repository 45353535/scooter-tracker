package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.maps.zzbn;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class DatasetFeature extends Feature {
    private final com.google.android.gms.internal.maps.zzr zza;

    public DatasetFeature(com.google.android.gms.internal.maps.zzr zzrVar) {
        super(zzrVar);
        this.zza = zzrVar;
    }

    @NonNull
    public Map<String, String> getDatasetAttributes() {
        try {
            return zzbn.zzc(this.zza.zzh().entrySet());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public String getDatasetId() {
        try {
            return this.zza.zze();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
