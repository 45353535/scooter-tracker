package f1;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import e1.a;
import e1.i;
import f1.bf;
import f1.ga;
import f1.z2;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class vf extends c1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m0 f71408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r5 f71409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t6 f71410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicReference f71411p;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f71412f = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d1.b f71413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c1.b f71414g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d1.b bVar, c1.b bVar2) {
            super(0);
            this.f71413f = bVar;
            this.f71414g = bVar2;
        }

        public final void a() {
            this.f71413f.g(new e1.b(null, this.f71414g), new e1.a(a.EnumC0857a.f68679g, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d1.b f71415f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c1.b f71416g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d1.b bVar, c1.b bVar2) {
            super(0);
            this.f71415f = bVar;
            this.f71416g = bVar2;
        }

        public final void a() {
            this.f71415f.g(new e1.b(null, this.f71416g), new e1.a(a.EnumC0857a.f68682j, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d1.b f71417f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c1.b f71418g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d1.b bVar, c1.b bVar2) {
            super(0);
            this.f71417f = bVar;
            this.f71418g = bVar2;
        }

        public final void a() {
            this.f71417f.e(new e1.j(null, this.f71418g), new e1.i(i.a.f68754d, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d1.b f71419f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c1.b f71420g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d1.b bVar, c1.b bVar2) {
            super(0);
            this.f71419f = bVar;
            this.f71420g = bVar2;
        }

        public final void a() {
            this.f71419f.e(new e1.j(null, this.f71420g), new e1.i(i.a.f68759i, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d1.b f71421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c1.b f71422g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d1.b bVar, c1.b bVar2) {
            super(0);
            this.f71421f = bVar;
            this.f71422g = bVar2;
        }

        public final void a() {
            this.f71421f.e(new e1.j(null, this.f71422g), new e1.i(i.a.f68758h, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(m0 adUnitLoader, r5 adUnitRenderer, t6 uiPoster, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutor, s1 adApiCallbackSender, wc session, y base64Wrapper, ag eventTracker, Function0 androidVersion) {
        super(adUnitLoader, adUnitRenderer, sdkConfig, backgroundExecutor, adApiCallbackSender, session, base64Wrapper, eventTracker, androidVersion);
        Intrinsics.checkNotNullParameter(adUnitLoader, "adUnitLoader");
        Intrinsics.checkNotNullParameter(adUnitRenderer, "adUnitRenderer");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.f71408m = adUnitLoader;
        this.f71409n = adUnitRenderer;
        this.f71410o = uiPoster;
        this.f71411p = sdkConfig;
    }

    public final void A(c1.b ad2, d1.b callback, String str) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (w(ad2.getLocation())) {
            this.f71410o.b(new b(callback, ad2));
            k(z2.a.f71695f, "Invalid configuration. Check logs for more details.", bf.a.f69483g, ad2.getLocation());
        } else if (D()) {
            r(ad2.getLocation(), ad2, callback, str);
        } else {
            this.f71410o.b(new c(callback, ad2));
        }
    }

    public final void B(c1.b ad2, d1.b callback) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (w(ad2.getLocation())) {
            this.f71410o.b(new d(callback, ad2));
            k(z2.i.f71749e, "Invalid configuration. Check logs for more details.", bf.a.f69483g, ad2.getLocation());
        } else if (!D()) {
            this.f71410o.b(new e(callback, ad2));
        } else if (s()) {
            h(ad2, callback);
        } else {
            this.f71410o.b(new f(callback, ad2));
        }
    }

    public final void C() {
        this.f71409n.E();
        this.f71408m.z();
    }

    public final boolean D() {
        ga.a aVarA;
        ga gaVar = (ga) this.f71411p.get();
        if (gaVar == null || (aVarA = gaVar.a()) == null) {
            return true;
        }
        return aVarA.b();
    }

    public final float x(int i10, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, i10, displayMetrics);
    }

    public final void y(c1.b banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        if (banner.getLayoutParams() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            banner.setLayoutParams(layoutParams);
        }
        DisplayMetrics displayMetrics = banner.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams2 = banner.getLayoutParams();
        int bannerWidth = banner.getBannerWidth();
        Intrinsics.checkNotNull(displayMetrics);
        layoutParams2.width = (int) x(bannerWidth, displayMetrics);
        banner.getLayoutParams().height = (int) x(banner.getBannerHeight(), displayMetrics);
    }

    public final void z(c1.b ad2, d1.b callback) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        A(ad2, callback, null);
    }

    public /* synthetic */ vf(m0 m0Var, r5 r5Var, t6 t6Var, AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, s1 s1Var, wc wcVar, y yVar, ag agVar, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(m0Var, r5Var, t6Var, atomicReference, scheduledExecutorService, s1Var, wcVar, yVar, agVar, (i10 & 512) != 0 ? a.f71412f : function0);
    }

    @Override // f1.c1, f1.y6
    public void a(String str) {
    }
}
