package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ug {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ug f116631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ug f116632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ug f116633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ug[] f116634e;

    static {
        ug ugVar = new ug(0, "UNKNOWN");
        f116631b = ugVar;
        ug ugVar2 = new ug(1, "NETWORK");
        f116632c = ugVar2;
        ug ugVar3 = new ug(2, "INVALID_RESPONSE");
        f116633d = ugVar3;
        ug[] ugVarArr = {ugVar, ugVar2, ugVar3};
        f116634e = ugVarArr;
        qf.a.a(ugVarArr);
    }

    public ug(int i10, String str) {
    }

    public static ug valueOf(String str) {
        return (ug) Enum.valueOf(ug.class, str);
    }

    public static ug[] values() {
        return (ug[]) f116634e.clone();
    }
}
