package com.bytedance.sdk.component.utils;

import java.io.Closeable;

/* JADX INFO: loaded from: classes6.dex */
public class to {
    public static void qdl(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }
}
