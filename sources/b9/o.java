package b9;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public class o extends l {
    public o(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // b9.l
    View h(Context context, k kVar) {
        return ("text".equals(kVar.D()) || "text-reverse".equals(kVar.D())) ? new f9.e(context) : ("circular".equals(kVar.D()) || "circular-reverse".equals(kVar.D())) ? new f9.a(context) : new f9.d(context);
    }

    @Override // b9.l
    protected k j(Context context, k kVar) {
        if (kVar != null) {
            if ("text".equals(kVar.D()) || "text-reverse".equals(kVar.D())) {
                return a.f5849m;
            }
            if ("circular".equals(kVar.D()) || "circular-reverse".equals(kVar.D())) {
                return a.f5851o;
            }
        }
        return a.f5850n;
    }

    public void r(float f10, int i10, int i11) {
        k kVar = this.f5921c;
        if (kVar == null) {
            return;
        }
        boolean z10 = kVar.D() != null && this.f5921c.D().endsWith("reverse");
        View view = this.f5920b;
        if (view instanceof f9.e) {
            f9.e eVar = (f9.e) view;
            if (i11 == 0) {
                eVar.setText("");
                return;
            }
            if (z10) {
                i10 = i11 - i10;
            }
            eVar.setRemaining(Math.max(1, i10));
            return;
        }
        if (view instanceof f9.a) {
            f9.a aVar = (f9.a) view;
            if (z10) {
                aVar.g(f10, i11 != 0 ? Math.max(1, i11 - i10) : 0);
                return;
            } else {
                aVar.g(100.0f - f10, i10);
                return;
            }
        }
        if (view instanceof f9.d) {
            f9.d dVar = (f9.d) view;
            if (z10) {
                f10 = 100.0f - f10;
            }
            dVar.b(f10);
        }
    }
}
