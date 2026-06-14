package com.mobilefuse.sdk.telemetry.implementations.sentry;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryException;", "", "type", "", "value", "module", "stacktrace", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackTrace;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackTrace;)V", "getModule", "()Ljava/lang/String;", "getStacktrace", "()Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackTrace;", "getType", "getValue", "component1", "component2", "component3", "component4", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class SentryException {

    @NotNull
    private final String module;

    @NotNull
    private final SentryStackTrace stacktrace;

    @NotNull
    private final String type;

    @NotNull
    private final String value;

    public SentryException(@NotNull String type, @NotNull String value, @NotNull String module, @NotNull SentryStackTrace stacktrace) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
        this.type = type;
        this.value = value;
        this.module = module;
        this.stacktrace = stacktrace;
    }

    public static /* synthetic */ SentryException copy$default(SentryException sentryException, String str, String str2, String str3, SentryStackTrace sentryStackTrace, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sentryException.type;
        }
        if ((i10 & 2) != 0) {
            str2 = sentryException.value;
        }
        if ((i10 & 4) != 0) {
            str3 = sentryException.module;
        }
        if ((i10 & 8) != 0) {
            sentryStackTrace = sentryException.stacktrace;
        }
        return sentryException.copy(str, str2, str3, sentryStackTrace);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModule() {
        return this.module;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SentryStackTrace getStacktrace() {
        return this.stacktrace;
    }

    @NotNull
    public final SentryException copy(@NotNull String type, @NotNull String value, @NotNull String module, @NotNull SentryStackTrace stacktrace) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
        return new SentryException(type, value, module, stacktrace);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SentryException)) {
            return false;
        }
        SentryException sentryException = (SentryException) other;
        return Intrinsics.areEqual(this.type, sentryException.type) && Intrinsics.areEqual(this.value, sentryException.value) && Intrinsics.areEqual(this.module, sentryException.module) && Intrinsics.areEqual(this.stacktrace, sentryException.stacktrace);
    }

    @NotNull
    public final String getModule() {
        return this.module;
    }

    @NotNull
    public final SentryStackTrace getStacktrace() {
        return this.stacktrace;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.module;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        SentryStackTrace sentryStackTrace = this.stacktrace;
        return iHashCode3 + (sentryStackTrace != null ? sentryStackTrace.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SentryException(type=" + this.type + ", value=" + this.value + ", module=" + this.module + ", stacktrace=" + this.stacktrace + ")";
    }
}
