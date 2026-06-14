package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nf0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ nf0[] f113851b;

    static {
        nf0[] nf0VarArr = {new nf0(0, "AD", "ad"), new nf0(1, "PACK_SHOT", "pack_shot"), new nf0(2, "CLOSE_DIALOG", "close_dialog")};
        f113851b = nf0VarArr;
        qf.a.a(nf0VarArr);
    }

    public nf0(int i10, String str, String str2) {
    }

    public static nf0 valueOf(String str) {
        return (nf0) Enum.valueOf(nf0.class, str);
    }

    public static nf0[] values() {
        return (nf0[]) f113851b.clone();
    }
}
