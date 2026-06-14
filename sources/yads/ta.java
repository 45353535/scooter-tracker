package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ta {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ta f116137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ta f116138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ta f116139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ta[] f116140e;

    static {
        ta taVar = new ta(0, "SINGLE");
        f116137b = taVar;
        ta taVar2 = new ta(1, "BLOCK");
        f116138c = taVar2;
        ta taVar3 = new ta(2, "BLOCK_INNER_CREATIVE");
        f116139d = taVar3;
        ta[] taVarArr = {taVar, taVar2, taVar3};
        f116140e = taVarArr;
        qf.a.a(taVarArr);
    }

    public ta(int i10, String str) {
    }

    public static ta valueOf(String str) {
        return (ta) Enum.valueOf(ta.class, str);
    }

    public static ta[] values() {
        return (ta[]) f116140e.clone();
    }
}
