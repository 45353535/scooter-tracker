package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class cl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f109458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa f109459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bl2 f109460c;

    public /* synthetic */ cl2(Context context, t9 t9Var, c4 c4Var, es2 es2Var, ta taVar, List list) {
        this(list, new xa(context, es2Var, c4Var), new bl2(context, c4Var, es2Var, t9Var, taVar));
    }

    public cl2(List list, xa xaVar, bl2 bl2Var) {
        this.f109458a = list;
        this.f109459b = xaVar;
        this.f109460c = bl2Var;
    }
}
