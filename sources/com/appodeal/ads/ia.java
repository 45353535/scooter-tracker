package com.appodeal.ads;

import com.appodeal.ads.ext.JsonArrayBuilder;
import com.appodeal.ads.ext.JsonObjectBuilder;
import com.appodeal.ads.ext.JsonObjectBuilderKt;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.modules.common.internal.service.ServiceInfo;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.ironsource.D5;
import com.ironsource.N6;
import com.mbridge.msdk.MBridgeConstans;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ia {
    public static final Unit A(final com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasObject("services", JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.r9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ia.B(qVar, (JsonObjectBuilder) obj);
            }
        }));
        return Unit.f93236a;
    }

    public static final Unit B(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        for (final ServiceInfo serviceInfo : ((com.appodeal.ads.networking.binders.l) qVar).f14062a) {
            jsonObject.hasObject(serviceInfo.getName(), JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.w9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.b(serviceInfo, (JsonObjectBuilder) obj);
                }
            }));
        }
        return Unit.f93236a;
    }

    public static final Unit C(final com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasObject("adapters", JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.o9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ia.D(qVar, (JsonObjectBuilder) obj);
            }
        }));
        jsonObject.hasArray("show_array", JsonObjectBuilderKt.jsonArray(new Function1() { // from class: com.appodeal.ads.p9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ia.d(qVar, (JsonArrayBuilder) obj);
            }
        }));
        return Unit.f93236a;
    }

    public static final Unit D(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        for (Map.Entry entry : ((com.appodeal.ads.networking.binders.c) qVar).f14012a.entrySet()) {
            String str = (String) entry.getKey();
            final com.appodeal.ads.networking.binders.a aVar = (com.appodeal.ads.networking.binders.a) entry.getValue();
            jsonObject.hasObject(str, JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.x9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.c(aVar, (JsonObjectBuilder) obj);
                }
            }));
        }
        return Unit.f93236a;
    }

    public static final Unit a(ServiceData serviceData, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        ServiceData.AppsFlyer appsFlyer = (ServiceData.AppsFlyer) serviceData;
        jsonObject.hasValue("attribution_id", appsFlyer.getAttributionId());
        final Map<String, Object> conversionData = appsFlyer.getConversionData();
        jsonObject.hasObject("conversion_data", (!conversionData.isEmpty() ? conversionData : null) != null ? JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.y9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ia.f(conversionData, (JsonObjectBuilder) obj);
            }
        }) : null);
        return Unit.f93236a;
    }

    public static final Unit b(ServiceInfo serviceInfo, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasValue(POBCoreNativeConstants.NATIVE_VERSION, serviceInfo.getBuildVersion());
        jsonObject.hasValue("sdk", serviceInfo.getSdkVersion());
        jsonObject.hasValue("initialized", Boolean.valueOf(serviceInfo.isInitialized()));
        return Unit.f93236a;
    }

    public static final Unit c(com.appodeal.ads.networking.binders.a aVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasValue(POBCoreNativeConstants.NATIVE_VERSION, aVar.f14002a);
        jsonObject.hasValue("sdk", aVar.f14003b);
        return Unit.f93236a;
    }

    public static final Unit d(com.appodeal.ads.networking.binders.q qVar, JsonArrayBuilder jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "$this$jsonArray");
        jsonArray.putValues(CollectionsKt.toList(((com.appodeal.ads.networking.binders.c) qVar).f14012a.keySet()));
        return Unit.f93236a;
    }

    public static final Unit e(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        com.appodeal.ads.networking.binders.b bVar = (com.appodeal.ads.networking.binders.b) qVar;
        jsonObject.hasValue("type", bVar.f14004a);
        jsonObject.hasValue("main_id", bVar.f14007d);
        jsonObject.hasValue(Constants.REWARDED_VIDEO, bVar.f14005b);
        jsonObject.hasValue("large_banners", bVar.f14006c);
        jsonObject.hasValue("show_timestamp", bVar.f14008e);
        jsonObject.hasValue("click_timestamp", bVar.f14009f);
        jsonObject.hasValue("finish_timestamp", bVar.f14010g);
        jsonObject.hasValue("impid", bVar.f14011h);
        return Unit.f93236a;
    }

    public static final Unit f(Map map, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        for (Map.Entry entry : map.entrySet()) {
            jsonObject.hasValue((String) entry.getKey(), entry.getValue());
        }
        return Unit.f93236a;
    }

    public static final void g(JSONObject jSONObject, final com.appodeal.ads.networking.binders.q data) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof com.appodeal.ads.networking.binders.b) {
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.f9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.e(data, (JsonObjectBuilder) obj);
                }
            });
            return;
        }
        if (data instanceof com.appodeal.ads.networking.binders.l) {
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.ea
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.A(data, (JsonObjectBuilder) obj);
                }
            });
            return;
        }
        if (data instanceof com.appodeal.ads.networking.binders.c) {
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.fa
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.C(data, (JsonObjectBuilder) obj);
                }
            });
            return;
        }
        if (data instanceof com.appodeal.ads.networking.binders.d) {
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.ga
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.i(data, (JsonObjectBuilder) obj);
                }
            });
            return;
        }
        if (data instanceof com.appodeal.ads.networking.binders.g) {
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.ha
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.l(data, (JsonObjectBuilder) obj);
                }
            });
            return;
        }
        if (data instanceof com.appodeal.ads.networking.binders.i) {
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.g9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.n(data, (JsonObjectBuilder) obj);
                }
            });
            return;
        }
        if (data instanceof com.appodeal.ads.networking.binders.p) {
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.h9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.o(data, (JsonObjectBuilder) obj);
                }
            });
            return;
        }
        if (data instanceof com.appodeal.ads.networking.binders.k) {
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.i9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.p(data, (JsonObjectBuilder) obj);
                }
            });
            return;
        }
        if (data instanceof com.appodeal.ads.networking.binders.m) {
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.j9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.q(data, (JsonObjectBuilder) obj);
                }
            });
            return;
        }
        if (data instanceof com.appodeal.ads.networking.binders.n) {
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.k9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.s(data, (JsonObjectBuilder) obj);
                }
            });
            return;
        }
        if (data instanceof com.appodeal.ads.networking.binders.o) {
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.q9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.t(data, (JsonObjectBuilder) obj);
                }
            });
            return;
        }
        if (data instanceof com.appodeal.ads.networking.binders.h) {
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.aa
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.u(data, (JsonObjectBuilder) obj);
                }
            });
            return;
        }
        if (data instanceof com.appodeal.ads.networking.binders.j) {
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.ba
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.v(data, (JsonObjectBuilder) obj);
                }
            });
        } else if (data instanceof com.appodeal.ads.networking.binders.e) {
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.ca
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.x(data, (JsonObjectBuilder) obj);
                }
            });
        } else {
            if (!(data instanceof com.appodeal.ads.networking.binders.f)) {
                throw new lf.m();
            }
            JsonObjectBuilderKt.jsonObject(jSONObject, new Function1() { // from class: com.appodeal.ads.da
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ia.y(data, (JsonObjectBuilder) obj);
                }
            });
        }
    }

    public static final Unit h(ServiceData serviceData, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        ServiceData.Adjust adjust = (ServiceData.Adjust) serviceData;
        jsonObject.hasValue("attribution_id", adjust.getAttributionId());
        final Map<String, Object> conversionData = adjust.getConversionData();
        jsonObject.hasObject("conversion_data", (!conversionData.isEmpty() ? conversionData : null) != null ? JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.z9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ia.j(conversionData, (JsonObjectBuilder) obj);
            }
        }) : null);
        return Unit.f93236a;
    }

    public static final Unit i(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        com.appodeal.ads.networking.binders.d dVar = (com.appodeal.ads.networking.binders.d) qVar;
        jsonObject.hasValue(EidRequestBuilder.REQUEST_FIELD_IFA, dVar.f14013a);
        jsonObject.hasValue("advertising_tracking", dVar.f14014b);
        jsonObject.hasValue("adidg", Boolean.valueOf(dVar.f14015c));
        jsonObject.hasValue(CommonUrlParts.APP_SET_ID, dVar.f14016d);
        jsonObject.hasValue(CommonUrlParts.APP_SET_ID_SCOPE, dVar.f14017e);
        return Unit.f93236a;
    }

    public static final Unit j(Map map, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        for (Map.Entry entry : map.entrySet()) {
            jsonObject.hasValue((String) entry.getKey(), entry.getValue());
        }
        return Unit.f93236a;
    }

    public static final Unit k(ServiceData serviceData, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        ServiceData.FacebookAnalytics facebookAnalytics = (ServiceData.FacebookAnalytics) serviceData;
        jsonObject.hasValue("user_id", facebookAnalytics.getUserId());
        jsonObject.hasValue("app_id", facebookAnalytics.getAppId());
        return Unit.f93236a;
    }

    public static final Unit l(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        com.appodeal.ads.networking.binders.g gVar = (com.appodeal.ads.networking.binders.g) qVar;
        jsonObject.hasValue("connection", gVar.f14045a);
        jsonObject.hasValue("connection_subtype", gVar.f14046b);
        return Unit.f93236a;
    }

    public static final Unit m(ServiceData serviceData, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        ServiceData.Firebase firebase = (ServiceData.Firebase) serviceData;
        jsonObject.hasValue("app_instance_id", firebase.getAppInstanceId());
        jsonObject.hasValue("keywords", firebase.getKeywordsAsString());
        return Unit.f93236a;
    }

    public static final Unit n(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        com.appodeal.ads.networking.binders.i iVar = (com.appodeal.ads.networking.binders.i) qVar;
        jsonObject.hasValue("lt", iVar.f14049a);
        jsonObject.hasValue(N6.f41419s, iVar.f14050b);
        jsonObject.hasValue("lon", iVar.f14051c);
        return Unit.f93236a;
    }

    public static final Unit o(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        com.appodeal.ads.networking.binders.p pVar = (com.appodeal.ads.networking.binders.p) qVar;
        jsonObject.hasValue("user_id", pVar.f14075a);
        jsonObject.hasValue(CommonUrlParts.LOCALE, pVar.f14076b);
        jsonObject.hasObject("consent_report", pVar.f14077c);
        jsonObject.hasObject("token", pVar.f14078d);
        jsonObject.hasValue("user_agent", pVar.f14079e);
        jsonObject.hasValue("timezone", pVar.f14080f);
        jsonObject.hasValue("local_time", Long.valueOf(pVar.f14081g));
        return Unit.f93236a;
    }

    public static final Unit p(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        boolean z10 = h2.f13367a;
        jsonObject.hasValue("segment_id", Long.valueOf(com.appodeal.ads.segments.s0.g().f14483a));
        jsonObject.hasObject("custom_state", ((com.appodeal.ads.networking.binders.k) qVar).f14061a);
        return Unit.f93236a;
    }

    public static final Unit q(final com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasObject("services_data", JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.l9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ia.r(qVar, (JsonObjectBuilder) obj);
            }
        }));
        return Unit.f93236a;
    }

    public static final Unit r(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        for (final ServiceData serviceData : ((com.appodeal.ads.networking.binders.m) qVar).f14063a) {
            if (serviceData instanceof ServiceData.AppsFlyer) {
                jsonObject.hasObject("appsflyer", JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.s9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ia.a(serviceData, (JsonObjectBuilder) obj);
                    }
                }));
            } else if (serviceData instanceof ServiceData.Adjust) {
                jsonObject.hasObject("adjust", JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.t9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ia.h(serviceData, (JsonObjectBuilder) obj);
                    }
                }));
            } else if (serviceData instanceof ServiceData.FacebookAnalytics) {
                jsonObject.hasObject("facebook_analytics", JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.u9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ia.k(serviceData, (JsonObjectBuilder) obj);
                    }
                }));
            } else {
                if (!(serviceData instanceof ServiceData.Firebase)) {
                    throw new lf.m();
                }
                jsonObject.hasObject(RemoteConfigComponent.DEFAULT_NAMESPACE, JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.v9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ia.m(serviceData, (JsonObjectBuilder) obj);
                    }
                }));
            }
        }
        return Unit.f93236a;
    }

    public static final Unit s(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        com.appodeal.ads.networking.binders.n nVar = (com.appodeal.ads.networking.binders.n) qVar;
        jsonObject.hasValue("session_id", Long.valueOf(nVar.f14064a));
        jsonObject.hasValue("session_uuid", nVar.f14065b);
        jsonObject.hasValue("session_uptime", Long.valueOf(nVar.f14066c));
        jsonObject.hasValue("session_uptime_m", Long.valueOf(nVar.f14067d));
        jsonObject.hasValue("session_start_ts", Long.valueOf(nVar.f14068e));
        jsonObject.hasValue("session_start_ts_m", Long.valueOf(nVar.f14069f));
        jsonObject.hasValue("app_uptime", Long.valueOf(nVar.f14070g));
        jsonObject.hasValue("app_uptime_m", Long.valueOf(nVar.f14071h));
        jsonObject.hasValue("app_session_average_length", Long.valueOf(nVar.f14072i));
        jsonObject.hasValue("app_session_average_length_m", Long.valueOf(nVar.f14073j));
        return Unit.f93236a;
    }

    public static final Unit t(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasArray("previous_sessions", ((com.appodeal.ads.networking.binders.o) qVar).f14074a);
        return Unit.f93236a;
    }

    public static final Unit u(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        com.appodeal.ads.networking.binders.h hVar = (com.appodeal.ads.networking.binders.h) qVar;
        jsonObject.hasValue("debug", hVar.f14047a);
        jsonObject.hasValue("check_sdk_version", hVar.f14048b);
        return Unit.f93236a;
    }

    public static final Unit v(final com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasObject("exact_revenue", JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.m9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ia.w(qVar, (JsonObjectBuilder) obj);
            }
        }));
        return Unit.f93236a;
    }

    public static final Unit w(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        com.appodeal.ads.networking.binders.j jVar = (com.appodeal.ads.networking.binders.j) qVar;
        jsonObject.hasValue("unit_name", jVar.f14052a);
        jsonObject.hasValue("network_name", jVar.f14053b);
        jsonObject.hasValue(Reporting.Key.PLACEMENT_ID, Integer.valueOf(jVar.f14054c));
        jsonObject.hasValue("placement_name", jVar.f14055d);
        jsonObject.hasValue("revenue", jVar.f14056e);
        jsonObject.hasValue("currency", jVar.f14057f);
        jsonObject.hasValue("precision", jVar.f14058g);
        jsonObject.hasValue("demand_source", jVar.f14059h);
        jsonObject.hasObject("ext", jVar.f14060i);
        return Unit.f93236a;
    }

    public static final Unit x(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        com.appodeal.ads.networking.binders.e eVar = (com.appodeal.ads.networking.binders.e) qVar;
        jsonObject.hasValue(MBridgeConstans.APP_KEY, eVar.f14018a);
        jsonObject.hasValue("sdk", eVar.f14019b);
        jsonObject.hasValue("os", "Android");
        jsonObject.hasValue(CommonUrlParts.OS_VERSION, eVar.f14020c);
        jsonObject.hasValue(N6.G, eVar.f14021d);
        jsonObject.hasValue("platform", eVar.f14022e);
        jsonObject.hasValue("android", eVar.f14023f);
        jsonObject.hasValue("android_level", Integer.valueOf(eVar.f14024g));
        jsonObject.hasValue("package", eVar.f14025h);
        jsonObject.hasValue("package_version", eVar.f14026i);
        jsonObject.hasValue("version_code", eVar.f14027j);
        jsonObject.hasValue("install_time", eVar.f14028k);
        jsonObject.hasValue("installer", eVar.f14029l);
        jsonObject.hasValue("framework", eVar.f14030m);
        jsonObject.hasValue("framework_version", eVar.f14031n);
        jsonObject.hasValue("plugins_version", eVar.f14032o);
        jsonObject.hasValue("pxratio", Double.valueOf(eVar.f14033p));
        jsonObject.hasValue(CommonUrlParts.DEVICE_TYPE, eVar.f14034q);
        jsonObject.hasValue("http_allowed", Boolean.valueOf(eVar.f14035r));
        jsonObject.hasValue(CommonUrlParts.MANUFACTURER, eVar.f14036s);
        jsonObject.hasValue("model", eVar.f14037t);
        jsonObject.hasValue("rooted", Boolean.valueOf(eVar.f14038u));
        jsonObject.hasValue("webview_version", eVar.f14039v);
        jsonObject.hasValue("width", Integer.valueOf(eVar.f14040w));
        jsonObject.hasValue("height", Integer.valueOf(eVar.f14041x));
        jsonObject.hasValue("crr", eVar.f14042y);
        jsonObject.hasValue("battery", Double.valueOf(eVar.f14043z));
        jsonObject.hasValue("storage_size", Long.valueOf(eVar.A));
        jsonObject.hasValue("storage_free", Long.valueOf(eVar.B));
        jsonObject.hasValue("storage_used", Long.valueOf(eVar.C));
        jsonObject.hasValue("ram_size", Long.valueOf(eVar.D));
        jsonObject.hasValue("ram_free", Long.valueOf(eVar.E));
        jsonObject.hasValue("ram_used", Long.valueOf(eVar.F));
        jsonObject.hasValue("cpu_usage", Double.valueOf(eVar.G));
        jsonObject.hasValue("coppa", Boolean.valueOf(eVar.H));
        jsonObject.hasValue("test", eVar.I);
        jsonObject.hasObject("ext", eVar.J);
        return Unit.f93236a;
    }

    public static final Unit y(final com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasObject("bidon_config", JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.n9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ia.z(qVar, (JsonObjectBuilder) obj);
            }
        }));
        return Unit.f93236a;
    }

    public static final Unit z(com.appodeal.ads.networking.binders.q qVar, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasValue(D5.f40571r, ((com.appodeal.ads.networking.binders.f) qVar).f14044a);
        return Unit.f93236a;
    }
}
