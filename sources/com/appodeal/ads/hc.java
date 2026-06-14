package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.ext.JsonArrayBuilder;
import com.appodeal.ads.ext.JsonObjectBuilder;
import com.appodeal.ads.ext.JsonObjectBuilderKt;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.modules.common.internal.data.ConnectionData;
import com.appodeal.ads.modules.common.internal.service.ServicesRegistry;
import com.appodeal.ads.revenue.RevenueCurrency;
import com.appodeal.ads.revenue.RevenuePrecision;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.appodeal.ads.storage.e0 f13396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.appodeal.ads.services.r f13397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ServicesRegistry f13398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.appodeal.ads.utils.session.g f13399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.appodeal.ads.initializing.h f13400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.appodeal.ads.bidon.b f13401g;

    public hc(Context context, com.appodeal.ads.storage.e0 keyValueStorage) {
        com.appodeal.ads.services.r servicesSolution = (com.appodeal.ads.services.r) com.appodeal.ads.services.v.f14778a.getValue();
        ServicesRegistry servicesRegistry = (ServicesRegistry) com.appodeal.ads.services.e.f14645a.getValue();
        com.appodeal.ads.utils.session.r sessionManager = com.appodeal.ads.utils.session.r.f15109b;
        com.appodeal.ads.initializing.j adNetworkRegistry = com.appodeal.ads.initializing.j.f13479b;
        com.appodeal.ads.bidon.b bidonConfigProvider = (com.appodeal.ads.bidon.b) com.appodeal.ads.bidon.e.f13152a.getValue();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
        Intrinsics.checkNotNullParameter(servicesSolution, "servicesSolution");
        Intrinsics.checkNotNullParameter(servicesRegistry, "servicesRegistry");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(adNetworkRegistry, "adNetworkRegistry");
        Intrinsics.checkNotNullParameter(bidonConfigProvider, "bidonConfigProvider");
        this.f13395a = context;
        this.f13396b = keyValueStorage;
        this.f13397c = servicesSolution;
        this.f13398d = servicesRegistry;
        this.f13399e = sessionManager;
        this.f13400f = adNetworkRegistry;
        this.f13401g = bidonConfigProvider;
    }

    public static com.appodeal.ads.networking.binders.k a(final HashMap map) {
        return new com.appodeal.ads.networking.binders.k(JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.fc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hc.g(map, (JsonObjectBuilder) obj);
            }
        }));
    }

    public static final Unit e(hc hcVar, JsonArrayBuilder jsonArray) {
        List<com.appodeal.ads.utils.session.e> list;
        Intrinsics.checkNotNullParameter(jsonArray, "$this$jsonArray");
        com.appodeal.ads.utils.session.f fVarF = hcVar.f13399e.f();
        if (fVarF != null && (list = fVarF.f15075c) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (final com.appodeal.ads.utils.session.e eVar : list) {
                arrayList.add(JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.gc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hc.f(eVar, (JsonObjectBuilder) obj);
                    }
                }));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                jsonArray.putValues(arrayList);
            }
        }
        return Unit.f93236a;
    }

    public static final Unit f(com.appodeal.ads.utils.session.e eVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasValue("session_uuid", eVar.f15065b);
        jsonObject.hasValue("session_id", Integer.valueOf(eVar.f15064a));
        long j10 = 1000;
        jsonObject.hasValue("session_uptime", Long.valueOf(eVar.f15068e / j10));
        jsonObject.hasValue("session_uptime_m", Long.valueOf(eVar.f15069f));
        jsonObject.hasValue("session_start_ts", Long.valueOf(eVar.f15066c / j10));
        jsonObject.hasValue("session_start_ts_m", Long.valueOf(eVar.f15067d));
        return Unit.f93236a;
    }

    public static final Unit g(Map map, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        for (Map.Entry entry : map.entrySet()) {
            jsonObject.hasValue((String) entry.getKey(), entry.getValue());
        }
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r51, com.appodeal.ads.utils.app.c r52, kotlin.coroutines.jvm.internal.d r53) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.hc.b(android.content.Context, com.appodeal.ads.utils.app.c, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object c(com.appodeal.ads.networking.binders.s sVar, uc ucVar, te teVar, xe xeVar, l0 l0Var, com.appodeal.ads.segments.o oVar, s8 s8Var) {
        String str;
        String stringValue;
        String precisionName;
        String demandSource;
        RevenuePrecision precision;
        Double revenue;
        switch (sVar.ordinal()) {
            case 0:
                if (teVar == null) {
                    return null;
                }
                boolean zB = ee.b(this.f13395a);
                int i10 = na.f13818b[teVar.u().ordinal()];
                if (i10 == 1) {
                    str = Constants.BANNER;
                } else if (i10 == 2) {
                    str = Constants.MREC;
                } else if (i10 == 3) {
                    str = "banner";
                } else if (i10 == 4) {
                    str = "video";
                } else {
                    if (i10 != 5) {
                        throw new lf.m();
                    }
                    str = "native";
                }
                String str2 = str;
                boolean z10 = teVar.u() == AdType.Rewarded;
                Boolean boolValueOf = z10 ? Boolean.valueOf(z10) : null;
                Boolean boolValueOf2 = zB ? Boolean.valueOf(zB) : null;
                String str3 = teVar.f14898j;
                long j10 = 1000;
                long j11 = teVar.f14900l / j10;
                Long lValueOf = j11 != 0 ? Long.valueOf(j11) : null;
                long j12 = teVar.f14901m / j10;
                Long lValueOf2 = j12 != 0 ? Long.valueOf(j12) : null;
                long j13 = teVar.f14902n / j10;
                return new com.appodeal.ads.networking.binders.b(str2, boolValueOf, boolValueOf2, str3, lValueOf, lValueOf2, j13 != 0 ? Long.valueOf(j13) : null, teVar.s());
            case 1:
                return new com.appodeal.ads.networking.binders.l(this.f13398d.getAvailableServicesInfo());
            case 2:
                Set<com.appodeal.ads.initializing.g> setA = this.f13400f.a(l0Var != null ? l0Var.f13566f : null);
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setA, 10)), 16));
                for (com.appodeal.ads.initializing.g gVar : setA) {
                    Pair pair = TuplesKt.to(gVar.f13475a, new com.appodeal.ads.networking.binders.a(gVar.f13476b, gVar.f13477c));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                return new com.appodeal.ads.networking.binders.c(linkedHashMap);
            case 3:
                zc instance = zc.f15321a;
                Intrinsics.checkNotNullExpressionValue(instance, "instance");
                Object objD = d(instance, v4.f15145f.getIsAdvertisingIdWasGenerated(), s8Var);
                return objD == pf.b.g() ? objD : (com.appodeal.ads.networking.binders.q) objD;
            case 4:
                Intrinsics.checkNotNullExpressionValue(zc.f15321a, "instance");
                ConnectionData connectionDataH = j2.h(this.f13395a);
                return new com.appodeal.ads.networking.binders.g(connectionDataH.getType(), connectionDataH.getSubType());
            case 5:
                zc instance2 = zc.f15321a;
                Intrinsics.checkNotNullExpressionValue(instance2, "instance");
                jd jdVar = new jd(this.f13395a, instance2);
                Intrinsics.checkNotNullExpressionValue(jdVar, "getLocation(...)");
                return new com.appodeal.ads.networking.binders.i(jdVar.getDeviceLocationType(), jdVar.obtainLatitude(), jdVar.obtainLongitude());
            case 6:
                Context context = this.f13395a;
                zc instance3 = zc.f15321a;
                Intrinsics.checkNotNullExpressionValue(instance3, "instance");
                String string = Locale.getDefault().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                JSONObject jSONObject = ((com.appodeal.ads.regulator.shared.g) ((com.appodeal.ads.regulator.shared.a) ((com.appodeal.ads.regulator.b0) v4.f15141b.getValue()).f14347b.getValue())).f14385g;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                JSONObject jSONObject2 = jSONObject;
                JSONObject jSONObjectC = v4.c();
                String str4 = o6.a().f14245a;
                String httpAgent = instance3.getHttpAgent(context);
                TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
                Locale locale = Locale.ENGLISH;
                String str5 = new SimpleDateFormat("Z", locale).format(Calendar.getInstance(timeZone, locale).getTime());
                Intrinsics.checkNotNullExpressionValue(str5, "run(...)");
                return new com.appodeal.ads.networking.binders.p(str4, string, jSONObject2, jSONObjectC, httpAgent, str5, System.currentTimeMillis() / ((long) 1000));
            case 7:
                HashMap map = com.appodeal.ads.segments.g0.f14472d;
                Intrinsics.checkNotNullExpressionValue(map, "getCustomRuleValues(...)");
                return a(map);
            case 8:
                return new com.appodeal.ads.networking.binders.m(this.f13397c.d());
            case 9:
                com.appodeal.ads.utils.session.f fVarF = this.f13399e.f();
                if (fVarF == null) {
                    throw new IllegalArgumentException("Session is not started");
                }
                com.appodeal.ads.utils.session.e eVar = fVarF.f15074b;
                long j14 = eVar.f15064a;
                String str6 = eVar.f15065b;
                long j15 = 1000;
                long j16 = eVar.f15068e / j15;
                long j17 = eVar.f15069f;
                long j18 = eVar.f15066c / j15;
                long j19 = eVar.f15067d;
                com.appodeal.ads.utils.session.b bVar = fVarF.f15073a;
                return new com.appodeal.ads.networking.binders.n(j14, str6, j16, j17, j18, j19, bVar.f15053b / j15, bVar.f15054c, fVarF.d() / j15, fVarF.c());
            case 10:
                return new com.appodeal.ads.networking.binders.o(JsonObjectBuilderKt.jsonArray(new Function1() { // from class: com.appodeal.ads.ec
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hc.e(this.f13286b, (JsonArrayBuilder) obj);
                    }
                }));
            case 11:
                if (xeVar == null) {
                    return null;
                }
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(xeVar.f15260a);
                if (!boolA.booleanValue()) {
                    boolA = null;
                }
                return new com.appodeal.ads.networking.binders.h(boolA, db.f13248j != null ? Boolean.TRUE : null);
            case 12:
                Object objB = b(this.f13395a, com.appodeal.ads.utils.app.c.f14961g, s8Var);
                return objB == pf.b.g() ? objB : (com.appodeal.ads.networking.binders.q) objB;
            case 13:
                if (ucVar == null || oVar == null) {
                    return null;
                }
                ImpressionLevelData impressionLevelData = ucVar.f14943i;
                double dDoubleValue = (impressionLevelData == null || (revenue = impressionLevelData.getRevenue()) == null) ? ucVar.f14937c.f15229f / 1000.0d : revenue.doubleValue();
                if (impressionLevelData == null || (stringValue = impressionLevelData.getCurrency()) == null) {
                    stringValue = RevenueCurrency.USD.getStringValue();
                }
                String str7 = stringValue;
                if (impressionLevelData == null || (precision = impressionLevelData.getPrecision()) == null || (precisionName = precision.getPrecisionName()) == null) {
                    precisionName = RevenuePrecision.Estimated.getPrecisionName();
                }
                String str8 = precisionName;
                if (impressionLevelData == null || (demandSource = impressionLevelData.getDemandSource()) == null) {
                    demandSource = ucVar.f14938d;
                }
                String str9 = demandSource;
                String str10 = ucVar.f14937c.f15234k;
                String name = ucVar.f14936b.getName();
                int i11 = oVar.f14494a;
                String str11 = oVar.f14495b;
                Intrinsics.checkNotNullExpressionValue(str11, "getName(...)");
                return new com.appodeal.ads.networking.binders.j(str10, name, i11, str11, Double.valueOf(dDoubleValue), str7, str8, str9, impressionLevelData != null ? impressionLevelData.getExtraData() : null);
            case 14:
                return new com.appodeal.ads.networking.binders.f(((com.appodeal.ads.bidon.c) this.f13401g).f13151b.f13149a);
            default:
                throw new lf.m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.appodeal.ads.zc r11, boolean r12, kotlin.coroutines.jvm.internal.d r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.appodeal.ads.ab
            if (r0 == 0) goto L13
            r0 = r13
            com.appodeal.ads.ab r0 = (com.appodeal.ads.ab) r0
            int r1 = r0.f11892x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11892x = r1
            goto L18
        L13:
            com.appodeal.ads.ab r0 = new com.appodeal.ads.ab
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f11890v
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f11892x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L54
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            boolean r11 = r0.f11889u
            java.lang.String r12 = r0.f11888t
            java.lang.String r1 = r0.f11887s
            java.lang.Object r0 = r0.f11886r
            java.lang.String r0 = (java.lang.String) r0
            kotlin.d.b(r13)
            r6 = r11
            r7 = r12
            r4 = r0
            r5 = r1
            goto La3
        L3b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L43:
            boolean r12 = r0.f11889u
            java.lang.String r11 = r0.f11888t
            java.lang.String r2 = r0.f11887s
            java.lang.Object r4 = r0.f11886r
            com.appodeal.ads.hc r4 = (com.appodeal.ads.hc) r4
            kotlin.d.b(r13)
            r9 = r2
            r2 = r11
            r11 = r9
            goto L89
        L54:
            kotlin.d.b(r13)
            r11.getClass()
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r11 = com.appodeal.ads.v4.f15145f
            java.lang.String r11 = r11.getId()
            java.lang.String r13 = "getIfa(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r13)
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r13 = com.appodeal.ads.v4.f15145f
            boolean r13 = r13.getIsLimitAdTrackingEnabled()
            if (r13 == 0) goto L70
            java.lang.String r13 = "0"
            goto L72
        L70:
            java.lang.String r13 = "1"
        L72:
            android.content.Context r2 = r10.f13395a
            r0.f11886r = r10
            r0.f11887s = r11
            r0.f11888t = r13
            r0.f11889u = r12
            r0.f11892x = r4
            java.lang.Object r2 = com.appodeal.ads.v4.a(r2, r0)
            if (r2 != r1) goto L85
            goto L9d
        L85:
            r4 = r2
            r2 = r13
            r13 = r4
            r4 = r10
        L89:
            java.lang.String r13 = (java.lang.String) r13
            android.content.Context r4 = r4.f13395a
            r0.f11886r = r11
            r0.f11887s = r2
            r0.f11888t = r13
            r0.f11889u = r12
            r0.f11892x = r3
            java.lang.Object r0 = com.appodeal.ads.v4.f(r4, r0)
            if (r0 != r1) goto L9e
        L9d:
            return r1
        L9e:
            r4 = r11
            r6 = r12
            r7 = r13
            r13 = r0
            r5 = r2
        La3:
            r8 = r13
            java.lang.String r8 = (java.lang.String) r8
            com.appodeal.ads.networking.binders.d r3 = new com.appodeal.ads.networking.binders.d
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.hc.d(com.appodeal.ads.zc, boolean, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
