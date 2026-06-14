package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@VisibleForTesting
final class zzat extends DeferredLifecycleHelper {
    protected OnDelegateCreatedListener zza;
    private final ViewGroup zzb;
    private final Context zzc;

    @Nullable
    private final StreetViewPanoramaOptions zzd;
    private final List zze = new ArrayList();

    @VisibleForTesting
    zzat(ViewGroup viewGroup, Context context, @Nullable StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.zzb = viewGroup;
        this.zzc = context;
        this.zzd = streetViewPanoramaOptions;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    protected final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzb();
    }

    public final void zza(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            ((zzas) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.zze.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public final void zzb() {
        if (this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            Context context = this.zzc;
            MapsInitializer.initialize(context);
            this.zza.onDelegateCreated(new zzas(this.zzb, zzcc.zza(context, null).zzi(ObjectWrapper.wrap(context), this.zzd)));
            List list = this.zze;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((zzas) getDelegate()).getStreetViewPanoramaAsync((OnStreetViewPanoramaReadyCallback) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
