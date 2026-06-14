package yads;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cd extends u92 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ed f109347l;

    public cd(@NotNull Context context) {
        this(context, new xg1());
    }

    @Override // yads.u92, yads.xz0
    public final void a(Context context, String str) {
        this.f109347l.a(str);
    }

    @Override // yads.u92
    public final void e() {
    }

    public final void setAdtuneWebViewListener(@NotNull fd fdVar) {
        this.f109347l.f110330c = fdVar;
    }

    public /* synthetic */ cd(Context context, xg1 xg1Var) {
        this(context, xg1Var, new ed(new c92(context)));
    }

    public cd(Context context, xg1 xg1Var, ed edVar) {
        super(context, null, 0 == true ? 1 : 0, 62);
        this.f109347l = edVar;
        if (xg1Var.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(edVar);
    }
}
