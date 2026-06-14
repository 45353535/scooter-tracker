package n2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f95078e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f95080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f95081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f95082d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(JSONObject component) throws JSONException {
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f95079a = string;
        String strOptString = component.optString("value");
        Intrinsics.checkNotNullExpressionValue(strOptString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f95080b = strOptString;
        String strOptString2 = component.optString("path_type", "absolute");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "component.optString(Cons…tants.PATH_TYPE_ABSOLUTE)");
        this.f95082d = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = component.optJSONArray("path");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new c(jSONObject));
            }
        }
        this.f95081c = arrayList;
    }

    public final String a() {
        return this.f95079a;
    }

    public final List b() {
        return this.f95081c;
    }

    public final String c() {
        return this.f95082d;
    }

    public final String d() {
        return this.f95080b;
    }
}
