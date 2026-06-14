package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class ls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f113204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ze f113205b;

    public /* synthetic */ ls(Context context) {
        this(new Handler(Looper.getMainLooper()), ns.a(context));
    }

    public ls(Handler handler, ze zeVar) {
        this.f113204a = handler;
        this.f113205b = zeVar;
    }
}
