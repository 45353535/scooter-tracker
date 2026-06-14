package q2;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.core.os.g;
import androidx.privacysandbox.ads.adservices.measurement.j;
import com.facebook.appevents.d;
import com.facebook.s;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import java.net.URLEncoder;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.k;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f98680a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f98681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f98682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static p2.a f98683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f98684e;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ JSONObject f98685f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject) {
            super(1);
            this.f98685f = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            Object objOpt = this.f98685f.opt(str);
            if (objOpt == null) {
                return null;
            }
            try {
                return URLEncoder.encode(str, "UTF-8") + D5.T + URLEncoder.encode(objOpt.toString(), "UTF-8");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: q2.b$b, reason: collision with other inner class name */
    public static final class C1167b implements OutcomeReceiver {
        C1167b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Log.d(b.c(), "OUTCOME_RECEIVER_TRIGGER_FAILURE");
            p2.a aVarB = b.b();
            if (aVarB == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                aVarB = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_ara_failed_reason", error.toString());
            Unit unit = Unit.f93236a;
            aVarB.b("gps_ara_failed", bundle);
        }

        public void onResult(Object result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Log.d(b.c(), "OUTCOME_RECEIVER_TRIGGER_SUCCESS");
            p2.a aVarB = b.b();
            if (aVarB == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                aVarB = null;
            }
            aVarB.b("gps_ara_succeed", null);
        }
    }

    static {
        String string = b.class.toString();
        Intrinsics.checkNotNullExpressionValue(string, "GpsAraTriggersManager::class.java.toString()");
        f98681b = string;
    }

    private b() {
    }

    public static final /* synthetic */ p2.a b() {
        if (e3.a.d(b.class)) {
            return null;
        }
        try {
            return f98683d;
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (e3.a.d(b.class)) {
            return null;
        }
        try {
            return f98681b;
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
            return null;
        }
    }

    private final boolean d() {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            if (!f98682c) {
                return false;
            }
            p2.a aVar = null;
            try {
                Class.forName("android.adservices.measurement.MeasurementManager");
                return true;
            } catch (Error e10) {
                Log.i(f98681b, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                p2.a aVar2 = f98683d;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar = aVar2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", e10.toString());
                Unit unit = Unit.f93236a;
                aVar.b("gps_ara_failed", bundle);
                return false;
            } catch (Exception e11) {
                Log.i(f98681b, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                p2.a aVar3 = f98683d;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar = aVar3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_ara_failed_reason", e11.toString());
                Unit unit2 = Unit.f93236a;
                aVar.b("gps_ara_failed", bundle2);
                return false;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    public static final void e() {
        if (e3.a.d(b.class)) {
            return;
        }
        try {
            f98682c = true;
            f98683d = new p2.a(s.m());
            f98684e = "https://www." + s.u() + "/privacy_sandbox/mobile/register/trigger";
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
        }
    }

    private final String f(d dVar) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObjectH = dVar.h();
            if (jSONObjectH != null && jSONObjectH.length() != 0) {
                Iterator<String> itKeys = jSONObjectH.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "params.keys()");
                return k.O(k.R(k.h(itKeys), new a(jSONObjectH)), C4240b4.j.f42670c, null, null, 0, null, null, 62, null);
            }
            return "";
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final boolean g(d dVar) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            String eventName = dVar.h().getString("_eventName");
            if (!Intrinsics.areEqual(eventName, "_removed_")) {
                Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
                if (!StringsKt.g0(eventName, "gps", false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(String applicationId, d event) {
        if (e3.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
            Intrinsics.checkNotNullParameter(event, "$event");
            f98680a.h(applicationId, event);
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
        }
    }

    public final void h(String applicationId, d event) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            if (g(event) && d()) {
                Context contextM = s.m();
                p2.a aVar = null;
                try {
                    MeasurementManager measurementManagerA = androidx.privacysandbox.ads.adservices.measurement.k.a(contextM.getSystemService(j.a()));
                    if (measurementManagerA == null) {
                        measurementManagerA = MeasurementManager.get(contextM.getApplicationContext());
                    }
                    if (measurementManagerA == null) {
                        Log.w(f98681b, "FAILURE_GET_MEASUREMENT_MANAGER");
                        p2.a aVar2 = f98683d;
                        if (aVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                            aVar2 = null;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("gps_ara_failed_reason", "Failed to get measurement manager");
                        Unit unit = Unit.f93236a;
                        aVar2.b("gps_ara_failed", bundle);
                        return;
                    }
                    String strF = f(event);
                    StringBuilder sb2 = new StringBuilder();
                    String str = f98684e;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("serverUri");
                        str = null;
                    }
                    sb2.append(str);
                    sb2.append('?');
                    sb2.append("app_id");
                    sb2.append(D5.T);
                    sb2.append(applicationId);
                    sb2.append('&');
                    sb2.append(strF);
                    Uri uri = Uri.parse(sb2.toString());
                    Intrinsics.checkNotNullExpressionValue(uri, "parse(\"$serverUri?$appId…=$applicationId&$params\")");
                    measurementManagerA.registerTrigger(uri, s.t(), g.a(new C1167b()));
                } catch (Error e10) {
                    Log.w(f98681b, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                    p2.a aVar3 = f98683d;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                    } else {
                        aVar = aVar3;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("gps_ara_failed_reason", e10.toString());
                    Unit unit2 = Unit.f93236a;
                    aVar.b("gps_ara_failed", bundle2);
                } catch (Exception e11) {
                    Log.w(f98681b, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                    p2.a aVar4 = f98683d;
                    if (aVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                    } else {
                        aVar = aVar4;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("gps_ara_failed_reason", e11.toString());
                    Unit unit3 = Unit.f93236a;
                    aVar.b("gps_ara_failed", bundle3);
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final void i(final String applicationId, final d event) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            s.t().execute(new Runnable() { // from class: q2.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.j(applicationId, event);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }
}
