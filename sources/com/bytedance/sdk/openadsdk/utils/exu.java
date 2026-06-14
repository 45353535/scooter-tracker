package com.bytedance.sdk.openadsdk.utils;

import java.io.Closeable;

/* JADX INFO: loaded from: classes6.dex */
public class exu {
    public static void qdl(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }
}
