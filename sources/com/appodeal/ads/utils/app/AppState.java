package com.appodeal.ads.utils.app;

import com.appodeal.ads.modules.common.internal.LogConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/appodeal/ads/utils/app/AppState;", "", "<init>", "(Ljava/lang/String;I)V", "Resumed", "Paused", LogConstants.EVENT_DESTROYED, "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppState[] $VALUES;
    public static final AppState Resumed = new AppState("Resumed", 0);
    public static final AppState Paused = new AppState("Paused", 1);
    public static final AppState Destroyed = new AppState(LogConstants.EVENT_DESTROYED, 2);

    private static final /* synthetic */ AppState[] $values() {
        return new AppState[]{Resumed, Paused, Destroyed};
    }

    static {
        AppState[] appStateArr$values = $values();
        $VALUES = appStateArr$values;
        $ENTRIES = qf.a.a(appStateArr$values);
    }

    private AppState(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static AppState valueOf(String str) {
        return (AppState) Enum.valueOf(AppState.class, str);
    }

    public static AppState[] values() {
        return (AppState[]) $VALUES.clone();
    }
}
