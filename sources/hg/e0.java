package hg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f73207b = new e0("START", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f73208c = new e0("STOP", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f73209d = new e0("STOP_AND_RESET_REPLAY_CACHE", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ e0[] f73210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f73211f;

    static {
        e0[] e0VarArrD = d();
        f73210e = e0VarArrD;
        f73211f = qf.a.a(e0VarArrD);
    }

    private e0(String str, int i10) {
    }

    private static final /* synthetic */ e0[] d() {
        return new e0[]{f73207b, f73208c, f73209d};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f73210e.clone();
    }
}
