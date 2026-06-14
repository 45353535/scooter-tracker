package com.ironsource;

import com.ironsource.C4475p0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4643z implements AdapterAdListener, NetworkInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final V0 f45923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final A f45924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final G f45925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private WeakReference<D> f45926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private E f45927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final BaseAdAdapter<?, ?> f45928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private C4360i5 f45929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private AbstractRunnableC4232ae f45930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f45931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f45932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f45933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f45934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f45935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final AdData f45936n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final C4424m2 f45937o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private final C4424m2 f45938p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f45939q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final String f45940r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f45941s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final String f45942t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final IronSource.a f45943u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f45944v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final H f45945w;

    /* JADX INFO: renamed from: com.ironsource.z$a */
    public static final class a extends AbstractRunnableC4232ae {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            long jA = C4360i5.a(AbstractC4643z.this.f45929g);
            IronLog ironLog = IronLog.INTERNAL;
            AbstractC4643z abstractC4643z = AbstractC4643z.this;
            ironLog.verbose(abstractC4643z.a("Load duration = " + jA + ", isBidder = " + abstractC4643z.u()));
            AbstractC4643z.this.f45935m = true;
            AbstractC4643z.this.f().e().e().a(jA, 1025, false);
            AbstractC4643z.this.f().e().e().a(jA, 1025, "time out", false);
            AbstractC4643z abstractC4643z2 = AbstractC4643z.this;
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            Intrinsics.checkNotNullExpressionValue(ironSourceErrorBuildLoadFailedError, "buildLoadFailedError(errorMessage)");
            abstractC4643z2.a(ironSourceErrorBuildLoadFailedError);
        }
    }

    public AbstractC4643z(@NotNull V0 adTools, @NotNull A instanceData, @NotNull G adInstancePayload, @NotNull D listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f45923a = adTools;
        this.f45924b = instanceData;
        this.f45925c = adInstancePayload;
        this.f45926d = new WeakReference<>(listener);
        this.f45931i = new LinkedHashMap();
        this.f45936n = instanceData.g();
        this.f45937o = instanceData.n();
        this.f45938p = instanceData.p();
        this.f45939q = instanceData.j().j();
        this.f45940r = instanceData.r();
        this.f45941s = instanceData.s();
        this.f45942t = instanceData.w();
        this.f45943u = instanceData.h();
        this.f45944v = instanceData.v();
        this.f45945w = instanceData.t();
        BaseAdAdapter<?, ?> baseAdAdapterA = a(instanceData);
        this.f45928f = baseAdAdapterA;
        adTools.e().a(new B(adTools, instanceData, baseAdAdapterA));
        adTools.e().a(new T1(instanceData.k()));
    }

    private final void B() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        try {
            G();
            A();
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str = "unexpected error while calling adapter.loadAd() - " + th2.getMessage();
            IronLog.INTERNAL.error(a(str));
            this.f45923a.e().h().g(str);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    private final void C() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.f45923a.e().a().a(k());
        D d10 = this.f45926d.get();
        if (d10 != null) {
            d10.a(this);
        }
    }

    private final void D() {
        IronLog ironLog = IronLog.INTERNAL;
        E e10 = null;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        H();
        if (this.f45935m) {
            c();
            this.f45923a.e().h().f("instance load success after it was already failed");
            return;
        }
        if (this.f45933k) {
            this.f45923a.e().h().f("instance load success after it was already loaded");
            return;
        }
        this.f45933k = true;
        long jA = C4360i5.a(this.f45929g);
        ironLog.verbose(a("Load duration = " + jA));
        this.f45923a.e().e().a(jA, false);
        a(C4475p0.a.LoadedSuccessfully);
        E e11 = this.f45927e;
        if (e11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadListener");
        } else {
            e10 = e11;
        }
        e10.a(this);
    }

    private final void E() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        if (this.f45934l) {
            this.f45923a.e().h().f("instance opened after it was already opened");
            return;
        }
        this.f45934l = true;
        this.f45923a.e().a().g(k());
        a(C4475p0.a.ShowedSuccessfully);
        D d10 = this.f45926d.get();
        if (d10 != null) {
            d10.b(this);
        }
    }

    private final void F() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        H();
        if (this.f45935m) {
            return;
        }
        B();
    }

    private final void G() {
        H();
        a aVarA = a();
        this.f45930h = aVarA;
        if (aVarA != null) {
            this.f45923a.a((AbstractRunnableC4232ae) aVarA, TimeUnit.SECONDS.toMillis(o()));
        }
    }

    private final void H() {
        AbstractRunnableC4232ae abstractRunnableC4232ae = this.f45930h;
        if (abstractRunnableC4232ae != null) {
            this.f45923a.b(abstractRunnableC4232ae);
            this.f45930h = null;
        }
    }

    private final int o() {
        Integer numF = this.f45924b.n().f();
        return (numF == null || numF.intValue() <= 0) ? this.f45924b.i().h() : numF.intValue();
    }

    protected abstract void A();

    public abstract void a(@NotNull I i10);

    @NotNull
    protected final AdData i() {
        return this.f45936n;
    }

    @Nullable
    protected final C4283dd j() {
        return this.f45924b.i().b().f();
    }

    @NotNull
    protected final String k() {
        return this.f45924b.i().l();
    }

    @NotNull
    protected final Map<String, Object> l() {
        return this.f45931i;
    }

    @Nullable
    public final C4424m2 m() {
        return this.f45938p;
    }

    @NotNull
    protected final A n() {
        return this.f45924b;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdClicked(Map map) {
        p4.b.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str, Map map) {
        p4.b.b(this, adapterErrorType, i10, str, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        onAdLoadSuccess(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdShowFailed(int i10, String str, Map map) {
        p4.b.e(this, i10, str, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public /* synthetic */ void onInitFailed(int i10, String str, Map map) {
        q4.a.a(this, i10, str, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public /* synthetic */ void onInitSuccess(Map map) {
        q4.a.b(this, map);
    }

    @NotNull
    public final String p() {
        return this.f45940r;
    }

    @NotNull
    public final String q() {
        return this.f45942t;
    }

    public final int r() {
        return this.f45941s;
    }

    @NotNull
    public final H s() {
        return this.f45945w;
    }

    public final int t() {
        return this.f45944v;
    }

    public final boolean u() {
        return this.f45939q;
    }

    public final boolean v() {
        return this.f45935m;
    }

    public final boolean w() {
        return this.f45933k;
    }

    public final boolean x() {
        return this.f45932j;
    }

    public final boolean y() {
        return this.f45934l;
    }

    public boolean z() {
        return this.f45933k;
    }

    public void b() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        H();
        this.f45923a.e().e().a(this.f45944v);
    }

    public void c() {
    }

    @NotNull
    public final IronSource.a d() {
        return this.f45943u;
    }

    @NotNull
    public LevelPlayAdInfo e() {
        String string = this.f45924b.i().b().b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strC = this.f45924b.i().b().c();
        String string2 = this.f45924b.h().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "instanceData.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, this.f45924b.n(), null, this.f45924b.i().l(), MapsKt.toMap(this.f45931i));
    }

    @NotNull
    public final V0 f() {
        return this.f45923a;
    }

    @Nullable
    public final BaseAdAdapter<?, ?> g() {
        return this.f45928f;
    }

    @NotNull
    public final C4424m2 h() {
        return this.f45937o;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        a(new Runnable() { // from class: com.ironsource.pn
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4643z.b(this.f44667b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(@NotNull final AdapterErrorType adapterErrorType, final int i10, @NotNull final String errorMessage) {
        Intrinsics.checkNotNullParameter(adapterErrorType, "adapterErrorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        a(new Runnable() { // from class: com.ironsource.qn
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4643z.a(this.f44760b, adapterErrorType, i10, errorMessage);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess(@NotNull final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        a(new Runnable() { // from class: com.ironsource.vn
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4643z.a(this.f45687b, extraData);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(@NotNull final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        a(new Runnable() { // from class: com.ironsource.tn
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4643z.b(this.f45525b, extraData);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(final int i10, @NotNull final String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        a(new Runnable() { // from class: com.ironsource.un
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4643z.a(this.f45595b, i10, errorMessage);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(final int i10, @Nullable final String str) {
        a(new Runnable() { // from class: com.ironsource.rn
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4643z.b(this.f44851b, i10, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        a(new Runnable() { // from class: com.ironsource.sn
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4643z.c(this.f45427b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AbstractC4643z this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F();
    }

    protected final void a(@NotNull C4475p0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f45924b.a(performance);
    }

    private final void b(int i10, String str) {
        IronLog.INTERNAL.verbose(a("error = " + i10 + ", " + str));
        H();
        this.f45935m = true;
        a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i10, str, C4360i5.a(this.f45929g));
        a(new IronSourceError(i10, str));
    }

    protected final void a(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f45923a.a(callback);
    }

    public final void a(boolean z10) {
        this.f45923a.e().a().a(z10);
    }

    private final BaseAdAdapter<?, ?> a(A a10) {
        if (a10.i().e().q()) {
            return this.f45925c.b();
        }
        return this.f45923a.a(a10);
    }

    public final void a(@NotNull E listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        this.f45927e = listener;
        this.f45932j = true;
        try {
            this.f45923a.e().e().a(false);
            this.f45929g = new C4360i5();
            G();
            BaseAdAdapter<?, ?> baseAdAdapter = this.f45928f;
            Intrinsics.checkNotNull(baseAdAdapter);
            AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f45924b.g(), ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str = "loadAd - network adapter not available " + this.f45942t;
            ironLog.error(a(str));
            b(C4644z0.c(this.f45924b.h()), str);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str2 = "loadAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str2));
            this.f45923a.e().h().g(str2);
            b(C4644z0.c(this.f45924b.h()), str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC4643z this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.f45931i.putAll(extraData);
        this$0.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC4643z this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC4643z this$0, int i10, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b(i10, str);
    }

    public static /* synthetic */ String a(AbstractC4643z abstractC4643z, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return abstractC4643z.a(str);
    }

    @NotNull
    protected final String a(@Nullable String str) {
        return this.f45923a.a(str, this.f45942t);
    }

    private final a a() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(IronSourceError ironSourceError) {
        a(C4475p0.a.FailedToLoad);
        E e10 = this.f45927e;
        if (e10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadListener");
            e10 = null;
        }
        e10.a(ironSourceError, this);
    }

    private final void a(AdapterErrorType adapterErrorType, int i10, String str) {
        long jA = C4360i5.a(this.f45929g);
        IronLog.INTERNAL.verbose(a("Load duration = " + jA + ", error = " + i10 + ", " + str));
        H();
        if (this.f45935m) {
            c();
            a(adapterErrorType, i10, str, jA);
        } else {
            if (this.f45933k) {
                a(adapterErrorType);
                return;
            }
            this.f45935m = true;
            c();
            a(adapterErrorType, i10, str, jA);
            a(new IronSourceError(i10, str));
        }
    }

    protected final void a(int i10, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        IronLog.INTERNAL.verbose(a("Show error = " + i10 + ", " + errorMessage));
        this.f45923a.e().a().a(k(), i10, errorMessage, "");
        a(C4475p0.a.FailedToShow);
        D d10 = this.f45926d.get();
        if (d10 != null) {
            d10.a(this, new IronSourceError(i10, errorMessage));
        }
        c();
    }

    private final void a(AdapterErrorType adapterErrorType) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
            this.f45923a.e().h().a("");
        } else {
            this.f45923a.e().h().f("instance load failed after it was already loaded");
        }
    }

    private final void a(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.f45923a.e().e().a(j10, i10);
        } else if (str != null && str.length() != 0) {
            this.f45923a.e().e().a(j10, i10, str, false);
        } else {
            this.f45923a.e().e().a(j10, i10, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC4643z this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.f45931i.putAll(extraData);
        this$0.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC4643z this$0, AdapterErrorType adapterErrorType, int i10, String errorMessage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterErrorType, "$adapterErrorType");
        Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(adapterErrorType, i10, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC4643z this$0, int i10, String errorMessage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(i10, errorMessage);
    }
}
