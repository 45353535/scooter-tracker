package com.bykv.vk.openvk.qdl.qdl.ud.ud;

import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public final class qdl {
    public static boolean qdl() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
