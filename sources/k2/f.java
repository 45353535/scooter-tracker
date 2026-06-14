package k2;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.appevents.m0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import v2.h;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f85964f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f85965g = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f85966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f85967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference f85968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f85969e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str, String str2) {
            return Intrinsics.areEqual("r2", str) ? new Regex("[^\\d.]").replace(str2, "") : str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(java.util.Map r6, java.lang.String r7, java.lang.String r8) {
            /*
                r5 = this;
                int r0 = r7.hashCode()
                r1 = 0
                r2 = 2
                r3 = 0
                switch(r0) {
                    case 3585: goto L53;
                    case 3586: goto L3c;
                    case 3587: goto L33;
                    case 3588: goto Lc;
                    default: goto La;
                }
            La:
                goto L79
            Lc:
                java.lang.String r0 = "r6"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L15
                goto L79
            L15:
                java.lang.String r0 = "-"
                boolean r1 = kotlin.text.StringsKt.g0(r8, r0, r3, r2, r1)
                if (r1 == 0) goto L79
                kotlin.text.Regex r1 = new kotlin.text.Regex
                r1.<init>(r0)
                java.util.List r8 = r1.j(r8, r3)
                java.util.Collection r8 = (java.util.Collection) r8
                java.lang.String[] r0 = new java.lang.String[r3]
                java.lang.Object[] r8 = r8.toArray(r0)
                java.lang.String[] r8 = (java.lang.String[]) r8
                r8 = r8[r3]
                goto L79
            L33:
                java.lang.String r0 = "r5"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L45
                goto L79
            L3c:
                java.lang.String r0 = "r4"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L45
                goto L79
            L45:
                kotlin.text.Regex r0 = new kotlin.text.Regex
                java.lang.String r1 = "[^a-z]+"
                r0.<init>(r1)
                java.lang.String r1 = ""
                java.lang.String r8 = r0.replace(r8, r1)
                goto L79
            L53:
                java.lang.String r0 = "r3"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L5c
                goto L79
            L5c:
                java.lang.String r0 = "m"
                boolean r4 = kotlin.text.StringsKt.a0(r8, r0, r3, r2, r1)
                if (r4 != 0) goto L78
                java.lang.String r4 = "b"
                boolean r4 = kotlin.text.StringsKt.a0(r8, r4, r3, r2, r1)
                if (r4 != 0) goto L78
                java.lang.String r4 = "ge"
                boolean r8 = kotlin.text.StringsKt.a0(r8, r4, r3, r2, r1)
                if (r8 == 0) goto L75
                goto L78
            L75:
                java.lang.String r8 = "f"
                goto L79
            L78:
                r8 = r0
            L79:
                r6.put(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k2.f.a.d(java.util.Map, java.lang.String, java.lang.String):void");
        }

        public final void e(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapB = f.b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object fVar = mapB.get(numValueOf);
            if (fVar == null) {
                fVar = new f(activity, null);
                mapB.put(numValueOf, fVar);
            }
            f.c((f) fVar);
        }

        private a() {
        }
    }

    public /* synthetic */ f(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (e3.a.d(f.class)) {
            return null;
        }
        try {
            return f85965g;
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(f fVar) {
        if (e3.a.d(f.class)) {
            return;
        }
        try {
            fVar.h();
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
        }
    }

    private final void d(final View view) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            g(new Runnable() { // from class: k2.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.e(view, this);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(View view, f this$0) {
        if (e3.a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "$view");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (view instanceof EditText) {
                this$0.f(view);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
        }
    }

    private final void f(View view) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.EditText");
            String lowerCase = StringsKt.v1(((EditText) view).getText().toString()).toString().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            if (lowerCase.length() != 0 && !this.f85966b.contains(lowerCase) && lowerCase.length() <= 100) {
                this.f85966b.add(lowerCase);
                HashMap map = new HashMap();
                List listB = c.b(view);
                List listA = null;
                for (d dVar : d.f85957d.c()) {
                    a aVar = f85964f;
                    String strC = aVar.c(dVar.c(), lowerCase);
                    if (dVar.d().length() <= 0 || c.f(strC, dVar.d())) {
                        if (c.e(listB, dVar.b())) {
                            aVar.d(map, dVar.c(), strC);
                        } else {
                            if (listA == null) {
                                listA = c.a(view);
                            }
                            if (c.e(listA, dVar.b())) {
                                aVar.d(map, dVar.c(), strC);
                            }
                        }
                    }
                }
                m0.f19689b.e(map);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final void g(Runnable runnable) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f85967c.post(runnable);
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
            if (!this.f85969e.getAndSet(true) && (viewD = h.d((Activity) this.f85968d.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewD.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalFocusChangeListener(this);
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (e3.a.d(this)) {
            return;
        }
        if (view != null) {
            try {
                d(view);
            } catch (Throwable th2) {
                e3.a.b(th2, this);
                return;
            }
        }
        if (view2 != null) {
            d(view2);
        }
    }

    private f(Activity activity) {
        this.f85966b = new LinkedHashSet();
        this.f85967c = new Handler(Looper.getMainLooper());
        this.f85968d = new WeakReference(activity);
        this.f85969e = new AtomicBoolean(false);
    }
}
