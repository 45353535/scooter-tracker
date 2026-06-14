package com.bytedance.sdk.openadsdk.yt.mml;

import com.vungle.ads.internal.signals.SignalManager;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    public static long qdl() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - (jCurrentTimeMillis % SignalManager.TWENTY_FOUR_HOURS_MILLIS);
    }

    public static boolean qdl(long j10) {
        return j10 - (j10 % SignalManager.TWENTY_FOUR_HOURS_MILLIS) == qdl();
    }
}
