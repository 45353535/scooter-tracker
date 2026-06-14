package id;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w0 {
    public static final void a(View view, v0 v0Var) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (v0Var == null) {
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int iK = pd.g0.k(context, v0Var.b());
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        int iK2 = pd.g0.k(context2, v0Var.d());
        Context context3 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        int iK3 = pd.g0.k(context3, v0Var.c());
        Context context4 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        view.setPadding(iK, iK2, iK3, pd.g0.k(context4, v0Var.a()));
    }
}
