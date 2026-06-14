package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.w0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class s implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f82599b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f82600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f82601d;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(s.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private s(View view, Runnable runnable) {
        this.f82600c = new AtomicReference(view);
        this.f82601d = runnable;
    }

    public static /* synthetic */ void a(s sVar, View view) {
        sVar.getClass();
        view.getViewTreeObserver().removeOnDrawListener(sVar);
    }

    public static /* synthetic */ void b(Window window, Window.Callback callback, Runnable runnable, w0 w0Var) {
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            window.setCallback(callback);
            e(viewPeekDecorView, runnable, w0Var);
        }
    }

    private static boolean c(View view) {
        return view.getViewTreeObserver().isAlive() && view.isAttachedToWindow();
    }

    public static void d(Activity activity, final Runnable runnable, final w0 w0Var) {
        final Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                e(viewPeekDecorView, runnable, w0Var);
            } else {
                final Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.j(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new Runnable() { // from class: io.sentry.android.core.internal.util.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.b(window, callback, runnable, w0Var);
                    }
                }));
            }
        }
    }

    public static void e(View view, Runnable runnable, w0 w0Var) {
        s sVar = new s(view, runnable);
        if (w0Var.d() >= 26 || c(view)) {
            view.getViewTreeObserver().addOnDrawListener(sVar);
        } else {
            view.addOnAttachStateChangeListener(sVar.new a());
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View view = (View) this.f82600c.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.r
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                s.a(this.f82597b, view);
            }
        });
        this.f82599b.postAtFrontOfQueue(this.f82601d);
    }
}
