package yads;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1 f113288b = new m1();

    public m1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Activity activity = (Activity) ((WeakReference) obj).get();
        return Boolean.valueOf(activity == null || activity.isFinishing() || activity.isDestroyed());
    }
}
