package io.bidmachine.iab.mraid;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import b9.v;
import com.ironsource.C4240b4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 extends WebView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f80140j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final v f80141k = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f80142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b9.v f80143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f80144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c0 f80145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f80146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f80147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f80148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f80149i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            a0.this.f80142b.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if ((action != 0 && action != 1) || view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f80142b = new d0(context);
        this.f80143c = new b9.v(context, this, new v.a() { // from class: io.bidmachine.iab.mraid.w
            @Override // b9.v.a
            public final void a(boolean z10) {
                a0.g(this.f80313a, z10);
            }
        });
        this.f80144d = new p(context);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setScrollBarStyle(33554432);
        setFocusableInTouchMode(false);
        setOnTouchListener(new b());
        setWebChromeClient(f80141k);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setBackgroundColor(0);
    }

    private final void e() {
        i.c("MraidWebView", C4240b4.i.f42653t0, new Object[0]);
        try {
            onPause();
        } catch (Throwable th2) {
            i.e("MraidWebView", th2);
        }
        this.f80148h = true;
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(a0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(a0 this$0, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(String str) {
        i.c("MraidWebView", "evaluate js complete: %s", str);
    }

    private final void j() {
        i.c("MraidWebView", C4240b4.i.f42655u0, new Object[0]);
        try {
            onResume();
        } catch (Throwable th2) {
            i.e("MraidWebView", th2);
        }
        this.f80148h = false;
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(a0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.s();
    }

    private final void l() {
        boolean z10 = !this.f80148h && this.f80143c.i();
        if (z10 != this.f80147g) {
            this.f80147g = z10;
            c0 c0Var = this.f80145e;
            if (c0Var != null) {
                c0Var.a(z10);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f80146f = false;
        this.f80149i = true;
        try {
            q();
            removeAllViews();
            this.f80143c.j();
            super.destroy();
        } catch (Throwable th2) {
            i.e("MraidWebView", th2);
        }
    }

    public final long getClickTimeMs() {
        return this.f80142b.a();
    }

    @NotNull
    public final p getMraidScreenMetrics() {
        return this.f80144d;
    }

    @Nullable
    public final c0 getMraidWebViewListener() {
        return this.f80145e;
    }

    public final void m(String str) {
        if (this.f80149i) {
            i.c("MraidWebView", "can't evaluating js: WebView is destroyed", new Object[0]);
            return;
        }
        if (str == null || str.length() == 0) {
            i.c("MraidWebView", "can't evaluating js: js is empty", new Object[0]);
            return;
        }
        try {
            i.c("MraidWebView", "evaluating js: %s", str);
            evaluateJavascript(str, new ValueCallback() { // from class: io.bidmachine.iab.mraid.x
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    a0.h((String) obj);
                }
            });
        } catch (Throwable th2) {
            i.d("MraidWebView", th2.getMessage(), new Object[0]);
            i.c("MraidWebView", "loading url: %s", str);
            loadUrl("javascript:" + str);
        }
    }

    public final boolean n() {
        return this.f80149i;
    }

    public final boolean o() {
        return this.f80147g;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        i.c("MraidWebView", "onConfigurationChanged: %s", b9.u.E(newConfig.orientation));
        pd.b0.b(new Runnable() { // from class: io.bidmachine.iab.mraid.z
            @Override // java.lang.Runnable
            public final void run() {
                a0.f(this.f80315b);
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        pd.b0.b(new Runnable() { // from class: io.bidmachine.iab.mraid.y
            @Override // java.lang.Runnable
            public final void run() {
                a0.k(this.f80314b);
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            j();
        } else {
            e();
        }
    }

    @Override // android.view.View
    protected boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        return false;
    }

    public final void p() {
        this.f80146f = true;
        this.f80143c.k();
        s();
    }

    public final void q() {
        stopLoading();
        loadUrl("");
        e();
    }

    public final void r() {
        this.f80142b.c();
    }

    public final void s() {
        c0 c0Var;
        if (!this.f80146f || this.f80149i) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext()");
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            view = this;
        }
        DisplayMetrics displayMetricsB = pd.g.b(context);
        boolean zI = this.f80144d.i(displayMetricsB.widthPixels, displayMetricsB.heightPixels);
        int[] iArr = new int[2];
        View viewO = r.o(context, view);
        Intrinsics.checkNotNullExpressionValue(viewO, "obtainRootView(context, container)");
        viewO.getLocationOnScreen(iArr);
        boolean zH = this.f80144d.h(iArr[0], iArr[1], viewO.getWidth(), viewO.getHeight()) | zI;
        view.getLocationOnScreen(iArr);
        boolean zG = zH | this.f80144d.g(iArr[0], iArr[1], view.getWidth(), view.getHeight());
        getLocationOnScreen(iArr);
        if ((!zG && !this.f80144d.f(iArr[0], iArr[1], getWidth(), getHeight())) || (c0Var = this.f80145e) == null) {
            return;
        }
        c0Var.b(this.f80144d);
    }

    public final void setMraidWebViewListener(@Nullable c0 c0Var) {
        this.f80145e = c0Var;
    }

    public final boolean t() {
        return this.f80142b.b();
    }
}
