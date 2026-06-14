package com.bytedance.sdk.component.adexpress.mml;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    public static void qdl(com.bytedance.sdk.component.jpc.jpc jpcVar, int i10) {
        if (jpcVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.qdl.qdl.lnr lnrVarLnr = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr();
        ExecutorService executorServiceRdp = lnrVarLnr != null ? lnrVarLnr.rdp() : null;
        if (executorServiceRdp == null) {
            com.bytedance.sdk.component.jpc.mo.qdl(jpcVar, i10);
        } else {
            jpcVar.setPriority(i10);
            executorServiceRdp.execute(jpcVar);
        }
    }

    public static void ud(com.bytedance.sdk.component.jpc.jpc jpcVar, int i10) {
        if (jpcVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.qdl.qdl.lnr lnrVarLnr = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr();
        ExecutorService executorServiceExu = lnrVarLnr != null ? lnrVarLnr.exu() : null;
        if (executorServiceExu == null) {
            com.bytedance.sdk.component.jpc.mo.qdl(jpcVar);
        } else {
            jpcVar.setPriority(i10);
            executorServiceExu.execute(jpcVar);
        }
    }

    public static ScheduledFuture qdl(Runnable runnable, long j10, TimeUnit timeUnit) {
        return com.bytedance.sdk.component.jpc.mo.mo().schedule(runnable, j10, timeUnit);
    }
}
