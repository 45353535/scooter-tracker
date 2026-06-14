package com.inmobi.media;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.sdk.InMobiSdk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3790il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CoroutineScope f38771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Regex f38772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f38773c;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f38771a = kotlinx.coroutines.i.a(eg.w0.c(executorServiceNewSingleThreadExecutor).plus(eg.m1.b(null, 1, null)));
        f38772b = new Regex("com\\.inmobi\\.(adquality|ads|commons|compliance|constants|logging|media|sdk|signals|unification|unifiedId)");
        Method[] declaredMethods = PublisherCallbacks.class.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            arrayList.add(method.getName());
        }
        f38773c = CollectionsKt.toSet(arrayList);
    }

    public static final String a(Thread thread, Throwable error) {
        String string;
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        try {
            StackTraceElement[] stackTrace = error.getStackTrace();
            Intrinsics.checkNotNull(stackTrace);
            boolean zB = b(stackTrace);
            if (!zB) {
                string = "";
            } else if (stackTrace.length >= P9.a().getCrashConfig().getMaxLengthOfStackTrace()) {
                string = "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
            } else {
                StackTraceElement[] stackTrace2 = error.getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace2, "getStackTrace(...)");
                Intrinsics.checkNotNullParameter(stackTrace2, "<this>");
                StringBuilder sb2 = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTrace2) {
                    sb2.append(stackTraceElement.toString());
                    sb2.append('\n');
                }
                string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            }
            jSONObject.put("name", error.getClass().getSimpleName());
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, error.getMessage());
            jSONObject.put("stack", string);
            if (thread != null) {
                jSONObject.put("thread", thread.getName());
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            P9.a(jSONObject, zB, jCurrentTimeMillis);
            CrashConfig crashConfig = AbstractC3760hf.f38713a;
            AbstractC3760hf.a(jSONObject, error instanceof OutOfMemoryError, zB, jCurrentTimeMillis);
            String string2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        } catch (OutOfMemoryError unused) {
            return "Did not append stackTrace to avoid potential ANR because of the large size of the stack trace";
        } catch (JSONException e10) {
            e10.toString();
            return "";
        }
    }

    public static final boolean b(StackTraceElement[] stackTraceElementArr) {
        Intrinsics.checkNotNullParameter(stackTraceElementArr, "<this>");
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length && !a(stackTraceElementArr[i10], InMobiInterstitial.a.class.getSuperclass()) && !a(stackTraceElementArr[i10], InMobiInterstitial.a.class) && !a(stackTraceElementArr[i10], Hc.class) && !a(stackTraceElementArr[i10], InMobiBanner.a.class) && !a(stackTraceElementArr[i10], InMobiBanner.a.class.getSuperclass()) && (!Intrinsics.areEqual(stackTraceElementArr[i10].getClassName(), InMobiSdk.class.getName()) || !Intrinsics.areEqual(stackTraceElementArr[i10].getMethodName(), "fireListener")); i10++) {
            String className = stackTraceElementArr[i10].getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            String name = S4.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.g0(className, name, false, 2, null)) {
                break;
            }
            String className2 = stackTraceElementArr[i10].getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            if (f38772b.a(className2)) {
                return true;
            }
        }
        return false;
    }

    public static final String a(String message, String trace) {
        Intrinsics.checkNotNullParameter("AppExitEvent", "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(trace, "trace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "AppExitEvent");
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, message);
            jSONObject.put("stack", trace);
        } catch (JSONException e10) {
            e10.toString();
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final String a(StackTraceElement[] stackTrace) {
        Intrinsics.checkNotNullParameter("Blocked", "name");
        Intrinsics.checkNotNullParameter("MainThreadBlocked", PglCryptUtils.KEY_MESSAGE);
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "Blocked");
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "MainThreadBlocked");
            Intrinsics.checkNotNullParameter(stackTrace, "<this>");
            StringBuilder sb2 = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb2.append(stackTraceElement.toString());
                sb2.append('\n');
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            jSONObject.put("stack", string);
        } catch (JSONException e10) {
            e10.toString();
        }
        String string2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public static final boolean a(Q9 q92) {
        Intrinsics.checkNotNullParameter(q92, "<this>");
        if (q92 instanceof T4) {
            StackTraceElement[] stackTraceElementArr = ((T4) q92).f37757g;
            if (stackTraceElementArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stackTrace");
                stackTraceElementArr = null;
            }
            return b(stackTraceElementArr);
        }
        if (q92 instanceof C4194z1) {
            C4194z1 c4194z1 = (C4194z1) q92;
            if (c4194z1.f40026g != 6) {
                return false;
            }
            return f38772b.a(c4194z1.f40027h);
        }
        if (q92 instanceof Wn) {
            return b(((Wn) q92).f37977g);
        }
        return false;
    }

    public static final boolean a(StackTraceElement stackTraceElement, Class cls) {
        Intrinsics.checkNotNullParameter(stackTraceElement, "<this>");
        return cls != null && Intrinsics.areEqual(stackTraceElement.getClassName(), cls.getName()) && f38773c.contains(stackTraceElement.getMethodName());
    }

    public static final void a(Function1 runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        eg.i.d(f38771a, null, null, new C3689el(runnable, null), 3, null);
    }
}
