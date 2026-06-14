package yads;

import java.util.LinkedHashMap;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nd3 implements db2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb2 f113827a;

    public /* synthetic */ nd3(v5 v5Var) {
        this(new cb2(v5Var));
    }

    @Override // yads.db2
    public final LinkedHashMap a() {
        return this.f113827a.a(SetsKt.setOf((Object[]) new u5[]{u5.f116517u, u5.f116518v}));
    }

    public nd3(cb2 cb2Var) {
        this.f113827a = cb2Var;
    }
}
