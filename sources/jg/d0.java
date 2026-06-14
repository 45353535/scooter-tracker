package jg;

import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f85867a = new a.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f85868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f85869c;

    static {
        Object objB;
        Object objB2;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f85868b = (String) objB;
        try {
            objB2 = Result.b(d0.class.getCanonicalName());
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.f93230c;
            objB2 = Result.b(kotlin.d.a(th3));
        }
        if (Result.g(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f85869c = (String) objB2;
    }

    public static final Throwable a(Throwable th2) {
        return th2;
    }
}
