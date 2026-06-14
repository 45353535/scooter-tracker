package ic;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 {
    public static final h0 a(id.k kVar, Context context, ec.b repository) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        return new h0(context, repository, kVar);
    }
}
