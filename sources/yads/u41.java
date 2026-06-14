package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v41 f116485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f116486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aj3 f116487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final za1 f116488d;

    public u41(v41 v41Var, Handler handler, aj3 aj3Var, za1 za1Var) {
        this.f116485a = v41Var;
        this.f116486b = handler;
        this.f116487c = aj3Var;
        this.f116488d = za1Var;
    }

    public /* synthetic */ u41(z32 z32Var, List list) {
        this(new v41(), new Handler(Looper.getMainLooper()), new aj3(), ab1.a(z32Var, list));
    }
}
