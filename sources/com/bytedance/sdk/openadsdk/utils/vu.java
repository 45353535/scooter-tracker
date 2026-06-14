package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public class vu {
    private static String lnr = null;
    private static volatile boolean mml = true;
    private static String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static String f17890ud;

    public static class qdl extends com.bytedance.sdk.component.jpc.jpc {
        public static AtomicBoolean qdl = new AtomicBoolean(false);

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private static final AtomicLong f17891ud = new AtomicLong(0);

        public qdl(String str, int i10) {
            super(str, i10);
        }

        public static void qdl() {
            if (qdl.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = f17891ud;
            if (jCurrentTimeMillis - atomicLong.get() < 600000) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            fco.ud((com.bytedance.sdk.component.jpc.jpc) new qdl("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            qdl.set(true);
            vu.mzz();
            qdl.set(false);
        }
    }

    public static String lnr() {
        qdl.qdl();
        return lnr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mzz() {
        String simOperatorName;
        String simOperator;
        String strSubstring;
        if (com.bytedance.sdk.openadsdk.core.yt.qdl() == null) {
            return;
        }
        mml = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.yt.qdl().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0 || simState == 1) {
                    mml = false;
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.aaj.lnr("SimUtils", th2.getMessage());
            }
            String str = null;
            try {
                simOperatorName = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                simOperatorName = null;
            }
            try {
                simOperator = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                simOperator = null;
            }
            if (simOperator == null || simOperator.length() < 5) {
                try {
                    simOperator = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(simOperator) || simOperator.length() <= 4) {
                strSubstring = null;
            } else {
                String strSubstring2 = simOperator.substring(0, 3);
                strSubstring = simOperator.substring(3);
                str = strSubstring2;
            }
            if (!TextUtils.isEmpty(simOperatorName)) {
                qdl = simOperatorName;
            }
            if (!TextUtils.isEmpty(str)) {
                f17890ud = str;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            lnr = strSubstring;
        } catch (Throwable unused4) {
        }
    }

    public static String qdl() {
        qdl.qdl();
        return qdl;
    }

    public static String ud() {
        try {
            qdl.qdl();
            if (!mml) {
                StringBuilder sb2 = new StringBuilder("getMCC");
                sb2.append(mml ? "Have SIM card" : "No SIM card, MCC returns null");
                com.bytedance.sdk.component.utils.aaj.lnr("MCC", sb2.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.yt.qdl().getResources().getConfiguration();
            int i10 = configuration.mcc;
            String strValueOf = i10 != 0 ? String.valueOf(i10) : f17890ud;
            com.bytedance.sdk.component.utils.aaj.lnr("MCC", "config=" + configuration.mcc + ",sMCC=" + f17890ud);
            return strValueOf;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr("SimUtils", th2.getMessage());
            return null;
        }
    }
}
