package sh;

import android.util.Log;
import hh.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f104700a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CopyOnWriteArraySet f104701b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f104702c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = x.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = x.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = ph.e.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = lh.e.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f104702c = MapsKt.toMap(linkedHashMap);
    }

    private c() {
    }

    private final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f104701b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(d.f104703a);
        }
    }

    private final String d(String str) {
        String str2 = (String) f104702c.get(str);
        return str2 == null ? StringsKt.J1(str, 23) : str2;
    }

    public final void a(String loggerName, int i10, String message, Throwable th2) {
        int iMin;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String strD = d(loggerName);
        if (Log.isLoggable(strD, i10)) {
            if (th2 != null) {
                message = message + '\n' + Log.getStackTraceString(th2);
            }
            String str = message;
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                int iU0 = StringsKt.u0(str, '\n', i11, false, 4, null);
                if (iU0 == -1) {
                    iU0 = length;
                }
                while (true) {
                    iMin = Math.min(iU0, i11 + 4000);
                    String strSubstring = str.substring(i11, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strD, strSubstring);
                    if (iMin >= iU0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : f104702c.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
