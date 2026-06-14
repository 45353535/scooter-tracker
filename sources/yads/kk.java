package yads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class kk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f112725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik f112726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f112727c;

    public kk(Context context, Handler handler, sm0 sm0Var) {
        this.f112725a = context.getApplicationContext();
        this.f112726b = new ik(this, handler, sm0Var);
    }

    public final void a() {
        if (this.f112727c) {
            this.f112725a.unregisterReceiver(this.f112726b);
            this.f112727c = false;
        }
    }
}
