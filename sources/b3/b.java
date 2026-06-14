package b3;

import b3.c;
import com.facebook.GraphRequest;
import com.facebook.a0;
import com.facebook.internal.e;
import com.facebook.internal.z;
import com.facebook.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5806a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f5807b;

    private b() {
    }

    public static final void b() {
        f5807b = true;
        if (s.q()) {
            f5806a.e();
        }
    }

    public static final void c(Throwable th2) {
        if (!f5807b || d() || th2 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "it.className");
            e.b bVarD = com.facebook.internal.e.d(className);
            if (bVarD != e.b.Unknown) {
                com.facebook.internal.e.c(bVarD);
                hashSet.add(bVarD.toString());
            }
        }
        if (!s.q() || hashSet.isEmpty()) {
            return;
        }
        c.a.c(new JSONArray((Collection) hashSet)).g();
    }

    public static final boolean d() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(c instrumentData, a0 response) {
        JSONObject jSONObjectD;
        Intrinsics.checkNotNullParameter(instrumentData, "$instrumentData");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.b() == null && (jSONObjectD = response.d()) != null && jSONObjectD.getBoolean("success")) {
                instrumentData.a();
            }
        } catch (JSONException unused) {
        }
    }

    public final void e() {
        if (z.U()) {
            return;
        }
        File[] fileArrN = k.n();
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrN) {
            final c cVarD = c.a.d(file);
            if (cVarD.f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", cVarD.toString());
                    GraphRequest.c cVar = GraphRequest.f19547n;
                    a1 a1Var = a1.f93282a;
                    String str = String.format("%s/instruments", Arrays.copyOf(new Object[]{s.n()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                    arrayList.add(cVar.A(null, str, jSONObject, new GraphRequest.b() { // from class: b3.a
                        @Override // com.facebook.GraphRequest.b
                        public final void a(a0 a0Var) {
                            b.f(cVarD, a0Var);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new com.facebook.z(arrayList).j();
    }
}
