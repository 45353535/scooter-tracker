package com.bytedance.sdk.openadsdk.yt;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface ud {
    Context getContext();

    Handler getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    HandlerThread getSafeHandlerThread(String str, int i10);

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<com.bytedance.sdk.openadsdk.yt.ud.qdl> list);
}
