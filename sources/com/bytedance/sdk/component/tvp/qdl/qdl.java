package com.bytedance.sdk.component.tvp.qdl;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static volatile qdl f16685ud;
    private volatile ud qdl;

    private qdl() {
    }

    public static qdl qdl() {
        if (f16685ud == null) {
            synchronized (qdl.class) {
                try {
                    if (f16685ud == null) {
                        f16685ud = new qdl();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f16685ud;
    }

    public ud ud() {
        return this.qdl;
    }

    public void qdl(ud udVar) {
        this.qdl = udVar;
    }
}
