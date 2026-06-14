package com.bytedance.sdk.component.mo.qdl.lnr;

import com.bytedance.sdk.component.mo.qdl.jpc;
import com.bytedance.sdk.component.mo.qdl.mzz;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    public static void qdl(AtomicLong atomicLong, int i10) {
        mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx == null || !mzzVarJtx.wd() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i10);
    }
}
