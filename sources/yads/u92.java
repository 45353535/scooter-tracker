package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u92 extends oo implements xz0, ib2, si3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f116572k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk3 f116573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f116574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ti3 f116575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jb2 f116576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ix2 f116577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zz0 f116578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public yz0 f116579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f116580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f116581j;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ u92(Context context, zk3 zk3Var, AttributeSet attributeSet, int i10) {
        zk3 zk3Var2 = (i10 & 2) != 0 ? new zk3() : zk3Var;
        attributeSet = (i10 & 4) != 0 ? null : attributeSet;
        Context applicationContext = context.getApplicationContext();
        this(context, zk3Var2, attributeSet, applicationContext, new ti3(), jb2.f112281h.a(applicationContext));
    }

    public final void a(Context context) {
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        int i10 = 1;
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(false);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setTextZoom(100);
        getSettings().setMinimumFontSize(1);
        getSettings().setMinimumLogicalFontSize(1);
        WebSettings settings = getSettings();
        Object obj = vt2.f117186j;
        ut2.a();
        synchronized (vt2.f117186j) {
        }
        int iOrdinal = this.f116573b.f118732a.ordinal();
        if (iOrdinal == 0) {
            i10 = -1;
        } else if (iOrdinal != 1) {
            i10 = 3;
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new lf.m();
                }
                i10 = 2;
            }
        }
        settings.setCacheMode(i10);
        WebSettings settings2 = getSettings();
        if (sb.a(21)) {
            settings2.setMixedContentMode(2);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        setWebViewClient(new wz0(this, xp2.b()));
        setWebChromeClient(new tz0());
    }

    @Override // yads.oo
    public final String b() {
        return "<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n" + yk3.a();
    }

    @Override // yads.oo
    public final void c() {
        setHtmlWebViewListener(null);
        super.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zz0 zz0Var;
        if (motionEvent != null && motionEvent.getAction() == 0 && (zz0Var = this.f116578g) != null) {
            zz0Var.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract void e();

    public final Context f() {
        return this.f116574c;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f116581j = true;
        this.f116576e.a(this);
        this.f116575d.getClass();
        a(ti3.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f116581j = false;
        this.f116575d.getClass();
        a(ti3.a(this));
        this.f116576e.b(this);
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        this.f116575d.getClass();
        a(ti3.a(this));
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.f116575d.getClass();
        a(ti3.a(this));
    }

    public final void setHtmlWebViewErrorListener(@Nullable yz0 yz0Var) {
        this.f116579h = yz0Var;
    }

    public void setHtmlWebViewListener(@Nullable zz0 zz0Var) {
        this.f116578g = zz0Var;
    }

    public u92(Context context, zk3 zk3Var, AttributeSet attributeSet, Context context2, ti3 ti3Var, jb2 jb2Var) {
        super(context2, attributeSet);
        this.f116573b = zk3Var;
        this.f116574c = context2;
        this.f116575d = ti3Var;
        this.f116576e = jb2Var;
        this.f116577f = new ix2();
        a(context);
        if (f116572k) {
            return;
        }
        f116572k = true;
    }

    public final void a(boolean z10) {
        if (this.f116580i != z10) {
            this.f116580i = z10;
            zz0 zz0Var = this.f116578g;
            if (zz0Var != null) {
                zz0Var.a(z10);
            }
        }
    }

    public void a(Context context, String str) {
        zz0 zz0Var = this.f116578g;
        if (zz0Var != null) {
            zz0Var.a(str);
        }
    }

    public void a() {
        ix2 ix2Var = this.f116577f;
        Runnable runnable = new Runnable() { // from class: yads.ar0
            @Override // java.lang.Runnable
            public final void run() {
                u92.a(this.f108756b);
            }
        };
        synchronized (ix2Var.f112180a) {
            if (ix2Var.f112181b) {
                return;
            }
            ix2Var.f112181b = true;
            Unit unit = Unit.f93236a;
            runnable.run();
        }
    }

    public static final void a(u92 u92Var) {
        u92Var.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    @Override // yads.ib2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.eb2 r2) {
        /*
            r1 = this;
            yads.eb2 r0 = yads.eb2.f110297c
            if (r2 != r0) goto L5
            goto L1a
        L5:
            yads.ti3 r2 = r1.f116575d
            r2.getClass()
            boolean r2 = yads.ti3.a(r1)
            if (r2 == 0) goto L1a
            yads.jb2 r2 = r1.f116576e
            boolean r2 = r2.a()
            if (r2 == 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            r1.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u92.a(yads.eb2):void");
    }

    public void a(int i10) {
        yz0 yz0Var = this.f116579h;
        if (yz0Var != null) {
            yz0Var.a(i10);
        }
    }
}
