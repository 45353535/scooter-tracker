package b3;

import com.facebook.GraphRequest;
import com.facebook.internal.z;
import com.facebook.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f5825a = new k();

    private k() {
    }

    public static final boolean d(String str) {
        File fileF = f();
        if (fileF == null || str == null) {
            return false;
        }
        return new File(fileF, str).delete();
    }

    public static final String e(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        return th2.getCause() == null ? th2.toString() : String.valueOf(th2.getCause());
    }

    public static final File f() {
        File file = new File(s.m().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final String g(Thread thread) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    public static final String h(Throwable th2) {
        Throwable th3 = null;
        if (th2 == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th2 != null && th2 != th3) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                jSONArray.put(stackTraceElement.toString());
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean i(StackTraceElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        String className = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "element.className");
        if (StringsKt.a0(className, "com.facebook", false, 2, null)) {
            return true;
        }
        String className2 = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className2, "element.className");
        return StringsKt.a0(className2, "com.meta", false, 2, null);
    }

    public static final boolean j(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        Throwable th3 = null;
        while (th2 != null && th2 != th3) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            for (StackTraceElement element : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (i(element)) {
                    return true;
                }
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        return false;
    }

    public static final boolean k(Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement element : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (i(element)) {
                    String className = element.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "element.className");
                    if (!StringsKt.a0(className, "com.facebook.appevents.codeless", false, 2, null)) {
                        String className2 = element.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className2, "element.className");
                        if (!StringsKt.a0(className2, "com.facebook.appevents.suggestedevents", false, 2, null)) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    Intrinsics.checkNotNullExpressionValue(methodName, "element.methodName");
                    if (StringsKt.a0(methodName, "onClick", false, 2, null)) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        Intrinsics.checkNotNullExpressionValue(methodName2, "element.methodName");
                        if (StringsKt.a0(methodName2, "onItemClick", false, 2, null)) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            Intrinsics.checkNotNullExpressionValue(methodName3, "element.methodName");
                            if (!StringsKt.a0(methodName3, "onTouch", false, 2, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final File[] l() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: b3.i
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return k.m(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        a1 a1Var = a1.f93282a;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return new Regex(str).g(name);
    }

    public static final File[] n() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: b3.j
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return k.o(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        a1 a1Var = a1.f93282a;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return new Regex(str).g(name);
    }

    public static final File[] p() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: b3.h
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return k.q(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        a1 a1Var = a1.f93282a;
        String str = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return new Regex(str).g(name);
    }

    public static final JSONObject r(String str, boolean z10) {
        File fileF = f();
        if (fileF != null && str != null) {
            try {
                return new JSONObject(z.d0(new FileInputStream(new File(fileF, str))));
            } catch (Exception unused) {
                if (z10) {
                    d(str);
                }
            }
        }
        return null;
    }

    public static final void s(String str, JSONArray reports, GraphRequest.b bVar) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            JSONObject jSONObjectA = z.A();
            if (jSONObjectA != null) {
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            }
            GraphRequest.c cVar = GraphRequest.f19547n;
            a1 a1Var = a1.f93282a;
            String str2 = String.format("%s/instruments", Arrays.copyOf(new Object[]{s.n()}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            cVar.A(null, str2, jSONObject, bVar).l();
        } catch (JSONException unused) {
        }
    }

    public static final void t(String str, String str2) {
        File fileF = f();
        if (fileF == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileF, str));
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
