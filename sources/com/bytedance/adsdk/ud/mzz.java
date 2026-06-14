package com.bytedance.adsdk.ud;

import android.content.Context;
import android.os.Trace;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class mzz {
    private static volatile com.bytedance.adsdk.ud.mml.wd fs = null;
    private static int jpc = 0;
    private static boolean lnr = true;
    private static boolean mml = true;
    private static long[] mo;
    private static String[] mzz;
    public static boolean qdl;
    private static volatile com.bytedance.adsdk.ud.mml.jpc rq;
    private static com.bytedance.adsdk.ud.mml.mzz to;
    private static com.bytedance.adsdk.ud.mml.mo tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static boolean f16071ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private static int f16072wd;

    public static void qdl(String str) {
        if (f16071ud) {
            int i10 = f16072wd;
            if (i10 == 20) {
                jpc++;
                return;
            }
            mzz[i10] = str;
            mo[i10] = System.nanoTime();
            Trace.beginSection(str);
            f16072wd++;
        }
    }

    public static float ud(String str) {
        int i10 = jpc;
        if (i10 > 0) {
            jpc = i10 - 1;
            return 0.0f;
        }
        if (!f16071ud) {
            return 0.0f;
        }
        int i11 = f16072wd - 1;
        f16072wd = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(mzz[i11])) {
            Trace.endSection();
            return (System.nanoTime() - mo[f16072wd]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + mzz[f16072wd] + ".");
    }

    public static com.bytedance.adsdk.ud.mml.jpc qdl(Context context) {
        com.bytedance.adsdk.ud.mml.jpc jpcVar;
        com.bytedance.adsdk.ud.mml.jpc jpcVar2 = rq;
        if (jpcVar2 != null) {
            return jpcVar2;
        }
        synchronized (com.bytedance.adsdk.ud.mml.jpc.class) {
            try {
                jpcVar = rq;
                if (jpcVar == null) {
                    com.bytedance.adsdk.ud.mml.wd wdVarUd = ud(context);
                    com.bytedance.adsdk.ud.mml.mo udVar = tvp;
                    if (udVar == null) {
                        udVar = new com.bytedance.adsdk.ud.mml.ud();
                    }
                    jpcVar = new com.bytedance.adsdk.ud.mml.jpc(wdVarUd, udVar);
                    rq = jpcVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jpcVar;
    }

    public static com.bytedance.adsdk.ud.mml.wd ud(Context context) {
        com.bytedance.adsdk.ud.mml.wd wdVar;
        if (!lnr) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.ud.mml.wd wdVar2 = fs;
        if (wdVar2 != null) {
            return wdVar2;
        }
        synchronized (com.bytedance.adsdk.ud.mml.wd.class) {
            try {
                wdVar = fs;
                if (wdVar == null) {
                    com.bytedance.adsdk.ud.mml.mzz mzzVar = to;
                    if (mzzVar == null) {
                        mzzVar = new com.bytedance.adsdk.ud.mml.mzz() { // from class: com.bytedance.adsdk.ud.mzz.1
                            @Override // com.bytedance.adsdk.ud.mml.mzz
                            public File qdl() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    wdVar = new com.bytedance.adsdk.ud.mml.wd(mzzVar);
                    fs = wdVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wdVar;
    }

    public static boolean qdl() {
        return mml;
    }
}
