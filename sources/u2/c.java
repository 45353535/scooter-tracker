package u2;

import com.facebook.s;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import w2.f;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f105185a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f105186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f105187c;

    private c() {
    }

    public static final void a() {
        if (e3.a.d(c.class)) {
            return;
        }
        try {
            f105186b = true;
            f105187c = com.facebook.internal.h.d("FBSDKFeatureIntegritySample", s.n(), false);
        } catch (Throwable th2) {
            e3.a.b(th2, c.class);
        }
    }

    private final String b(String str) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            String[] strArrQ = w2.f.q(f.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (strArrQ == null) {
                return "none";
            }
            String str2 = strArrQ[0];
            return str2 == null ? "none" : str2;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public static final void c(Map parameters) {
        if (e3.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            if (!f105186b || parameters.isEmpty()) {
                return;
            }
            try {
                List<String> list = CollectionsKt.toList(parameters.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : list) {
                    Object obj = parameters.get(str);
                    if (obj == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String str2 = (String) obj;
                    c cVar = f105185a;
                    if (cVar.d(str) || cVar.d(str2)) {
                        parameters.remove(str);
                        if (!f105187c) {
                            str2 = "";
                        }
                        jSONObject.put(str, str2);
                    }
                }
                if (jSONObject.length() != 0) {
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "restrictiveParamJson.toString()");
                    parameters.put("_onDeviceParams", string);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            e3.a.b(th2, c.class);
        }
    }

    private final boolean d(String str) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            return !Intrinsics.areEqual("none", b(str));
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }
}
