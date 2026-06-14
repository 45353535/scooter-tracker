package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4588vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f45655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f45656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f45657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f45658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f45659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final JSONObject f45660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Map<String, JSONObject> f45661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f45662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f45663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f45664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private C4588vc f45665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Lazy f45666l;

    /* JADX INFO: renamed from: com.ironsource.vc$a */
    static final class a extends Lambda implements Function0<NetworkSettings> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings invoke() {
            String strJ = C4588vc.this.j();
            String strL = C4588vc.this.l();
            String strH = C4588vc.this.h();
            String strK = C4588vc.this.k();
            JSONObject jSONObjectC = C4588vc.this.c();
            C4588vc c4588vc = C4588vc.this.f45665k;
            JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC, c4588vc != null ? c4588vc.c() : null);
            JSONObject jSONObjectM = C4588vc.this.m();
            C4588vc c4588vc2 = C4588vc.this.f45665k;
            JSONObject jSONObjectB2 = IronSourceUtils.b(jSONObjectM, c4588vc2 != null ? c4588vc2.m() : null);
            JSONObject jSONObjectE = C4588vc.this.e();
            C4588vc c4588vc3 = C4588vc.this.f45665k;
            JSONObject jSONObjectB3 = IronSourceUtils.b(jSONObjectE, c4588vc3 != null ? c4588vc3.e() : null);
            JSONObject jSONObjectD = C4588vc.this.d();
            C4588vc c4588vc4 = C4588vc.this.f45665k;
            JSONObject jSONObjectB4 = IronSourceUtils.b(jSONObjectD, c4588vc4 != null ? c4588vc4.d() : null);
            JSONObject jSONObjectG = C4588vc.this.g();
            C4588vc c4588vc5 = C4588vc.this.f45665k;
            NetworkSettings networkSettings = new NetworkSettings(strJ, strL, strH, strK, jSONObjectB, jSONObjectB2, jSONObjectB3, jSONObjectB4, IronSourceUtils.b(jSONObjectG, c4588vc5 != null ? c4588vc5.g() : null));
            networkSettings.setIsMultipleInstances(C4588vc.this.o());
            networkSettings.setSubProviderId(C4588vc.this.n());
            networkSettings.setAdSourceNameForEvents(C4588vc.this.b());
            return networkSettings;
        }
    }

    public C4588vc(@NotNull String providerName, @NotNull JSONObject networkSettings) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        this.f45655a = providerName;
        this.f45656b = providerName;
        String strOptString = networkSettings.optString(C4605wc.f45741d, providerName);
        Intrinsics.checkNotNullExpressionValue(strOptString, "networkSettings.optStrin…,\n          providerName)");
        this.f45657c = strOptString;
        String strOptString2 = networkSettings.optString(C4605wc.f45742e, strOptString);
        Intrinsics.checkNotNullExpressionValue(strOptString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.f45658d = strOptString2;
        Object objOpt = networkSettings.opt(C4605wc.f45743f);
        this.f45659e = objOpt instanceof String ? (String) objOpt : null;
        this.f45660f = networkSettings.optJSONObject("application");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(adFormatArrValues.length);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            arrayList.add(C4456nf.a(adFormat));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            String str = (String) obj;
            JSONObject jSONObjectOptJSONObject = networkSettings.optJSONObject("adFormats");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            linkedHashMap.put(obj, jSONObjectOptJSONObject2);
        }
        this.f45661g = linkedHashMap;
        String strOptString3 = networkSettings.optString("spId", "0");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.f45662h = strOptString3;
        String strOptString4 = networkSettings.optString(C4605wc.f45738a);
        Intrinsics.checkNotNullExpressionValue(strOptString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.f45663i = strOptString4;
        this.f45664j = networkSettings.optBoolean(C4605wc.f45740c, false);
        this.f45666l = lf.i.a(new a());
    }

    @NotNull
    public final String b() {
        return this.f45663i;
    }

    @Nullable
    public final JSONObject c() {
        return this.f45660f;
    }

    @NotNull
    public final JSONObject d() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f45661g.get("banner"), this.f45660f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    @NotNull
    public final JSONObject e() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f45661g.get("interstitial"), this.f45660f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    @NotNull
    public final NetworkSettings f() {
        return (NetworkSettings) this.f45666l.getValue();
    }

    @NotNull
    public final JSONObject g() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f45661g.get("nativeAd"), this.f45660f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    @NotNull
    public final String h() {
        return this.f45658d;
    }

    @NotNull
    public final String i() {
        return this.f45656b;
    }

    @NotNull
    public final String j() {
        return this.f45655a;
    }

    @Nullable
    public final String k() {
        return this.f45659e;
    }

    @NotNull
    public final String l() {
        return this.f45657c;
    }

    @NotNull
    public final JSONObject m() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f45661g.get("rewarded"), this.f45660f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectB, "mergeJsons(\n            …     applicationSettings)");
        return jSONObjectB;
    }

    @NotNull
    public final String n() {
        return this.f45662h;
    }

    public final boolean o() {
        return this.f45664j;
    }

    @NotNull
    public final Map<String, JSONObject> a() {
        return this.f45661g;
    }

    public final void b(@Nullable C4588vc c4588vc) {
        this.f45665k = c4588vc;
    }
}
