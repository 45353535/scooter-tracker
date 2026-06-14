package com.bytedance.sdk.openadsdk.aaj;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private int mml;
    private qdl mzz;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private jpc f16802ud;
    private ScheduledExecutorService qdl = null;
    private long lnr = 0;

    public interface qdl {
    }

    public ud(jpc jpcVar, int i10) {
        this.f16802ud = jpcVar;
        this.mml = i10;
    }

    public void qdl(long j10) {
        this.lnr = j10;
    }

    public boolean ud() {
        ScheduledExecutorService scheduledExecutorService = this.qdl;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public void qdl(int i10) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.qdl = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.aaj.ud.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = ud.this.lnr;
                if (System.currentTimeMillis() - ud.this.lnr > ud.this.mml) {
                    ud.this.qdl.shutdown();
                    if (ud.this.f16802ud != null) {
                        ud.this.f16802ud.ud(0, "Automatic detection of stuck");
                    }
                    if (ud.this.mzz != null) {
                        qdl unused2 = ud.this.mzz;
                    }
                }
            }
        }, 0L, i10, TimeUnit.MILLISECONDS);
    }

    public void qdl() {
        ScheduledExecutorService scheduledExecutorService = this.qdl;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
