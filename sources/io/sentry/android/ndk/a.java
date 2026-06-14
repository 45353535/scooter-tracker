package io.sentry.android.ndk;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.o1;
import io.sentry.ndk.NativeModuleListLoader;
import io.sentry.util.w;
import io.sentry.v7;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements o1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final io.sentry.util.a f82818c = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f82819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NativeModuleListLoader f82820b;

    public a(SentryAndroidOptions sentryAndroidOptions, NativeModuleListLoader nativeModuleListLoader) {
        this.f82819a = (v7) w.c(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.f82820b = (NativeModuleListLoader) w.c(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }
}
