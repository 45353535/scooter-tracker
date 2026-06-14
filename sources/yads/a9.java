package yads;

import java.util.LinkedHashMap;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class a9 implements db2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb2 f108603a;

    public /* synthetic */ a9(v5 v5Var) {
        this(new cb2(v5Var));
    }

    @Override // yads.db2
    public final LinkedHashMap a() {
        return this.f108603a.a(SetsKt.setOf(u5.f116502f));
    }

    public a9(cb2 cb2Var) {
        this.f108603a = cb2Var;
    }
}
