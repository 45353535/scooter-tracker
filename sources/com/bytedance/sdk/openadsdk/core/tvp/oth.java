package com.bytedance.sdk.openadsdk.core.tvp;

import android.os.SystemClock;
import com.ironsource.C4240b4;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class oth implements com.bytedance.sdk.openadsdk.core.rq.wd.lnr {
    private String mo;
    private long qdl = 0;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f17530ud = 0;
    private int lnr = 0;
    private String mml = null;
    private String mzz = null;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final AtomicBoolean f17531wd = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
    public void qdl(String str) {
        this.mo = str;
        this.qdl = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
    public void ud(String str) {
        this.mzz = str;
        this.f17530ud = SystemClock.elapsedRealtime();
        this.f17531wd.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
    public void qdl(int i10, String str, String str2) {
        this.lnr = i10;
        this.mml = str;
        this.mzz = str2;
        this.f17530ud = SystemClock.elapsedRealtime();
        this.f17531wd.set(false);
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str) {
        if (this.f17531wd.get()) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, false, str, "success", this.f17530ud - this.qdl, this.mzz, this.mo, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, false, str, C4240b4.g.f42582e, this.f17530ud - this.qdl, this.mzz, this.mo, this.lnr, this.mml);
        }
    }
}
