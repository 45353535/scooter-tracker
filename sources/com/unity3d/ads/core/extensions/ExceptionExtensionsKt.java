package com.unity3d.ads.core.extensions;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.services.SDKErrorHandler;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import uf.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0006"}, d2 = {"getShortenedStackTrace", "", "", "maxLines", "", "retrieveUnityCrashValue", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExceptionExtensionsKt {
    @NotNull
    public static final String getShortenedStackTrace(@NotNull Throwable th2, int i10) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th2.printStackTrace(printWriter);
                    String string = stringWriter.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "stringWriter.toString()");
                    String strO = k.O(k.Z(StringsKt.E0(StringsKt.v1(string).toString()), i10), IOUtils.LINE_SEPARATOR_UNIX, null, null, 0, null, null, 62, null);
                    c.a(printWriter, null);
                    c.a(stringWriter, null);
                    return strO;
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 15;
        }
        return getShortenedStackTrace(th2, i10);
    }

    @NotNull
    public static final String retrieveUnityCrashValue(@NotNull Throwable th2) {
        StackTraceElement stackTraceElement;
        boolean zG0;
        String className;
        Intrinsics.checkNotNullParameter(th2, "<this>");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "this.stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            stackTraceElement = null;
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement2 = stackTrace[i10];
            if (stackTraceElement2 == null || (className = stackTraceElement2.getClassName()) == null) {
                zG0 = false;
            } else {
                Intrinsics.checkNotNullExpressionValue(className, "className");
                zG0 = StringsKt.g0(className, SDKErrorHandler.UNITY_PACKAGE, false, 2, null);
            }
            if (zG0) {
                stackTraceElement = stackTraceElement2;
                break;
            }
            i10++;
        }
        if (stackTraceElement != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "unknown";
            } else {
                Intrinsics.checkNotNullExpressionValue(fileName, "it.fileName ?: SDKErrorHandler.UNKNOWN_FILE");
            }
            String str = fileName + '_' + stackTraceElement.getLineNumber();
            if (str != null) {
                return str;
            }
        }
        return "unknown";
    }
}
