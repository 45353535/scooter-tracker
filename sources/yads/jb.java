package yads;

import java.lang.ref.WeakReference;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class jb implements s12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uv0 f112279a;

    public jb(uv0 uv0Var) {
        this.f112279a = uv0Var;
    }

    @Override // yads.s12
    public final void a(g41 g41Var) {
        gk2 gk2Var = this.f112279a.f116790a;
        KProperty kProperty = uv0.f116789b[0];
        gk2Var.getClass();
        gk2Var.f111244a = new WeakReference(g41Var);
    }
}
