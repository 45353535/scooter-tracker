package yads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class at0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f108798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f108799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vu f108800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yz1 f108801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gy1 f108802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zs0 f108803f;

    public at0(c4 c4Var, es2 es2Var, vu vuVar, yz1 yz1Var, gy1 gy1Var, zs0 zs0Var) {
        this.f108798a = c4Var;
        this.f108799b = es2Var;
        this.f108800c = vuVar;
        this.f108801d = yz1Var;
        this.f108802e = gy1Var;
        this.f108803f = zs0Var;
    }

    public final void a(Context context, rs0 rs0Var) {
        View viewA = this.f108801d.f118468b.a("feedback");
        ImageView imageView = viewA instanceof ImageView ? (ImageView) viewA : null;
        if (imageView == null) {
            return;
        }
        List list = rs0Var.f115563b;
        if (list.isEmpty()) {
            return;
        }
        try {
            xa xaVar = new xa(context, this.f108799b, this.f108798a);
            this.f108803f.getClass();
            PopupMenu popupMenuA = zs0.a(context, imageView, list);
            popupMenuA.setOnMenuItemClickListener(new yd2(xaVar, list, this.f108800c, this.f108802e));
            popupMenuA.show();
        } catch (Exception e10) {
            boolean z10 = lb1.f113032a;
            ((pr3) this.f108799b).a().reportError("Failed to render feedback", e10);
        }
    }
}
