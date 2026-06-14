package com.mobilefuse.sdk.telemetry.implementations.sentry;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackFrame;", "", "function", "", "filename", "lineNumber", "", "module", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getFilename", "()Ljava/lang/String;", "getFunction", "getLineNumber", "()I", "getModule", "component1", "component2", "component3", "component4", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class SentryStackFrame {

    @NotNull
    private final String filename;

    @NotNull
    private final String function;
    private final int lineNumber;

    @NotNull
    private final String module;

    public SentryStackFrame(@NotNull String function, @NotNull String filename, int i10, @NotNull String module) {
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(module, "module");
        this.function = function;
        this.filename = filename;
        this.lineNumber = i10;
        this.module = module;
    }

    public static /* synthetic */ SentryStackFrame copy$default(SentryStackFrame sentryStackFrame, String str, String str2, int i10, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sentryStackFrame.function;
        }
        if ((i11 & 2) != 0) {
            str2 = sentryStackFrame.filename;
        }
        if ((i11 & 4) != 0) {
            i10 = sentryStackFrame.lineNumber;
        }
        if ((i11 & 8) != 0) {
            str3 = sentryStackFrame.module;
        }
        return sentryStackFrame.copy(str, str2, i10, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFunction() {
        return this.function;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLineNumber() {
        return this.lineNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModule() {
        return this.module;
    }

    @NotNull
    public final SentryStackFrame copy(@NotNull String function, @NotNull String filename, int lineNumber, @NotNull String module) {
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(module, "module");
        return new SentryStackFrame(function, filename, lineNumber, module);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SentryStackFrame)) {
            return false;
        }
        SentryStackFrame sentryStackFrame = (SentryStackFrame) other;
        return Intrinsics.areEqual(this.function, sentryStackFrame.function) && Intrinsics.areEqual(this.filename, sentryStackFrame.filename) && this.lineNumber == sentryStackFrame.lineNumber && Intrinsics.areEqual(this.module, sentryStackFrame.module);
    }

    @NotNull
    public final String getFilename() {
        return this.filename;
    }

    @NotNull
    public final String getFunction() {
        return this.function;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    @NotNull
    public final String getModule() {
        return this.module;
    }

    public int hashCode() {
        String str = this.function;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.filename;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.lineNumber) * 31;
        String str3 = this.module;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SentryStackFrame(function=" + this.function + ", filename=" + this.filename + ", lineNumber=" + this.lineNumber + ", module=" + this.module + ")";
    }
}
