package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.mraid.a;
import sg.bigo.ads.core.mraid.a.a;
import sg.bigo.ads.core.mraid.c;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements sg.bigo.ads.common.d.d {
    private final c.b A;
    private final c.b B;
    private int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final Context f104417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final n f104418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    final FrameLayout f104419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    final sg.bigo.ads.core.mraid.a.a f104420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    final j f104421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    o f104422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public b f104423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    c.C1296c f104424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.core.mraid.c f104425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    final sg.bigo.ads.core.mraid.c f104426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    final c f104427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    private WeakReference<Activity> f104428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private ViewGroup f104429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    private final C1297e f104430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private l f104431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private c.C1296c f104432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private Integer f104433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f104434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f104435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f104436t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private i f104437u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h f104438v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f104439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f104440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private sg.bigo.ads.core.mraid.a f104441y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Handler f104442z;

    public interface a extends b {
        void a(String str, String str2);
    }

    public interface b {
        void a();

        void a(@NonNull String str, @Nullable sg.bigo.ads.common.i iVar);

        boolean a(Activity activity, int i10);

        void b();

        boolean b(Activity activity, int i10);

        void c();

        void d();

        void e();

        void f();

        void g();
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f104452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f104453b;

        private c() {
            this.f104452a = -1;
            this.f104453b = -1;
        }

        final void a() {
            int measuredWidth = e.this.f104424h.getMeasuredWidth();
            int measuredHeight = e.this.f104424h.getMeasuredHeight();
            this.f104452a = measuredWidth;
            this.f104453b = measuredHeight;
        }

        /* synthetic */ c(e eVar, byte b10) {
            this();
        }
    }

    public interface d {
        void a();
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.e$e, reason: collision with other inner class name */
    @VisibleForTesting
    static class C1297e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        final Handler f104455a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        a f104456b;

        /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.e$e$a */
        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NonNull
            final View[] f104457a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NonNull
            final Handler f104458b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            Runnable f104459c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f104460d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final Runnable f104461e;

            private a(@NonNull Handler handler, @NonNull View[] viewArr) {
                this.f104461e = new Runnable() { // from class: sg.bigo.ads.core.mraid.e.e.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (final View view : a.this.f104457a) {
                            if (view.getHeight() > 0 || view.getWidth() > 0) {
                                a.a(a.this);
                            } else {
                                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.core.mraid.e.e.a.1.1
                                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                                    public final boolean onPreDraw() {
                                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                                        a.a(a.this);
                                        return true;
                                    }
                                });
                            }
                        }
                    }
                };
                this.f104458b = handler;
                this.f104457a = viewArr;
            }

            final void a() {
                this.f104458b.removeCallbacks(this.f104461e);
                this.f104459c = null;
            }

            /* synthetic */ a(Handler handler, View[] viewArr, byte b10) {
                this(handler, viewArr);
            }

            static /* synthetic */ void a(a aVar) {
                Runnable runnable;
                int i10 = aVar.f104460d - 1;
                aVar.f104460d = i10;
                if (i10 != 0 || (runnable = aVar.f104459c) == null) {
                    return;
                }
                runnable.run();
                aVar.f104459c = null;
            }
        }

        C1297e() {
        }

        final void a() {
            a aVar = this.f104456b;
            if (aVar != null) {
                aVar.a();
                this.f104456b = null;
            }
        }
    }

    public e(@NonNull Context context, @NonNull n nVar) {
        this(context, nVar, new sg.bigo.ads.core.mraid.c(nVar), new sg.bigo.ads.core.mraid.c(n.INTERSTITIAL), new C1297e());
    }

    static int a(int i10, int i11, int i12) {
        return Math.max(i10, Math.min(i11, i12));
    }

    private void l() {
        this.f104425i.a();
        this.f104424h = null;
    }

    private void m() {
        this.f104426j.a();
        this.f104432p = null;
    }

    @VisibleForTesting
    private void n() throws sg.bigo.ads.core.mraid.d {
        int iA;
        i iVar = this.f104437u;
        if (iVar != i.NONE) {
            iA = iVar.f104499d;
        } else {
            if (this.f104436t) {
                o();
                return;
            }
            Activity activity = this.f104428l.get();
            if (activity == null) {
                throw new sg.bigo.ads.core.mraid.d("Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
            }
            iA = sg.bigo.ads.common.aa.b.a(activity);
        }
        a(iA);
    }

    @VisibleForTesting
    private void o() {
        Integer num;
        j().setSystemUiVisibility(this.f104435s);
        Activity activity = this.f104428l.get();
        if (activity != null && (num = this.f104433q) != null) {
            b bVar = this.f104423g;
            if (bVar != null && bVar.b(activity, num.intValue())) {
                return;
            } else {
                activity.setRequestedOrientation(this.f104433q.intValue());
            }
        }
        this.f104433q = null;
    }

    private boolean p() {
        return !this.f104420d.f104370a.isVisible();
    }

    private void q() {
        if (this.f104441y != null) {
            this.f104417a.getContentResolver().unregisterContentObserver(this.f104441y);
            this.f104441y = null;
        }
    }

    @Nullable
    public final c.C1296c b() {
        return this.f104426j.c() ? this.f104432p : this.f104424h;
    }

    @VisibleForTesting
    final boolean c() {
        Activity activity = this.f104428l.get();
        if (activity == null || b() == null) {
            return false;
        }
        if (this.f104418b != n.INLINE) {
            return true;
        }
        return h.a(activity);
    }

    public final void d() {
        this.f104439w = false;
        k();
        c.C1296c c1296c = this.f104424h;
        if (c1296c != null) {
            c1296c.onResume();
        }
        c.C1296c c1296c2 = this.f104432p;
        if (c1296c2 != null) {
            c1296c2.onResume();
        }
    }

    public final void e() {
        this.f104430n.a();
        try {
            sg.bigo.ads.common.d.a.a().a(this);
        } catch (IllegalArgumentException e10) {
            if (!e10.getMessage().contains("Receiver not registered")) {
                throw e10;
            }
        }
        if (!this.f104439w) {
            a(true);
        }
        u.b(this.f104420d);
        l();
        m();
        o();
        q();
        this.f104429m = null;
        u.b(this.f104419c);
        u.b(this.f104420d);
        this.f104440x = true;
    }

    final void f() {
        b bVar;
        if (this.f104418b != n.INTERSTITIAL || (bVar = this.f104423g) == null) {
            return;
        }
        bVar.g();
    }

    @VisibleForTesting
    protected final void g() {
        o oVar;
        o oVar2;
        ViewGroup.LayoutParams layoutParams;
        c.C1296c c1296c;
        if (this.f104424h == null || (oVar = this.f104422f) == o.LOADING || oVar == (oVar2 = o.HIDDEN)) {
            return;
        }
        o oVar3 = o.EXPANDED;
        if (oVar == oVar3 || this.f104418b == n.INTERSTITIAL) {
            o();
        }
        o oVar4 = this.f104422f;
        if (oVar4 != o.RESIZED && oVar4 != oVar3) {
            if (oVar4 == o.DEFAULT) {
                this.f104419c.setVisibility(4);
                a(oVar2);
                return;
            }
            return;
        }
        if (!this.f104426j.c() || (c1296c = this.f104432p) == null) {
            this.f104420d.removeView(this.f104424h);
            this.f104419c.addView(this.f104424h, new FrameLayout.LayoutParams(-1, -1));
            this.f104419c.setVisibility(0);
        } else {
            m();
            this.f104420d.removeView(c1296c);
        }
        c cVar = this.f104427k;
        c.C1296c c1296c2 = e.this.f104424h;
        if (c1296c2 != null && cVar.f104452a > 0 && cVar.f104453b > 0 && (layoutParams = c1296c2.getLayoutParams()) != null) {
            layoutParams.width = cVar.f104452a;
            layoutParams.height = cVar.f104453b;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            }
            e.this.f104424h.setLayoutParams(layoutParams);
        }
        u.b(this.f104420d);
        a(o.DEFAULT);
    }

    @VisibleForTesting
    final void h() {
        b bVar = this.f104423g;
        if (bVar != null) {
            bVar.c();
        }
    }

    @NonNull
    final ViewGroup i() {
        ViewGroup viewGroup = this.f104429m;
        if (viewGroup != null) {
            return viewGroup;
        }
        View viewA = u.a(this.f104428l.get(), this.f104419c);
        return viewA instanceof ViewGroup ? (ViewGroup) viewA : this.f104419c;
    }

    @NonNull
    final ViewGroup j() {
        if (this.f104429m == null) {
            this.f104429m = i();
        }
        return this.f104429m;
    }

    final void k() {
        o oVar;
        if (this.f104440x || (oVar = this.f104422f) == o.LOADING || oVar == o.HIDDEN || this.f104424h == null) {
            return;
        }
        Context context = this.f104417a;
        if (this.f104441y != null) {
            q();
        }
        this.f104441y = new sg.bigo.ads.core.mraid.a(this.f104442z, context.getApplicationContext(), new a.InterfaceC1294a() { // from class: sg.bigo.ads.core.mraid.e.7
            @Override // sg.bigo.ads.core.mraid.a.InterfaceC1294a
            public final void a(float f10) {
                e.this.f104425i.c("mraidbridge.notifyAudioVolumeChangeEvent(" + f10 + ");");
            }
        });
        context.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f104441y);
    }

    @VisibleForTesting
    private e(@NonNull Context context, @NonNull n nVar, @NonNull sg.bigo.ads.core.mraid.c cVar, @NonNull sg.bigo.ads.core.mraid.c cVar2, @NonNull C1297e c1297e) {
        o oVar = o.LOADING;
        this.f104422f = oVar;
        this.f104436t = true;
        this.f104437u = i.NONE;
        this.f104439w = true;
        byte b10 = 0;
        this.f104440x = false;
        c.a aVar = new c.a() { // from class: sg.bigo.ads.core.mraid.e.3
            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a() {
                e eVar = e.this;
                eVar.f104425i.a(h.b(eVar.f104417a), h.a(eVar.f104417a), h.d(eVar.f104417a), h.c(eVar.f104417a), eVar.c());
                eVar.f104425i.a(eVar.f104418b);
                sg.bigo.ads.core.mraid.c cVar3 = eVar.f104425i;
                cVar3.a(cVar3.b());
                eVar.f104425i.a(eVar.f104421e);
                eVar.k();
                eVar.a(o.DEFAULT);
                eVar.f104425i.c("mraidbridge.notifyReadyEvent();");
                b bVar = e.this.f104423g;
                if (bVar != null) {
                    bVar.a();
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b() {
                b bVar = e.this.f104423g;
                if (bVar != null) {
                    bVar.b();
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void c() {
                e.this.h();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean d() {
                return e.this.a();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void e() {
                e.this.f();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void f() {
                e.this.g();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(int i10, int i11, int i12, int i13, @NonNull a.EnumC1295a enumC1295a, boolean z10) throws sg.bigo.ads.core.mraid.d {
                e eVar = e.this;
                if (eVar.f104424h == null) {
                    throw new sg.bigo.ads.core.mraid.d("Unable to resize after the WebView is destroyed");
                }
                o oVar2 = eVar.f104422f;
                if (oVar2 == o.LOADING || oVar2 == o.HIDDEN) {
                    return;
                }
                if (oVar2 == o.EXPANDED) {
                    throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an already expanded ad");
                }
                if (eVar.f104418b == n.INTERSTITIAL) {
                    throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an interstitial ad");
                }
                eVar.f104427k.a();
                Context context2 = eVar.f104417a;
                int iA = sg.bigo.ads.common.utils.e.a(context2, i10);
                int iA2 = sg.bigo.ads.common.utils.e.a(context2, i11);
                int iA3 = sg.bigo.ads.common.utils.e.a(context2, i12);
                int iA4 = sg.bigo.ads.common.utils.e.a(context2, i13);
                Rect rect = eVar.f104421e.f104506g;
                int i14 = rect.left + iA3;
                int i15 = rect.top + iA4;
                Rect rect2 = new Rect(i14, i15, iA + i14, i15 + iA2);
                if (!z10) {
                    Rect rect3 = eVar.f104421e.f104502c;
                    if (rect2.width() > rect3.width() || rect2.height() > rect3.height()) {
                        throw new sg.bigo.ads.core.mraid.d("resizeProperties specified a size (" + i10 + ", " + i11 + ") and offset (" + i12 + ", " + i13 + ") that doesn't allow the ad to appear within the max allowed size (" + eVar.f104421e.f104503d.width() + ", " + eVar.f104421e.f104503d.height() + ")");
                    }
                    rect2.offsetTo(e.a(rect3.left, rect2.left, rect3.right - rect2.width()), e.a(rect3.top, rect2.top, rect3.bottom - rect2.height()));
                }
                Rect rect4 = new Rect();
                eVar.f104420d.a(enumC1295a, rect2, rect4);
                if (!eVar.f104421e.f104502c.contains(rect4)) {
                    throw new sg.bigo.ads.core.mraid.d("resizeProperties specified a size (" + i10 + ", " + i11 + ") and offset (" + i12 + ", " + i13 + ") that doesn't allow the close region to appear within the max allowed size (" + eVar.f104421e.f104503d.width() + ", " + eVar.f104421e.f104503d.height() + ")");
                }
                if (!rect2.contains(rect4)) {
                    throw new sg.bigo.ads.core.mraid.d("resizeProperties specified a size (" + i10 + ", " + iA2 + ") and offset (" + i12 + ", " + i13 + ") that don't allow the close region to appear within the resized ad.");
                }
                eVar.f104420d.setCloseVisible(false);
                eVar.f104420d.setClosePosition(enumC1295a);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect2.width(), rect2.height());
                int i16 = rect2.left;
                Rect rect5 = eVar.f104421e.f104502c;
                layoutParams.leftMargin = i16 - rect5.left;
                layoutParams.topMargin = rect2.top - rect5.top;
                o oVar3 = eVar.f104422f;
                if (oVar3 == o.DEFAULT) {
                    eVar.f104419c.removeView(eVar.f104424h);
                    eVar.f104419c.setVisibility(4);
                    eVar.f104420d.addView(eVar.f104424h, new FrameLayout.LayoutParams(-1, -1));
                    eVar.j().addView(eVar.f104420d, layoutParams);
                } else if (oVar3 == o.RESIZED) {
                    eVar.f104420d.setLayoutParams(layoutParams);
                }
                eVar.f104420d.setClosePosition(enumC1295a);
                eVar.a(o.RESIZED);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b(boolean z10) {
                e.this.b(z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@NonNull String str) {
                e.this.a(str);
            }

            @Override // sg.bigo.ads.core.mraid.c.a
            public final void a(String str, String str2) {
                b bVar = e.this.f104423g;
                if (bVar == null || !(bVar instanceof a)) {
                    return;
                }
                ((a) bVar).a(str, str2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(String str, sg.bigo.ads.common.i iVar) {
                e.this.a(str, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@Nullable String str, boolean z10) throws sg.bigo.ads.core.mraid.d {
                e.this.a(str, z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(sg.bigo.ads.core.mraid.b bVar) {
                if (e.this.f104426j.c()) {
                    return;
                }
                e.this.f104425i.a(bVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z10) {
                if (e.this.f104426j.c()) {
                    return;
                }
                e.this.f104425i.a(z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z10, i iVar) throws sg.bigo.ads.core.mraid.d {
                e.this.a(z10, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean a(@NonNull JsResult jsResult) {
                return e.this.a(jsResult);
            }
        };
        this.A = aVar;
        c.b bVar = new c.b() { // from class: sg.bigo.ads.core.mraid.e.4
            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a() {
                final e eVar = e.this;
                eVar.a(new Runnable() { // from class: sg.bigo.ads.core.mraid.e.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        e eVar2 = e.this;
                        eVar2.f104426j.a(h.b(eVar2.f104417a), h.a(e.this.f104417a), h.d(e.this.f104417a), h.c(e.this.f104417a), e.this.c());
                        e eVar3 = e.this;
                        eVar3.f104426j.a(eVar3.f104422f);
                        e eVar4 = e.this;
                        eVar4.f104426j.a(eVar4.f104418b);
                        sg.bigo.ads.core.mraid.c cVar3 = e.this.f104426j;
                        cVar3.a(cVar3.b());
                        e.this.f104426j.c("mraidbridge.notifyReadyEvent();");
                    }
                });
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b() {
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void c() {
                e.this.h();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean d() {
                return e.this.a();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void e() {
                e.this.f();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void f() {
                e.this.g();
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(int i10, int i11, int i12, int i13, @NonNull a.EnumC1295a enumC1295a, boolean z10) throws sg.bigo.ads.core.mraid.d {
                throw new sg.bigo.ads.core.mraid.d("Not allowed to resize from an expanded state");
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void b(boolean z10) {
                e.this.b(z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@NonNull String str) {
                e.this.a(str);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(String str, @Nullable sg.bigo.ads.common.i iVar) {
                e.this.a(str, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(@Nullable String str, boolean z10) {
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(sg.bigo.ads.core.mraid.b bVar2) {
                e.this.f104425i.a(bVar2);
                e.this.f104426j.a(bVar2);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z10) {
                e.this.f104425i.a(z10);
                e.this.f104426j.a(z10);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final void a(boolean z10, i iVar) throws sg.bigo.ads.core.mraid.d {
                e.this.a(z10, iVar);
            }

            @Override // sg.bigo.ads.core.mraid.c.b
            public final boolean a(@NonNull JsResult jsResult) {
                return e.this.a(jsResult);
            }
        };
        this.B = bVar;
        this.C = -1;
        this.f104442z = new Handler(Looper.getMainLooper());
        this.f104417a = context;
        this.f104428l = context instanceof Activity ? new WeakReference<>((Activity) context) : new WeakReference<>(null);
        this.f104418b = nVar;
        this.f104425i = cVar;
        this.f104426j = cVar2;
        this.f104430n = c1297e;
        this.f104427k = new c(this, b10);
        this.f104422f = oVar;
        this.f104421e = new j(context, context.getResources().getDisplayMetrics().density);
        this.f104419c = new FrameLayout(context);
        sg.bigo.ads.core.mraid.a.a aVar2 = new sg.bigo.ads.core.mraid.a.a(context);
        this.f104420d = aVar2;
        aVar2.setOnCloseListener(new a.b() { // from class: sg.bigo.ads.core.mraid.e.1
            @Override // sg.bigo.ads.core.mraid.a.a.b
            public final void a() {
                e.this.g();
            }
        });
        View view = new View(context);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.core.mraid.e.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        aVar2.addView(view, new FrameLayout.LayoutParams(-1, -1));
        sg.bigo.ads.common.d.a.a().a(context, this);
        cVar.f104397a = aVar;
        cVar2.f104397a = bVar;
        this.f104438v = new h();
        this.f104434r = 4871;
    }

    @VisibleForTesting
    private void a(int i10) throws sg.bigo.ads.core.mraid.d {
        Activity activity = this.f104428l.get();
        if (activity == null || !a(this.f104437u)) {
            throw new sg.bigo.ads.core.mraid.d("Attempted to lock orientation to unsupported value: " + this.f104437u.name());
        }
        if (this.f104433q == null) {
            this.f104433q = Integer.valueOf(activity.getRequestedOrientation());
        }
        b bVar = this.f104423g;
        if (bVar == null || !bVar.a(activity, i10)) {
            activity.setRequestedOrientation(i10);
        }
    }

    @VisibleForTesting
    protected final void b(boolean z10) {
        if (z10 == p()) {
            return;
        }
        this.f104420d.setCloseVisible(!z10);
    }

    @Override // sg.bigo.ads.common.d.b
    public final void a(Context context, Intent intent) {
        int rotation;
        if (!"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (rotation = ((WindowManager) this.f104417a.getSystemService("window")).getDefaultDisplay().getRotation()) == this.C) {
            return;
        }
        this.C = rotation;
        a((Runnable) null);
    }

    private static void a(@NonNull WebView webView, boolean z10) {
        if (z10) {
            webView.stopLoading();
            webView.loadUrl("");
        }
        webView.onPause();
    }

    final void a(@Nullable final Runnable runnable) {
        byte b10 = 0;
        this.f104430n.a();
        final c.C1296c c1296cB = b();
        if (c1296cB == null) {
            return;
        }
        C1297e c1297e = this.f104430n;
        C1297e.a aVar = new C1297e.a(c1297e.f104455a, new View[]{this.f104419c, c1296cB}, b10);
        c1297e.f104456b = aVar;
        aVar.f104459c = new Runnable() { // from class: sg.bigo.ads.core.mraid.e.6
            @Override // java.lang.Runnable
            public final void run() {
                DisplayMetrics displayMetrics = e.this.f104417a.getResources().getDisplayMetrics();
                j jVar = e.this.f104421e;
                jVar.f104500a.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                jVar.a(jVar.f104500a, jVar.f104501b);
                int[] iArr = new int[2];
                ViewGroup viewGroupI = e.this.i();
                viewGroupI.getLocationOnScreen(iArr);
                j jVar2 = e.this.f104421e;
                int i10 = iArr[0];
                int i11 = iArr[1];
                jVar2.f104502c.set(i10, i11, viewGroupI.getWidth() + i10, viewGroupI.getHeight() + i11);
                jVar2.a(jVar2.f104502c, jVar2.f104503d);
                e.this.f104419c.getLocationOnScreen(iArr);
                e eVar = e.this;
                j jVar3 = eVar.f104421e;
                int i12 = iArr[0];
                int i13 = iArr[1];
                jVar3.f104506g.set(i12, i13, eVar.f104419c.getWidth() + i12, e.this.f104419c.getHeight() + i13);
                jVar3.a(jVar3.f104506g, jVar3.f104507h);
                c1296cB.getLocationOnScreen(iArr);
                j jVar4 = e.this.f104421e;
                int i14 = iArr[0];
                int i15 = iArr[1];
                jVar4.f104504e.set(i14, i15, c1296cB.getWidth() + i14, c1296cB.getHeight() + i15);
                jVar4.a(jVar4.f104504e, jVar4.f104505f);
                e eVar2 = e.this;
                eVar2.f104425i.a(eVar2.f104421e);
                if (e.this.f104426j.c()) {
                    e eVar3 = e.this;
                    eVar3.f104426j.a(eVar3.f104421e);
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        aVar.f104460d = aVar.f104457a.length;
        aVar.f104458b.post(aVar.f104461e);
    }

    @VisibleForTesting
    final void a(@NonNull String str) {
        MraidVideoActivity.a(this.f104417a, str);
    }

    @VisibleForTesting
    final void a(@NonNull String str, @Nullable sg.bigo.ads.common.i iVar) {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (MRAIDNativeFeature.TEL.equalsIgnoreCase(scheme) || "voicemail".equalsIgnoreCase(scheme) || MRAIDNativeFeature.SMS.equalsIgnoreCase(scheme) || "mailto".equalsIgnoreCase(scheme) || "geo".equalsIgnoreCase(scheme) || "google.streetview".equalsIgnoreCase(scheme)) {
            sg.bigo.ads.common.t.a.a(2, "MraidController", String.format("Uri scheme %s is not allowed.", uri.getScheme()));
            return;
        }
        b bVar = this.f104423g;
        if (bVar != null) {
            bVar.a(str, iVar);
        }
    }

    public final void a(@NonNull String str, @Nullable d dVar) {
        a(dVar);
        this.f104425i.a(str);
    }

    final void a(@Nullable String str, boolean z10) throws sg.bigo.ads.core.mraid.d {
        sg.bigo.ads.core.mraid.a.a aVar;
        c.C1296c c1296c;
        if (this.f104424h == null) {
            throw new sg.bigo.ads.core.mraid.d("Unable to expand after the WebView is destroyed");
        }
        if (this.f104418b == n.INTERSTITIAL) {
            return;
        }
        o oVar = this.f104422f;
        o oVar2 = o.DEFAULT;
        if (oVar == oVar2 || oVar == o.RESIZED) {
            n();
            boolean z11 = str != null;
            if (z11) {
                c.C1296c c1296cA = sg.bigo.ads.core.mraid.c.a(this.f104417a);
                this.f104432p = c1296cA;
                if (c1296cA == null) {
                    return;
                }
                this.f104426j.a(c1296cA);
                this.f104426j.b(str);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            o oVar3 = this.f104422f;
            if (oVar3 == oVar2) {
                this.f104435s = j().getSystemUiVisibility();
                j().setSystemUiVisibility(this.f104434r);
                if (z11) {
                    aVar = this.f104420d;
                    c1296c = this.f104432p;
                } else {
                    this.f104427k.a();
                    this.f104419c.removeView(this.f104424h);
                    this.f104419c.setVisibility(4);
                    aVar = this.f104420d;
                    c1296c = this.f104424h;
                }
                aVar.addView(c1296c, layoutParams);
                j().addView(this.f104420d, new FrameLayout.LayoutParams(-1, -1));
            } else if (oVar3 == o.RESIZED && z11) {
                this.f104420d.removeView(this.f104424h);
                this.f104419c.addView(this.f104424h, layoutParams);
                this.f104419c.setVisibility(4);
                this.f104420d.addView(this.f104432p, layoutParams);
            }
            this.f104420d.setLayoutParams(layoutParams);
            b(z10);
            a(o.EXPANDED);
        }
    }

    public final void a(@Nullable d dVar) {
        c.C1296c c1296cA = sg.bigo.ads.core.mraid.c.a(this.f104417a);
        this.f104424h = c1296cA;
        if (c1296cA == null) {
            return;
        }
        if (dVar != null) {
            dVar.a();
        }
        this.f104425i.a(this.f104424h);
        this.f104419c.addView(this.f104424h, new FrameLayout.LayoutParams(-1, -1));
    }

    final void a(@NonNull o oVar) {
        sg.bigo.ads.common.t.a.a(0, 3, "MraidController", "MRAID state set to ".concat(String.valueOf(oVar)));
        o oVar2 = this.f104422f;
        this.f104422f = oVar;
        this.f104425i.a(oVar);
        sg.bigo.ads.core.mraid.c cVar = this.f104426j;
        if (cVar.f104400d) {
            cVar.a(oVar);
        }
        b bVar = this.f104423g;
        if (bVar != null) {
            o oVar3 = o.EXPANDED;
            if (oVar == oVar3) {
                bVar.d();
            } else if ((oVar2 == oVar3 && oVar == o.DEFAULT) || oVar == o.HIDDEN) {
                bVar.f();
            } else {
                o oVar4 = o.RESIZED;
                if ((oVar2 == oVar4 && oVar == o.DEFAULT) || oVar == oVar4) {
                    bVar.e();
                }
            }
        }
        a((Runnable) null);
    }

    public final void a(boolean z10) {
        this.f104439w = true;
        q();
        c.C1296c c1296c = this.f104424h;
        if (c1296c != null) {
            a(c1296c, z10);
        }
        c.C1296c c1296c2 = this.f104432p;
        if (c1296c2 != null) {
            a(c1296c2, z10);
        }
    }

    @VisibleForTesting
    final void a(boolean z10, i iVar) throws sg.bigo.ads.core.mraid.d {
        if (!a(iVar)) {
            throw new sg.bigo.ads.core.mraid.d("Unable to force orientation to ".concat(String.valueOf(iVar)));
        }
        this.f104436t = z10;
        this.f104437u = iVar;
        if (this.f104422f == o.EXPANDED || (this.f104418b == n.INTERSTITIAL && !this.f104439w)) {
            n();
        }
    }

    @VisibleForTesting
    final boolean a() {
        l lVar = this.f104431o;
        if (lVar != null) {
            return lVar.b();
        }
        return true;
    }

    private static boolean a(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    @VisibleForTesting
    final boolean a(@NonNull JsResult jsResult) {
        l lVar = this.f104431o;
        if (lVar != null) {
            return lVar.a();
        }
        jsResult.confirm();
        return true;
    }

    @VisibleForTesting
    private boolean a(i iVar) {
        ActivityInfo activityInfo;
        if (iVar == i.NONE) {
            return true;
        }
        Activity activity = this.f104428l.get();
        if (activity == null) {
            return false;
        }
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return a(activityInfo.configChanges, 128) && a(activityInfo.configChanges, 1024);
    }
}
