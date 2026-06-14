package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.internal.gestures.k;

/* JADX INFO: loaded from: classes3.dex */
public class j extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f82729c;

    public j(Window.Callback callback, Runnable runnable) {
        super(callback);
        this.f82729c = runnable;
    }

    @Override // io.sentry.android.core.internal.gestures.k, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        this.f82729c.run();
    }
}
