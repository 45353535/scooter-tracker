package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ReportLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReportLevel[] $VALUES;

    @NotNull
    public static final Companion Companion;

    @NotNull
    private final String description;
    public static final ReportLevel IGNORE = new ReportLevel("IGNORE", 0, "ignore");
    public static final ReportLevel WARN = new ReportLevel("WARN", 1, "warn");
    public static final ReportLevel STRICT = new ReportLevel("STRICT", 2, "strict");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ReportLevel[] $values() {
        return new ReportLevel[]{IGNORE, WARN, STRICT};
    }

    static {
        ReportLevel[] reportLevelArr$values = $values();
        $VALUES = reportLevelArr$values;
        $ENTRIES = a.a(reportLevelArr$values);
        Companion = new Companion(null);
    }

    private ReportLevel(String str, int i10, String str2) {
        this.description = str2;
    }

    public static ReportLevel valueOf(String str) {
        return (ReportLevel) Enum.valueOf(ReportLevel.class, str);
    }

    public static ReportLevel[] values() {
        return (ReportLevel[]) $VALUES.clone();
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
