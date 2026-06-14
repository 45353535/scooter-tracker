package jd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import id.z0;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import pd.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f85812a = new d();

    private d() {
    }

    private final z0.b a(String str) {
        for (z0.b bVar : z0.b.values()) {
            if (StringsKt.N(bVar.name(), str, true)) {
                return bVar;
            }
        }
        return null;
    }

    private final Bitmap b(String str) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrH = g0.h(bytes, 0, 1, null);
            objB = Result.b(bArrH == null ? null : BitmapFactory.decodeByteArray(bArrH, 0, bArrH.length));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (Bitmap) (Result.i(objB) ? null : objB);
    }

    public static final z0 c(String json) {
        Object objB;
        Intrinsics.checkNotNullParameter(json, "json");
        d dVar = f85812a;
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObject = new JSONObject(json);
            String title = jSONObject.optString("title");
            String subtitle = jSONObject.optString("subtitle");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actions");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            } else {
                Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "rootObject.optJSONArray(\"actions\") ?: JSONArray()");
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                String strOptString = jSONObject2.optString("type");
                Intrinsics.checkNotNullExpressionValue(strOptString, "actionObject.optString(\"type\")");
                z0.b bVarA = dVar.a(strOptString);
                if (bVarA != null) {
                    String actionTitle = jSONObject2.optString("title");
                    String data = jSONObject2.optString("data");
                    String it = jSONObject2.optString("icon");
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    if (StringsKt.y0(it)) {
                        it = null;
                    }
                    Bitmap bitmapB = it != null ? dVar.b(it) : null;
                    Intrinsics.checkNotNullExpressionValue(actionTitle, "actionTitle");
                    Intrinsics.checkNotNullExpressionValue(data, "data");
                    arrayList.add(new z0.a(bVarA, actionTitle, data, bitmapB));
                }
            }
            Intrinsics.checkNotNullExpressionValue(title, "title");
            Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
            objB = Result.b(new z0(title, subtitle, arrayList));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (z0) (Result.i(objB) ? null : objB);
    }
}
