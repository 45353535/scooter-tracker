package com.bytedance.sdk.openadsdk.core.jpc;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.settings.rq;
import com.bytedance.sdk.openadsdk.core.yt;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private static volatile long lnr;
    private static volatile qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static volatile boolean f17270ud;
    private final Queue<C0261qdl> mml = new LinkedList();
    private final rq mo = yt.mml();
    private Handler mzz;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jpc.qdl$qdl, reason: collision with other inner class name */
    private static class C0261qdl {
        private final long qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final String f17271ud;

        private C0261qdl(long j10, String str) {
            this.qdl = j10;
            this.f17271ud = str;
        }
    }

    private qdl() {
    }

    private synchronized boolean ud(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iHkc = this.mo.hkc();
        long jEkw = this.mo.ekw();
        if (this.mml.size() <= 0 || this.mml.size() < iHkc) {
            this.mml.offer(new C0261qdl(jCurrentTimeMillis, str));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.mml.peek().qdl);
            if (jAbs <= jEkw) {
                ud(jEkw - jAbs);
                return true;
            }
            this.mml.poll();
            this.mml.offer(new C0261qdl(jCurrentTimeMillis, str));
        }
        return false;
    }

    public synchronized String lnr() {
        String str;
        try {
            HashMap map = new HashMap();
            for (C0261qdl c0261qdl : this.mml) {
                if (map.containsKey(c0261qdl.f17271ud)) {
                    map.put(c0261qdl.f17271ud, Integer.valueOf(((Integer) map.get(c0261qdl.f17271ud)).intValue() + 1));
                } else {
                    map.put(c0261qdl.f17271ud, 1);
                }
            }
            str = "";
            int i10 = Integer.MIN_VALUE;
            for (String str2 : map.keySet()) {
                int iIntValue = ((Integer) map.get(str2)).intValue();
                if (i10 < iIntValue) {
                    str = str2;
                    i10 = iIntValue;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return str;
    }

    public static qdl qdl() {
        if (qdl == null) {
            synchronized (qdl.class) {
                try {
                    if (qdl == null) {
                        qdl = new qdl();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qdl;
    }

    public synchronized boolean qdl(String str) {
        try {
            if (ud(str)) {
                qdl(true);
                qdl(lnr);
            } else {
                qdl(false);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f17270ud;
    }

    private synchronized void qdl(long j10) {
        try {
            if (this.mzz == null) {
                this.mzz = new Handler(Looper.getMainLooper());
            }
            this.mzz.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jpc.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    qdl.this.qdl(false);
                }
            }, j10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean ud() {
        return f17270ud;
    }

    private synchronized void ud(long j10) {
        lnr = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void qdl(boolean z10) {
        f17270ud = z10;
    }
}
