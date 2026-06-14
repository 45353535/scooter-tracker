package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class my {
    public static final Boolean a(df1 df1Var, String str) {
        Object obj = oy.f114444f;
        ff1 ff1Var = (ff1) df1Var;
        if (!ff1Var.a(str)) {
            ff1Var = null;
        }
        if (ff1Var != null) {
            return Boolean.valueOf(ff1Var.a(str, false));
        }
        return null;
    }

    public static final Integer b(df1 df1Var, String str) {
        Object obj = oy.f114444f;
        ff1 ff1Var = (ff1) df1Var;
        if (!ff1Var.a(str)) {
            ff1Var = null;
        }
        if (ff1Var != null) {
            return Integer.valueOf(ff1Var.a(0, str));
        }
        return null;
    }

    public static final void a(df1 df1Var, String str, Boolean bool) {
        Object obj = oy.f114444f;
        if (bool != null) {
            ((ff1) df1Var).b(str, bool.booleanValue());
        } else {
            ((ff1) df1Var).d(str);
        }
    }

    public static final void a(df1 df1Var, String str, Integer num) {
        Object obj = oy.f114444f;
        if (num != null) {
            ((ff1) df1Var).b(num.intValue(), str);
        } else {
            ((ff1) df1Var).d(str);
        }
    }
}
