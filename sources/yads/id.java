package yads;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class id extends u92 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final md f111959l;

    public id(@NotNull Context context) {
        this(context, new xg1());
    }

    @Override // yads.u92, yads.xz0
    public final void a(Context context, String str) {
        this.f111959l.a(str);
    }

    @Override // yads.u92
    public final void e() {
    }

    public final void setAdtuneWebViewListener(@NotNull nd ndVar) {
        this.f111959l.f113429c = ndVar;
    }

    public final void setOptOutUrl(@Nullable String str) {
        this.f111959l.f113430d = str;
    }

    public /* synthetic */ id(Context context, xg1 xg1Var) {
        this(context, xg1Var, new md(new bd(context)));
    }

    public id(Context context, xg1 xg1Var, md mdVar) {
        super(context, null, 0 == true ? 1 : 0, 62);
        this.f111959l = mdVar;
        if (xg1Var.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(mdVar);
    }
}
