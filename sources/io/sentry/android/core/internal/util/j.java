package io.sentry.android.core.internal.util;

import android.os.StrictMode;
import io.sentry.util.runtime.a;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements io.sentry.util.runtime.a {
    public static /* synthetic */ Object c(Runnable runnable) {
        runnable.run();
        return null;
    }

    @Override // io.sentry.util.runtime.a
    public Object a(a.InterfaceC1016a interfaceC1016a) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            return interfaceC1016a.run();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // io.sentry.util.runtime.a
    public void b(final Runnable runnable) {
        a(new a.InterfaceC1016a() { // from class: io.sentry.android.core.internal.util.i
            @Override // io.sentry.util.runtime.a.InterfaceC1016a
            public final Object run() {
                return j.c(runnable);
            }
        });
    }
}
