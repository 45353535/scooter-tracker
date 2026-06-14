package m2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.appevents.o;
import com.facebook.s;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f94401a = new b();

    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n2.a f94402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference f94403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private WeakReference f94404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View.OnClickListener f94405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f94406f;

        public a(n2.a mapping, View rootView, View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f94402b = mapping;
            this.f94403c = new WeakReference(hostView);
            this.f94404d = new WeakReference(rootView);
            this.f94405e = n2.f.g(hostView);
            this.f94406f = true;
        }

        public final boolean a() {
            return this.f94406f;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (e3.a.d(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(view, "view");
                View.OnClickListener onClickListener = this.f94405e;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = (View) this.f94404d.get();
                View view3 = (View) this.f94403c.get();
                if (view2 == null || view3 == null) {
                    return;
                }
                n2.a aVar = this.f94402b;
                Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type com.facebook.appevents.codeless.internal.EventBinding");
                b.d(aVar, view2, view3);
            } catch (Throwable th2) {
                e3.a.b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: m2.b$b, reason: collision with other inner class name */
    public static final class C1083b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n2.a f94407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference f94408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private WeakReference f94409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private AdapterView.OnItemClickListener f94410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f94411f;

        public C1083b(n2.a mapping, View rootView, AdapterView hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f94407b = mapping;
            this.f94408c = new WeakReference(hostView);
            this.f94409d = new WeakReference(rootView);
            this.f94410e = hostView.getOnItemClickListener();
            this.f94411f = true;
        }

        public final boolean a() {
            return this.f94411f;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            Intrinsics.checkNotNullParameter(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f94410e;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i10, j10);
            }
            View view2 = (View) this.f94409d.get();
            AdapterView adapterView2 = (AdapterView) this.f94408c.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            b.d(this.f94407b, view2, adapterView2);
        }
    }

    private b() {
    }

    public static final a b(n2.a mapping, View rootView, View hostView) {
        if (e3.a.d(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
            return null;
        }
    }

    public static final C1083b c(n2.a mapping, View rootView, AdapterView hostView) {
        if (e3.a.d(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new C1083b(mapping, rootView, hostView);
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
            return null;
        }
    }

    public static final void d(n2.a mapping, View rootView, View hostView) {
        if (e3.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            final String strB = mapping.b();
            final Bundle bundleB = g.f94424f.b(mapping, rootView, hostView);
            f94401a.f(bundleB);
            s.t().execute(new Runnable() { // from class: m2.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.e(strB, bundleB);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(String eventName, Bundle parameters) {
        if (e3.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "$eventName");
            Intrinsics.checkNotNullParameter(parameters, "$parameters");
            o.f19698b.f(s.m()).b(eventName, parameters);
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
        }
    }

    public final void f(Bundle parameters) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                parameters.putDouble("_valueToSum", v2.h.f(string));
            }
            parameters.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }
}
