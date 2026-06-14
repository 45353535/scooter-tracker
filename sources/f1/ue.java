package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ue f71305c = new ue("NONE", 0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ue f71306d = new ue("IDLE", 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ue f71307e = new ue("PLAYING", 2, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ue f71308f = new ue("PAUSED", 3, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ue[] f71309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f71310h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71311b;

    static {
        ue[] ueVarArrD = d();
        f71309g = ueVarArrD;
        f71310h = qf.a.a(ueVarArrD);
    }

    public ue(String str, int i10, int i11) {
        this.f71311b = i11;
    }

    public static final /* synthetic */ ue[] d() {
        return new ue[]{f71305c, f71306d, f71307e, f71308f};
    }

    public static ue valueOf(String str) {
        return (ue) Enum.valueOf(ue.class, str);
    }

    public static ue[] values() {
        return (ue[]) f71309g.clone();
    }
}
