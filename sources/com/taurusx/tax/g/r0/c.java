package com.taurusx.tax.g.r0;

import com.taurusx.tax.log.LogUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ExecutorService f66314c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static ExecutorService f66315o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static ExecutorService f66316s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f66317w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f66318y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f66319z;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f66319z = iAvailableProcessors;
        f66317w = iAvailableProcessors + 1;
        f66318y = (iAvailableProcessors * 3) + 1;
        f66314c = null;
        f66315o = null;
        f66316s = null;
    }

    public static ExecutorService w() {
        if (f66315o == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("create ThreadPoolExecutor for event tracker ");
            int i10 = f66317w;
            sb2.append(i10);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            int i11 = f66318y;
            sb2.append(i11);
            LogUtil.d("taurusx", sb2.toString());
            f66315o = new ThreadPoolExecutor(i10, i11, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        return f66315o;
    }

    public static ExecutorService y() {
        if (f66316s == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("create ThreadPoolExecutor for flyer ");
            int i10 = f66317w;
            sb2.append(i10);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            int i11 = f66318y;
            sb2.append(i11);
            LogUtil.d("taurusx", sb2.toString());
            f66316s = new ThreadPoolExecutor(i10, i11, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        return f66316s;
    }

    public static ExecutorService z() {
        if (f66314c == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("create ThreadPoolExecutor for ad request ");
            int i10 = f66317w;
            sb2.append(i10);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            int i11 = f66318y;
            sb2.append(i11);
            LogUtil.d("taurusx", sb2.toString());
            f66314c = new ThreadPoolExecutor(i10, i11, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        return f66314c;
    }
}
