package org.bidon.sdk.config;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/config/SdkState;", "", "<init>", "(Ljava/lang/String;I)V", "NotInitialized", "Initializing", "Initialized", "InitializationFailed", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SdkState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SdkState[] $VALUES;
    public static final SdkState NotInitialized = new SdkState("NotInitialized", 0);
    public static final SdkState Initializing = new SdkState("Initializing", 1);
    public static final SdkState Initialized = new SdkState("Initialized", 2);
    public static final SdkState InitializationFailed = new SdkState("InitializationFailed", 3);

    private static final /* synthetic */ SdkState[] $values() {
        return new SdkState[]{NotInitialized, Initializing, Initialized, InitializationFailed};
    }

    static {
        SdkState[] sdkStateArr$values = $values();
        $VALUES = sdkStateArr$values;
        $ENTRIES = a.a(sdkStateArr$values);
    }

    private SdkState(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static SdkState valueOf(String str) {
        return (SdkState) Enum.valueOf(SdkState.class, str);
    }

    public static SdkState[] values() {
        return (SdkState[]) $VALUES.clone();
    }
}
