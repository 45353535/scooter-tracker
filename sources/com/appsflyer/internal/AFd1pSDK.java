package com.appsflyer.internal;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AFd1pSDK {
    @NotNull
    public static final ExceptionInfo AFAdRevenueData(@NotNull Throwable th2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        String name = th2.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return new ExceptionInfo(name + ": " + str, getRevenue(th2), lf.c.b(th2), 0, 8, null);
    }

    @NotNull
    private static String getRevenue(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(th2, "");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            if (!StringsKt.a0(className, "com.appsflyer", false, 2, null)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        String str = th2 + IOUtils.LINE_SEPARATOR_UNIX + CollectionsKt.joinToString$default(arrayList, IOUtils.LINE_SEPARATOR_UNIX, null, null, 0, null, new Function1<StackTraceElement, CharSequence>() { // from class: com.appsflyer.internal.AFd1pSDK.2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@NotNull StackTraceElement stackTraceElement2) {
                Intrinsics.checkNotNullParameter(stackTraceElement2, "");
                return "at " + stackTraceElement2;
            }
        }, 30, null);
        Intrinsics.checkNotNullParameter(str, "");
        return AFd1rSDK.AFAdRevenueData(str, "SHA-256");
    }
}
