package com.amazon.aps.shared.metrics.model;

import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;", "", "<init>", "(Ljava/lang/String;I)V", InitializationStatus.SUCCESS, "Failure", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApsMetricsResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ApsMetricsResult[] $VALUES;
    public static final ApsMetricsResult Success = new ApsMetricsResult(InitializationStatus.SUCCESS, 0);
    public static final ApsMetricsResult Failure = new ApsMetricsResult("Failure", 1);

    private static final /* synthetic */ ApsMetricsResult[] $values() {
        return new ApsMetricsResult[]{Success, Failure};
    }

    static {
        ApsMetricsResult[] apsMetricsResultArr$values = $values();
        $VALUES = apsMetricsResultArr$values;
        $ENTRIES = a.a(apsMetricsResultArr$values);
    }

    private ApsMetricsResult(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ApsMetricsResult valueOf(String str) {
        return (ApsMetricsResult) Enum.valueOf(ApsMetricsResult.class, str);
    }

    public static ApsMetricsResult[] values() {
        return (ApsMetricsResult[]) $VALUES.clone();
    }
}
