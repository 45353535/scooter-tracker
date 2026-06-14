package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f23895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Handler f23896b = new Handler(Looper.getMainLooper());

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(32), new p(), new q());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f23895a = threadPoolExecutor;
    }
}
