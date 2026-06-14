package yads;

import java.util.LinkedHashMap;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class y82 implements db2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb2 f118111a;

    public /* synthetic */ y82(v5 v5Var) {
        this(new cb2(v5Var));
    }

    @Override // yads.db2
    public final LinkedHashMap a() {
        return this.f118111a.a(SetsKt.setOf((Object[]) new u5[]{u5.f116505i, u5.f116507k, u5.f116506j, u5.f116508l, u5.f116509m, u5.f116520x, u5.f116521y, u5.f116522z}));
    }

    public y82(cb2 cb2Var) {
        this.f118111a = cb2Var;
    }
}
