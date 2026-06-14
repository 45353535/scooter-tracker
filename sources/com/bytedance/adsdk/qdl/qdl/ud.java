package com.bytedance.adsdk.qdl.qdl;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends RuntimeException {
    public ud(String str, Throwable th2) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th2);
    }
}
