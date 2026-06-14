package com.google.firebase.analytics;

import j$.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
final class zza extends ThreadPoolExecutor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zza(FirebaseAnalytics firebaseAnalytics, int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
        Objects.requireNonNull(firebaseAnalytics);
    }
}
