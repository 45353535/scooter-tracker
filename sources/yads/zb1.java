package yads;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zb1 implements jf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es2 f118604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yb1 f118605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final px1 f118606c;

    public zb1(es2 es2Var, yb1 yb1Var, px1 px1Var) {
        this.f118604a = es2Var;
        this.f118605b = yb1Var;
        this.f118606c = px1Var;
    }

    @Override // yads.jf0
    public final List a(Context context, t9 t9Var, jz1 jz1Var, wy wyVar, b2 b2Var, m30 m30Var, y3 y3Var, dp2 dp2Var, w33 w33Var, xg0 xg0Var, oh0 oh0Var, h7 h7Var) {
        List list;
        sh0 sh0Var;
        aw awVar = new aw(t9Var, b2Var, new yi3(), wyVar, this.f118606c, m30Var, w33Var);
        mr1 mr1VarA = ((pr3) this.f118604a).a();
        List listListOf = CollectionsKt.listOf((Object[]) new hx0[]{new zd2(awVar, mr1VarA, new bx()), new ad1(awVar, mr1VarA, new nn2(), new bx()), new zc1(awVar, mr1VarA, new nn2(), new bx())});
        yb1 yb1Var = this.f118605b;
        yb1Var.getClass();
        try {
            yb1Var.f118142e.getClass();
        } catch (Throwable unused) {
        }
        if (wh0.a(context) && oh0Var != null) {
            r22 r22VarC = jz1Var.c();
            try {
                list = listListOf;
                try {
                    sh0Var = new sh0(oh0Var.f114321e, yb1Var.f118138a, yb1Var.f118139b, new sx(new aw(t9Var, b2Var, yb1Var.f118143f, wyVar, yb1Var.f118144g, m30Var, w33Var), new yy(t9Var, b2Var, y3Var, r22VarC, w33Var, oh0Var), new cy2(h7Var, b2Var, yb1Var.f118144g, tx2.a(h7Var))), yb1Var.f118140c, xg0Var, yb1Var.f118141d);
                } catch (Throwable unused2) {
                    sh0Var = null;
                }
            } catch (Throwable unused3) {
                list = listListOf;
            }
            return CollectionsKt.filterNotNull(CollectionsKt.plus((Collection) CollectionsKt.listOf(sh0Var), (Iterable) list));
        }
        list = listListOf;
        sh0Var = null;
        return CollectionsKt.filterNotNull(CollectionsKt.plus((Collection) CollectionsKt.listOf(sh0Var), (Iterable) list));
    }
}
