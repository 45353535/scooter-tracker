package e2;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class k extends m {
    public k(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // e2.m
    View j(Context context, e eVar) {
        return "text".equals(eVar.D()) ? new i2.d(context) : new i2.a(context);
    }

    @Override // e2.m
    protected e l(Context context, e eVar) {
        return (eVar == null || !"text".equals(eVar.D())) ? a.f68795h : a.f68796i;
    }

    public void r(int i10, int i11) {
        View view = this.f68878b;
        if (!(view instanceof i2.d)) {
            if (view instanceof i2.a) {
                ((i2.a) view).g(i10, i11);
            }
        } else {
            i2.d dVar = (i2.d) view;
            if (i11 == 0) {
                dVar.setText("");
            } else {
                dVar.setRemaining(i11);
            }
        }
    }
}
