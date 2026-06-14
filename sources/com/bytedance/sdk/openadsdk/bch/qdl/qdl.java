package com.bytedance.sdk.openadsdk.bch.qdl;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.jpc;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private static Handler qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static HandlerThread f16930ud;

    public static Handler qdl() {
        try {
            HandlerThread handlerThread = f16930ud;
            if (handlerThread == null || !handlerThread.isAlive()) {
                synchronized (qdl.class) {
                    try {
                        HandlerThread handlerThread2 = f16930ud;
                        if (handlerThread2 == null || !handlerThread2.isAlive()) {
                            f16930ud = jpc.qdl("csj_ev");
                            qdl = new Handler(f16930ud.getLooper());
                        }
                    } finally {
                    }
                }
            } else if (qdl == null) {
                synchronized (qdl.class) {
                    try {
                        if (qdl == null) {
                            qdl = new Handler(f16930ud.getLooper());
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return qdl;
    }
}
