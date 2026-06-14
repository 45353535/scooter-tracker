package yads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class bz1 implements dz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f109156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f109157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qz f109158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f109159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fg1 f109160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o00 f109161f;

    public /* synthetic */ bz1(Context context, pr3 pr3Var, qz qzVar) {
        this(context, pr3Var, qzVar, new CopyOnWriteArrayList(), new fg1(context), null, null, null);
    }

    public bz1(Context context, pr3 pr3Var, qz qzVar, List list, fg1 fg1Var, o00 o00Var, cr3 cr3Var, ur3 ur3Var) {
        this.f109156a = context;
        this.f109157b = pr3Var;
        this.f109158c = qzVar;
        this.f109159d = list;
        this.f109160e = fg1Var;
        this.f109161f = o00Var;
        fg1Var.a();
    }
}
