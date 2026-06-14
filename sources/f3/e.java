package f3;

import b3.k;
import com.facebook.GraphRequest;
import com.facebook.a0;
import com.facebook.internal.z;
import com.facebook.s;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f71934a = new e();

    private e() {
    }

    public static final void d() {
        if (s.q()) {
            h();
        }
    }

    public static final File[] e() {
        File fileF = k.f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: f3.d
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return e.f(file, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "reportDir.listFiles { di…OR_REPORT_PREFIX)))\n    }");
        return fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        a1 a1Var = a1.f93282a;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return new Regex(str).g(name);
    }

    public static final void g(String str) {
        try {
            new a(str).e();
        } catch (Exception unused) {
        }
    }

    public static final void h() {
        if (z.U()) {
            return;
        }
        File[] fileArrE = e();
        final ArrayList arrayList = new ArrayList();
        for (File file : fileArrE) {
            a aVar = new a(file);
            if (aVar.d()) {
                arrayList.add(aVar);
            }
        }
        CollectionsKt.sortWith(arrayList, new Comparator() { // from class: f3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.i((a) obj, (a) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < arrayList.size() && i10 < 1000; i10++) {
            jSONArray.put(arrayList.get(i10));
        }
        k.s("error_reports", jSONArray, new GraphRequest.b() { // from class: f3.c
            @Override // com.facebook.GraphRequest.b
            public final void a(a0 a0Var) {
                e.j(arrayList, a0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(a aVar, a o22) {
        Intrinsics.checkNotNullExpressionValue(o22, "o2");
        return aVar.b(o22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ArrayList validReports, a0 response) {
        JSONObject jSONObjectD;
        Intrinsics.checkNotNullParameter(validReports, "$validReports");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.b() == null && (jSONObjectD = response.d()) != null && jSONObjectD.getBoolean("success")) {
                Iterator it = validReports.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a();
                }
            }
        } catch (JSONException unused) {
        }
    }
}
