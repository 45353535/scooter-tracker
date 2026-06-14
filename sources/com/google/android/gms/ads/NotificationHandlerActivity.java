package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbxl;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public final class NotificationHandlerActivity extends Activity {

    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    protected final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzbxl zzbxlVarZzk = zzbb.zzb().zzk(this, new zzbtp());
            if (zzbxlVarZzk == null) {
                zzo.zzf("OfflineUtils is null");
            } else {
                zzbxlVarZzk.zze(getIntent());
            }
        } catch (RemoteException e10) {
            zzo.zzf("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        finish();
    }
}
