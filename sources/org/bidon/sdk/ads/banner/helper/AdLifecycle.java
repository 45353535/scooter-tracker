package org.bidon.sdk.ads.banner.helper;

import com.appodeal.ads.modules.common.internal.LogConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/ads/banner/helper/AdLifecycle;", "", "<init>", "(Ljava/lang/String;I)V", LogConstants.EVENT_CREATED, "Loading", LogConstants.EVENT_LOADED, "LoadingFailed", "Displaying", "Displayed", "DisplayingFailed", LogConstants.EVENT_DESTROYED, "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdLifecycle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdLifecycle[] $VALUES;
    public static final AdLifecycle Created = new AdLifecycle(LogConstants.EVENT_CREATED, 0);
    public static final AdLifecycle Loading = new AdLifecycle("Loading", 1);
    public static final AdLifecycle Loaded = new AdLifecycle(LogConstants.EVENT_LOADED, 2);
    public static final AdLifecycle LoadingFailed = new AdLifecycle("LoadingFailed", 3);
    public static final AdLifecycle Displaying = new AdLifecycle("Displaying", 4);
    public static final AdLifecycle Displayed = new AdLifecycle("Displayed", 5);
    public static final AdLifecycle DisplayingFailed = new AdLifecycle("DisplayingFailed", 6);
    public static final AdLifecycle Destroyed = new AdLifecycle(LogConstants.EVENT_DESTROYED, 7);

    private static final /* synthetic */ AdLifecycle[] $values() {
        return new AdLifecycle[]{Created, Loading, Loaded, LoadingFailed, Displaying, Displayed, DisplayingFailed, Destroyed};
    }

    static {
        AdLifecycle[] adLifecycleArr$values = $values();
        $VALUES = adLifecycleArr$values;
        $ENTRIES = qf.a.a(adLifecycleArr$values);
    }

    private AdLifecycle(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static AdLifecycle valueOf(String str) {
        return (AdLifecycle) Enum.valueOf(AdLifecycle.class, str);
    }

    public static AdLifecycle[] values() {
        return (AdLifecycle[]) $VALUES.clone();
    }
}
