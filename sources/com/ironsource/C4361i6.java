package com.ironsource;

import android.app.Activity;
import com.ironsource.C4240b4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4361i6 extends AbstractC4643z implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private WeakReference<InterfaceC4377j6> f43358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    private C4360i5 f43359y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4361i6(@NotNull V0 adTools, @NotNull A instanceData, @NotNull G adInstancePayload, @NotNull InterfaceC4377j6 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f43358x = new WeakReference<>(listener);
    }

    private final void O() {
        IronLog.INTERNAL.verbose(AbstractC4643z.a(this, (String) null, 1, (Object) null));
        f().e().a().i(k());
    }

    private final void P() {
        IronLog.INTERNAL.verbose(AbstractC4643z.a(this, (String) null, 1, (Object) null));
        f().e().a().k(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4361i6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4361i6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4361i6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C4361i6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P();
    }

    @Override // com.ironsource.AbstractC4643z
    protected void A() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object objG = g();
        Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterAdFullScreenInterface) objG).loadAd(n().g(), ContextProvider.getInstance().getActiveContext(), this);
    }

    @Override // com.ironsource.AbstractC4643z
    public void a(@NotNull I adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.AbstractC4643z
    public void c() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object objG = g();
        Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
        ((AdapterAdFullScreenInterface) objG).destroyAd(n().g());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdClosed(Map map) {
        p4.a.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdEnded(Map map) {
        p4.a.b(this, map);
    }

    @Override // com.ironsource.AbstractC4643z, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public /* synthetic */ void onAdRewarded(Map map) {
        p4.c.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdStarted(Map map) {
        p4.a.c(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public /* synthetic */ void onAdVisible(Map map) {
        p4.a.d(this, map);
    }

    private final List<String> I() {
        JSONObject jSONObjectOptJSONObject = new P6().a(new String[]{"md"}).optJSONObject("md");
        if (jSONObjectOptJSONObject == null) {
            return CollectionsKt.emptyList();
        }
        Object objOpt = jSONObjectOptJSONObject.opt(N6.C);
        List list = objOpt instanceof List ? (List) objOpt : null;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return arrayList;
    }

    private final Map<String, Object> J() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        for (String str : I()) {
            List listSplit$default = StringsKt.split$default(str, new String[]{C4240b4.j.f42668b}, false, 2, 2, null);
            if (listSplit$default.size() < 2) {
                IronLog.INTERNAL.warning(a("\"" + str + "\" is not a valid key=value format"));
            } else {
                String str2 = (String) listSplit$default.get(0);
                mapCreateMapBuilder.put("custom_" + str2, (String) listSplit$default.get(1));
            }
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    private final void K() {
        this.f43359y = new C4360i5();
        IronLog.INTERNAL.verbose(AbstractC4643z.a(this, (String) null, 1, (Object) null));
        f().e().a().a(k(), "");
        InterfaceC4377j6 interfaceC4377j6 = this.f43358x.get();
        if (interfaceC4377j6 != null) {
            interfaceC4377j6.b(this);
        }
        c();
    }

    private final void L() {
        IronLog.INTERNAL.verbose(AbstractC4643z.a(this, (String) null, 1, (Object) null));
        f().e().a().d(k());
    }

    private final void M() {
        Map<String, Object> mapJ = J();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = f().a(jCurrentTimeMillis, p());
        long jA = C4360i5.a(this.f43359y);
        LevelPlayReward levelPlayRewardA = Ib.f41088s.d().B().a(k(), n().i().b().c());
        if (levelPlayRewardA == null) {
            levelPlayRewardA = J4.f41164a.a();
        }
        LevelPlayReward levelPlayReward = levelPlayRewardA;
        f().e().a().a(k(), levelPlayReward.getName(), levelPlayReward.getAmount(), jCurrentTimeMillis, strA, jA, mapJ, f().j());
        InterfaceC4377j6 interfaceC4377j6 = this.f43358x.get();
        if (interfaceC4377j6 != null) {
            interfaceC4377j6.a(this, levelPlayReward);
        }
    }

    private final void N() {
        IronLog.INTERNAL.verbose(AbstractC4643z.a(this, (String) null, 1, (Object) null));
        InterfaceC4377j6 interfaceC4377j6 = this.f43358x.get();
        if (interfaceC4377j6 != null) {
            interfaceC4377j6.a(this);
        }
    }

    public final void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + k()));
        try {
            f().e().a().a(activity, k());
            if (!(g() instanceof AdapterAdFullScreenInterface)) {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                f().e().h().g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            } else {
                Object objG = g();
                Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((AdapterAdFullScreenInterface) objG).showAd(i(), activity, this);
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str = "showAd - exception = " + th2.getMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
            a(C4644z0.h(n().h()), str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        a(new Runnable() { // from class: com.ironsource.tk
            @Override // java.lang.Runnable
            public final void run() {
                C4361i6.a(this.f45522b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        a(new Runnable() { // from class: com.ironsource.sk
            @Override // java.lang.Runnable
            public final void run() {
                C4361i6.b(this.f45422b);
            }
        });
    }

    @Override // com.ironsource.AbstractC4643z, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(@NotNull Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        super.onAdOpened(extraData);
        a(new Runnable() { // from class: com.ironsource.uk
            @Override // java.lang.Runnable
            public final void run() {
                C4361i6.c(this.f45592b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        a(new Runnable() { // from class: com.ironsource.xk
            @Override // java.lang.Runnable
            public final void run() {
                C4361i6.d(this.f45846b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        a(new Runnable() { // from class: com.ironsource.vk
            @Override // java.lang.Runnable
            public final void run() {
                C4361i6.e(this.f45680b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        a(new Runnable() { // from class: com.ironsource.wk
            @Override // java.lang.Runnable
            public final void run() {
                C4361i6.f(this.f45807b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4361i6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4361i6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K();
    }
}
