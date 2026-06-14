package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class o7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7 f70725b = new o7("FIRST", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o7 f70726c = new o7("MIDDLE", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o7 f70727d = new o7("THIRD", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o7[] f70728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f70729f;

    static {
        o7[] o7VarArrD = d();
        f70728e = o7VarArrD;
        f70729f = qf.a.a(o7VarArrD);
    }

    public o7(String str, int i10) {
    }

    public static final /* synthetic */ o7[] d() {
        return new o7[]{f70725b, f70726c, f70727d};
    }

    public static o7 valueOf(String str) {
        return (o7) Enum.valueOf(o7.class, str);
    }

    public static o7[] values() {
        return (o7[]) f70728e.clone();
    }
}
