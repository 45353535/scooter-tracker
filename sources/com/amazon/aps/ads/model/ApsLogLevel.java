package com.amazon.aps.ads.model;

import com.appodeal.ads.modules.common.internal.LogConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/amazon/aps/ads/model/ApsLogLevel;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "All", "Trace", "Debug", LogConstants.EVENT_INFO, "Warn", "Error", "Fatal", "Off", "intValue", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApsLogLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ApsLogLevel[] $VALUES;
    private final int value;
    public static final ApsLogLevel All = new ApsLogLevel("All", 0, 0);
    public static final ApsLogLevel Trace = new ApsLogLevel("Trace", 1, 1);
    public static final ApsLogLevel Debug = new ApsLogLevel("Debug", 2, 2);
    public static final ApsLogLevel Info = new ApsLogLevel(LogConstants.EVENT_INFO, 3, 3);
    public static final ApsLogLevel Warn = new ApsLogLevel("Warn", 4, 4);
    public static final ApsLogLevel Error = new ApsLogLevel("Error", 5, 5);
    public static final ApsLogLevel Fatal = new ApsLogLevel("Fatal", 6, 6);
    public static final ApsLogLevel Off = new ApsLogLevel("Off", 7, 7);

    private static final /* synthetic */ ApsLogLevel[] $values() {
        return new ApsLogLevel[]{All, Trace, Debug, Info, Warn, Error, Fatal, Off};
    }

    static {
        ApsLogLevel[] apsLogLevelArr$values = $values();
        $VALUES = apsLogLevelArr$values;
        $ENTRIES = a.a(apsLogLevelArr$values);
    }

    private ApsLogLevel(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ApsLogLevel valueOf(String str) {
        return (ApsLogLevel) Enum.valueOf(ApsLogLevel.class, str);
    }

    public static ApsLogLevel[] values() {
        return (ApsLogLevel[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: intValue, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
