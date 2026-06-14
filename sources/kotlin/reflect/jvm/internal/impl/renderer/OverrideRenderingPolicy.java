package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class OverrideRenderingPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OverrideRenderingPolicy[] $VALUES;
    public static final OverrideRenderingPolicy RENDER_OVERRIDE = new OverrideRenderingPolicy("RENDER_OVERRIDE", 0);
    public static final OverrideRenderingPolicy RENDER_OPEN = new OverrideRenderingPolicy("RENDER_OPEN", 1);
    public static final OverrideRenderingPolicy RENDER_OPEN_OVERRIDE = new OverrideRenderingPolicy("RENDER_OPEN_OVERRIDE", 2);

    private static final /* synthetic */ OverrideRenderingPolicy[] $values() {
        return new OverrideRenderingPolicy[]{RENDER_OVERRIDE, RENDER_OPEN, RENDER_OPEN_OVERRIDE};
    }

    static {
        OverrideRenderingPolicy[] overrideRenderingPolicyArr$values = $values();
        $VALUES = overrideRenderingPolicyArr$values;
        $ENTRIES = a.a(overrideRenderingPolicyArr$values);
    }

    private OverrideRenderingPolicy(String str, int i10) {
    }

    public static OverrideRenderingPolicy valueOf(String str) {
        return (OverrideRenderingPolicy) Enum.valueOf(OverrideRenderingPolicy.class, str);
    }

    public static OverrideRenderingPolicy[] values() {
        return (OverrideRenderingPolicy[]) $VALUES.clone();
    }
}
