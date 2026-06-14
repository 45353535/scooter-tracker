package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/LogLevel;", "", "parent", "(Ljava/lang/String;ILcom/mobilefuse/sdk/telemetry/LogLevel;)V", "getParent", "()Lcom/mobilefuse/sdk/telemetry/LogLevel;", "ERROR", "WARN", "DEBUG", "INFO", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public enum LogLevel {
    ERROR(null),
    WARN(ERROR),
    DEBUG(WARN),
    INFO(INFO);


    @Nullable
    private final LogLevel parent;

    LogLevel(LogLevel logLevel) {
        this.parent = logLevel;
    }

    @Nullable
    public final LogLevel getParent() {
        return this.parent;
    }
}
