package l1;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import n1.h;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements s1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v1.a f93867a = new v1.a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f93868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n1.a f93869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f93870d;

    public d(Context context, n1.a aVar, h hVar) {
        this.f93868b = context.getApplicationContext();
        this.f93869c = aVar;
        this.f93870d = hVar;
    }

    public final void a() {
        v1.a aVar;
        t1.b.a("%s : start", "OneDTPropertyWatchdog");
        Context context = this.f93868b;
        if (context == null || (aVar = this.f93867a) == null || aVar.f105677b) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("com.dt.ignite.service.action.PROPERTY_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(aVar, intentFilter, 4);
        } else {
            context.registerReceiver(aVar, intentFilter);
        }
        this.f93867a.f105677b = true;
    }
}
