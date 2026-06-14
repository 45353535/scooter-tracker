package lc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import ec.b;
import ic.t;
import ic.u;
import ic.v;
import id.a0;
import id.a1;
import id.b1;
import id.i1;
import id.l0;
import id.q0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingConfig;
import io.bidmachine.iab.mraid.o;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pd.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends jc.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f94150v = new b(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final hd.e f94151t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private io.bidmachine.iab.mraid.b f94152u;

    private final class a implements b.a {
        public a() {
        }

        @Override // ec.b.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String result) {
            Intrinsics.checkNotNullParameter(result, "result");
            g.this.b0(result);
        }

        @Override // ec.b.a
        public void onError(a0 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            g.this.U(error);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, Object assetsHolder, ec.b repository, id.a adElementParams, jc.c adFormListener, yc.b eventCallback, wc.a aVar, hd.e eVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.f94151t = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(g this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        io.bidmachine.iab.mraid.b bVar = this$0.f94152u;
        if (bVar != null) {
            bVar.E();
        }
        this$0.f94152u = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(g this$0, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewGroup, "$viewGroup");
        io.bidmachine.iab.mraid.b bVar = this$0.f94152u;
        hd.e eVar = this$0.f94151t;
        if (eVar == null || bVar == null) {
            return;
        }
        eVar.onViewAddedToContainer(bVar.getWebView(), viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(g this$0, o oVar, String str, String preparedSource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(preparedSource, "$preparedSource");
        try {
            Context contextE = this$0.E();
            List listR = this$0.R();
            jc.c cVarC = this$0.C();
            yc.b eventCallback = this$0.s();
            Intrinsics.checkNotNullExpressionValue(eventCallback, "eventCallback");
            io.bidmachine.iab.mraid.b bVar = new io.bidmachine.iab.mraid.b(contextE, oVar, str, null, listR, null, 1000L, new h(this$0, cVarC, eventCallback, this$0.f94151t));
            bVar.Y(preparedSource);
            hd.e eVar = this$0.f94151t;
            if (eVar != null) {
                eVar.onViewCreated(bVar.getWebView());
            }
            this$0.f94152u = bVar;
        } catch (Throwable th2) {
            v.i(th2);
            this$0.U(a0.f74366b.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(g this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        io.bidmachine.iab.mraid.b bVar = this$0.f94152u;
        if (bVar != null) {
            bVar.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(final String str) {
        String strPrepareCreativeForMeasure;
        if (str == null || str.length() == 0) {
            U(new a0("Adm is null or empty"));
            return;
        }
        hd.e eVar = this.f94151t;
        if (eVar != null && (strPrepareCreativeForMeasure = eVar.prepareCreativeForMeasure(str)) != null) {
            str = strPrepareCreativeForMeasure;
        }
        Intrinsics.checkNotNullExpressionValue(str, "htmlMeasurer?.prepareCre…iveForMeasure(adm) ?: adm");
        final o oVarT = T();
        final String strS = S();
        jd.h.d(new Runnable() { // from class: lc.a
            @Override // java.lang.Runnable
            public final void run() {
                g.X(this.f94140b, oVarT, strS, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(g this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Q();
    }

    private final void d0(String str) {
        q0 q0VarD = q0.f74599b.d(str);
        if (q0VarD != null) {
            G().c(q0VarD, F(), new a());
            return;
        }
        U(new a0("Invalid adm url (" + str + ')'));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(g this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        io.bidmachine.iab.mraid.b bVar = this$0.f94152u;
        if (bVar != null) {
            bVar.Z();
            this$0.v();
        }
    }

    @Override // jc.a
    public View H() {
        return this.f94152u;
    }

    @Override // jc.a
    protected void J() {
        Unit unit;
        hd.e eVar = this.f94151t;
        if (eVar != null) {
            eVar.destroy(new u() { // from class: lc.b
                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    g.c0(this.f94144b);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    pd.v.b(this);
                }
            });
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Q();
        }
    }

    public final void Q() {
        jd.h.d(new u() { // from class: lc.f
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                g.V(this.f94149b);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    public final List R() {
        try {
            String strE = h().e(AdaptiveRenderingConfig.NATIVE_FEATURES_KEY);
            if (strE != null && strE.length() > 0) {
                List mutableList = CollectionsKt.toMutableList((Collection) StringsKt.split$default(strE, new String[]{StringUtils.COMMA}, false, 0, 6, null));
                int size = mutableList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String str = (String) mutableList.get(i10);
                    int length = str.length() - 1;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 <= length) {
                        boolean z11 = Intrinsics.compare((int) str.charAt(!z10 ? i11 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i11++;
                        } else {
                            z10 = true;
                        }
                    }
                    mutableList.set(i10, str.subSequence(i11, length + 1).toString());
                }
                return mutableList;
            }
        } catch (Exception unused) {
        }
        return CollectionsKt.emptyList();
    }

    public final String S() {
        if (!h().f().containsKey("base_url")) {
            return "https://localhost";
        }
        String strE = h().e("base_url");
        if (f0.s(strE)) {
            return strE;
        }
        return null;
    }

    public final o T() {
        String strE = h().e("placement_type");
        if (Intrinsics.areEqual(strE, "fullscreen")) {
            return o.INTERSTITIAL;
        }
        if (Intrinsics.areEqual(strE, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
            return o.INLINE;
        }
        return null;
    }

    public final void U(a0 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        hd.e eVar = this.f94151t;
        if (eVar != null) {
            eVar.onError(error);
        }
        C().d(this, error);
    }

    public final void Z(a0 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        hd.e eVar = this.f94151t;
        if (eVar != null) {
            eVar.onError(error);
        }
        C().c(this, error);
    }

    @Override // jc.a, ic.f
    public void a(final ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        jd.h.d(new u() { // from class: lc.d
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                g.W(this.f94146b, viewGroup);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    @Override // ic.f
    public void c() {
        a1 a1VarL = h().l();
        b1 b1VarA = a1VarL != null ? a1VarL.a() : null;
        if (b1VarA == null) {
            b0(h().m());
            return;
        }
        if (b1VarA instanceof l0) {
            b0(((l0) b1VarA).a());
            return;
        }
        if (b1VarA instanceof i1) {
            d0((String) CollectionsKt.firstOrNull(((i1) b1VarA).a()));
            return;
        }
        U(new a0("Invalid resource type (" + b1VarA.getClass().getSimpleName() + "), it should be HtmlResourceSource or UrlResourceSource"));
    }

    @Override // jc.a, ic.f
    public void d() {
        jd.h.d(new u() { // from class: lc.c
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                g.e0(this.f94145b);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    @Override // jc.a, ic.f
    public void m() {
        Unit unit;
        io.bidmachine.iab.mraid.b bVar = this.f94152u;
        if (bVar != null) {
            bVar.P();
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.m();
        }
    }

    @Override // jc.a, ic.f
    public void o() {
        jd.h.d(new u() { // from class: lc.e
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                g.a0(this.f94148b);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    @Override // jc.a
    public void v() {
        super.v();
        hd.e eVar = this.f94151t;
        if (eVar != null) {
            eVar.onShown();
        }
    }
}
