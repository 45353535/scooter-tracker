package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C4406l1;
import com.ironsource.InterfaceC4356i1;
import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class O2 implements B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final L9 f41483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4346h8 f41484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final V1 f41485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4476p1 f41486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4367ic f41487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Kf f41488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final M8 f41489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final M8.a f41490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private BannerAdInfo f41491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private WeakReference<P2> f41492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private WeakReference<FrameLayout> f41493k;

    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
            C4312f8 size = O2.this.d().getSize();
            ((FrameLayout) v10).addView(O2.this.d(), 0, new FrameLayout.LayoutParams(size.c(), size.a(), 17));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
            ((FrameLayout) v10).removeAllViews();
        }
    }

    public O2(@NotNull L9 adInstance, @NotNull C4346h8 container, @NotNull V1 auctionDataReporter, @NotNull InterfaceC4476p1 analytics, @NotNull InterfaceC4367ic networkDestroyAPI, @NotNull Kf threadManager, @NotNull M8 sessionDepthService, @NotNull M8.a sessionDepthServiceEditor) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        this.f41483a = adInstance;
        this.f41484b = container;
        this.f41485c = auctionDataReporter;
        this.f41486d = analytics;
        this.f41487e = networkDestroyAPI;
        this.f41488f = threadManager;
        this.f41489g = sessionDepthService;
        this.f41490h = sessionDepthServiceEditor;
        String strF = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(strF, "adInstance.instanceId");
        String strE = adInstance.e();
        Intrinsics.checkNotNullExpressionValue(strE, "adInstance.id");
        this.f41491i = new BannerAdInfo(strF, strE);
        this.f41492j = new WeakReference<>(null);
        this.f41493k = new WeakReference<>(null);
        Gc gc2 = new Gc();
        adInstance.a(gc2);
        gc2.a(this);
    }

    public final void a(@NotNull BannerAdInfo bannerAdInfo) {
        Intrinsics.checkNotNullParameter(bannerAdInfo, "<set-?>");
        this.f41491i = bannerAdInfo;
    }

    public final void b(@NotNull WeakReference<FrameLayout> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f41493k = value;
        FrameLayout frameLayout = value.get();
        if (frameLayout != null) {
            frameLayout.addOnAttachStateChangeListener(a());
        }
    }

    @NotNull
    public final BannerAdInfo c() {
        return this.f41491i;
    }

    protected final void finalize() {
        b();
    }

    @Override // com.ironsource.B2
    public void onBannerClick() {
        InterfaceC4356i1.a.f43302a.a().a(this.f41486d);
        this.f41488f.a(new Runnable() { // from class: com.ironsource.pi
            @Override // java.lang.Runnable
            public final void run() {
                O2.b(this.f44661b);
            }
        });
    }

    @Override // com.ironsource.B2
    public void onBannerShowSuccess() {
        M8 m82 = this.f41489g;
        IronSource.a aVar = IronSource.a.BANNER;
        InterfaceC4356i1.a.f43302a.f(new C4406l1.w(m82.a(aVar))).a(this.f41486d);
        this.f41490h.b(aVar);
        this.f41485c.b("onBannerShowSuccess");
        this.f41488f.a(new Runnable() { // from class: com.ironsource.oi
            @Override // java.lang.Runnable
            public final void run() {
                O2.c(this.f44579b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(O2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        P2 p22 = this$0.f41492j.get();
        if (p22 != null) {
            p22.onBannerAdShown();
        }
    }

    public final void a(@NotNull WeakReference<P2> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f41492j = weakReference;
    }

    @NotNull
    public final C4346h8 d() {
        return this.f41484b;
    }

    @NotNull
    public final WeakReference<P2> e() {
        return this.f41492j;
    }

    @NotNull
    public final WeakReference<FrameLayout> f() {
        return this.f41493k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(O2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC4356i1.d.f43325a.b().a(this$0.f41486d);
        this$0.f41487e.a(this$0.f41483a);
    }

    public final void b() {
        ki.a(this.f41488f, new Runnable() { // from class: com.ironsource.ni
            @Override // java.lang.Runnable
            public final void run() {
                O2.a(this.f44484b);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(O2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        P2 p22 = this$0.f41492j.get();
        if (p22 != null) {
            p22.onBannerAdClicked();
        }
    }

    private final a a() {
        return new a();
    }

    public /* synthetic */ O2(L9 l92, C4346h8 c4346h8, V1 v12, InterfaceC4476p1 interfaceC4476p1, InterfaceC4367ic interfaceC4367ic, Kf kf2, M8 m82, M8.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l92, c4346h8, v12, interfaceC4476p1, (i10 & 16) != 0 ? new C4383jc() : interfaceC4367ic, (i10 & 32) != 0 ? S7.f41731a : kf2, (i10 & 64) != 0 ? Ib.f41088s.d().s() : m82, (i10 & 128) != 0 ? Ib.f41088s.a().h() : aVar);
    }
}
