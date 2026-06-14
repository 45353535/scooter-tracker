package com.taurusx.tax.g.q0.s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.taurusx.tax.g.q0.s.w;
import com.taurusx.tax.g.q0.y;
import com.taurusx.tax.log.LogUtil;
import java.security.MessageDigest;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class z extends com.taurusx.tax.g.q0.z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedBlockingQueue<IBinder> f66306w;

    /* JADX INFO: renamed from: com.taurusx.tax.g.q0.s.z$z, reason: collision with other inner class name */
    public class ServiceConnectionC0804z implements ServiceConnection {
        public ServiceConnectionC0804z() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LogUtil.d("taurusx", "onServiceConnected: ");
            try {
                z.this.f66306w.offer(iBinder);
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
        this.f66306w = new LinkedBlockingQueue<>(1);
    }

    @Override // com.taurusx.tax.g.q0.z
    public y z() {
        boolean zBindService;
        IBinder iBinderPoll;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            LogUtil.d("taurusx", "fetch: main looper not allowed");
            return null;
        }
        LogUtil.d("taurusx", "fetch: ...");
        ServiceConnectionC0804z serviceConnectionC0804z = new ServiceConnectionC0804z();
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            zBindService = this.f66311z.bindService(intent, serviceConnectionC0804z, 1);
            try {
                LogUtil.d("taurusx", "init: start bind service, result " + zBindService);
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                LogUtil.d("taurusx", "fetch: get OAID with exception " + e);
            }
        } catch (Exception e11) {
            e = e11;
            zBindService = false;
        }
        String strZ = (!zBindService || (iBinderPoll = this.f66306w.poll(5L, TimeUnit.SECONDS)) == null) ? null : z(w.z.z(iBinderPoll), "OUID");
        if (zBindService) {
            try {
                this.f66311z.unbindService(serviceConnectionC0804z);
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(strZ)) {
            LogUtil.d("taurusx", "fetch: get OAID failed!");
            return null;
        }
        LogUtil.d("taurusx", "fetch: get OAID success! OAID is " + strZ);
        return new y(strZ, false);
    }

    private String z(w wVar, String str) {
        Signature[] signatureArr;
        String packageName = this.f66311z.getPackageName();
        String string = null;
        try {
            signatureArr = this.f66311z.getPackageManager().getPackageInfo(packageName, 64).signatures;
        } catch (Exception e10) {
            e10.printStackTrace();
            signatureArr = null;
        }
        if (signatureArr != null && signatureArr.length > 0) {
            byte[] byteArray = signatureArr[0].toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(com.taurusx.tax.y.s.w.f67666t);
                if (messageDigest != null) {
                    byte[] bArrDigest = messageDigest.digest(byteArray);
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b10 : bArrDigest) {
                        sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3));
                    }
                    string = sb2.toString();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return ((w.z.C0803z) wVar).z(packageName, string, str);
    }
}
