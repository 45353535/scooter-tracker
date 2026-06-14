package f1;

import f1.bf;
import f1.xc;
import java.util.Locale;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f70221a;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70222f = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke() {
            return new JSONObject();
        }
    }

    public jg(Function0 jsonFactory) {
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        this.f70221a = jsonFactory;
    }

    public final String a(y0 event, fb environment) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(environment, "environment");
        String string = e(d(c(i(j(g(h((JSONObject) this.f70221a.invoke(), environment), event), environment), event), event), environment), environment, event.a()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final JSONObject b(fb fbVar, String str) {
        Object objB;
        JSONObject jSONObject = (JSONObject) this.f70221a.invoke();
        try {
            Result.Companion companion = Result.f93230c;
            jSONObject.put("device_battery_level", fbVar.n());
            jSONObject.put("device_charging_status", fbVar.o());
            jSONObject.put("device_language", fbVar.s());
            jSONObject.put("device_timezone", fbVar.B());
            jSONObject.put("device_volume", fbVar.D());
            jSONObject.put("device_mute", fbVar.w());
            jSONObject.put("device_audio_output", fbVar.m());
            jSONObject.put("device_storage", fbVar.A());
            jSONObject.put("device_low_memory_warning", fbVar.t());
            jSONObject.put("device_up_time", fbVar.C());
            jSONObject.put("chartboost_sdk_autocache_enabled", fbVar.g());
            jSONObject.put("chartboost_sdk_gdpr", fbVar.j());
            jSONObject.put("chartboost_sdk_ccpa", fbVar.h());
            jSONObject.put("chartboost_sdk_coppa", fbVar.i());
            jSONObject.put("chartboost_sdk_lgpd", fbVar.k());
            jSONObject.put(Reporting.Key.SESSION_DURATION, fbVar.a());
            JSONObject jSONObjectPut = jSONObject.put("session_impression_count", f(fbVar, str));
            JSONObject jSONObject2 = jSONObjectPut;
            if (jSONObjectPut == null) {
                jSONObject2 = jSONObject;
            }
            objB = Result.b(jSONObject2);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            eg.i("Cannot generate tracking body data: ", thG);
        }
        Object obj = jSONObject;
        if (Result.g(objB) == null) {
            obj = objB;
        }
        return (JSONObject) obj;
    }

    public final JSONObject c(JSONObject jSONObject, y0 y0Var) {
        Object objB;
        String strB;
        String strA;
        String strG;
        JSONObject jSONObjectPut;
        xc.AdSize adSizeC;
        try {
            Result.Companion companion = Result.f93230c;
            String lowerCase = y0Var.a().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            jSONObject.put("ad_type", lowerCase);
            xc xcVarP = y0Var.p();
            if (xcVarP == null || (strB = xcVarP.b()) == null) {
                strB = "missing impression id";
            }
            jSONObject.put("ad_impression_id", strB);
            xc xcVarP2 = y0Var.p();
            if (xcVarP2 == null || (strA = xcVarP2.a()) == null) {
                strA = "missing creative id";
            }
            jSONObject.put("ad_creative_id", strA);
            jSONObject.put("ad_location_id", y0Var.h());
            xc xcVarP3 = y0Var.p();
            if (xcVarP3 == null || (strG = xcVarP3.g()) == null) {
                strG = "";
            }
            jSONObject.put("template_url", strG);
            xc xcVarP4 = y0Var.p();
            if (xcVarP4 == null || (adSizeC = xcVarP4.c()) == null) {
                jSONObjectPut = null;
            } else {
                jSONObject.put("ad_height", adSizeC.getHeight());
                jSONObjectPut = jSONObject.put("ad_width", adSizeC.getWidth());
            }
            if (jSONObjectPut == null) {
                jSONObjectPut = jSONObject;
            }
            objB = Result.b(jSONObjectPut);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            eg.i("Cannot generate tracking body data: ", thG);
        }
        Object obj = jSONObject;
        if (Result.g(objB) == null) {
            obj = objB;
        }
        return (JSONObject) obj;
    }

    public final JSONObject d(JSONObject jSONObject, fb fbVar) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            jSONObject.put("device_id", fbVar.r());
            jSONObject.put("device_make", fbVar.u());
            jSONObject.put("device_model", fbVar.v());
            jSONObject.put("device_os_version", fbVar.y());
            jSONObject.put("device_platform", fbVar.z());
            jSONObject.put("device_country", fbVar.q());
            jSONObject.put("device_connection_type", fbVar.p());
            JSONObject jSONObjectPut = jSONObject.put("device_orientation", fbVar.x());
            JSONObject jSONObject2 = jSONObjectPut;
            if (jSONObjectPut == null) {
                jSONObject2 = jSONObject;
            }
            objB = Result.b(jSONObject2);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            eg.i("Cannot generate tracking body data: ", thG);
        }
        Object obj = jSONObject;
        if (Result.g(objB) == null) {
            obj = objB;
        }
        return (JSONObject) obj;
    }

    public final JSONObject e(JSONObject jSONObject, fb fbVar, String str) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObjectPut = jSONObject.put("payload", b(fbVar, str));
            JSONObject jSONObject2 = jSONObjectPut;
            if (jSONObjectPut == null) {
                jSONObject2 = jSONObject;
            }
            objB = Result.b(jSONObject2);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            eg.i("Cannot generate tracking body data: ", thG);
        }
        Object obj = jSONObject;
        if (Result.g(objB) == null) {
            obj = objB;
        }
        return (JSONObject) obj;
    }

    public final int f(fb fbVar, String str) {
        if (Intrinsics.areEqual(str, bf.b.f69484g.b())) {
            return fbVar.d();
        }
        if (Intrinsics.areEqual(str, bf.c.f69485g.b())) {
            return fbVar.e();
        }
        if (Intrinsics.areEqual(str, bf.a.f69483g.b())) {
            return fbVar.c();
        }
        return 0;
    }

    public final JSONObject g(JSONObject jSONObject, y0 y0Var) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            jSONObject.put(com.taurusx.tax.w.s.s.I, y0Var.k().getValue());
            jSONObject.put("event_message", y0Var.j());
            jSONObject.put(Reporting.Key.EVENT_TYPE, y0Var.q().name());
            jSONObject.put("event_timestamp", y0Var.o());
            JSONObject jSONObjectPut = jSONObject.put("event_latency", y0Var.f());
            JSONObject jSONObject2 = jSONObjectPut;
            if (jSONObjectPut == null) {
                jSONObject2 = jSONObject;
            }
            objB = Result.b(jSONObject2);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            eg.i("Cannot generate tracking body data: ", thG);
        }
        Object obj = jSONObject;
        if (Result.g(objB) == null) {
            obj = objB;
        }
        return (JSONObject) obj;
    }

    public final JSONObject h(JSONObject jSONObject, fb fbVar) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            jSONObject.put("app_id", fbVar.f());
            JSONObject jSONObjectPut = jSONObject.put("chartboost_sdk_version", fbVar.l());
            JSONObject jSONObject2 = jSONObjectPut;
            if (jSONObjectPut == null) {
                jSONObject2 = jSONObject;
            }
            objB = Result.b(jSONObject2);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            eg.i("Cannot generate tracking body data: ", thG);
        }
        Object obj = jSONObject;
        if (Result.g(objB) == null) {
            obj = objB;
        }
        return (JSONObject) obj;
    }

    public final JSONObject i(JSONObject jSONObject, y0 y0Var) {
        Object objB;
        JSONObject jSONObjectPut;
        try {
            Result.Companion companion = Result.f93230c;
            b1.e eVarI = y0Var.i();
            if (eVarI != null) {
                jSONObject.put("mediation_sdk", eVarI.f5794a);
                jSONObject.put("mediation_sdk_version", eVarI.f5795b);
                jSONObjectPut = jSONObject.put("mediation_sdk_adapter_version", eVarI.f5796c);
            } else {
                jSONObjectPut = null;
            }
            if (jSONObjectPut == null) {
                jSONObjectPut = jSONObject;
            }
            objB = Result.b(jSONObjectPut);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            eg.i("Cannot generate tracking body data: ", thG);
        }
        Object obj = jSONObject;
        if (Result.g(objB) == null) {
            obj = objB;
        }
        return (JSONObject) obj;
    }

    public final JSONObject j(JSONObject jSONObject, fb fbVar) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            jSONObject.put("session_id", fbVar.b());
            JSONObject jSONObjectPut = jSONObject.put("session_count", fbVar.E());
            JSONObject jSONObject2 = jSONObjectPut;
            if (jSONObjectPut == null) {
                jSONObject2 = jSONObject;
            }
            objB = Result.b(jSONObject2);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            eg.i("Cannot generate tracking body data: ", thG);
        }
        Object obj = jSONObject;
        if (Result.g(objB) == null) {
            obj = objB;
        }
        return (JSONObject) obj;
    }

    public /* synthetic */ jg(Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a.f70222f : function0);
    }
}
