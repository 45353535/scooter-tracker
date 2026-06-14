package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.tvp;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.settings.rq;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.multipro.aidl.qdl.mml;
import com.bytedance.sdk.openadsdk.multipro.aidl.qdl.mo;
import com.bytedance.sdk.openadsdk.multipro.aidl.qdl.mzz;
import com.bytedance.sdk.openadsdk.multipro.aidl.qdl.wd;

/* JADX INFO: loaded from: classes6.dex */
public class BinderPoolService extends Service {
    private static boolean lnr;
    public static volatile boolean qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Binder f17758ud = new qdl();

    public static class qdl extends IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i10) throws RemoteException {
            if (i10 == 0) {
                return wd.qdl();
            }
            if (i10 == 1) {
                return mzz.qdl();
            }
            if (i10 == 4) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.qdl.lnr.qdl();
            }
            if (i10 == 5) {
                return mo.ud();
            }
            if (i10 == 6) {
                return mml.qdl();
            }
            if (i10 != 7) {
                return null;
            }
            return com.bytedance.sdk.openadsdk.multipro.aidl.qdl.ud.qdl();
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.f17758ud;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        yt.ud(getApplicationContext());
        qdl = true;
        if (!lnr) {
            tvp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.1
                @Override // java.lang.Runnable
                public void run() {
                    rq.lnr().lnr(BinderPoolService.this.getApplicationContext());
                }
            });
        }
        lnr = true;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }
}
