package com.appodeal.ads.segments;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;

/* JADX INFO: loaded from: classes6.dex */
public abstract class t0 {
    public static final void a(j0 j0Var) {
        long jB = j0Var.b();
        boolean z10 = j0Var.b() == -1;
        Log.log("Segment", LogConstants.EVENT_SET, "matched segment #" + jB + " (default - " + z10 + "): " + j0Var.c().f14479a);
    }
}
