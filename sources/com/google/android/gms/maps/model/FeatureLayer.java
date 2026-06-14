package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzal;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class FeatureLayer {
    private final com.google.android.gms.internal.maps.zzu zza;

    @Nullable
    private StyleFactory zzb;
    private final Map zzc = new HashMap();

    public interface OnFeatureClickListener {
        void onFeatureClick(@NonNull FeatureClickEvent featureClickEvent);
    }

    public interface StyleFactory {
        @Nullable
        FeatureStyle getStyle(@NonNull Feature feature);
    }

    public FeatureLayer(com.google.android.gms.internal.maps.zzu zzuVar) {
        this.zza = (com.google.android.gms.internal.maps.zzu) Preconditions.checkNotNull(zzuVar);
    }

    public final void addOnFeatureClickListener(@NonNull OnFeatureClickListener onFeatureClickListener) {
        try {
            zze zzeVar = new zze(this, onFeatureClickListener);
            this.zzc.put(onFeatureClickListener, zzeVar);
            this.zza.zzf(zzeVar);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Nullable
    public String getDatasetId() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Nullable
    public StyleFactory getFeatureStyle() {
        return this.zzb;
    }

    @NonNull
    @FeatureType
    public String getFeatureType() {
        try {
            return this.zza.zze();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isAvailable() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void removeOnFeatureClickListener(@NonNull OnFeatureClickListener onFeatureClickListener) {
        try {
            Map map = this.zzc;
            if (map.containsKey(onFeatureClickListener)) {
                this.zza.zzg((zzal) map.get(onFeatureClickListener));
                map.remove(onFeatureClickListener);
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setFeatureStyle(@Nullable StyleFactory styleFactory) {
        this.zzb = styleFactory;
        if (styleFactory == null) {
            try {
                this.zza.zzh(null);
            } catch (RemoteException e10) {
                throw new RuntimeRemoteException(e10);
            }
        } else {
            try {
                this.zza.zzh(new zzd(this, styleFactory));
            } catch (RemoteException e11) {
                throw new RuntimeRemoteException(e11);
            }
        }
    }
}
