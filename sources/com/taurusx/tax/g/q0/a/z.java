package com.taurusx.tax.g.q0.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;
import com.taurusx.tax.g.q0.a.w;
import com.taurusx.tax.g.q0.y;
import com.taurusx.tax.log.LogUtil;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class z extends com.taurusx.tax.g.q0.z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedBlockingQueue<IBinder> f66296w;

    /* JADX INFO: renamed from: com.taurusx.tax.g.q0.a.z$z, reason: collision with other inner class name */
    public class ServiceConnectionC0800z implements ServiceConnection {
        public ServiceConnectionC0800z() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LogUtil.d("taurusx", "onServiceConnected");
            try {
                z.this.f66296w.offer(iBinder);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LogUtil.d("taurusx", "onServiceDisconnected: ");
        }
    }

    public z(Context context) {
        super(context);
        this.f66296w = new LinkedBlockingQueue<>(1);
    }

    @Override // com.taurusx.tax.g.q0.z
    public y z() {
        boolean zBindService;
        IBinder iBinderPoll;
        LogUtil.d("taurusx", "fetch: ...");
        try {
            this.f66311z.getPackageManager().getPackageInfo("com.samsung.android.deviceidservice", 0);
            ServiceConnectionC0800z serviceConnectionC0800z = new ServiceConnectionC0800z();
            try {
                Intent intent = new Intent();
                intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
                zBindService = this.f66311z.bindService(intent, serviceConnectionC0800z, 1);
                try {
                    LogUtil.d("taurusx", "fetch: bind samsung DeviceIdService result" + zBindService);
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    LogUtil.d("taurusx", "fetch: get OAID with exception " + e);
                }
            } catch (Exception e11) {
                e = e11;
                zBindService = false;
            }
            String strW = (!zBindService || (iBinderPoll = this.f66296w.poll(5L, TimeUnit.SECONDS)) == null) ? null : new w.z(iBinderPoll).w();
            if (zBindService) {
                try {
                    this.f66311z.unbindService(serviceConnectionC0800z);
                } catch (Exception unused) {
                }
            }
            if (TextUtils.isEmpty(strW)) {
                LogUtil.d("taurusx", "fetch: get OAID failed!");
                return null;
            }
            LogUtil.d("taurusx", "fetch: get OAID success! OAID is " + strW);
            return new y(strW, false);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }
}
