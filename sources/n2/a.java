package n2;

import com.taurusx.tax.w.s.s;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f95061j = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f95063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC1092a f95064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f95065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f95066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f95067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f95068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f95069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f95070i;

    /* JADX INFO: renamed from: n2.a$a, reason: collision with other inner class name */
    public enum EnumC1092a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(JSONObject mapping) throws JSONException {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            String eventName = mapping.getString(s.I);
            String string = mapping.getString("method");
            Intrinsics.checkNotNullExpressionValue(string, "mapping.getString(\"method\")");
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = string.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            c cVarValueOf = c.valueOf(upperCase);
            String string2 = mapping.getString(Reporting.Key.EVENT_TYPE);
            Intrinsics.checkNotNullExpressionValue(string2, "mapping.getString(\"event_type\")");
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase2 = string2.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            EnumC1092a enumC1092aValueOf = EnumC1092a.valueOf(upperCase2);
            String appVersion = mapping.getString("app_version");
            JSONArray jSONArray = mapping.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jsonPath = jSONArray.getJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jsonPath, "jsonPath");
                arrayList.add(new n2.c(jsonPath));
            }
            String pathType = mapping.optString("path_type", "absolute");
            JSONArray jSONArrayOptJSONArray = mapping.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jsonParameter = jSONArrayOptJSONArray.getJSONObject(i11);
                    Intrinsics.checkNotNullExpressionValue(jsonParameter, "jsonParameter");
                    arrayList2.add(new n2.b(jsonParameter));
                }
            }
            String componentId = mapping.optString("component_id");
            String activityName = mapping.optString("activity_name");
            Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
            Intrinsics.checkNotNullExpressionValue(appVersion, "appVersion");
            Intrinsics.checkNotNullExpressionValue(componentId, "componentId");
            Intrinsics.checkNotNullExpressionValue(pathType, "pathType");
            Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
            return new a(eventName, cVarValueOf, enumC1092aValueOf, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }

        public final List b(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "array.getJSONObject(i)");
                        arrayList.add(a(jSONObject));
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }

        private b() {
        }
    }

    public enum c {
        MANUAL,
        INFERENCE
    }

    public a(String eventName, c method, EnumC1092a type, String appVersion, List path, List parameters, String componentId, String pathType, String activityName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.f95062a = eventName;
        this.f95063b = method;
        this.f95064c = type;
        this.f95065d = appVersion;
        this.f95066e = path;
        this.f95067f = parameters;
        this.f95068g = componentId;
        this.f95069h = pathType;
        this.f95070i = activityName;
    }

    public final String a() {
        return this.f95070i;
    }

    public final String b() {
        return this.f95062a;
    }

    public final List c() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(this.f95067f);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(parameters)");
        return listUnmodifiableList;
    }

    public final List d() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(this.f95066e);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(path)");
        return listUnmodifiableList;
    }
}
