package sg.bigo.ads.common.e;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: sg.bigo.ads.common.e.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1257a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f102312a = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: sg.bigo.ads.common.e.a.a.1
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                AbstractC1257a.this.a(z10);
            }
        };

        @RequiresApi(api = 18)
        final ViewTreeObserver.OnWindowFocusChangeListener a() {
            Object obj = this.f102312a;
            if (obj instanceof ViewTreeObserver.OnWindowFocusChangeListener) {
                return (ViewTreeObserver.OnWindowFocusChangeListener) obj;
            }
            return null;
        }

        public abstract void a(boolean z10);
    }

    public static void a(@NonNull View view) {
        view.postInvalidateOnAnimation();
    }

    public static void b(View view, AbstractC1257a abstractC1257a) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListenerA;
        if (view == null || abstractC1257a == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || (onWindowFocusChangeListenerA = abstractC1257a.a()) == null) {
            return;
        }
        viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListenerA);
    }

    public static void a(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setZ(f10);
    }

    public static void a(View view, int i10) {
        if (view == null) {
            return;
        }
        view.setElevation(i10);
    }

    public static void a(@NonNull View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, AbstractC1257a abstractC1257a) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListenerA;
        if (view == null || abstractC1257a == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || (onWindowFocusChangeListenerA = abstractC1257a.a()) == null) {
            return;
        }
        viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListenerA);
    }
}
