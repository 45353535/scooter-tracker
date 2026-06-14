package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import com.bytedance.sdk.component.utils.aaj;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class wd {
    private static final AtomicInteger qdl = new AtomicInteger(1);

    public static boolean qdl() {
        return qdl.get() == 1;
    }

    protected static void qdl(int i10) {
        boolean z10 = true;
        if (i10 == 1 || i10 == 2) {
            try {
                AtomicInteger atomicInteger = qdl;
                if (atomicInteger.get() != i10) {
                    try {
                        atomicInteger.set(i10);
                    } catch (Throwable th2) {
                        th = th2;
                        aaj.lnr("SdkSwitch", th.getMessage());
                    }
                } else {
                    z10 = false;
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
            }
            if (z10) {
                Log.e("SdkSwitch", "switch status changed: " + qdl());
                if (qdl()) {
                    com.bytedance.sdk.openadsdk.mml.qdl.ud.ud();
                } else {
                    com.bytedance.sdk.openadsdk.mml.qdl.ud.lnr();
                }
            }
        }
    }
}
