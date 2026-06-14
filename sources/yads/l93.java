package yads;

import j$.util.Objects;
import java.util.Set;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l93 {
    public static final void a(vr3 vr3Var, zl2 zl2Var) {
        String strA;
        Set setEmptySet;
        try {
            c cVarA = zl2Var.a();
            if (cVarA == null || (strA = cVarA.a()) == null) {
                strA = "";
            }
            c cVarA2 = zl2Var.a();
            if (cVarA2 == null || (setEmptySet = cVarA2.b()) == null) {
                setEmptySet = SetsKt.emptySet();
            }
            vr3Var.a(strA);
            vr3Var.a(setEmptySet);
            Objects.toString(setEmptySet);
            boolean z10 = lb1.f113032a;
        } catch (Throwable th2) {
            th2.toString();
            boolean z11 = lb1.f113032a;
        }
    }
}
