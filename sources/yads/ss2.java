package yads;

import java.util.LinkedHashMap;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ss2 implements db2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb2 f115922a;

    public /* synthetic */ ss2(v5 v5Var) {
        this(new cb2(v5Var));
    }

    @Override // yads.db2
    public final LinkedHashMap a() {
        return this.f115922a.a(SetsKt.setOf((Object[]) new u5[]{u5.f116504h, u5.f116505i, u5.f116507k, u5.f116506j, u5.f116508l, u5.f116509m, u5.f116522z}));
    }

    public ss2(cb2 cb2Var) {
        this.f115922a = cb2Var;
    }
}
