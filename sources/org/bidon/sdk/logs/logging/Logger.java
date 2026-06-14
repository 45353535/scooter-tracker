package org.bidon.sdk.logs.logging;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lorg/bidon/sdk/logs/logging/Logger;", "", "loggerLevel", "Lorg/bidon/sdk/logs/logging/Logger$Level;", "getLoggerLevel", "()Lorg/bidon/sdk/logs/logging/Logger$Level;", "setLogLevel", "", "logLevel", "Level", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Logger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/bidon/sdk/logs/logging/Logger$Level;", "", "<init>", "(Ljava/lang/String;I)V", "Verbose", "Error", "Off", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Level {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level Verbose = new Level("Verbose", 0);
        public static final Level Error = new Level("Error", 1);
        public static final Level Off = new Level("Off", 2);

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{Verbose, Error, Off};
        }

        static {
            Level[] levelArr$values = $values();
            $VALUES = levelArr$values;
            $ENTRIES = a.a(levelArr$values);
        }

        private Level(String str, int i10) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    @NotNull
    Level getLoggerLevel();

    void setLogLevel(@NotNull Level logLevel);
}
