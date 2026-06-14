package yads;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class qo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final db3 f115112a;

    public qo1(db3 db3Var) {
        this.f115112a = db3Var;
    }

    public final boolean a(String str, String str2) {
        if (str2 == null || StringsKt.y0(str2)) {
            return true;
        }
        this.f115112a.getClass();
        cb3 cb3VarA = db3.a(str);
        if (cb3VarA == null) {
            return true;
        }
        this.f115112a.getClass();
        cb3 cb3VarA2 = db3.a(str2);
        return cb3VarA2 == null || cb3VarA.compareTo(cb3VarA2) >= 0;
    }
}
