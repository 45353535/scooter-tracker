package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbln {
    private final zzblm zza;

    @VisibleForTesting
    public zzbln(zzblm zzblmVar) {
        Context context;
        this.zza = zzblmVar;
        try {
            context = (Context) ObjectWrapper.unwrap(zzblmVar.zzm());
        } catch (RemoteException | NullPointerException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzn(ObjectWrapper.wrap(new MediaView(context)));
            } catch (RemoteException e11) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
            }
        }
    }

    public final zzblm zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            return null;
        }
    }
}
