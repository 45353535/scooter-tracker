package com.ironsource;

import android.app.Activity;
import com.ironsource.C4344h6;
import com.ironsource.C4441n0;
import com.ironsource.D0;
import com.ironsource.InterfaceC4355i0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Za implements InterfaceC4327g6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final a f42251n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f42252o = "Fullscreen Ad Internal";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final LevelPlay.AdFormat f42253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f42254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f42255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final C4441n0 f42256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4310f6 f42257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4593w0 f42258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final I7 f42259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4496q4 f42260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Lazy f42261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private InterfaceC4229ab f42262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final UUID f42263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private InterfaceC4481p6 f42264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private C4360i5 f42265m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            C4441n0 c4441n0A = C4441n0.a.a(com.unity3d.mediation.a.a(adFormat), D0.b.MEDIATION);
            if (!c4441n0A.g()) {
                c4441n0A.e().a().a(placementName, "SDK is not initialized", false);
                return false;
            }
            L3 l3A = Ib.f41088s.d().p().a(placementName, adFormat);
            boolean zD = l3A.d();
            c4441n0A.e().a().a(placementName, l3A.e(), zD);
            return zD;
        }

        private a() {
        }
    }

    public interface b {
        @Nullable
        Double getBidFloor();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final C4441n0 f42266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final C4310f6 f42267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final I7 f42268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final InterfaceC4496q4 f42269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final C4600w7 f42270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final b f42271f;

        public c(@NotNull C4441n0 adTools, @NotNull C4310f6 adControllerFactory, @NotNull I7 provider, @NotNull InterfaceC4496q4 currentTimeProvider, @NotNull C4600w7 idFactory, @NotNull b config) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            Intrinsics.checkNotNullParameter(idFactory, "idFactory");
            Intrinsics.checkNotNullParameter(config, "config");
            this.f42266a = adTools;
            this.f42267b = adControllerFactory;
            this.f42268c = provider;
            this.f42269d = currentTimeProvider;
            this.f42270e = idFactory;
            this.f42271f = config;
        }

        @NotNull
        public final C4310f6 a() {
            return this.f42267b;
        }

        @NotNull
        public final C4441n0 b() {
            return this.f42266a;
        }

        @NotNull
        public final b c() {
            return this.f42271f;
        }

        @NotNull
        public final InterfaceC4496q4 d() {
            return this.f42269d;
        }

        @NotNull
        public final C4600w7 e() {
            return this.f42270e;
        }

        @NotNull
        public final I7 f() {
            return this.f42268c;
        }
    }

    static final class d extends Lambda implements Function0<C4293e6> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4293e6 invoke() {
            return Za.this.b();
        }
    }

    public static final class e implements InterfaceC4514r6 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4304f0 f42274b;

        e(C4304f0 c4304f0) {
            this.f42274b = c4304f0;
        }

        @Override // com.ironsource.InterfaceC4514r6
        @NotNull
        public C4498q6 a(boolean z10, @NotNull InterfaceC4548t6 listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            AbstractC4576v0 abstractC4576v0A = Za.this.g().a(z10, this.f42274b);
            return new C4498q6(Ib.f41088s.c(), new V0(Za.this.f(), abstractC4576v0A, D0.b.MEDIATION), abstractC4576v0A, listener, null, null, null, null, 240, null);
        }
    }

    public Za(@NotNull LevelPlay.AdFormat adFormat, @NotNull String adUnitId, @NotNull b config, @NotNull C4441n0 adTools, @NotNull C4310f6 fullscreenAdControllerFactory, @NotNull InterfaceC4593w0 adUnitDataFactory, @NotNull I7 mediationServicesProvider, @NotNull InterfaceC4496q4 currentTimeProvider, @NotNull C4600w7 idFactory) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(fullscreenAdControllerFactory, "fullscreenAdControllerFactory");
        Intrinsics.checkNotNullParameter(adUnitDataFactory, "adUnitDataFactory");
        Intrinsics.checkNotNullParameter(mediationServicesProvider, "mediationServicesProvider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        this.f42253a = adFormat;
        this.f42254b = adUnitId;
        this.f42255c = config;
        this.f42256d = adTools;
        this.f42257e = fullscreenAdControllerFactory;
        this.f42258f = adUnitDataFactory;
        this.f42259g = mediationServicesProvider;
        this.f42260h = currentTimeProvider;
        this.f42261i = lf.i.a(new d());
        UUID uuidA = idFactory.a();
        this.f42263k = uuidA;
        this.f42264l = new C4344h6(this, null, 2, 0 == true ? 1 : 0);
        adTools.e().a(new C4440n(com.unity3d.mediation.a.a(adFormat), uuidA, adUnitId));
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Za this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f42256d.e().f().a();
        this$0.f42264l.loadAd();
    }

    @NotNull
    public final C4293e6 c() {
        return (C4293e6) this.f42261i.getValue();
    }

    @NotNull
    public final LevelPlay.AdFormat d() {
        return this.f42253a;
    }

    @Override // com.ironsource.InterfaceC4327g6
    public void onAdClicked() {
        this.f42256d.d(new Runnable() { // from class: com.ironsource.bk
            @Override // java.lang.Runnable
            public final void run() {
                Za.c(this.f42780b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4327g6
    public void onAdClosed() {
        this.f42256d.d(new Runnable() { // from class: com.ironsource.rj
            @Override // java.lang.Runnable
            public final void run() {
                Za.d(this.f44847b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4327g6
    public void onAdDisplayed(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f42256d.d(new Runnable() { // from class: com.ironsource.ck
            @Override // java.lang.Runnable
            public final void run() {
                Za.b(this.f42838b, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4327g6
    public void onAdInfoChanged(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f42256d.d(new Runnable() { // from class: com.ironsource.tj
            @Override // java.lang.Runnable
            public final void run() {
                Za.c(this.f45520b, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4327g6
    public void onAdLoadFailed(@NotNull final LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f42256d.d(new Runnable() { // from class: com.ironsource.pj
            @Override // java.lang.Runnable
            public final void run() {
                Za.c(this.f44662b, error);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4327g6
    public void onAdLoaded(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f42256d.d(new Runnable() { // from class: com.ironsource.wj
            @Override // java.lang.Runnable
            public final void run() {
                Za.d(this.f45805b, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Za this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f42264l.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Za this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.f42264l.onAdLoaded(adInfo);
    }

    private final void p() {
        Double bidFloor = this.f42255c.getBidFloor();
        if (bidFloor != null) {
            this.f42256d.e().f().a(bidFloor.doubleValue());
        }
    }

    public final void a(@Nullable InterfaceC4229ab interfaceC4229ab) {
        this.f42262j = interfaceC4229ab;
    }

    @NotNull
    public final UUID e() {
        return this.f42263k;
    }

    @NotNull
    public final C4441n0 f() {
        return this.f42256d;
    }

    @NotNull
    public final InterfaceC4593w0 g() {
        return this.f42258f;
    }

    @NotNull
    public final String h() {
        return this.f42254b;
    }

    @NotNull
    public final b i() {
        return this.f42255c;
    }

    @NotNull
    public final InterfaceC4496q4 j() {
        return this.f42260h;
    }

    @Nullable
    public final InterfaceC4229ab k() {
        return this.f42262j;
    }

    @NotNull
    public final I7 l() {
        return this.f42259g;
    }

    public final boolean m() {
        InterfaceC4355i0 interfaceC4355i0C = this.f42264l.c();
        this.f42256d.e().e().a(Boolean.valueOf(interfaceC4355i0C.a()), interfaceC4355i0C instanceof InterfaceC4355i0.a ? ((InterfaceC4355i0.a) interfaceC4355i0C).c() : null);
        return interfaceC4355i0C.a();
    }

    public final void n() {
        this.f42265m = new C4360i5();
        this.f42256d.d(new Runnable() { // from class: com.ironsource.vj
            @Override // java.lang.Runnable
            public final void run() {
                Za.b(this.f45679b);
            }
        });
    }

    public final void o() {
        a(new C4428m6(this, this.f42260h));
        c().m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Za this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.f42264l.onAdDisplayed(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Za this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f42264l.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Za this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f42264l.onAdClosed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Za this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f42264l.a();
    }

    public final void a(@NotNull InterfaceC4481p6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f42264l = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Za this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f42264l.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Za this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        this$0.f42264l.onAdInfoChanged(adInfo);
    }

    public final void a(@NotNull final Activity activity, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f42256d.d(new Runnable() { // from class: com.ironsource.sj
            @Override // java.lang.Runnable
            public final void run() {
                Za.a(activity, this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Activity activity, Za this$0, String str) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ContextProvider.getInstance().updateActivity(activity);
        this$0.f42256d.e().h().d();
        this$0.f42264l.a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4293e6 b() {
        C4304f0 c4304f0 = new C4304f0(com.unity3d.mediation.a.a(this.f42253a), this.f42263k, this.f42254b, null, this.f42259g.A().a(), this.f42255c.getBidFloor(), 8, null);
        e eVar = new e(c4304f0);
        B5 b5E = this.f42256d.e();
        C4441n0 c4441n0 = this.f42256d;
        b5E.a(new B0(c4441n0, c4304f0, c4441n0.b(this.f42253a, this.f42254b).b().b()));
        return this.f42257e.a(this, this.f42256d, c4304f0, eVar);
    }

    public final void a(@NotNull C4344h6.a status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f42264l = new C4344h6(this, status);
    }

    @Override // com.ironsource.InterfaceC4327g6
    public void a(@NotNull final LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f42256d.d(new Runnable() { // from class: com.ironsource.nj
            @Override // java.lang.Runnable
            public final void run() {
                Za.b(this.f44485b, error);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4327g6
    public void a() {
        this.f42256d.d(new Runnable() { // from class: com.ironsource.qj
            @Override // java.lang.Runnable
            public final void run() {
                Za.e(this.f44756b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4327g6
    public void a(@NotNull final LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C4441n0.a(this.f42256d, "onAdRewarded adInfo: " + this.f42264l.b() + " reward: " + reward, (String) null, 2, (Object) null));
        this.f42256d.e(new Runnable() { // from class: com.ironsource.uj
            @Override // java.lang.Runnable
            public final void run() {
                Za.a(this.f45590b, reward);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Za this$0, LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reward, "$reward");
        InterfaceC4229ab interfaceC4229ab = this$0.f42262j;
        if (interfaceC4229ab != null) {
            interfaceC4229ab.onAdRewarded(reward, this$0.f42264l.b());
        }
    }

    public final void a(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C4441n0.a(this.f42256d, "onAdLoaded adInfo: " + adInfo, (String) null, 2, (Object) null));
        final long jA = C4360i5.a(this.f42265m);
        this.f42256d.d(new Runnable() { // from class: com.ironsource.dk
            @Override // java.lang.Runnable
            public final void run() {
                Za.a(this.f42930b, jA);
            }
        });
        this.f42256d.e(new Runnable() { // from class: com.ironsource.oj
            @Override // java.lang.Runnable
            public final void run() {
                Za.a(this.f44580b, adInfo);
            }
        });
    }

    public /* synthetic */ Za(LevelPlay.AdFormat adFormat, String str, b bVar, C4441n0 c4441n0, C4310f6 c4310f6, InterfaceC4593w0 interfaceC4593w0, I7 i72, InterfaceC4496q4 interfaceC4496q4, C4600w7 c4600w7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, str, bVar, c4441n0, c4310f6, interfaceC4593w0, (i10 & 64) != 0 ? Ib.f41088s.d() : i72, interfaceC4496q4, c4600w7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Za this$0, long j10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f42256d.e().f().a(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Za this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC4229ab interfaceC4229ab = this$0.f42262j;
        if (interfaceC4229ab != null) {
            interfaceC4229ab.onAdLoaded(adInfo);
        }
    }

    public static /* synthetic */ void a(Za za2, LevelPlayAdError levelPlayAdError, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        za2.a(levelPlayAdError, j10);
    }

    public final void a(@Nullable final LevelPlayAdError levelPlayAdError, final long j10) {
        IronLog.INTERNAL.verbose(C4441n0.a(this.f42256d, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        this.f42256d.d(new Runnable() { // from class: com.ironsource.zj
            @Override // java.lang.Runnable
            public final void run() {
                Za.a(this.f45984b, j10, levelPlayAdError);
            }
        });
        this.f42256d.e(new Runnable() { // from class: com.ironsource.ak
            @Override // java.lang.Runnable
            public final void run() {
                Za.a(levelPlayAdError, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Za this$0, long j10, LevelPlayAdError levelPlayAdError) {
        String errorMessage;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Qc qcF = this$0.f42256d.e().f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (errorMessage = levelPlayAdError.getErrorMessage()) == null) {
            errorMessage = "";
        }
        qcF.a(j10, errorCode, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, Za this$0) {
        InterfaceC4229ab interfaceC4229ab;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (levelPlayAdError == null || (interfaceC4229ab = this$0.f42262j) == null) {
            return;
        }
        interfaceC4229ab.onAdLoadFailed(levelPlayAdError);
    }

    public final void a(@NotNull final LevelPlayAdError error, @NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C4441n0.a(this.f42256d, "onAdDisplayFailed error: " + error + ", adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.f42256d.d(new Runnable() { // from class: com.ironsource.xj
            @Override // java.lang.Runnable
            public final void run() {
                Za.a(this.f45844b, error);
            }
        });
        this.f42256d.e(new Runnable() { // from class: com.ironsource.yj
            @Override // java.lang.Runnable
            public final void run() {
                Za.a(this.f45915b, error, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Za this$0, LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f42256d.e().h().a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Za this$0, LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC4229ab interfaceC4229ab = this$0.f42262j;
        if (interfaceC4229ab != null) {
            interfaceC4229ab.onAdDisplayFailed(error, adInfo);
        }
    }

    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f42256d.e().h().f("Fullscreen Ad Internal - " + message);
    }
}
