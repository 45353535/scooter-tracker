package sg.bigo.ads.ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.taurusx.tax.f.t;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.pubnative.lite.sdk.analytics.Reporting;
import sg.bigo.ads.ad.a;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.common.f.b;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.controller.landing.a;
import sg.bigo.ads.core.e.a.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c<T extends Ad, U extends sg.bigo.ads.api.core.b> extends sg.bigo.ads.api.b.a<T, U> implements b.a {
    private boolean A;
    private long B;
    private AdBid C;
    private final Set<String> D;
    private final Set<String> E;
    private final Map<String, Object> F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    protected AdInteractionListener f100334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public f f100335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    protected View f100336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.core.e.a.b f100337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f100338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f100339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f100340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f100341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f100342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f100343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected long f100344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f100345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public sg.bigo.ads.controller.landing.a f100346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f100347n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f100348o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f100349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f100350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected sg.bigo.ads.controller.landing.c f100351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f100352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f100353t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f100354u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f100355v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public WeakReference<a> f100356w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f100357x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f100358y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f100359z;

    public interface a {
        LandingPageStyleConfig a(Context context, String str, int i10, boolean z10);

        boolean f_();
    }

    public c(@NonNull f fVar) {
        super(fVar.f102176c);
        this.f100338e = false;
        this.f100358y = false;
        this.f100339f = false;
        this.f100359z = false;
        this.f100340g = false;
        this.A = false;
        this.f100341h = false;
        this.f100342i = false;
        this.f100343j = false;
        this.D = new HashSet();
        this.E = new HashSet();
        this.f100350q = false;
        this.f100353t = -1;
        this.f100354u = 0L;
        this.f100355v = 0L;
        this.F = new HashMap();
        this.f100357x = true;
        this.f100335b = fVar;
        A();
        B();
        this.Y = new sg.bigo.ads.common.v.a();
    }

    private void A() {
        sg.bigo.ads.api.core.b bVar = this.f100335b.f102174a;
        q qVarM = i.f102116a.m();
        b.f[] fVarArrC = bVar.C();
        e[] eVarArr = new e[0];
        if (fVarArrC != null && fVarArrC.length > 0) {
            eVarArr = new e[fVarArrC.length];
            for (int i10 = 0; i10 < fVarArrC.length; i10++) {
                eVarArr[i10] = new e(fVarArrC[i10].a(), this.f100335b.f102177d);
            }
        }
        b.f[] fVarArrD = bVar.D();
        e[] eVarArr2 = new e[0];
        if (fVarArrD != null && fVarArrD.length > 0) {
            eVarArr2 = new e[fVarArrD.length];
            for (int i11 = 0; i11 < fVarArrD.length; i11++) {
                eVarArr2[i11] = new e(fVarArrD[i11].a(), this.f100335b.f102177d);
            }
        }
        b.f[] fVarArrE = bVar.E();
        e[] eVarArr3 = new e[0];
        if (fVarArrE != null && fVarArrE.length > 0) {
            eVarArr3 = new e[fVarArrE.length];
            for (int i12 = 0; i12 < fVarArrE.length; i12++) {
                eVarArr3[i12] = new e(fVarArrE[i12].a(), this.f100335b.f102177d);
            }
        }
        b.f[] fVarArrF = bVar.F();
        e[] eVarArr4 = new e[0];
        if (fVarArrF != null && fVarArrF.length > 0) {
            eVarArr4 = new e[fVarArrF.length];
            for (int i13 = 0; i13 < fVarArrF.length; i13++) {
                eVarArr4[i13] = new e(fVarArrF[i13].a(), this.f100335b.f102177d);
            }
        }
        sg.bigo.ads.core.e.a.b bVarA = a(qVarM, eVarArr, eVarArr2, eVarArr3, eVarArr4);
        this.f100337d = bVarA;
        bVarA.b("express_id", bVar.ab());
    }

    private void B() {
        this.f100338e = false;
        this.f100358y = false;
        this.f100339f = false;
        this.f100359z = false;
        this.f100340g = false;
        this.A = false;
        this.f100341h = false;
        this.f100342i = false;
        this.f100344k = 0L;
        this.f100345l = 0L;
        this.C = null;
        this.f100343j = false;
        this.f102139ab = 0;
    }

    private int C() {
        b.a aVarO = this.f100335b.f102174a.O();
        if (aVarO != null) {
            return aVarO.a();
        }
        return 0;
    }

    private long D() {
        if (this.f100335b.f102174a.O() != null) {
            return r0.b();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        try {
            sg.bigo.ads.controller.landing.a aVar = this.f100346m;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable unused) {
        }
    }

    @NonNull
    protected sg.bigo.ads.core.e.a.b a(q qVar, e[] eVarArr, e[] eVarArr2, e[] eVarArr3, e[] eVarArr4) {
        return new sg.bigo.ads.core.e.a.b(qVar, eVarArr, eVarArr2, eVarArr3, eVarArr4, sg.bigo.ads.core.d.b.c(this.f100335b.f102174a, this));
    }

    public void a_() {
        if (isExpired() || this.f100342i) {
            b(2000, 2, this.f100342i ? "The ad is destroyed" : "The ad is expired");
            return;
        }
        if (this.A) {
            return;
        }
        this.A = true;
        this.f100344k = SystemClock.elapsedRealtime();
        h();
        AdInteractionListener adInteractionListener = this.f100334a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdImpression();
        }
    }

    @NonNull
    public <ValueType> ValueType b(String str, ValueType valuetype) {
        ValueType valuetype2 = (ValueType) this.F.get(str);
        return valuetype2 != null ? valuetype2 : valuetype;
    }

    @Override // sg.bigo.ads.api.b.a
    public final void c() {
        if (this.f100338e) {
            return;
        }
        this.f100338e = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f100345l = jElapsedRealtime;
        sg.bigo.ads.api.b.a aVar = this.f102138aa;
        if (aVar instanceof c) {
            ((c) aVar).f100345l = jElapsedRealtime;
        }
        if (this.f100335b.f102174a.ah()) {
            return;
        }
        d("filled");
        if (this.f100335b.f102174a.N().k() == 1) {
            u();
        }
        if (this.f100335b.f102174a.N().c() == 2) {
            sg.bigo.ads.a.c.a(this.f100335b.f102178e);
        }
        sg.bigo.ads.common.f.b.a(this);
    }

    @Override // sg.bigo.ads.api.b.a
    public final String d() {
        return f().H();
    }

    @Override // sg.bigo.ads.api.Ad
    @CallSuper
    public final void destroy() {
        this.f100342i = true;
        if (sg.bigo.ads.common.n.d.b()) {
            F();
            destroyInMainThread();
        } else {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.F();
                    c.this.destroyInMainThread();
                }
            });
        }
        if (this.f100343j) {
            sg.bigo.ads.common.form.a.a(f().hashCode(), 4);
        }
        sg.bigo.ads.common.form.a.b(f().hashCode());
        setAdInteractionListener(null);
        sg.bigo.ads.common.f.b.b(this);
    }

    @MainThread
    protected void destroyInMainThread() {
    }

    @Override // sg.bigo.ads.api.b.a
    public final long e() {
        return f().a();
    }

    @Override // sg.bigo.ads.api.b.a
    @NonNull
    public U f() {
        return (U) this.f100335b.f102174a;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public AdBid getBid() {
        if (this.C == null) {
            f fVar = this.f100335b;
            sg.bigo.ads.api.core.b bVar = fVar.f102174a;
            this.C = bVar.ak() ? new a.C1203a(fVar, bVar, this.f100337d) : null;
        }
        return this.C;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getExtraInfo(String str) {
        f fVar = this.f100335b;
        sg.bigo.ads.api.core.b bVar = fVar != null ? fVar.f102174a : null;
        return bVar != null ? bVar.b(str) : "";
    }

    protected void h() {
        int i10;
        n();
        int i11 = this.Z;
        int i12 = sg.bigo.ads.common.v.a.f102849e;
        if (i11 != i12) {
            sg.bigo.ads.common.v.a aVar = this.Y;
            View view = this.f100336c;
            if (aVar.f102851g == i12) {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 4 - start activity from background");
                i10 = sg.bigo.ads.common.v.a.f102849e;
            } else if (sg.bigo.ads.common.v.a.a(view)) {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 5 - Lock screen");
                i10 = sg.bigo.ads.common.v.a.f102850f;
            } else if (sg.bigo.ads.common.v.a.b(view)) {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 3 - Float window");
                i10 = sg.bigo.ads.common.v.a.f102848d;
            } else {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 1 - not outside app");
                i10 = sg.bigo.ads.common.v.a.f102846b;
            }
            this.Z = i10;
        }
        this.f100337d.a(this.Z);
        this.f100337d.a(this.f100335b.f102178e, i());
        if (a("06002010")) {
            sg.bigo.ads.core.d.b.a(this.f100335b.f102178e, this, (String) b("show_proportion", ""), j(), ((Integer) b("render_style", 0)).intValue(), w(), ((Long) b("attach_render_cost", -1L)).longValue(), SystemClock.elapsedRealtime() - this.f100345l, ((Integer) b("icon_sta", -1)).intValue(), ((Integer) b("img_sta", -1)).intValue(), ((Integer) b("vid_sta", -1)).intValue());
        }
        if (this.f100335b.f102174a.N().k() == 0) {
            u();
        }
    }

    protected int i() {
        return 0;
    }

    @Override // sg.bigo.ads.api.Ad
    public boolean isExpired() {
        return this.f100335b.f102174a.J();
    }

    public String j() {
        if (this.f100336c == null) {
            return "";
        }
        return this.f100336c.getWidth() + "x" + this.f100336c.getHeight();
    }

    protected int k() {
        return 0;
    }

    protected final void l() {
        AdInteractionListener adInteractionListener = this.f100334a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdOpened();
        }
    }

    @CallSuper
    protected void m() {
        AdInteractionListener adInteractionListener = this.f100334a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClosed();
        }
        this.f100341h = true;
    }

    protected void n() {
        d("impression");
    }

    protected void o() {
        d(Reporting.EventType.VIDEO_AD_CLICKED);
    }

    public boolean p() {
        return this.A;
    }

    protected final int q() {
        return this.f100335b.f102175b.b();
    }

    protected final int r() {
        return this.f100335b.f102174a.w();
    }

    public final int s() {
        if (this.f100355v != f().y()) {
            return -1;
        }
        return this.f100353t;
    }

    @Override // sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    @CallSuper
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.f100334a = adInteractionListener;
    }

    public final long t() {
        if (this.f100355v != f().y()) {
            return 0L;
        }
        return this.f100354u;
    }

    public void u() {
        if (this.f100335b.f102174a.N().f() > 0) {
            final sg.bigo.ads.controller.landing.a aVar = new sg.bigo.ads.controller.landing.a(this.f100335b.f102174a);
            this.f100346m = aVar;
            final Context context = this.f100335b.f102178e;
            final String strA = aVar.f103729b.a();
            final String strJ = aVar.f103729b.j();
            final int iC = aVar.f103729b.c();
            int i10 = aVar.f103730c;
            if (((i10 == 4 || i10 == 5) && TextUtils.isEmpty(strJ)) || sg.bigo.ads.core.landing.a.a(strA) || TextUtils.isEmpty(strA) || !strA.startsWith("http")) {
                return;
            }
            if (iC == 0 || iC == 2) {
                final a.InterfaceC1284a interfaceC1284a = new a.InterfaceC1284a() { // from class: sg.bigo.ads.controller.landing.a.3
                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC1284a
                    public final void a(String str) {
                        sg.bigo.ads.common.t.a.a(0, 3, "Preload", "preloadWebView onStart preloadType = " + a.this.f103730c + ", url = " + str);
                    }

                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC1284a
                    public final void a(String str, long j10, boolean z10, int i11) {
                        a.this.f103731d = z10;
                        HashMap map = new HashMap();
                        map.put("land_way", String.valueOf(i11));
                        sg.bigo.ads.core.d.b.a(a.this.f103728a, "preload_cost", j10, z10 ? 1 : 0, map);
                        sg.bigo.ads.common.t.a.a(0, 3, "Preload", "preload landing page onComplete preloadType=" + a.this.f103730c + ", success = " + z10 + ", cost = " + j10 + ", url = " + str);
                        if (z10) {
                            return;
                        }
                        a.this.a();
                    }
                };
                sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.controller.landing.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a aVar2 = a.this;
                        int i11 = aVar2.f103730c;
                        if (i11 != 1) {
                            if (i11 == 4 || i11 == 5) {
                                a.a(aVar2, context, strJ, iC, interfaceC1284a);
                                return;
                            }
                            return;
                        }
                        Uri uri = Uri.parse(strA);
                        a.a(a.this, context, uri.getScheme() + "://" + uri.getHost(), iC, interfaceC1284a);
                    }
                });
            }
        }
    }

    protected final void v() {
        if (this.f100359z) {
            return;
        }
        this.f100359z = true;
        this.B = SystemClock.elapsedRealtime();
    }

    public final long w() {
        if (this.B == 0) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.B;
    }

    protected final boolean x() {
        WeakReference<a> weakReference = this.f100356w;
        return (weakReference == null || weakReference.get() == null || !this.f100356w.get().f_()) ? false : true;
    }

    public sg.bigo.ads.controller.landing.c y() {
        return this.f100351r;
    }

    private void d(String str) {
        if (this.D.contains(str)) {
            sg.bigo.ads.common.t.a.a(0, 3, t.f66040o, "ignore callback action, action = ".concat(String.valueOf(str)));
            return;
        }
        sg.bigo.ads.api.core.b bVarF = f();
        Map<String, Object> mapA = sg.bigo.ads.core.b.a.a(str, this.f100335b.f102175b, this.X, bVarF, Integer.valueOf(bVarF.aj()), null, null, this);
        str.getClass();
        if (str.equals("impression") || str.equals(Reporting.EventType.VIDEO_AD_CLICKED)) {
            mapA.put(Reporting.Key.AD_SIZE, j());
            mapA.put("show_proportion", b("show_proportion", ""));
            mapA.put("render_style", b("render_style", 0));
        }
        sg.bigo.ads.core.b.b.a().a(str, mapA);
    }

    public void a() {
        A();
        B();
    }

    @Override // sg.bigo.ads.api.b.a
    public final void b() {
        if (this.f100358y) {
            return;
        }
        this.f100358y = true;
        this.f100335b.f102176c.f102124h.b();
        if (a("06002008")) {
            sg.bigo.ads.core.d.b.a(this, ((Boolean) b("is_cache", Boolean.FALSE)).booleanValue());
        }
    }

    public final void c(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        this.E.add(str);
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(int i10, int i11, String str) {
        if (this.f100339f) {
            return;
        }
        this.f100339f = true;
        this.f100335b.f102176c.f102124h.b();
        if (!this.f100335b.f102174a.ah() && a("06002008")) {
            sg.bigo.ads.core.d.b.a(this, i10, i11, str);
        }
    }

    public final void b(int i10, int i11, String str) {
        AdError adError = new AdError(i10, i11, str);
        a(i10, i11, str, true);
        AdInteractionListener adInteractionListener = this.f100334a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdError(adError);
        }
    }

    public final void a(int i10, int i11, String str, boolean z10) {
        sg.bigo.ads.core.d.b.a(this.f100335b.f102174a, new AdError(i10, i11, str), p(), z10);
    }

    public final void b(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        this.D.add(str);
    }

    public final void a(int i10, String str) {
        b(i10, 0, str);
    }

    @Override // sg.bigo.ads.common.f.b.a
    public final void a(Activity activity) {
        Intent intent;
        if (activity != null && (activity instanceof AdActivity) && (intent = activity.getIntent()) != null && intent.getIntExtra("ad_identifier", -1) == hashCode() && intent.getBooleanExtra("create_error_flag", false)) {
            String stringExtra = intent.getStringExtra("create_error_msg");
            b(2005, 0, "Activity create error");
            sg.bigo.ads.core.d.b.a(f(), 3000, 10117, stringExtra);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void b(@Nullable sg.bigo.ads.common.i iVar, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        String str;
        this.f100349p = i10;
        boolean z10 = (i11 == 13 || i11 == 14) && (this instanceof sg.bigo.ads.api.b.f);
        if (!this.f100340g && (!this.f100342i || z10)) {
            this.f100340g = true;
            a(iVar != null ? iVar.f102538b : null, i10, i11, dVar);
        }
        long jElapsedRealtime = this.f100344k > 0 ? SystemClock.elapsedRealtime() - this.f100344k : 0L;
        String str2 = "";
        if (iVar == null || iVar.f102538b == null) {
            str = "";
        } else {
            str = iVar.f102538b.x + StringUtils.COMMA + iVar.f102538b.y;
        }
        if (iVar != null && iVar.f102537a != null) {
            str2 = iVar.f102537a.x + StringUtils.COMMA + iVar.f102537a.y;
        }
        if (a("06002011")) {
            String strA = !TextUtils.isEmpty(dVar.f102163g) ? dVar.f102163g : f().N().a();
            f fVar = this.f100335b;
            Context context = fVar.f102178e;
            sg.bigo.ads.api.core.b bVar = fVar.f102174a;
            String strJ = j();
            String str3 = str;
            int i12 = dVar.f102157a;
            int i13 = dVar.f102167k;
            int i14 = this.f100347n + 1;
            this.f100347n = i14;
            int i15 = this.f100348o + 1;
            this.f100348o = i15;
            sg.bigo.ads.core.d.b.a(context, bVar, strJ, str3, str2, i10, i11, i12, i13, jElapsedRealtime, i14, i15, this, strA);
        }
        AdInteractionListener adInteractionListener = this.f100334a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClicked();
        }
        if (z10) {
            ((sg.bigo.ads.api.b.f) this).h_();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    protected void a(@Nullable Point point, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        int i12;
        int i13;
        int width;
        int height;
        char c10;
        float fFloatValue;
        boolean zA;
        final boolean z10;
        o();
        this.f100337d.b("action_type", String.valueOf(dVar.f102157a));
        sg.bigo.ads.core.e.a.b bVar = this.f100337d;
        if (point != null) {
            i13 = point.x;
            i12 = point.y;
        } else {
            i12 = 0;
            i13 = 0;
        }
        View view = this.f100336c;
        if (view != null) {
            width = view.getWidth();
            height = this.f100336c.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        if (width > 0) {
            c10 = 0;
            fFloatValue = new BigDecimal(i13 / width).setScale(3, 4).floatValue();
        } else {
            c10 = 0;
            fFloatValue = 0.0f;
        }
        float fFloatValue2 = height > 0 ? new BigDecimal(i12 / height).setScale(3, 4).floatValue() : 0.0f;
        String str = (i11 == 1 || i11 == 2) ? DevicePublicKeyStringDef.DIRECT : i11 == 3 ? "confirm" : "unknown";
        Integer numValueOf = Integer.valueOf(i13);
        Integer numValueOf2 = Integer.valueOf(i12);
        Integer numValueOf3 = Integer.valueOf(width);
        Integer numValueOf4 = Integer.valueOf(height);
        Float fValueOf = Float.valueOf(fFloatValue);
        Float fValueOf2 = Float.valueOf(fFloatValue2);
        Object[] objArr = new Object[7];
        objArr[c10] = numValueOf;
        objArr[1] = numValueOf2;
        objArr[2] = numValueOf3;
        objArr[3] = numValueOf4;
        objArr[4] = fValueOf;
        objArr[5] = fValueOf2;
        objArr[6] = str;
        bVar.b("click_prop", sg.bigo.ads.common.utils.q.e(sg.bigo.ads.common.utils.q.a("{'x':%d,'y':%d,'ad_w':%d,'ad_h':%d,'x_r':%s,'y_r':%s,'mode':'%s'}", objArr)));
        this.f100337d.b("click_source", String.valueOf(i11));
        this.f100337d.b("click_module", String.valueOf(i10));
        int i14 = dVar.f102157a;
        if (i14 == 1) {
            zA = this.f100335b.f102174a.a(4);
        } else {
            if (i14 != 4) {
                z10 = c10;
                final sg.bigo.ads.core.e.a.b bVar2 = this.f100337d;
                final Context context = this.f100335b.f102178e;
                final int iK = k();
                final int i15 = i();
                sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.1

                    /* JADX INFO: renamed from: a */
                    final /* synthetic */ Context f104058a;

                    /* JADX INFO: renamed from: b */
                    final /* synthetic */ boolean f104059b;

                    /* JADX INFO: renamed from: c */
                    final /* synthetic */ int f104060c;

                    /* JADX INFO: renamed from: d */
                    final /* synthetic */ int f104061d;

                    public AnonymousClass1(final Context context2, final boolean z102, final int iK2, final int i152) {
                        context = context2;
                        z = z102;
                        i = iK2;
                        i = i152;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.a(context, z, i, i);
                    }
                });
                sg.bigo.ads.core.d.b.a(this.f100335b.f102174a, 1, dVar, this);
            }
            zA = this.f100335b.f102174a.a(8);
        }
        z102 = zA;
        final sg.bigo.ads.core.e.a.b bVar22 = this.f100337d;
        final Context context2 = this.f100335b.f102178e;
        final int iK2 = k();
        final int i152 = i();
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.1

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Context f104058a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ boolean f104059b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f104060c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ int f104061d;

            public AnonymousClass1(final Context context22, final boolean z102, final int iK22, final int i1522) {
                context = context22;
                z = z102;
                i = iK22;
                i = i1522;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.a(context, z, i, i);
            }
        });
        sg.bigo.ads.core.d.b.a(this.f100335b.f102174a, 1, dVar, this);
    }

    public final synchronized void a(String str, Object obj) {
        this.F.put(str, obj);
    }

    public void a(sg.bigo.ads.api.b.a aVar) {
        this.f102138aa = aVar;
        if (aVar != null) {
            HashMap map = new HashMap();
            sg.bigo.ads.core.d.b.a((Map<String, String>) map, (sg.bigo.ads.api.b.a) this, false);
            this.f100337d.a(map);
        }
    }

    @CallSuper
    public void a(@NonNull d.a<T> aVar) {
    }

    public final void a(@Nullable sg.bigo.ads.common.i iVar, int i10, int i11, @NonNull sg.bigo.ads.api.core.d dVar) {
        String str;
        if (isExpired()) {
            str = "The ad is expired";
        } else {
            boolean z10 = (i11 == 13 || i11 == 14) && (this instanceof sg.bigo.ads.api.b.f);
            if (!this.f100342i || z10) {
                if (C() != 2 || (p() && SystemClock.elapsedRealtime() - this.f100344k >= D())) {
                    b(iVar, i10, i11, dVar);
                    return;
                }
                return;
            }
            str = "The ad is destroyed";
        }
        a(2000, 3, str, false);
    }

    public final void a(@Nullable sg.bigo.ads.common.i iVar, @NonNull sg.bigo.ads.api.core.d dVar) {
        a(iVar, 0, 1, dVar);
    }

    public void a(sg.bigo.ads.controller.landing.c cVar) {
        this.f100351r = cVar;
    }

    protected final boolean a(String str) {
        return !this.E.contains(str);
    }

    public static boolean a(c cVar) {
        return cVar == null || cVar.f100342i;
    }
}
