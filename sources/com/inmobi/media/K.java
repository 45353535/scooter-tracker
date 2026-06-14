package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f37176a;

    static {
        String simpleName = K.class.getSimpleName();
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        AdConfig adConfig = (AdConfig) Y3.f38021a.a(AdConfig.class);
        int maxPoolSize = adConfig.getMaxPoolSize();
        int maxPoolSize2 = adConfig.getMaxPoolSize();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        String name = simpleName + "-AD";
        Intrinsics.checkNotNullParameter(name, "name");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(maxPoolSize, maxPoolSize2, 5L, timeUnit, linkedBlockingQueue, new B9(name, false));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f37176a = threadPoolExecutor;
    }
}
