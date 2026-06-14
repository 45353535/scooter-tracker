package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4318fe {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f43114c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f43115d = 2070;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f43116e = 2080;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f43117f = 2090;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f43118g = 2100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f43119h = 2110;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f43121b;

    /* JADX INFO: renamed from: com.ironsource.fe$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4318fe(int i10, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f43120a = i10;
        this.f43121b = errorMessage;
    }

    public final int a() {
        return this.f43120a;
    }

    @NotNull
    public final String b() {
        return this.f43121b;
    }

    public final int c() {
        return this.f43120a;
    }

    @NotNull
    public final String d() {
        return this.f43121b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4318fe)) {
            return false;
        }
        C4318fe c4318fe = (C4318fe) obj;
        return this.f43120a == c4318fe.f43120a && Intrinsics.areEqual(this.f43121b, c4318fe.f43121b);
    }

    public int hashCode() {
        return (this.f43120a * 31) + this.f43121b.hashCode();
    }

    @NotNull
    public String toString() {
        return "SdkError(errorCode=" + this.f43120a + ", errorMessage=" + this.f43121b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4318fe(@NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        int errorCode = error.getErrorCode();
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "error.errorMessage");
        this(errorCode, errorMessage);
    }

    @NotNull
    public final C4318fe a(int i10, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new C4318fe(i10, errorMessage);
    }

    public static /* synthetic */ C4318fe a(C4318fe c4318fe, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c4318fe.f43120a;
        }
        if ((i11 & 2) != 0) {
            str = c4318fe.f43121b;
        }
        return c4318fe.a(i10, str);
    }
}
