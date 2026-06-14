package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@VisibleForTesting
final class zzaw extends DeferredLifecycleHelper {
    protected OnDelegateCreatedListener zza;
    private final Fragment zzb;
    private Activity zzc;
    private final List zzd = new ArrayList();

    @VisibleForTesting
    zzaw(Fragment fragment) {
        this.zzb = fragment;
    }

    static /* synthetic */ void zza(zzaw zzawVar, Activity activity) {
        zzawVar.zzc = activity;
        zzawVar.zzc();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    protected final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((zzav) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.zzd.add(onMapReadyCallback);
        }
    }

    public final void zzc() {
        if (this.zzc == null || this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.zzc);
            IMapFragmentDelegate iMapFragmentDelegateZzf = zzcc.zza(this.zzc, null).zzf(ObjectWrapper.wrap(this.zzc));
            if (iMapFragmentDelegateZzf == null) {
                return;
            }
            this.zza.onDelegateCreated(new zzav(this.zzb, iMapFragmentDelegateZzf));
            List list = this.zzd;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((zzav) getDelegate()).getMapAsync((OnMapReadyCallback) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
