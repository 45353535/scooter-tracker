package io.sentry.android.replay;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m INITIAL = new m("INITIAL", 0);
    public static final m STARTED = new m("STARTED", 1);
    public static final m RESUMED = new m("RESUMED", 2);
    public static final m PAUSED = new m("PAUSED", 3);
    public static final m STOPPED = new m("STOPPED", 4);
    public static final m CLOSED = new m("CLOSED", 5);

    private static final /* synthetic */ m[] $values() {
        return new m[]{INITIAL, STARTED, RESUMED, PAUSED, STOPPED, CLOSED};
    }

    static {
        m[] mVarArr$values = $values();
        $VALUES = mVarArr$values;
        $ENTRIES = qf.a.a(mVarArr$values);
    }

    private m(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
