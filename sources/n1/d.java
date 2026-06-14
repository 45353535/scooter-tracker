package n1;

import android.content.ComponentName;
import android.os.IBinder;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f95030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f95031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f95032d;

    public d(e eVar, ComponentName componentName, IBinder iBinder) {
        this.f95032d = eVar;
        this.f95030b = componentName;
        this.f95031c = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f95032d.a(this.f95030b, this.f95031c);
    }
}
