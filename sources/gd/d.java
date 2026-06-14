package gd;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import gd.d;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lf.i;
import org.jetbrains.annotations.NotNull;
import pd.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f72742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Function0 f72743c;

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        public final void a() {
            d.this.getOnCloseClickListener().invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f72742b = i.a(new c(context));
        this.f72743c = b.f72745f;
        setOnClickListener(new View.OnClickListener() { // from class: gd.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.e(this.f72739b, view);
            }
        });
        h privacySheetView = getPrivacySheetView();
        privacySheetView.setOnCloseButtonClickListener(new a());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        Unit unit = Unit.f93236a;
        addView(privacySheetView, layoutParams);
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets c(d this$0, int i10, View view, WindowInsets insets) {
        Rect rect;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (Build.VERSION.SDK_INT >= 30) {
            Insets insets2 = insets.getInsets(WindowInsets.Type.systemBars());
            rect = new Rect(insets2.left, insets2.top, insets2.right, insets2.bottom);
        } else {
            rect = new Rect(insets.getSystemWindowInsetLeft(), insets.getSystemWindowInsetTop(), insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
        }
        this$0.getPrivacySheetView().setPadding(this$0.getPrivacySheetView().getPaddingLeft(), this$0.getPrivacySheetView().getPaddingTop(), this$0.getPrivacySheetView().getPaddingRight(), i10 + rect.bottom);
        this$0.setPadding(0, rect.top, 0, 0);
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(d this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f72743c.invoke();
    }

    private final void g() {
        final int paddingBottom = getPrivacySheetView().getPaddingBottom();
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: gd.c
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return d.c(this.f72740a, paddingBottom, view, windowInsets);
            }
        });
    }

    private final h getPrivacySheetView() {
        return (h) this.f72742b.getValue();
    }

    public final void d() {
        getPrivacySheetView().c();
    }

    public final void f(String title, Drawable drawable, Function0 clickListener) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        getPrivacySheetView().d(title, drawable, clickListener);
    }

    @NotNull
    public final Function0<Unit> getOnCloseClickListener() {
        return this.f72743c;
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View child, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(child, "child");
        int size = View.MeasureSpec.getSize(i10);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int iK = g0.k(context, 600.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        if (size >= g0.k(context2, 32.0f) + iK) {
            i10 = View.MeasureSpec.makeMeasureSpec(iK, 1073741824);
        }
        super.measureChildWithMargins(child, i10, i11, i12, i13);
    }

    public final void setOnCloseClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f72743c = function0;
    }

    public final void setSubtitle(@NotNull String subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        getPrivacySheetView().setSubtitle(subtitle);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        getPrivacySheetView().setTitle(title);
    }

    static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f72745f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }

        public final void a() {
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f72746f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f72746f = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            h hVar = new h(this.f72746f);
            hVar.setOnClickListener(new View.OnClickListener() { // from class: gd.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.c.g(view);
                }
            });
            return hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(View view) {
        }
    }
}
