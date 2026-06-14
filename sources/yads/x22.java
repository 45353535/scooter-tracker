package yads;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class x22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n22 f117689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e62 f117690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u42 f117691c;

    public /* synthetic */ x22(Context context, CoroutineScope coroutineScope, v5 v5Var, rx1 rx1Var) {
        this(rx1Var, new n22(context, coroutineScope, v5Var), new e62(v5Var));
    }

    public x22(rx1 rx1Var, n22 n22Var, e62 e62Var) {
        this.f117689a = n22Var;
        this.f117690b = e62Var;
        this.f117691c = rx1Var.a();
    }
}
