package f1;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dc f69647a = new dc();

    public final f1 a(Context context, m4 ctaConfig, Function0 function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ctaConfig, "ctaConfig");
        f1 l0Var = ctaConfig.b() != null ? new l0(context, null, 0, null, function0, 14, null) : new jb(context, null, 0, null, null, null, null, function0, 126, null);
        l0Var.e(ctaConfig);
        return l0Var;
    }
}
