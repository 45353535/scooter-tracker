package org.bidon.sdk.logs.analytic;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/bidon/sdk/logs/analytic/Precision;", "", "<init>", "(Ljava/lang/String;I)V", "Precise", "Estimated", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Precision {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Precision[] $VALUES;
    public static final Precision Precise = new Precision("Precise", 0);
    public static final Precision Estimated = new Precision("Estimated", 1);

    private static final /* synthetic */ Precision[] $values() {
        return new Precision[]{Precise, Estimated};
    }

    static {
        Precision[] precisionArr$values = $values();
        $VALUES = precisionArr$values;
        $ENTRIES = a.a(precisionArr$values);
    }

    private Precision(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) $VALUES.clone();
    }
}
