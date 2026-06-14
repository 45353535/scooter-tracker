package org.bidon.sdk.logs.logging.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.logs.logging.Logger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lorg/bidon/sdk/logs/logging/impl/LoggerImpl;", "Lorg/bidon/sdk/logs/logging/Logger;", "<init>", "()V", "loggerLevel", "Lorg/bidon/sdk/logs/logging/Logger$Level;", "getLoggerLevel", "()Lorg/bidon/sdk/logs/logging/Logger$Level;", "setLoggerLevel", "(Lorg/bidon/sdk/logs/logging/Logger$Level;)V", "setLogLevel", "", "logLevel", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoggerImpl implements Logger {

    @NotNull
    private Logger.Level loggerLevel = Logger.Level.Off;

    @Override // org.bidon.sdk.logs.logging.Logger
    @NotNull
    public Logger.Level getLoggerLevel() {
        return this.loggerLevel;
    }

    @Override // org.bidon.sdk.logs.logging.Logger
    public void setLogLevel(@NotNull Logger.Level logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        setLoggerLevel(logLevel);
    }

    public void setLoggerLevel(@NotNull Logger.Level level) {
        Intrinsics.checkNotNullParameter(level, "<set-?>");
        this.loggerLevel = level;
    }
}
