package com.ironsource;

import com.ironsource.D0;
import com.ironsource.InterfaceC4366ib;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4382jb extends AbstractC4620xa implements Sb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final UUID f43414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4349hb f43415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Pb f43416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private String f43417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C4283dd f43418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private InterfaceC4416lb f43419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdData f43420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdViewBinder f43421k;

    public /* synthetic */ C4382jb(UUID uuid, C4349hb c4349hb, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C4600w7.f45720a.a() : uuid, c4349hb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4382jb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.API.info(String.valueOf(this$0));
        try {
            Pb pb2 = this$0.f43416f;
            if (pb2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
                pb2 = null;
            }
            pb2.n();
            this$0.f43419i = null;
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4382jb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Pb pb2 = null;
        if (this$0.c()) {
            IronLog.INTERNAL.warning(C4441n0.a(this$0.a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            Pb pb3 = this$0.f43416f;
            if (pb3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            } else {
                pb2 = pb3;
            }
            pb2.o();
        }
    }

    @Override // com.ironsource.AbstractC4620xa
    public boolean d() {
        this.f43416f = e();
        return true;
    }

    @Nullable
    public final AdapterNativeAdViewBinder l() {
        return this.f43421k;
    }

    @Nullable
    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.f43420j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a(new Runnable() { // from class: com.ironsource.bl
            @Override // java.lang.Runnable
            public final void run() {
                C4382jb.b(this.f42781b);
            }
        });
    }

    @Override // com.ironsource.Sb
    public void onNativeAdLoadFailed(@Nullable IronSourceError ironSourceError) {
        String string = this.f43414d.toString();
        Intrinsics.checkNotNullExpressionValue(string, "adId.toString()");
        final LevelPlayAdError levelPlayAdError = new LevelPlayAdError(ironSourceError, string, b());
        b(new Runnable() { // from class: com.ironsource.dl
            @Override // java.lang.Runnable
            public final void run() {
                C4382jb.a(this.f42932b, levelPlayAdError);
            }
        });
    }

    private final Pb e() {
        this.f43418h = a().c(this.f43417g);
        UUID uuid = this.f43414d;
        String strB = b();
        C4283dd c4283dd = this.f43418h;
        if (c4283dd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("placement");
            c4283dd = null;
        }
        Zb zb2 = new Zb(uuid, strB, c4283dd);
        a(zb2);
        return new Pb(this, a(), zb2);
    }

    public final void f() {
        a(new Runnable() { // from class: com.ironsource.al
            @Override // java.lang.Runnable
            public final void run() {
                C4382jb.a(this.f42443b);
            }
        });
    }

    @NotNull
    public final UUID g() {
        return this.f43414d;
    }

    @Nullable
    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.f43420j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Nullable
    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.f43420j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Nullable
    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.f43420j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Nullable
    public final InterfaceC4366ib.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.f43420j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new InterfaceC4366ib.a(icon.getDrawable(), icon.getUri());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4382jb(@NotNull UUID adId, @NotNull C4349hb nativeAd) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        IronSource.a aVar = IronSource.a.NATIVE_AD;
        super(new C4441n0(aVar, D0.b.MEDIATION));
        this.f43414d = adId;
        this.f43415e = nativeAd;
        this.f43417g = "";
        a().e().a(new C4440n(aVar, adId, b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4382jb this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC4416lb interfaceC4416lb = this$0.f43419i;
        if (interfaceC4416lb != null) {
            interfaceC4416lb.b(this$0.f43415e, adInfo);
        }
    }

    public final void a(@Nullable final InterfaceC4416lb interfaceC4416lb) {
        a(new Runnable() { // from class: com.ironsource.cl
            @Override // java.lang.Runnable
            public final void run() {
                C4382jb.a(this.f42840b, interfaceC4416lb);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4382jb this$0, InterfaceC4416lb interfaceC4416lb) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f43419i = interfaceC4416lb;
    }

    @Override // com.ironsource.Sb
    public void b(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.zk
            @Override // java.lang.Runnable
            public final void run() {
                C4382jb.a(this.f45987b, adInfo);
            }
        });
    }

    @Override // com.ironsource.Sb
    public void a(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        Mb mb2 = new Mb();
        Pb pb2 = this.f43416f;
        if (pb2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            pb2 = null;
        }
        pb2.a(mb2);
        this.f43420j = mb2.a();
        this.f43421k = mb2.b();
        b(new Runnable() { // from class: com.ironsource.el
            @Override // java.lang.Runnable
            public final void run() {
                C4382jb.b(this.f43023b, adInfo);
            }
        });
    }

    public final void b(@NotNull final String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        a(new Runnable() { // from class: com.ironsource.yk
            @Override // java.lang.Runnable
            public final void run() {
                C4382jb.a(this.f45918b, placementName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4382jb this$0, LevelPlayAdError levelPlayError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(levelPlayError, "$levelPlayError");
        InterfaceC4416lb interfaceC4416lb = this$0.f43419i;
        if (interfaceC4416lb != null) {
            interfaceC4416lb.a(this$0.f43415e, levelPlayError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4382jb this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC4416lb interfaceC4416lb = this$0.f43419i;
        if (interfaceC4416lb != null) {
            interfaceC4416lb.c(this$0.f43415e, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4382jb this$0, String placementName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placementName, "$placementName");
        this$0.f43417g = placementName;
    }
}
