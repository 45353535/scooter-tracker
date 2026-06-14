package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ez {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ez f110528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ez[] f110529c;

    static {
        ez ezVar = new ez();
        f110528b = ezVar;
        ez[] ezVarArr = {ezVar};
        f110529c = ezVarArr;
        qf.a.a(ezVarArr);
    }

    public static ez valueOf(String str) {
        return (ez) Enum.valueOf(ez.class, str);
    }

    public static ez[] values() {
        return (ez[]) f110529c.clone();
    }
}
