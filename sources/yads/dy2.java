package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class dy2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ dy2[] f110110c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110111b;

    static {
        dy2[] dy2VarArr = {new dy2(0, "VISIBLE", "visible"), new dy2(1, "DELAYED", "delayed")};
        f110110c = dy2VarArr;
        qf.a.a(dy2VarArr);
    }

    public dy2(int i10, String str, String str2) {
        this.f110111b = str2;
    }

    public static dy2 valueOf(String str) {
        return (dy2) Enum.valueOf(dy2.class, str);
    }

    public static dy2[] values() {
        return (dy2[]) f110110c.clone();
    }
}
