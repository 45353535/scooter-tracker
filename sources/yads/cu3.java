package yads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class cu3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f109599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f109600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioManager f109601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vs3 f109602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qu3 f109603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f109604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f109605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f109606h;

    public cu3(Handler handler, Context context, vs3 vs3Var, qu3 qu3Var) {
        super(handler);
        this.f109604f = new AtomicReference(Float.valueOf(-1.0f));
        this.f109605g = new AtomicBoolean(false);
        this.f109606h = Executors.newSingleThreadExecutor();
        this.f109599a = handler;
        this.f109600b = context;
        this.f109601c = (AudioManager) context.getSystemService("audio");
        this.f109602d = vs3Var;
        this.f109603e = qu3Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        if (this.f109605g.getAndSet(true)) {
            return;
        }
        this.f109606h.submit(new xt3(this));
    }
}
