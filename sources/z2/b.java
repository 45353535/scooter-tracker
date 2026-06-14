package z2;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.internal.z;
import com.facebook.s;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SharedPreferences f119152c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f119150a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f119151b = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f119153d = new AtomicBoolean(false);

    private b() {
    }

    public static final void a(String pathID, String predictedEvent) {
        if (e3.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Intrinsics.checkNotNullParameter(predictedEvent, "predictedEvent");
            if (!f119153d.get()) {
                f119150a.c();
            }
            Map map = f119151b;
            map.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = f119152c;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", z.b0(MapsKt.toMap(map))).apply();
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
        }
    }

    public static final String b(View view, String text) {
        if (e3.a.d(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = n2.f.j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return z.p0(jSONObject.toString());
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
            return null;
        }
    }

    private final void c() {
        String str = "";
        if (e3.a.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f119153d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = s.m().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…RE, Context.MODE_PRIVATE)");
            f119152c = sharedPreferences;
            Map map = f119151b;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
                sharedPreferences = null;
            }
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            map.putAll(z.Y(str));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public static final String d(String pathID) {
        if (e3.a.d(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Map map = f119151b;
            if (map.containsKey(pathID)) {
                return (String) map.get(pathID);
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
            return null;
        }
    }
}
