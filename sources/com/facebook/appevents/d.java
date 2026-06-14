package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.internal.r;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.b1;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f19642g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashSet f19643h = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f19644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f19645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f19648f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(String identifier) {
            boolean zContains;
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            if (identifier.length() == 0 || identifier.length() > 40) {
                a1 a1Var = a1.f93282a;
                String str = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{identifier, 40}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                throw new com.facebook.i(str);
            }
            synchronized (d.f19643h) {
                zContains = d.f19643h.contains(identifier);
                Unit unit = Unit.f93236a;
            }
            if (zContains) {
                return;
            }
            if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").g(identifier)) {
                synchronized (d.f19643h) {
                    d.f19643h.add(identifier);
                }
            } else {
                a1 a1Var2 = a1.f93282a;
                String str2 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{identifier}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                throw new com.facebook.i(str2);
            }
        }

        private a() {
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f19649f = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f19650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f19651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f19652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f19653e;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(String jsonString, String operationalJsonString, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            Intrinsics.checkNotNullParameter(operationalJsonString, "operationalJsonString");
            this.f19650b = jsonString;
            this.f19651c = operationalJsonString;
            this.f19652d = z10;
            this.f19653e = z11;
        }

        private final Object readResolve() throws ObjectStreamException, JSONException {
            return new d(this.f19650b, this.f19651c, this.f19652d, this.f19653e, null);
        }
    }

    public /* synthetic */ d(String str, String str2, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z10, z11);
    }

    private final JSONObject i(String str, String str2, Double d10, Bundle bundle, UUID uuid) throws JSONException {
        f19642g.a(str2);
        JSONObject jSONObject = new JSONObject();
        String strE = y2.a.e(str2);
        if (Intrinsics.areEqual(strE, str2)) {
            strE = u2.f.d(str2);
        }
        jSONObject.put("_eventName", strE);
        jSONObject.put("_logTime", System.currentTimeMillis() / ((long) 1000));
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map mapO = o(this, bundle, false, 2, null);
            for (String str3 : mapO.keySet()) {
                jSONObject.put(str3, mapO.get(str3));
            }
        }
        if (d10 != null) {
            jSONObject.put("_valueToSum", d10.doubleValue());
        }
        if (this.f19647e) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f19646d) {
            jSONObject.put("_implicitlyLogged", "1");
            return jSONObject;
        }
        r.a aVar = com.facebook.internal.r.f19964e;
        com.facebook.d0 d0Var = com.facebook.d0.APP_EVENTS;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "eventObject.toString()");
        aVar.c(d0Var, "AppEvents", "Created app event '%s'", string);
        return jSONObject;
    }

    private final Map n(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String key : bundle.keySet()) {
            a aVar = f19642g;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            aVar.a(key);
            Object obj = bundle.get(key);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                a1 a1Var = a1.f93282a;
                String str = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                throw new com.facebook.i(str);
            }
            map.put(key, obj.toString());
        }
        if (!z10) {
            u2.c.c(map);
            y2.a.f(b1.d(map), this.f19648f);
            o2.a.c(b1.d(map), this.f19648f);
        }
        return map;
    }

    static /* synthetic */ Map o(d dVar, Bundle bundle, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return dVar.n(bundle, z10);
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.f19644b.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        String string2 = this.f19645c.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "operationalJsonObject.toString()");
        return new b(string, string2, this.f19646d, this.f19647e);
    }

    public final boolean g() {
        return this.f19646d;
    }

    public final JSONObject h() {
        return this.f19644b;
    }

    public final JSONObject j() {
        return this.f19644b;
    }

    public final String k() {
        return this.f19648f;
    }

    public final JSONObject l() {
        return this.f19645c;
    }

    public final boolean m() {
        return this.f19646d;
    }

    public String toString() {
        a1 a1Var = a1.f93282a;
        String str = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f19644b.optString("_eventName"), Boolean.valueOf(this.f19646d), this.f19644b.toString()}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    public d(String contextName, String eventName, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid, n0 n0Var) {
        JSONObject jSONObjectE;
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f19646d = z10;
        this.f19647e = z11;
        this.f19648f = eventName;
        this.f19645c = (n0Var == null || (jSONObjectE = n0Var.e()) == null) ? new JSONObject() : jSONObjectE;
        this.f19644b = i(contextName, eventName, d10, bundle, uuid);
    }

    private d(String str, String str2, boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject(str);
        this.f19644b = jSONObject;
        this.f19645c = new JSONObject(str2);
        this.f19646d = z10;
        String strOptString = jSONObject.optString("_eventName");
        Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.f19648f = strOptString;
        this.f19647e = z11;
    }
}
