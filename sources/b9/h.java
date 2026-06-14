package b9;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public class h extends l {
    public h(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // b9.l
    View h(Context context, k kVar) {
        return "text".equals(kVar.D()) ? new f9.e(context) : new f9.a(context);
    }

    @Override // b9.l
    protected k j(Context context, k kVar) {
        return (kVar == null || !"text".equals(kVar.D())) ? a.f5844h : a.f5845i;
    }

    public void r(int i10, int i11) {
        View view = this.f5920b;
        if (!(view instanceof f9.e)) {
            if (view instanceof f9.a) {
                ((f9.a) view).g(i10, i11);
            }
        } else {
            f9.e eVar = (f9.e) view;
            if (i11 == 0) {
                eVar.setText("");
            } else {
                eVar.setRemaining(i11);
            }
        }
    }
}
