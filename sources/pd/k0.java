package pd;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f98238f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f98239g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, b bVar) {
            super(1);
            this.f98238f = view;
            this.f98239g = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f93236a;
        }

        public final void invoke(Throwable th2) {
            this.f98238f.removeOnLayoutChangeListener(this.f98239g);
        }
    }

    public static final class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f98240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f98241c;

        b(View view, CancellableContinuation cancellableContinuation) {
            this.f98240b = view;
            this.f98241c = cancellableContinuation;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f98240b.removeOnLayoutChangeListener(this);
            this.f98241c.resumeWith(Result.b(view));
        }
    }

    public static final class c implements w {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f98242b;

        c(View view) {
            this.f98242b = view;
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            v.a(this, th2);
        }

        @Override // pd.w
        public void onRun() {
            this.f98242b.setVisibility(8);
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            v.b(this);
        }
    }

    public static final class d implements w {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f98243b;

        d(View view) {
            this.f98243b = view;
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            v.a(this, th2);
        }

        @Override // pd.w
        public void onRun() {
            this.f98243b.setVisibility(0);
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            v.b(this);
        }
    }

    public static final void b(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            viewGroup.removeAllViews();
            Unit unit = Unit.f93236a;
        } catch (Throwable unused) {
        }
        d(viewGroup, view, 0, layoutParams, 2, null);
    }

    public static final void c(ViewGroup viewGroup, View view, int i10, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            n(view);
            if (layoutParams != null) {
                viewGroup.addView(view, i10, layoutParams);
            } else {
                viewGroup.addView(view, i10);
            }
            Unit unit = Unit.f93236a;
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void d(ViewGroup viewGroup, View view, int i10, ViewGroup.LayoutParams layoutParams, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = -1;
        }
        if ((i11 & 4) != 0) {
            layoutParams = null;
        }
        c(viewGroup, view, i10, layoutParams);
    }

    public static final Object e(View view, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            b bVar = new b(view, eVar);
            eVar.v(new a(view, bVar));
            view.addOnLayoutChangeListener(bVar);
        } else {
            eVar.resumeWith(Result.b(view));
        }
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }

    public static final Activity f(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View viewG = g(view);
        Context context = viewG != null ? viewG.getContext() : null;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return g0.n((ContextWrapper) context, 0, 1, null);
        }
        return null;
    }

    public static final View g(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (k(view)) {
            return view;
        }
        ViewParent parent = view.getParent();
        View view2 = null;
        while (parent instanceof View) {
            view2 = (View) parent;
            if (k(view2)) {
                return view2;
            }
            parent = view2.getParent();
        }
        return view2;
    }

    public static final Window h(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Activity activityF = f(view);
        if (activityF != null) {
            return activityF.getWindow();
        }
        return null;
    }

    public static final Rect i(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static final void j(View view) {
        if (view == null) {
            return;
        }
        b0.b(new c(view));
    }

    public static final boolean k(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getId() == 16908290;
    }

    public static final boolean l(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getAlpha() == 0.0f;
    }

    public static final boolean m(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return i0.i(view.getVisibility());
    }

    public static final Unit n(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        viewGroup.removeView(view);
        return Unit.f93236a;
    }

    public static final void o(View view, Integer num) {
        if (view == null || num == null) {
            return;
        }
        try {
            view.setBackgroundColor(num.intValue());
            Unit unit = Unit.f93236a;
        } catch (Throwable unused) {
        }
    }

    public static final void p(View view, final int i10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: pd.j0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return k0.q(i10, view2, windowInsets);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets q(int i10, View selfView, WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(selfView, "selfView");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(i10);
        Intrinsics.checkNotNullExpressionValue(insets, "windowInsets.getInsets(typeInsets)");
        selfView.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsets;
    }

    public static final void r(View view) {
        if (view == null) {
            return;
        }
        b0.b(new d(view));
    }
}
