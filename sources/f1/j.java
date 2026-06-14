package f1;

import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f70133a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f70134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Application f70135c;

    public final Context a() {
        Context context;
        WeakReference weakReference = f70134b;
        return (weakReference == null || (context = (Context) weakReference.get()) == null) ? f70135c : context;
    }

    public final void b(Context context) {
        if (context instanceof Application) {
            f70135c = (Application) context;
            return;
        }
        f70134b = new WeakReference(context);
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        f70135c = applicationContext instanceof Application ? (Application) applicationContext : null;
    }
}
