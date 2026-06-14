package com.moloco.sdk.acm.services;

import android.util.Log;
import eg.o0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f54105a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CoroutineScope f54106b = i.a(o0.c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f54107c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f54108d = com.moloco.sdk.acm.services.a.f54098a.a("debug.moloco.enable_logs");

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54109r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f54110s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f54111t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f54110s = str;
            this.f54111t = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f54110s, this.f54111t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54109r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            ArrayList arrayList = d.f54107c;
            String str = this.f54110s;
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                return Unit.f93236a;
            }
            androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
            d.f54105a.k(str);
            throw null;
        }
    }

    public static /* synthetic */ void e(d dVar, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "ACM";
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        dVar.h(str, str2, th2, z10);
    }

    public static /* synthetic */ void f(d dVar, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "ACM";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        dVar.i(str, str2, z10);
    }

    public static /* synthetic */ void l(d dVar, String str, String str2, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "ACM";
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        dVar.n(str, str2, th2, z10);
    }

    public static /* synthetic */ void m(d dVar, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "ACM";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        dVar.o(str, str2, z10);
    }

    public final StackTraceElement a(StackTraceElement[] stackTraceElementArr) {
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!Intrinsics.areEqual(stackTraceElement.getClassName(), f54105a.getClass().getCanonicalName())) {
                return stackTraceElement;
            }
        }
        return (StackTraceElement) ArraysKt.first(stackTraceElementArr);
    }

    public final String c(String str) {
        try {
            return '[' + j() + "] " + str;
        } catch (Exception unused) {
            return str;
        }
    }

    public final void g(String str, String str2) {
        eg.i.d(f54106b, null, null, new a(str, str2, null), 3, null);
    }

    public final void h(String tag, String msg, Throwable th2, boolean z10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f54108d || z10) {
            String strK = k(tag);
            String strC = c(msg);
            Log.e(strK, strC, th2);
            g(strK, strC);
        }
    }

    public final void i(String tag, String msg, boolean z10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f54108d || z10) {
            String strK = k(tag);
            String strC = c(msg);
            Log.d(strK, strC);
            g(strK, strC);
        }
    }

    public final String j() throws ClassNotFoundException {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElementA = a(stackTrace);
        String className = stackTraceElementA.getClassName();
        stackTraceElementA.getMethodName();
        Class<?> cls = Class.forName(className);
        cls.isAnonymousClass();
        cls.getDeclaredMethods();
        String methodName = stackTraceElementA.getMethodName();
        if (Intrinsics.areEqual(methodName, "invokeSuspend")) {
            String className2 = stackTraceElementA.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            methodName = StringsKt.l1(StringsKt.Q0(className2, "$1"), "$", null, 2, null);
        }
        Intrinsics.checkNotNullExpressionValue(methodName, "let(...)");
        return methodName;
    }

    public final String k(String str) {
        if (StringsKt.a0(str, "ACM", false, 2, null)) {
            return str;
        }
        return "ACM" + str;
    }

    public final void n(String tag, String msg, Throwable th2, boolean z10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f54108d || z10) {
            String strK = k(tag);
            String strC = c(msg);
            Log.w(strK, strC, th2);
            g(strK, strC);
        }
    }

    public final void o(String tag, String msg, boolean z10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f54108d || z10) {
            String strK = k(tag);
            String strC = c(msg);
            Log.i(strK, strC);
            g(strK, strC);
        }
    }
}
