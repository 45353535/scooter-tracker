package yads;

import java.util.HashSet;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class yx2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f118434b = new HashSet(CollectionsKt.listOf((Object[]) new s33[]{s33.f115681c, s33.f115680b}));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u33 f118435a;

    public /* synthetic */ yx2() {
        this(new u33(f118434b));
    }

    public final ud3 a(n10 n10Var) {
        int i10 = n10Var.f113686i;
        zx2 zx2Var = n10Var.f113684g;
        if (zx2Var == null) {
            return null;
        }
        la3 la3VarA = this.f118435a.a(zx2Var.f118871a);
        if (la3VarA == null) {
            return null;
        }
        float f10 = la3VarA.f113028c;
        if (ka3.f112666c == la3VarA.f113027b) {
            f10 = (long) ((f10 / 100) * i10);
        }
        return new ud3((long) Math.min(f10, i10));
    }

    public yx2(u33 u33Var) {
        this.f118435a = u33Var;
    }
}
