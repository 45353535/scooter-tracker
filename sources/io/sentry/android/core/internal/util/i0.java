package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import io.sentry.android.core.internal.util.f0;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class i0 {
    public static void a(f0.c cVar, Window window, Window$OnFrameMetricsAvailableListener window$OnFrameMetricsAvailableListener, Handler handler) {
        if (window$OnFrameMetricsAvailableListener == null) {
            return;
        }
        window.addOnFrameMetricsAvailableListener(window$OnFrameMetricsAvailableListener, handler);
    }

    public static void b(f0.c cVar, Window window, Window$OnFrameMetricsAvailableListener window$OnFrameMetricsAvailableListener) {
        if (window$OnFrameMetricsAvailableListener == null) {
            return;
        }
        window.removeOnFrameMetricsAvailableListener(window$OnFrameMetricsAvailableListener);
    }
}
