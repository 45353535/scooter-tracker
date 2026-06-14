package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class dl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5 f109967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final il2 f109968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fl2 f109969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cl2 f109970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final al2 f109971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f109972f;

    public /* synthetic */ dl2(Context context, c9 c9Var, t9 t9Var, c4 c4Var, es2 es2Var, ta taVar, e5 e5Var, il2 il2Var, fl2 fl2Var, List list) {
        this(c9Var, e5Var, il2Var, fl2Var, new cl2(context, t9Var, c4Var, es2Var, taVar, list));
    }

    public dl2(c9 c9Var, e5 e5Var, il2 il2Var, fl2 fl2Var, cl2 cl2Var) {
        this.f109967a = e5Var;
        this.f109968b = il2Var;
        this.f109969c = fl2Var;
        this.f109970d = cl2Var;
        this.f109971e = new al2(c9Var, this);
    }
}
