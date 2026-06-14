package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbmo extends RemoteCreator {
    public zzbmo() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof zzbkz ? (zzbkz) iInterfaceQueryLocalInterface : new zzbkx(iBinder);
    }

    @Nullable
    public final zzbkw zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderZze = ((zzbkz) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(frameLayout), ObjectWrapper.wrap(frameLayout2), ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof zzbkw ? (zzbkw) iInterfaceQueryLocalInterface : new zzbku(iBinderZze);
        } catch (RemoteException e10) {
            e = e10;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e11) {
            e = e11;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
