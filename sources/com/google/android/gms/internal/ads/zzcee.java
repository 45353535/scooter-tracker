package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes8.dex */
final class zzcee extends ScheduledThreadPoolExecutor {
    zzcee(int i10, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
