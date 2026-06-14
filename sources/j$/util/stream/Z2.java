package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class Z2 {
    public static final Z2 OP;
    public static final Z2 SPLITERATOR;
    public static final Z2 STREAM;
    public static final Z2 TERMINAL_OP;
    public static final Z2 UPSTREAM_TERMINAL_OP;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Z2[] f85173a;

    public static Z2 valueOf(String str) {
        return (Z2) Enum.valueOf(Z2.class, str);
    }

    public static Z2[] values() {
        return (Z2[]) f85173a.clone();
    }

    static {
        Z2 z22 = new Z2("SPLITERATOR", 0);
        SPLITERATOR = z22;
        Z2 z23 = new Z2("STREAM", 1);
        STREAM = z23;
        Z2 z24 = new Z2("OP", 2);
        OP = z24;
        Z2 z25 = new Z2("TERMINAL_OP", 3);
        TERMINAL_OP = z25;
        Z2 z26 = new Z2("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = z26;
        f85173a = new Z2[]{z22, z23, z24, z25, z26};
    }
}
