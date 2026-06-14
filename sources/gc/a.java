package gc;

import android.content.Context;
import id.a0;
import io.bidmachine.rendering.ad.fullscreen.FullScreenActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static m f72719a;

    public static final void c(m mVar, Context context) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            f72719a = mVar;
            context.startActivity(ic.d.a(context, FullScreenActivity.class));
        } catch (Throwable unused) {
            f72719a = null;
            mVar.U(new a0("Ad is null"));
        }
    }
}
