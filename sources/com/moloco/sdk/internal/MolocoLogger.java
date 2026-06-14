package com.moloco.sdk.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.moloco.sdk.internal.MolocoLogger;
import com.taurusx.tax.y.z.w.s;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005:;<=>B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ5\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ5\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b \u0010\u001fJ5\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\u001fJ!\u0010#\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010&J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010.R$\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00040/j\b\u0012\u0004\u0012\u00020\u0004`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R*\u00109\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u00178F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b8\u0010\u0003\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006?"}, d2 = {"Lcom/moloco/sdk/internal/MolocoLogger;", "", "<init>", "()V", "Lcom/moloco/sdk/internal/MolocoLogger$LoggerListener;", "loggerListener", "", "addListener", "(Lcom/moloco/sdk/internal/MolocoLogger$LoggerListener;)V", "removeListener", "", s.z.f67720z, NotificationCompat.CATEGORY_MESSAGE, "fireListeners", "(Ljava/lang/String;Ljava/lang/String;)V", "prefixWithMolocoName", "(Ljava/lang/String;)Ljava/lang/String;", "prefixWithMethodName", "", "Ljava/lang/StackTraceElement;", "stackTraceArray", "findMostRelevantStackTrace", "([Ljava/lang/StackTraceElement;)Ljava/lang/StackTraceElement;", "", "forceLogging", "debug", "(Ljava/lang/String;Ljava/lang/String;Z)V", "debugBuildLog", "", "exception", "info", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V", "warn", "error", "throwable", "tlog", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCallingMethodName", "()Ljava/lang/String;", "Lcom/moloco/sdk/internal/MolocoLogger$c;", "configuration", "setConfiguration$moloco_sdk_release", "(Lcom/moloco/sdk/internal/MolocoLogger$c;)V", "setConfiguration", "MOLOCO_TAG", "Ljava/lang/String;", "Lcom/moloco/sdk/internal/MolocoLogger$c;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "listeners", "Ljava/util/LinkedHashSet;", "value", "getLogEnabled", "()Z", "setLogEnabled", "(Z)V", "getLogEnabled$annotations", "logEnabled", "LoggerListener", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", "a", "b", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class MolocoLogger {

    @NotNull
    private static final String MOLOCO_TAG = "Moloco";

    @NotNull
    public static final MolocoLogger INSTANCE = new MolocoLogger();

    @NotNull
    private static c configuration = new d(new b());

    @NotNull
    private static final LinkedHashSet<LoggerListener> listeners = new LinkedHashSet<>();
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/moloco/sdk/internal/MolocoLogger$LoggerListener;", "", "onLog", "", s.z.f67720z, "", NotificationCompat.CATEGORY_MESSAGE, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface LoggerListener {
        void onLog(@NotNull String tag, @NotNull String msg);
    }

    public interface a {
        boolean a();
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f54124b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f54125a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public b() {
            nf.a.b(false, false, null, null, 0, new Function0() { // from class: com.moloco.sdk.internal.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MolocoLogger.b.b(this.f54210b);
                }
            }, 31, null);
        }

        public static final Unit b(b bVar) {
            bVar.c(bVar.d());
            return Unit.f93236a;
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.a
        public boolean a() {
            return this.f54125a;
        }

        public void c(boolean z10) {
            this.f54125a = z10;
        }

        public final boolean d() {
            return Boolean.parseBoolean(a("debug.moloco.internal_logging"));
        }

        public final String a(String str) {
            try {
                Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) objInvoke;
                try {
                    if (TextUtils.isEmpty(str2)) {
                        return null;
                    }
                    return str2;
                } catch (Exception unused) {
                    return str2;
                }
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    public interface c {
        void a(boolean z10);

        boolean a();

        boolean b();

        boolean c();
    }

    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f54126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f54127b;

        public d(a adb) {
            Intrinsics.checkNotNullParameter(adb, "adb");
            this.f54126a = adb;
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.c
        public boolean a() {
            return this.f54126a.a();
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.c
        public boolean b() {
            return this.f54127b;
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.c
        public boolean c() {
            return false;
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.c
        public void a(boolean z10) {
            this.f54127b = z10;
        }
    }

    private MolocoLogger() {
    }

    public static final void addListener(@NotNull LoggerListener loggerListener) {
        Intrinsics.checkNotNullParameter(loggerListener, "loggerListener");
        listeners.add(loggerListener);
    }

    public static /* synthetic */ void debug$default(MolocoLogger molocoLogger, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        molocoLogger.debug(str, str2, z10);
    }

    public static /* synthetic */ void debugBuildLog$default(MolocoLogger molocoLogger, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        molocoLogger.debugBuildLog(str, str2, z10);
    }

    public static /* synthetic */ void error$default(MolocoLogger molocoLogger, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        molocoLogger.error(str, str2, th2, z10);
    }

    private final StackTraceElement findMostRelevantStackTrace(StackTraceElement[] stackTraceArray) {
        for (StackTraceElement stackTraceElement : stackTraceArray) {
            if (!Intrinsics.areEqual(stackTraceElement.getClassName(), INSTANCE.getClass().getCanonicalName())) {
                return stackTraceElement;
            }
        }
        return (StackTraceElement) ArraysKt.first(stackTraceArray);
    }

    private final void fireListeners(String tag, String msg) {
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            ((LoggerListener) it.next()).onLog(INSTANCE.prefixWithMolocoName(tag), msg);
        }
    }

    public static final boolean getLogEnabled() {
        c cVar = configuration;
        return cVar.c() || cVar.a() || cVar.b();
    }

    public static /* synthetic */ void getLogEnabled$annotations() {
    }

    public static /* synthetic */ void info$default(MolocoLogger molocoLogger, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        molocoLogger.info(str, str2, th2, z10);
    }

    private final String prefixWithMethodName(String str) {
        try {
            return '[' + getCallingMethodName() + "] " + str;
        } catch (Exception unused) {
            return str;
        }
    }

    private final String prefixWithMolocoName(String str) {
        if (StringsKt.a0(str, MOLOCO_TAG, false, 2, null)) {
            return str;
        }
        return MOLOCO_TAG + str;
    }

    public static final void removeListener(@NotNull LoggerListener loggerListener) {
        Intrinsics.checkNotNullParameter(loggerListener, "loggerListener");
        listeners.remove(loggerListener);
    }

    public static final void setLogEnabled(boolean z10) {
        configuration.a(z10);
    }

    public static /* synthetic */ void tlog$default(MolocoLogger molocoLogger, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        molocoLogger.tlog(str, th2);
    }

    public static /* synthetic */ void warn$default(MolocoLogger molocoLogger, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        molocoLogger.warn(str, str2, th2, z10);
    }

    public final void debug(@NotNull String tag, @NotNull String msg, boolean forceLogging) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (getLogEnabled() || forceLogging) {
            String strPrefixWithMolocoName = prefixWithMolocoName(tag);
            String strPrefixWithMethodName = prefixWithMethodName(msg);
            Log.d(strPrefixWithMolocoName, strPrefixWithMethodName);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }

    public final void debugBuildLog(@NotNull String tag, @NotNull String msg, boolean forceLogging) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public final void error(@NotNull String tag, @NotNull String msg, @Nullable Throwable exception, boolean forceLogging) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (getLogEnabled() || forceLogging) {
            String strPrefixWithMolocoName = prefixWithMolocoName(tag);
            String strPrefixWithMethodName = prefixWithMethodName(msg);
            Log.e(strPrefixWithMolocoName, strPrefixWithMethodName, exception);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }

    @NotNull
    public final String getCallingMethodName() throws ClassNotFoundException {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElementFindMostRelevantStackTrace = findMostRelevantStackTrace(stackTrace);
        String className = stackTraceElementFindMostRelevantStackTrace.getClassName();
        stackTraceElementFindMostRelevantStackTrace.getMethodName();
        Class<?> cls = Class.forName(className);
        cls.isAnonymousClass();
        cls.getDeclaredMethods();
        String methodName = stackTraceElementFindMostRelevantStackTrace.getMethodName();
        if (Intrinsics.areEqual(methodName, "invokeSuspend")) {
            String className2 = stackTraceElementFindMostRelevantStackTrace.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            methodName = StringsKt.l1(StringsKt.Q0(className2, "$1"), "$", null, 2, null);
        }
        Intrinsics.checkNotNullExpressionValue(methodName, "let(...)");
        return methodName;
    }

    public final void info(@NotNull String tag, @NotNull String msg, @Nullable Throwable exception, boolean forceLogging) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (getLogEnabled() || forceLogging) {
            String strPrefixWithMolocoName = prefixWithMolocoName(tag);
            String strPrefixWithMethodName = prefixWithMethodName(msg);
            Log.i(strPrefixWithMolocoName, strPrefixWithMethodName, exception);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }

    @VisibleForTesting(otherwise = 5)
    public final void setConfiguration$moloco_sdk_release(@NotNull c configuration2) {
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        configuration = configuration2;
    }

    public final void tlog(@NotNull String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.i("==tlog==", prefixWithMethodName(msg), throwable);
    }

    public final void warn(@NotNull String tag, @NotNull String msg, @Nullable Throwable exception, boolean forceLogging) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (getLogEnabled() || forceLogging) {
            String strPrefixWithMolocoName = prefixWithMolocoName(tag);
            String strPrefixWithMethodName = prefixWithMethodName(msg);
            Log.w(strPrefixWithMolocoName, strPrefixWithMethodName, exception);
            fireListeners(strPrefixWithMolocoName, strPrefixWithMethodName);
        }
    }
}
