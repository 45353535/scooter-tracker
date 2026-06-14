package org.bidon.sdk.ads.banner.helper;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/bidon/sdk/ads/banner/helper/ActivityLifecycleState;", "", "<init>", "(Ljava/lang/String;I)V", "Resumed", "Paused", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActivityLifecycleState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActivityLifecycleState[] $VALUES;
    public static final ActivityLifecycleState Resumed = new ActivityLifecycleState("Resumed", 0);
    public static final ActivityLifecycleState Paused = new ActivityLifecycleState("Paused", 1);

    private static final /* synthetic */ ActivityLifecycleState[] $values() {
        return new ActivityLifecycleState[]{Resumed, Paused};
    }

    static {
        ActivityLifecycleState[] activityLifecycleStateArr$values = $values();
        $VALUES = activityLifecycleStateArr$values;
        $ENTRIES = qf.a.a(activityLifecycleStateArr$values);
    }

    private ActivityLifecycleState(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ActivityLifecycleState valueOf(String str) {
        return (ActivityLifecycleState) Enum.valueOf(ActivityLifecycleState.class, str);
    }

    public static ActivityLifecycleState[] values() {
        return (ActivityLifecycleState[]) $VALUES.clone();
    }
}
