package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class fg1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f110714b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p33 f110713a = new p33();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f110715c = new AtomicBoolean();

    public fg1(Context context) {
        this.f110714b = context.getApplicationContext();
    }

    public final void a() {
        if (sb.a(this.f110714b)) {
            this.f110713a.getClass();
            if (p33.a() || this.f110715c.getAndSet(true)) {
                return;
            }
            wa1.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
        }
    }
}
