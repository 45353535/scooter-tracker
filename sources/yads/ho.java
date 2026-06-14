package yads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ho extends km2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f111640v = (int) TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f111641s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final go f111642t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final pm2 f111643u;

    public ho(Context context, int i10, String str, go goVar, pm2 pm2Var) {
        super(i10, fo.a(str), goVar);
        this.f111641s = context;
        this.f111642t = goVar;
        this.f111643u = pm2Var;
        k();
        a(new zd0(1.0f, f111640v, 0));
    }

    @Override // yads.km2
    public oj3 a(oj3 oj3Var) {
        return oj3Var;
    }

    @Override // yads.km2
    public final void a(Object obj) {
        this.f111642t.a(obj);
    }

    public /* synthetic */ ho(Context context, String str, go goVar) {
        this(context, 0, str, goVar, null);
    }
}
