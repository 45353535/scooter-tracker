package yads;

import android.content.Context;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes4.dex */
public final class pr2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Mutex f114751d = ng.f.b(false, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f114752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bv2 f114753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lr2 f114754c;

    public /* synthetic */ pr2(Context context, mr1 mr1Var, hl0 hl0Var, pd pdVar, v5 v5Var) {
        this(v5Var, new bv2(), new lr2(context.getApplicationContext(), mr1Var, pdVar, hl0Var, v5Var));
    }

    public pr2(v5 v5Var, bv2 bv2Var, lr2 lr2Var) {
        this.f114752a = v5Var;
        this.f114753b = bv2Var;
        this.f114754c = lr2Var;
    }
}
