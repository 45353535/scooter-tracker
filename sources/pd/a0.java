package pd;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f98216a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakReference f98217b;

    private a0() {
    }

    public final Activity a() {
        WeakReference weakReference = f98217b;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public final void b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f98217b = new WeakReference(activity);
    }
}
