package com.bytedance.sdk.component.wd.lnr;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    private qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private ud f16732ud;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.wd.lnr.lnr$lnr, reason: collision with other inner class name */
    private static class C0241lnr {
        private static final lnr qdl = new lnr();
    }

    public enum qdl {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    public interface ud {
    }

    public static void qdl(qdl qdlVar) {
        synchronized (lnr.class) {
            C0241lnr.qdl.qdl = qdlVar;
        }
    }

    private lnr() {
        this.qdl = qdl.OFF;
        this.f16732ud = new com.bytedance.sdk.component.wd.lnr.ud();
    }
}
