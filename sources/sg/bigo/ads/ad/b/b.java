package sg.bigo.ads.ad.b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.adsession.media.InteractionType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.ad.d;
import sg.bigo.ads.api.AdIconView;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.NativeAdView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.m;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.adview.h;
import sg.bigo.ads.core.c.c;

/* JADX INFO: loaded from: classes4.dex */
public class b extends d<NativeAd, sg.bigo.ads.core.a.a> implements NativeAd, h {
    protected InterfaceC1207b A;
    protected final View.OnAttachStateChangeListener B;

    @Nullable
    protected sg.bigo.ads.core.c.b C;
    protected ViewGroup D;
    public MediaView E;
    protected g F;
    protected a G;
    public int H;
    private long I;
    private sg.bigo.ads.common.view.c J;
    private int K;
    private final Map<Integer, Integer> L;
    private WeakReference<Activity> O;
    private boolean P;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected long f100197z;

    public interface a {
        void a();
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.b.b$b, reason: collision with other inner class name */
    public interface InterfaceC1207b {
        void a();

        void b();
    }

    public b(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
        this.f100197z = -1L;
        this.I = -1L;
        this.B = new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.ad.b.b.1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                b.this.f100197z = SystemClock.elapsedRealtime();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                b.this.I = SystemClock.elapsedRealtime();
                view.removeOnAttachStateChangeListener(this);
            }
        };
        this.F = null;
        this.G = null;
        this.H = 0;
        this.L = new HashMap();
        this.P = false;
    }

    private boolean G() {
        int iX = ((sg.bigo.ads.core.a.a) f()).x();
        return iX == 1 || iX == 15 || iX == 16 || iX == 17 || iX == 18 || this.f100352s == 2;
    }

    protected void A() {
        InterfaceC1207b interfaceC1207b = this.A;
        if (interfaceC1207b != null) {
            interfaceC1207b.a();
        }
    }

    protected final void B() {
        InterfaceC1207b interfaceC1207b = this.A;
        if (interfaceC1207b != null) {
            interfaceC1207b.b();
        }
    }

    public final sg.bigo.ads.common.view.c C() {
        sg.bigo.ads.common.view.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        String str = this.X.f102123g;
        if (q.a((CharSequence) str)) {
            return null;
        }
        sg.bigo.ads.common.view.c cVar2 = new sg.bigo.ads.common.view.c(this.f100335b.f102179f, str);
        this.J = cVar2;
        return cVar2;
    }

    protected List<sg.bigo.ads.core.c.a> D() {
        return sg.bigo.ads.ad.b.a.a(((sg.bigo.ads.core.a.a) f()).G());
    }

    protected boolean F() {
        return false;
    }

    public void b(Activity activity) {
        this.O = new WeakReference<>(activity);
    }

    public final void c(int i10) {
        ((sg.bigo.ads.core.a.a) f()).f(i10);
        this.f100352s = i10;
    }

    public final void d(int i10) {
        this.L.put(Integer.valueOf(this.K), Integer.valueOf(this.f100348o));
        this.K = i10;
        Integer num = this.L.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        this.f100348o = num.intValue();
    }

    @Override // sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        sg.bigo.ads.core.c.b bVar = this.C;
        if (bVar != null) {
            bVar.b();
        }
        this.f100336c = null;
        this.D = null;
        MediaView mediaView = this.E;
        if (mediaView != null) {
            mediaView.c();
            this.E = null;
        }
        sg.bigo.ads.common.view.c cVar = this.J;
        if (cVar != null) {
            u.b(cVar);
            this.J = null;
        }
        this.F = null;
        this.G = null;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getAdvertiser() {
        return ((sg.bigo.ads.core.a.a) f()).i();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getCallToAction() {
        return ((sg.bigo.ads.core.a.a) f()).u();
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getCreativeId() {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        return aVar != null ? aVar.z() : "";
    }

    @Override // sg.bigo.ads.api.NativeAd
    public NativeAd.CreativeType getCreativeType() {
        return NativeAd.CreativeType.IMAGE;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getDescription() {
        return ((sg.bigo.ads.core.a.a) f()).t();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public float getMediaContentAspectRatio() {
        if (sg.bigo.ads.ad.b.a.a(this).a()) {
            return (r0.getWidth() * 1.0f) / r0.getHeight();
        }
        return 0.0f;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public b.d getPopPage() {
        return ((sg.bigo.ads.core.a.a) f()).q();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getSponsored() {
        return ((sg.bigo.ads.core.a.a) f()).au();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getTitle() {
        return ((sg.bigo.ads.core.a.a) f()).s();
    }

    @Override // sg.bigo.ads.api.NativeAd
    @Nullable
    public VideoController getVideoController() {
        return null;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getWarning() {
        b.e eVarB = ((sg.bigo.ads.core.a.a) f()).B();
        return eVarB != null ? eVarB.c() : "";
    }

    @Override // sg.bigo.ads.ad.c
    public void h() {
        super.h();
        sg.bigo.ads.core.c.b bVar = this.C;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // sg.bigo.ads.api.NativeAd
    public boolean hasIcon() {
        n.a aVarAv = ((sg.bigo.ads.core.a.a) f()).av();
        return (aVarAv == null || q.a((CharSequence) aVarAv.c())) ? false : true;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, @Nullable MediaView mediaView, @Nullable ImageView imageView, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list) {
        if (a(viewGroup)) {
            a(viewGroup, mediaView, (View) imageView, adOptionsView, list, 1, null);
        }
    }

    @Override // sg.bigo.ads.core.adview.h
    public final void a(int i10, int i11, int i12, int i13, int i14, int i15) {
        i iVar = new i();
        iVar.f102538b = new Point(i10, i11);
        iVar.f102537a = new Point(i12, i13);
        b(iVar, i14, i15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void b(i iVar, int i10, int i11) {
        Activity activityB;
        Activity activity;
        sg.bigo.ads.api.core.d dVarA;
        int i12;
        int i13;
        ViewGroup viewGroup;
        String str;
        String str2;
        String str3;
        if (x()) {
            str3 = "Styleable landing page is opened, ignore the click action.";
        } else {
            if (this.f100357x) {
                sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
                WeakReference<Activity> weakReference = this.O;
                Activity activityA = null;
                if (weakReference == null || (activityB = weakReference.get()) == null) {
                    activityB = null;
                } else {
                    sg.bigo.ads.common.t.a.a(0, 3, "NativeStaticAdImpl", "Interstitial/Reward Video/Splash native ad get activity context from show(Activity activity).");
                    b(1);
                }
                if (activityB == null) {
                    sg.bigo.ads.api.a.h hVar = sg.bigo.ads.api.a.i.f102116a;
                    if (this.P) {
                        if (hVar != null && hVar.n().a(16)) {
                            activityB = sg.bigo.ads.common.f.b.b();
                            if (activityB == null) {
                                str2 = "Interstitial/Reward Video/Splash native ad failed to get activity context.";
                                sg.bigo.ads.common.t.a.a(0, "NativeStaticAdImpl", str2);
                            } else {
                                str = "Interstitial/Reward Video/Splash native ad get activity context from current activity.";
                                sg.bigo.ads.common.t.a.a(0, 3, "NativeStaticAdImpl", str);
                                b(2);
                            }
                        }
                    } else if (hVar != null && hVar.n().a(17)) {
                        try {
                            Activity activityA2 = sg.bigo.ads.common.utils.c.a(this.D);
                            if (activityA2 != null) {
                                try {
                                    sg.bigo.ads.common.t.a.a(0, 3, "NativeStaticAdImpl", "Native ad get activity context from view.");
                                    b(3);
                                } catch (Exception unused) {
                                }
                                activityB = activityA2;
                            }
                        } catch (Exception unused2) {
                        }
                        if (activityB == null) {
                            activityB = sg.bigo.ads.common.f.b.b();
                            if (activityB == null) {
                                str2 = "Native ad failed to get activity context.";
                                sg.bigo.ads.common.t.a.a(0, "NativeStaticAdImpl", str2);
                            } else {
                                str = "Native ad get activity context from current activity.";
                                sg.bigo.ads.common.t.a.a(0, 3, "NativeStaticAdImpl", str);
                                b(2);
                            }
                        }
                    }
                }
                if (activityB == null) {
                    activityB = this.f100335b.f102178e;
                }
                boolean z10 = this instanceof sg.bigo.ads.api.b.f;
                boolean z11 = !z10 && aVar.a(16);
                if (z11 && (viewGroup = this.D) != null) {
                    activityA = sg.bigo.ads.common.utils.c.a(viewGroup);
                }
                if (aVar.f().c() != 0) {
                    sg.bigo.ads.controller.landing.e.a(activityB, this);
                    dVarA = new sg.bigo.ads.api.core.d();
                    dVarA.f102167k = 1;
                    activity = activityA;
                    i13 = i11;
                    i12 = i10;
                } else {
                    b.InterfaceC1253b interfaceC1253bN = aVar.N();
                    String strA = interfaceC1253bN.a();
                    if (z10) {
                        ((sg.bigo.ads.api.b.f) this).L();
                    }
                    activity = activityA;
                    dVarA = sg.bigo.ads.controller.landing.e.a(activityB, activity, interfaceC1253bN.b(), sg.bigo.ads.controller.landing.e.a(strA, aVar.bn(), aVar.bo()), interfaceC1253bN.g(), aVar.a(2), interfaceC1253bN.c(), interfaceC1253bN.d(), this, aVar.ar(), z11);
                    dVarA.f102167k = 0;
                    i12 = i10;
                    i13 = i11;
                }
                a(iVar, i13, i12, dVarA);
                sg.bigo.ads.core.c.b bVar = this.C;
                if (bVar != null) {
                    bVar.a(InteractionType.CLICK);
                }
                if (dVarA.f102160d < 0 || !G()) {
                    return;
                }
                a(new sg.bigo.ads.controller.landing.c(dVarA.f102160d, dVarA.f102161e));
                sg.bigo.ads.controller.landing.e.a(activity, (sg.bigo.ads.ad.c) this);
                return;
            }
            str3 = "ignore the click action.";
        }
        sg.bigo.ads.common.t.a.a(0, "NativeStaticAdImpl", str3);
    }

    @Override // sg.bigo.ads.api.NativeAd
    public void registerViewForInteraction(NativeAdView nativeAdView, @Nullable MediaView mediaView, @Nullable AdIconView adIconView, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list) {
        if (a(nativeAdView)) {
            a(nativeAdView, mediaView, adIconView, adOptionsView, list, 1, null);
        }
    }

    @Override // sg.bigo.ads.ad.c
    public void a(Point point, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        super.a(point, i10, i11, dVar);
        a aVar = this.G;
        if (aVar != null) {
            aVar.a();
        }
    }

    @CallSuper
    protected void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable View view, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i10, @Nullable View... viewArr) {
        this.D = viewGroup;
        viewGroup.setTag(11);
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        if (aVar.x() != 2) {
            sg.bigo.ads.common.view.c cVar = this.J;
            if (cVar != null) {
                cVar.bringToFront();
            } else {
                sg.bigo.ads.common.view.c.a(this.f100335b.f102178e, viewGroup, C());
            }
        }
        if (C() != null) {
            View[] viewArr2 = {this.J};
            if (viewArr == null || viewArr.length == 0) {
                viewArr = viewArr2;
            } else {
                View[] viewArr3 = (View[]) Arrays.copyOf(viewArr, viewArr.length + 1);
                System.arraycopy(viewArr2, 0, viewArr3, viewArr.length, 1);
                viewArr = viewArr3;
            }
        }
        int i11 = a(viewGroup, view, i10) ? 5 : 1;
        if (adOptionsView != null) {
            adOptionsView.setTag(4);
            if (a(viewGroup, adOptionsView)) {
                adOptionsView.a(aVar, aVar.l());
                i11 |= 8;
            }
        }
        if (mediaView != null) {
            mediaView.setTag(5);
            if (a(viewGroup, mediaView)) {
                a(mediaView);
                sg.bigo.ads.ad.b.a.a(viewGroup, mediaView, i10, this, this.H);
                i11 |= 2;
                this.E = mediaView;
            }
        }
        for (View view2 : sg.bigo.ads.ad.b.a.b(list)) {
            if (view2 != null) {
                sg.bigo.ads.ad.b.a.a(viewGroup, view2, i10, this, this.H);
            }
        }
        this.C = c.a.f104007a.a(D(), F(), this.D, viewArr);
        a("render_style", Integer.valueOf(i11));
        v();
        this.f100336c = viewGroup;
        d.a.a(((sg.bigo.ads.ad.d) this).f100435y);
    }

    public void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable ImageView imageView, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i10, @Nullable View... viewArr) {
        a(viewGroup, mediaView, (View) imageView, adOptionsView, list, i10, viewArr);
    }

    public final void a(a aVar) {
        this.G = aVar;
    }

    public final void a(InterfaceC1207b interfaceC1207b) {
        this.A = interfaceC1207b;
    }

    protected void a(@Nullable MediaView mediaView) {
        if (mediaView == null) {
            return;
        }
        final sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        if (this.f100335b.f102175b.e() == 2) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.F = new g() { // from class: sg.bigo.ads.ad.b.b.4
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i10, @NonNull String str, String str2) {
                    sg.bigo.ads.core.a.a aVar2 = aVar;
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) aVar2, aVar2.aT(), str, SystemClock.elapsedRealtime() - jElapsedRealtime, 0L, 1, str2, false);
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                    sg.bigo.ads.core.a.a aVar2 = aVar;
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) aVar2, aVar2.aT(), fVar.f102679a, SystemClock.elapsedRealtime() - jElapsedRealtime, fVar.f102681c, 0, 1, fVar.f102680b, false);
                }
            };
        }
        mediaView.a(aVar, this.F);
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.d
    public final void a(@NonNull d.a<NativeAd> aVar) {
        super.a(aVar);
        a(aVar, this.f100335b.f102175b.e());
    }

    public void a(@NonNull final d.a<NativeAd> aVar, int i10) {
        A();
        final sg.bigo.ads.core.a.a aVar2 = (sg.bigo.ads.core.a.a) f();
        final String strAT = aVar2.aT();
        if (q.a((CharSequence) strAT)) {
            aVar.a(this, 1027, 1300, "Missing media image.");
            return;
        }
        if (sg.bigo.ads.api.a.i.f102116a.n().a(9) && URLUtil.isHttpUrl(strAT)) {
            aVar.a(this, 1028, 1305, "Invalid http url");
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) aVar2, strAT, "Invalid http url", 0L, 0L, 1, "", false);
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (i10 == 0) {
            sg.bigo.ads.common.p.e.a(this.f100335b.f102178e, strAT, aVar2.al(), new g() { // from class: sg.bigo.ads.ad.b.b.2
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i11, @NonNull String str, String str2) {
                    aVar2.c(str2);
                    aVar.a(b.this, 1029, i11, "Failed to download media image: ".concat(String.valueOf(str)));
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) aVar2, strAT, str, SystemClock.elapsedRealtime() - jElapsedRealtime, 0L, 1, str2, false);
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                    aVar2.c(fVar.f102680b);
                    m mVar = new m();
                    mVar.f102207a = bitmap.getWidth();
                    mVar.f102208b = bitmap.getHeight();
                    mVar.f102210d = fVar.f102681c;
                    aVar2.a(mVar);
                    b.this.a(bitmap, 2);
                    b.this.a("is_cache", Boolean.valueOf(fVar.f102679a != 1));
                    aVar.a(b.this);
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) aVar2, strAT, fVar.f102679a, SystemClock.elapsedRealtime() - jElapsedRealtime, fVar.f102681c, 0, 1, fVar.f102680b, false);
                }
            });
            return;
        }
        if (i10 == 1) {
            sg.bigo.ads.common.p.e.a(this.f100335b.f102178e, strAT, aVar2.al(), new g() { // from class: sg.bigo.ads.ad.b.b.3
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i11, @NonNull String str, String str2) {
                    aVar2.c(str2);
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) aVar2, strAT, str, SystemClock.elapsedRealtime() - jElapsedRealtime, 0L, 1, str2, false);
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                    aVar2.c(fVar.f102680b);
                    m mVar = new m();
                    mVar.f102207a = bitmap.getWidth();
                    mVar.f102208b = bitmap.getHeight();
                    mVar.f102210d = fVar.f102681c;
                    aVar2.a(mVar);
                    b.this.a(bitmap, 2);
                    sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) aVar2, strAT, fVar.f102679a, SystemClock.elapsedRealtime() - jElapsedRealtime, fVar.f102681c, 0, 1, fVar.f102680b, false);
                }
            });
        }
        aVar.a(this);
    }

    public final void a(i iVar, int i10, int i11) {
        b(iVar, i10, i11);
    }

    public void a(boolean z10) {
        this.P = z10;
    }

    private boolean a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            a(2001, "NativeAdView cannot be null.");
            return false;
        }
        if (isExpired()) {
            b(2000, 1, "The ad is expired.");
            return false;
        }
        if (!this.f100342i) {
            return true;
        }
        b(2000, 1, "The ad is destroyed.");
        return false;
    }

    protected static boolean a(ViewGroup viewGroup, View view) {
        Object tag = view.getTag();
        return (tag == null || viewGroup.findViewWithTag(tag) == null) ? false : true;
    }

    protected boolean a(@NonNull ViewGroup viewGroup, View view, int i10) {
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) f();
        if (view != null && aVar != null) {
            view.setTag(1);
            if (a(viewGroup, view)) {
                n.a aVarAv = aVar.av();
                if (aVarAv != null) {
                    String strC = aVarAv.c();
                    if (sg.bigo.ads.api.a.i.f102116a.n().a(9) && URLUtil.isHttpUrl(strC)) {
                        sg.bigo.ads.core.d.b.a(aVar, 3000, 10220, "Invalid http url: ".concat(String.valueOf(strC)));
                    } else if (view instanceof ImageView) {
                        new sg.bigo.ads.common.p.b((ImageView) view, (byte) 0).a(null, aVarAv.c(), aVar.al());
                    } else if (view instanceof AdIconView) {
                        ((AdIconView) view).a(aVarAv.c(), aVar.al());
                    }
                }
                sg.bigo.ads.ad.b.a.a(viewGroup, view, i10, this, this.H);
                return true;
            }
        }
        return false;
    }
}
