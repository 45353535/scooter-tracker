package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzc extends BaseGmsClient {
    protected zzc(Context context, Looper looper, int i10, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        super(context, looper, i10, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }
}
