package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.w6;
import io.sentry.w7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.ApiStatus;

/* JADX INFO: loaded from: classes3.dex */
@ApiStatus.Internal
public final class ViewHierarchyEventProcessor implements io.sentry.d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f82360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.o f82361c = new io.sentry.android.core.internal.util.o(io.sentry.android.core.internal.util.h.a(), 2000, 3);

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.f82360b = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.util.o.a("ViewHierarchy");
        }
    }

    public static /* synthetic */ void a(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, ILogger iLogger) {
        try {
            atomicReference.set(g(view, list));
            countDownLatch.countDown();
        } catch (Throwable th2) {
            iLogger.a(g7.ERROR, "Failed to process view hierarchy.", th2);
        }
    }

    private static void b(View view, io.sentry.protocol.k0 k0Var, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
                throw null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    io.sentry.protocol.k0 k0VarH = h(childAt);
                    arrayList.add(k0VarH);
                    b(childAt, k0VarH, list);
                }
            }
            k0Var.p(arrayList);
        }
    }

    public static io.sentry.protocol.j0 f(Activity activity, final List list, io.sentry.util.thread.a aVar, ILogger iLogger) {
        final ILogger iLogger2;
        Throwable th2;
        if (activity == null) {
            iLogger.c(g7.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.c(g7.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        final View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.c(g7.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
        } catch (Throwable th3) {
            th = th3;
            iLogger2 = iLogger;
        }
        if (!aVar.a()) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicReference atomicReference = new AtomicReference(null);
            iLogger2 = iLogger;
            try {
                activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.l2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewHierarchyEventProcessor.a(atomicReference, viewPeekDecorView, list, countDownLatch, iLogger2);
                    }
                });
                if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                    return (io.sentry.protocol.j0) atomicReference.get();
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                iLogger2.a(g7.ERROR, "Failed to process view hierarchy.", th2);
            }
            return null;
        }
        try {
            return g(viewPeekDecorView, list);
        } catch (Throwable th5) {
            th2 = th5;
            iLogger2 = iLogger;
        }
        th2 = th;
        iLogger2.a(g7.ERROR, "Failed to process view hierarchy.", th2);
        return null;
    }

    public static io.sentry.protocol.j0 g(View view, List list) {
        ArrayList arrayList = new ArrayList(1);
        io.sentry.protocol.j0 j0Var = new io.sentry.protocol.j0("android_view_system", arrayList);
        io.sentry.protocol.k0 k0VarH = h(view);
        arrayList.add(k0VarH);
        b(view, k0VarH, list);
        return j0Var;
    }

    private static io.sentry.protocol.k0 h(View view) {
        io.sentry.protocol.k0 k0Var = new io.sentry.protocol.k0();
        k0Var.s(io.sentry.android.core.internal.util.m.a(view));
        try {
            k0Var.r(io.sentry.android.core.internal.gestures.j.b(view));
        } catch (Throwable unused) {
        }
        k0Var.w(Double.valueOf(view.getX()));
        k0Var.x(Double.valueOf(view.getY()));
        k0Var.v(Double.valueOf(view.getWidth()));
        k0Var.q(Double.valueOf(view.getHeight()));
        k0Var.o(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            k0Var.u("visible");
        } else if (visibility == 4) {
            k0Var.u("invisible");
        } else if (visibility == 8) {
            k0Var.u("gone");
        }
        return k0Var;
    }

    @Override // io.sentry.d0
    public /* synthetic */ w7 c(w7 w7Var, io.sentry.i0 i0Var) {
        return io.sentry.c0.a(this, w7Var, i0Var);
    }

    @Override // io.sentry.d0
    public w6 d(w6 w6Var, io.sentry.i0 i0Var) {
        io.sentry.protocol.j0 j0VarF;
        if (w6Var.B0()) {
            if (!this.f82360b.isAttachViewHierarchy()) {
                this.f82360b.getLogger().c(g7.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return w6Var;
            }
            if (!io.sentry.util.m.i(i0Var)) {
                boolean zA = this.f82361c.a();
                this.f82360b.getBeforeViewHierarchyCaptureCallback();
                if (!zA && (j0VarF = f(d1.c().b(), this.f82360b.getViewHierarchyExporters(), this.f82360b.getThreadChecker(), this.f82360b.getLogger())) != null) {
                    i0Var.o(io.sentry.b.c(j0VarF));
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
