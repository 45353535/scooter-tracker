package hc;

import android.content.Context;
import io.bidmachine.rendering.ad.view.ExpandActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference f73155a;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
        WeakReference weakReference = f73155a;
        if (weakReference != null) {
            weakReference.clear();
        }
        f73155a = null;
    }

    public static final void d(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        try {
            f73155a = new WeakReference(rVar);
            Context context = rVar.getContext();
            Context context2 = rVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            context.startActivity(ic.d.a(context2, ExpandActivity.class));
        } catch (Throwable unused) {
            rVar.i0();
        }
    }
}
