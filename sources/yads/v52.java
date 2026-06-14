package yads;

import android.view.View;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class v52 implements kh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jh3 f116884a;

    public v52(jh3 jh3Var) {
        this.f116884a = jh3Var;
    }

    @Override // yads.kh3
    public final List a() {
        return CollectionsKt.emptyList();
    }

    @Override // yads.kh3
    public final View getView() {
        return this.f116884a.b();
    }
}
