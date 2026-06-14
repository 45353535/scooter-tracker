package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class al2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9 f108714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl2 f108715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f108716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f108717d;

    public al2(c9 c9Var, dl2 dl2Var) {
        this(c9Var, dl2Var, new Handler(Looper.getMainLooper()));
    }

    public al2(c9 c9Var, dl2 dl2Var, Handler handler) {
        this.f108714a = c9Var;
        this.f108715b = dl2Var;
        this.f108716c = handler;
    }
}
