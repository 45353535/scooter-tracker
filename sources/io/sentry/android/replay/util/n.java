package io.sentry.android.replay.util;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f83170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Runnable f83171c;

    public n(String taskName, Runnable delegate) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f83170b = taskName;
        this.f83171c = delegate;
    }

    public final String a() {
        return this.f83170b;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f83171c.run();
    }
}
