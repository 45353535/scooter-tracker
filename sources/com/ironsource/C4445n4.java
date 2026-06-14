package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4445n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Throwable f44446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f44447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f44448c;

    public C4445n4(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f44446a = throwable;
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace");
        sb2.append(throwable.toString());
        sb2.append(System.lineSeparator());
        boolean z10 = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb2.append(stackTraceElement.toString());
            sb2.append(";" + System.lineSeparator());
            String string = stackTraceElement.toString();
            Intrinsics.checkNotNullExpressionValue(string, "elem.toString()");
            String strE = C4462o4.d().e();
            Intrinsics.checkNotNullExpressionValue(strE, "getInstance().keyword");
            if (StringsKt.g0(string, strE, false, 2, null)) {
                z10 = true;
            }
        }
        Throwable cause = this.f44446a.getCause();
        if (cause != null) {
            sb2.append("--CAUSE");
            sb2.append(System.lineSeparator());
            sb2.append(cause.toString());
            sb2.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace2, "cause.stackTrace");
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                sb2.append(stackTraceElement2.toString());
                sb2.append(";" + System.lineSeparator());
                String string2 = stackTraceElement2.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "elem.toString()");
                String strE2 = C4462o4.d().e();
                Intrinsics.checkNotNullExpressionValue(strE2, "getInstance().keyword");
                if (StringsKt.g0(string2, strE2, false, 2, null)) {
                    z10 = true;
                }
            }
        }
        String string3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "builder.toString()");
        this.f44447b = string3;
        this.f44448c = z10;
    }

    @NotNull
    public final Throwable a() {
        return this.f44446a;
    }

    @NotNull
    public final String b() {
        return this.f44447b;
    }

    @NotNull
    public final Throwable c() {
        return this.f44446a;
    }

    public final boolean d() {
        return this.f44448c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4445n4) && Intrinsics.areEqual(this.f44446a, ((C4445n4) obj).f44446a);
    }

    public int hashCode() {
        return this.f44446a.hashCode();
    }

    @NotNull
    public String toString() {
        return "CrashReportWrapper(throwable=" + this.f44446a + ")";
    }

    @NotNull
    public final C4445n4 a(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new C4445n4(throwable);
    }

    public static /* synthetic */ C4445n4 a(C4445n4 c4445n4, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = c4445n4.f44446a;
        }
        return c4445n4.a(th2);
    }
}
