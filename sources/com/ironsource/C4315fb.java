package com.ironsource;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4315fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f43103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43104b;

    public C4315fb(@Nullable String str, int i10) {
        this.f43103a = str;
        this.f43104b = i10;
    }

    private final String b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        String strA = a(stackTrace, 4);
        String strB = b(stackTrace, 4);
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strA, strB}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    public final int a() {
        return this.f43104b;
    }

    @NotNull
    public final String c() {
        String str = this.f43103a;
        if (str == null || str.length() == 0) {
            return b();
        }
        return b() + " - " + this.f43103a;
    }

    private final String a(StackTraceElement[] stackTraceElementArr, int i10) {
        List listEmptyList;
        List listEmptyList2;
        if (stackTraceElementArr.length <= i10) {
            return "";
        }
        String className = stackTraceElementArr[i10].getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
        List listJ = new Regex("\\.").j(className, 0);
        if (listJ.isEmpty()) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ListIterator listIterator = listJ.listIterator(listJ.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listEmptyList = CollectionsKt.take(listJ, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listEmptyList = CollectionsKt.emptyList();
        }
        String str = ((String[]) listEmptyList.toArray(new String[0]))[r4.length - 1];
        if (!StringsKt.g0(str, "$", false, 2, null)) {
            return str;
        }
        List listJ2 = new Regex("\\$").j(str, 0);
        if (listJ2.isEmpty()) {
            listEmptyList2 = CollectionsKt.emptyList();
        } else {
            ListIterator listIterator2 = listJ2.listIterator(listJ2.size());
            while (listIterator2.hasPrevious()) {
                if (((String) listIterator2.previous()).length() != 0) {
                    listEmptyList2 = CollectionsKt.take(listJ2, listIterator2.nextIndex() + 1);
                    break;
                }
            }
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return ((String[]) listEmptyList2.toArray(new String[0]))[0];
    }

    private final String b(StackTraceElement[] stackTraceElementArr, int i10) {
        List listEmptyList;
        int i11;
        List listEmptyList2;
        List listEmptyList3;
        if (stackTraceElementArr.length > i10) {
            String className = stackTraceElementArr[i10].getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
            List listJ = new Regex("\\.").j(className, 0);
            if (!listJ.isEmpty()) {
                ListIterator listIterator = listJ.listIterator(listJ.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listEmptyList = CollectionsKt.take(listJ, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
            String str = strArr[strArr.length - 1];
            if (StringsKt.g0(str, "$", false, 2, null)) {
                List listJ2 = new Regex("\\$").j(str, 0);
                if (!listJ2.isEmpty()) {
                    ListIterator listIterator2 = listJ2.listIterator(listJ2.size());
                    while (listIterator2.hasPrevious()) {
                        if (((String) listIterator2.previous()).length() != 0) {
                            listEmptyList3 = CollectionsKt.take(listJ2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                    listEmptyList3 = CollectionsKt.emptyList();
                } else {
                    listEmptyList3 = CollectionsKt.emptyList();
                }
                return ((String[]) listEmptyList3.toArray(new String[0]))[1] + "." + stackTraceElementArr[i10].getMethodName();
            }
            String methodName = stackTraceElementArr[i10].getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName, "stackTrace[depth].methodName");
            if (StringsKt.g0(methodName, "$", false, 2, null) && stackTraceElementArr.length > (i11 = i10 + 1)) {
                String className2 = stackTraceElementArr[i11].getClassName();
                Intrinsics.checkNotNullExpressionValue(className2, "stackTrace[depth + 1]\n                .className");
                List listJ3 = new Regex("\\$").j(className2, 0);
                if (!listJ3.isEmpty()) {
                    ListIterator listIterator3 = listJ3.listIterator(listJ3.size());
                    while (listIterator3.hasPrevious()) {
                        if (((String) listIterator3.previous()).length() != 0) {
                            listEmptyList2 = CollectionsKt.take(listJ3, listIterator3.nextIndex() + 1);
                            break;
                        }
                    }
                    listEmptyList2 = CollectionsKt.emptyList();
                } else {
                    listEmptyList2 = CollectionsKt.emptyList();
                }
                String[] strArr2 = (String[]) listEmptyList2.toArray(new String[0]);
                if (strArr2.length > 1) {
                    return strArr2[1] + "." + stackTraceElementArr[i11].getMethodName();
                }
                String methodName2 = stackTraceElementArr[i11].getMethodName();
                Intrinsics.checkNotNullExpressionValue(methodName2, "{\n              stackTra….methodName\n            }");
                return methodName2;
            }
            String methodName3 = stackTraceElementArr[i10].getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName3, "stackTrace[depth].methodName");
            return methodName3;
        }
        return "";
    }
}
