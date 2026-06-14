package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.stream.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5676b3 {
    public static final EnumC5676b3 DOUBLE_VALUE;
    public static final EnumC5676b3 INT_VALUE;
    public static final EnumC5676b3 LONG_VALUE;
    public static final EnumC5676b3 REFERENCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC5676b3[] f85223a;

    public static EnumC5676b3 valueOf(String str) {
        return (EnumC5676b3) Enum.valueOf(EnumC5676b3.class, str);
    }

    public static EnumC5676b3[] values() {
        return (EnumC5676b3[]) f85223a.clone();
    }

    static {
        EnumC5676b3 enumC5676b3 = new EnumC5676b3("REFERENCE", 0);
        REFERENCE = enumC5676b3;
        EnumC5676b3 enumC5676b32 = new EnumC5676b3("INT_VALUE", 1);
        INT_VALUE = enumC5676b32;
        EnumC5676b3 enumC5676b33 = new EnumC5676b3("LONG_VALUE", 2);
        LONG_VALUE = enumC5676b33;
        EnumC5676b3 enumC5676b34 = new EnumC5676b3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC5676b34;
        f85223a = new EnumC5676b3[]{enumC5676b3, enumC5676b32, enumC5676b33, enumC5676b34};
    }
}
