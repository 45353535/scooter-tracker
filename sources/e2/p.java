package e2;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class p extends m {
    public p(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // e2.m
    View j(Context context, e eVar) {
        return ("text".equals(eVar.D()) || "text-reverse".equals(eVar.D())) ? new i2.d(context) : ("circular".equals(eVar.D()) || "circular-reverse".equals(eVar.D())) ? new i2.a(context) : new i2.c(context);
    }

    @Override // e2.m
    protected e l(Context context, e eVar) {
        if (eVar != null) {
            if ("text".equals(eVar.D()) || "text-reverse".equals(eVar.D())) {
                return a.f68800m;
            }
            if ("circular".equals(eVar.D()) || "circular-reverse".equals(eVar.D())) {
                return a.f68802o;
            }
        }
        return a.f68801n;
    }

    public void r(float f10, int i10, int i11) {
        e eVar = this.f68879c;
        if (eVar == null) {
            return;
        }
        boolean z10 = eVar.D() != null && this.f68879c.D().endsWith("reverse");
        View view = this.f68878b;
        if (view instanceof i2.d) {
            i2.d dVar = (i2.d) view;
            if (i11 == 0) {
                dVar.setText("");
                return;
            }
            if (z10) {
                i10 = i11 - i10;
            }
            dVar.setRemaining(Math.max(1, i10));
            return;
        }
        if (view instanceof i2.a) {
            i2.a aVar = (i2.a) view;
            if (z10) {
                aVar.g(f10, i11 != 0 ? Math.max(1, i11 - i10) : 0);
                return;
            } else {
                aVar.g(100.0f - f10, i10);
                return;
            }
        }
        if (view instanceof i2.c) {
            i2.c cVar = (i2.c) view;
            if (z10) {
                f10 = 100.0f - f10;
            }
            cVar.b(f10);
        }
    }
}
