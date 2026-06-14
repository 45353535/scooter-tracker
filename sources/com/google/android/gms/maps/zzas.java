package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzcb;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* JADX INFO: loaded from: classes8.dex */
@VisibleForTesting
final class zzas implements StreetViewLifecycleDelegate {
    private final ViewGroup zza;
    private final IStreetViewPanoramaViewDelegate zzb;
    private View zzc;

    public zzas(ViewGroup viewGroup, IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate) {
        this.zzb = (IStreetViewPanoramaViewDelegate) Preconditions.checkNotNull(iStreetViewPanoramaViewDelegate);
        this.zza = (ViewGroup) Preconditions.checkNotNull(viewGroup);
    }

    @Override // com.google.android.gms.maps.internal.StreetViewLifecycleDelegate
    public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        try {
            this.zzb.getStreetViewPanoramaAsync(new zzar(this, onStreetViewPanoramaReadyCallback));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onCreate(@Nullable Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            zzcb.zzb(bundle, bundle2);
            IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate = this.zzb;
            iStreetViewPanoramaViewDelegate.onCreate(bundle2);
            zzcb.zzb(bundle2, bundle);
            this.zzc = (View) ObjectWrapper.unwrap(iStreetViewPanoramaViewDelegate.getView());
            ViewGroup viewGroup = this.zza;
            viewGroup.removeAllViews();
            viewGroup.addView(this.zzc);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onDestroy() {
        try {
            this.zzb.onDestroy();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onDestroyView() {
        throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onInflate(Activity activity, Bundle bundle, @Nullable Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onLowMemory() {
        try {
            this.zzb.onLowMemory();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onPause() {
        try {
            this.zzb.onPause();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onResume() {
        try {
            this.zzb.onResume();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            zzcb.zzb(bundle, bundle2);
            this.zzb.onSaveInstanceState(bundle2);
            zzcb.zzb(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onStart() {
        try {
            this.zzb.onStart();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Override // com.google.android.gms.dynamic.LifecycleDelegate
    public final void onStop() {
        try {
            this.zzb.onStop();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
