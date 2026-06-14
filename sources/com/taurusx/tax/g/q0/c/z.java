package com.taurusx.tax.g.q0.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import com.taurusx.tax.log.LogUtil;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes11.dex */
public class z extends com.taurusx.tax.g.q0.z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedBlockingQueue<IBinder> f66303w;

    /* JADX INFO: renamed from: com.taurusx.tax.g.q0.c.z$z, reason: collision with other inner class name */
    public class ServiceConnectionC0802z implements ServiceConnection {
        public ServiceConnectionC0802z() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LogUtil.d("taurusx", "onServiceConnected");
            try {
                z.this.f66303w.offer(iBinder);
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
        this.f66303w = new LinkedBlockingQueue<>(1);
    }

    public boolean w() {
        try {
            PackageManager packageManager = this.f66311z.getPackageManager();
            packageManager.getPackageInfo("com.huawei.hwid", 0);
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage("com.huawei.hwid");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null) {
                if (listQueryIntentServices.size() > 0) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.taurusx.tax.g.q0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taurusx.tax.g.q0.y z() {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.g.q0.c.z.z():com.taurusx.tax.g.q0.y");
    }
}
