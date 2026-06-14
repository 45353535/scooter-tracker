package com.facebook.appevents;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19693b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f19694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f19695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f19696e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19697a = new LinkedHashMap();

    public static final class a {

        /* JADX INFO: renamed from: com.facebook.appevents.n0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0330a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[p0.values().length];
                try {
                    iArr[p0.CustomData.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p0.OperationalData.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p0.CustomAndOperationalData.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(o0 typeOfParameter, String key, String value, Bundle customEventsParams, n0 operationalData) {
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(customEventsParams, "customEventsParams");
            Intrinsics.checkNotNullParameter(operationalData, "operationalData");
            int i10 = C0330a.$EnumSwitchMapping$0[d(typeOfParameter, key).ordinal()];
            if (i10 == 1) {
                customEventsParams.putCharSequence(key, value);
                return;
            }
            if (i10 == 2) {
                operationalData.b(typeOfParameter, key, value);
            } else {
                if (i10 != 3) {
                    return;
                }
                operationalData.b(typeOfParameter, key, value);
                customEventsParams.putCharSequence(key, value);
            }
        }

        public final Pair b(o0 typeOfParameter, String key, String value, Bundle bundle, n0 n0Var) {
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            int i10 = C0330a.$EnumSwitchMapping$0[d(typeOfParameter, key).ordinal()];
            if (i10 == 1) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putCharSequence(key, value);
            } else if (i10 == 2) {
                if (n0Var == null) {
                    n0Var = new n0();
                }
                n0Var.b(typeOfParameter, key, value);
            } else if (i10 == 3) {
                if (n0Var == null) {
                    n0Var = new n0();
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                n0Var.b(typeOfParameter, key, value);
                bundle.putCharSequence(key, value);
            }
            return new Pair(bundle, n0Var);
        }

        public final Object c(o0 typeOfParameter, String key, Bundle bundle, n0 n0Var) {
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(key, "key");
            Object objD = n0Var != null ? n0Var.d(typeOfParameter, key) : null;
            return objD == null ? bundle != null ? bundle.getCharSequence(key) : null : objD;
        }

        public final p0 d(o0 typeOfParameter, String parameter) {
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            Pair pair = (Pair) n0.f19696e.get(typeOfParameter);
            Set set = pair != null ? (Set) pair.getFirst() : null;
            Pair pair2 = (Pair) n0.f19696e.get(typeOfParameter);
            Set set2 = pair2 != null ? (Set) pair2.getSecond() : null;
            return (set == null || !set.contains(parameter)) ? (set2 == null || !set2.contains(parameter)) ? p0.CustomData : p0.CustomAndOperationalData : p0.OperationalData;
        }

        private a() {
        }
    }

    static {
        Set of2 = SetsKt.setOf((Object[]) new String[]{"fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used"});
        f19694c = of2;
        Set of3 = SetsKt.setOf((Object[]) new String[]{"fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time"});
        f19695d = of3;
        f19696e = MapsKt.mapOf(TuplesKt.to(o0.IAPParameters, new Pair(of2, of3)));
    }

    public final void b(o0 type, String key, Object value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            d.f19642g.a(key);
            if (!(value instanceof String) && !(value instanceof Number)) {
                a1 a1Var = a1.f93282a;
                String str = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{value, key}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                throw new com.facebook.i(str);
            }
            if (!this.f19697a.containsKey(type)) {
                this.f19697a.put(type, new LinkedHashMap());
            }
            Map map = (Map) this.f19697a.get(type);
            if (map != null) {
                map.put(key, value);
            }
        } catch (Exception unused) {
        }
    }

    public final n0 c() {
        n0 n0Var = new n0();
        for (o0 o0Var : this.f19697a.keySet()) {
            Map map = (Map) this.f19697a.get(o0Var);
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        n0Var.b(o0Var, str, obj);
                    }
                }
            }
        }
        return n0Var;
    }

    public final Object d(o0 type, String key) {
        Map map;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f19697a.containsKey(type) && (map = (Map) this.f19697a.get(type)) != null) {
            return map.get(key);
        }
        return null;
    }

    public final JSONObject e() {
        JSONObject jSONObject;
        try {
            Map map = this.f19697a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((o0) ((Map.Entry) obj).getKey()).g(), ((Map.Entry) obj).getValue());
            }
            jSONObject = new JSONObject(MapsKt.toMap(linkedHashMap));
        } catch (Exception unused) {
            jSONObject = null;
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }
}
