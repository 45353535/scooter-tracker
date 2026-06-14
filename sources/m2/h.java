package m2;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f94440a = new h();

    public static final class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n2.a f94441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference f94442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final WeakReference f94443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View.OnTouchListener f94444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f94445f;

        public a(n2.a mapping, View rootView, View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f94441b = mapping;
            this.f94442c = new WeakReference(hostView);
            this.f94443d = new WeakReference(rootView);
            this.f94444e = n2.f.h(hostView);
            this.f94445f = true;
        }

        public final boolean a() {
            return this.f94445f;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            View view2 = (View) this.f94443d.get();
            View view3 = (View) this.f94442c.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                b.d(this.f94441b, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f94444e;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    private h() {
    }

    public static final a a(n2.a mapping, View rootView, View hostView) {
        if (e3.a.d(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            e3.a.b(th2, h.class);
            return null;
        }
    }
}
