package yads;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class oa0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final na0 f114243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oa0 f114244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final oa0 f114245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ oa0[] f114246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f114247f;

    static {
        oa0 oa0Var = new oa0(0, "DEFAULT");
        f114244c = oa0Var;
        oa0 oa0Var2 = new oa0(1, "RESULT");
        f114245d = oa0Var2;
        oa0[] oa0VarArr = {oa0Var, oa0Var2};
        f114246e = oa0VarArr;
        f114247f = qf.a.a(oa0VarArr);
        f114243b = new na0();
    }

    public oa0(int i10, String str) {
    }

    public static oa0 valueOf(String str) {
        return (oa0) Enum.valueOf(oa0.class, str);
    }

    public static oa0[] values() {
        return (oa0[]) f114246e.clone();
    }
}
