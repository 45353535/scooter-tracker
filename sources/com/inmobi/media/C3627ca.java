package com.inmobi.media;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.inmobi.media.C3627ca;
import com.ironsource.C4240b4;
import com.taurusx.tax.y.z.w.s;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3627ca implements Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W9 f38334a;

    public C3627ca(W9 incompleteLogData) {
        Intrinsics.checkNotNullParameter(incompleteLogData, "incompleteLogData");
        this.f38334a = incompleteLogData;
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", s.z.f67720z);
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            JSONArray jSONArray = this.f38334a.f37939b;
            Ab logLevel = Ab.f36563c;
            SimpleDateFormat simpleDateFormat = Db.f36722a;
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", s.z.f67720z);
            Intrinsics.checkNotNullParameter(message, "message");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scope", "ERROR");
            jSONObject.put("timestamp", Db.f36722a.format(new Date()));
            jSONObject.put(s.z.f67720z, "IncompleteLogFinalizer");
            jSONObject.put("data", message);
            jSONArray.put(jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void b(String value) {
        Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", s.z.f67720z);
        Intrinsics.checkNotNullParameter("exitReason", C4240b4.i.W);
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            this.f38334a.f37938a.put("exitReason", value);
        } catch (Exception unused) {
        }
    }

    public final Object b() {
        final String str = "IncompleteLogFinalizer";
        Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", s.z.f67720z);
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObject = this.f38334a.f37938a;
            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            if (!Intrinsics.areEqual(jSONObject.toString(), JsonUtils.EMPTY_JSON)) {
                JSONArray jSONArray = this.f38334a.f37939b;
                Intrinsics.checkNotNullParameter(jSONArray, "<this>");
                if (jSONArray.length() != 0) {
                    CoroutineScope coroutineScope = Sb.f37702a;
                    Rb.a(new Function0() { // from class: w3.c6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C3627ca.a(this.f107003b, str);
                        }
                    });
                }
            }
            return Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    public static final Unit a(C3627ca c3627ca, String str) throws JSONException {
        W9 w92 = c3627ca.f38334a;
        JSONObject jSONObject = w92.f37938a;
        JSONArray jSONArray = w92.f37939b;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vitals", jSONObject);
        jSONObject2.put(s.z.f67719y, jSONArray);
        String string = jSONObject2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Tb.a(str, string, c3627ca.f38334a.f37940c.f39367a);
        String str2 = c3627ca.f38334a.f37940c.f39367a;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        C3980qb c3980qb = c3627ca.f38334a.f37940c;
        eg.h.b(null, new C3601ba(new C3980qb(str2, timeInMillis, 0, c3980qb.f39370d, true, c3980qb.f39372f), null), 1, null);
        return Unit.f93236a;
    }

    public final Object a() {
        try {
            Result.Companion companion = Result.f93230c;
            CoroutineScope coroutineScope = Sb.f37702a;
            return Result.b(Result.a(Rb.a(new Function0() { // from class: w3.b6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3627ca.a(this.f106990b);
                }
            })));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    public static final Unit a(C3627ca c3627ca) {
        Tb.a(c3627ca.f38334a.f37940c.f39367a);
        eg.h.b(null, new C3575aa(c3627ca, null), 1, null);
        return Unit.f93236a;
    }
}
