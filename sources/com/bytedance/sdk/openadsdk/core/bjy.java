package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* JADX INFO: loaded from: classes6.dex */
public class bjy {
    private final com.bytedance.sdk.openadsdk.utils.qdl qdl = new com.bytedance.sdk.openadsdk.utils.qdl();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private boolean f17156ud;

    private static class qdl {
        private static final bjy qdl = new bjy();
    }

    public static bjy qdl() {
        return qdl.qdl;
    }

    public boolean lnr() {
        return this.f17156ud;
    }

    public boolean mml() {
        return this.qdl.qdl();
    }

    public com.bytedance.sdk.openadsdk.utils.qdl mzz() {
        return this.qdl;
    }

    public void ud() {
        try {
            Context contextQdl = yt.qdl();
            if (contextQdl instanceof Application) {
                ((Application) contextQdl).registerActivityLifecycleCallbacks(this.qdl);
                this.f17156ud = true;
            } else {
                if (contextQdl == null || contextQdl.getApplicationContext() == null) {
                    return;
                }
                ((Application) contextQdl.getApplicationContext()).registerActivityLifecycleCallbacks(this.qdl);
                this.f17156ud = true;
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th2);
        }
    }

    public boolean qdl(boolean z10) {
        return this.qdl.qdl(z10);
    }
}
