package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.media3.common.MimeTypes;
import io.sentry.g7;
import io.sentry.w6;
import io.sentry.w7;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.ApiStatus;

/* JADX INFO: loaded from: classes3.dex */
@ApiStatus.Internal
public final class ScreenshotEventProcessor implements io.sentry.d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f82322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0 f82323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.o f82324d = new io.sentry.android.core.internal.util.o(io.sentry.android.core.internal.util.h.a(), 2000, 3);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, w0 w0Var) {
        this.f82322b = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f82323c = (w0) io.sentry.util.w.c(w0Var, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.util.o.a("Screenshot");
        }
    }

    @Override // io.sentry.d0
    public /* synthetic */ w7 c(w7 w7Var, io.sentry.i0 i0Var) {
        return io.sentry.c0.a(this, w7Var, i0Var);
    }

    @Override // io.sentry.d0
    public w6 d(w6 w6Var, io.sentry.i0 i0Var) {
        final Bitmap bitmapC;
        if (w6Var.B0()) {
            if (!this.f82322b.isAttachScreenshot()) {
                this.f82322b.getLogger().c(g7.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return w6Var;
            }
            Activity activityB = d1.c().b();
            if (activityB != null && !io.sentry.util.m.i(i0Var)) {
                boolean zA = this.f82324d.a();
                this.f82322b.getBeforeScreenshotCaptureCallback();
                if (!zA && (bitmapC = io.sentry.android.core.internal.util.y.c(activityB, this.f82322b.getThreadChecker(), this.f82322b.getLogger(), this.f82323c)) != null) {
                    i0Var.m(io.sentry.b.a(new Callable() { // from class: io.sentry.android.core.z1
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return io.sentry.android.core.internal.util.y.d(bitmapC, this.f82816b.f82322b.getLogger());
                        }
                    }, "screenshot.png", MimeTypes.IMAGE_PNG, false));
                    i0Var.k("android:activity", activityB);
                }
            }
        }
        return w6Var;
    }

    @Override // io.sentry.d0
    public io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, io.sentry.i0 i0Var) {
        return e0Var;
    }
}
