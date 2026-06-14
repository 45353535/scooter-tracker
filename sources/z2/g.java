package z2;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z2.j;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f119161e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f119162f = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f119163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f119164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f119165d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapB = g.b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object gVar = mapB.get(numValueOf);
            if (gVar == null) {
                gVar = new g(activity, null);
                mapB.put(numValueOf, gVar);
            }
            g.c((g) gVar);
        }

        public final void b(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            g gVar = (g) g.b().remove(Integer.valueOf(activity.hashCode()));
            if (gVar != null) {
                g.d(gVar);
            }
        }

        private a() {
        }
    }

    public /* synthetic */ g(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (e3.a.d(g.class)) {
            return null;
        }
        try {
            return f119162f;
        } catch (Throwable th2) {
            e3.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(g gVar) {
        if (e3.a.d(g.class)) {
            return;
        }
        try {
            gVar.g();
        } catch (Throwable th2) {
            e3.a.b(th2, g.class);
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (e3.a.d(g.class)) {
            return;
        }
        try {
            gVar.h();
        } catch (Throwable th2) {
            e3.a.b(th2, g.class);
        }
    }

    private final void e() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: z2.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.f(this.f119160b);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f119164c.post(runnable);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(g this$0) {
        if (e3.a.d(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                View viewD = v2.h.d((Activity) this$0.f119163b.get());
                Activity activity = (Activity) this$0.f119163b.get();
                if (viewD != null && activity != null) {
                    for (View view : c.a(viewD)) {
                        if (!n2.d.g(view)) {
                            String strD = c.d(view);
                            if (strD.length() > 0 && strD.length() <= 300) {
                                j.a aVar = j.f119172f;
                                String localClassName = activity.getLocalClassName();
                                Intrinsics.checkNotNullExpressionValue(localClassName, "activity.localClassName");
                                aVar.d(view, viewD, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            e3.a.b(th2, g.class);
        }
    }

    private final void g() {
        View viewD;
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (!this.f119165d.getAndSet(true) && (viewD = v2.h.d((Activity) this.f119163b.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewD.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    e();
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final void h() {
        View viewD;
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (this.f119165d.getAndSet(false) && (viewD = v2.h.d((Activity) this.f119163b.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewD.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            e();
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private g(Activity activity) {
        this.f119163b = new WeakReference(activity);
        this.f119164c = new Handler(Looper.getMainLooper());
        this.f119165d = new AtomicBoolean(false);
    }
}
