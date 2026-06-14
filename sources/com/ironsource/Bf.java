package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.mediation.LevelPlayAdSize;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Bf f40456a = new Bf();

    private Bf() {
    }

    @Nullable
    public final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return B1.a(context, c(context));
    }

    @Nullable
    public final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return B1.b(context, c(context));
    }

    @Nullable
    public final String c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return B1.g(context);
    }

    @NotNull
    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.b().d());
        concurrentHashMap.putAll(C4432ma.b().c());
        return concurrentHashMap;
    }

    public final void e() {
        com.ironsource.mediationsdk.r.m().R();
    }

    @NotNull
    public final JSONObject a(boolean z10) {
        JSONObject jSONObjectB = IronSourceUtils.b(z10);
        Intrinsics.checkNotNullExpressionValue(jSONObjectB, "getMediationAdditionalData(isDemandOnlyMode)");
        return jSONObjectB;
    }

    @NotNull
    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectB = K6.a().b();
        Intrinsics.checkNotNullExpressionValue(jSONObjectB, "getProperties().toJSON()");
        return jSONObjectB;
    }

    @NotNull
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> networkAdaptersMap = com.ironsource.mediationsdk.c.b().e();
            Intrinsics.checkNotNullExpressionValue(networkAdaptersMap, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    Bf bf2 = f40456a;
                    String key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                    String strA = bf2.a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    Intrinsics.checkNotNullExpressionValue(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    Intrinsics.checkNotNullExpressionValue(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObject.putOpt(strA, bf2.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
        }
        return jSONObject;
    }

    public final void a(@Nullable InterfaceC4298eb interfaceC4298eb) {
        C4295e8.a().b(interfaceC4298eb);
    }

    @NotNull
    public final LevelPlayAdSize b(@Nullable String str, int i10, int i11) {
        if (str != null && str.length() != 0 && !Intrinsics.areEqual(str, "CUSTOM")) {
            if (Intrinsics.areEqual(str, com.ironsource.mediationsdk.l.f44063c)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            return LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
        }
        return LevelPlayAdSize.Companion.createCustomSize(i10, i11);
    }

    public final void a(@Nullable InterfaceC4486pb interfaceC4486pb) {
        C4606wd.a().b(interfaceC4486pb);
    }

    public final void a(@Nullable Da da2) {
        C4544t2.a().b(da2);
    }

    public final int a() {
        return Ib.f41088s.d().i().c();
    }

    @NotNull
    public final String a(@Nullable C4283dd c4283dd) {
        String strC;
        return (c4283dd == null || (strC = c4283dd.c()) == null) ? new String() : strC;
    }

    @NotNull
    public final String a(@NotNull NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    public final void b(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        IronLog.INTERNAL.error(message);
    }

    public final boolean a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }

    @NotNull
    public final ISBannerSize a(@Nullable String str, int i10, int i11) {
        return new ISBannerSize(str, i10, i11);
    }

    @NotNull
    public final com.ironsource.mediationsdk.q a(@NotNull Activity activity, @NotNull ISBannerSize size) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.q qVarB = com.ironsource.mediationsdk.r.m().b(activity, size);
        Intrinsics.checkNotNullExpressionValue(qVarB, "getInstance().createBanner(activity, size)");
        return qVarB;
    }

    public final void a(@NotNull A5 event, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(data, "data");
        Td.i().a(new C4649z5(event, data));
    }

    private final JSONObject a(String str, String str2) {
        return new JSONObject(MapsKt.mapOf(TuplesKt.to(C4574uf.f45563b, str), TuplesKt.to("sdkVersion", str2)));
    }

    @NotNull
    public final String a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            try {
                if (!StringsKt.g0(key, TokenBuilder.TOKEN_DELIMITER, false, 2, null)) {
                    return !StringsKt.g0(key, "_", false, 2, null) ? key : (String) CollectionsKt.first(StringsKt.split$default(key, new String[]{"_"}, false, 0, 6, null));
                }
                String str = (String) CollectionsKt.last(StringsKt.split$default(key, new String[]{TokenBuilder.TOKEN_DELIMITER}, false, 0, 6, null));
                return !StringsKt.g0(str, "_", false, 2, null) ? str : (String) CollectionsKt.first(StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
        }
        Exception exc = e;
        C4462o4.d().a(exc);
        IronLog.INTERNAL.error(exc.getMessage());
        return key;
    }
}
