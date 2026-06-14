package fd;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import id.e1;
import id.f1;
import id.z;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g extends RelativeLayout {

    public static class a extends RelativeLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f72006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f72008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f72009d;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f72008c = 1.0f;
            this.f72009d = 1.0f;
            this.f72006a = i10;
            this.f72007b = i11;
        }

        private View b(List list, String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ic.f fVar = (ic.f) it.next();
                if (fVar.h().j().equals(str)) {
                    return fVar.j();
                }
            }
            return null;
        }

        private void e(e1 e1Var, e1 e1Var2, List list) {
            f(e1Var, f1.Left, 5, 1, 9, list);
            f(e1Var2, f1.Right, 7, 0, 11, list);
        }

        private void f(e1 e1Var, f1 f1Var, int i10, int i11, int i12, List list) {
            if (e1Var == null) {
                return;
            }
            View viewB = b(list, e1Var.a());
            if (viewB == null) {
                addRule(i12);
                return;
            }
            if (e1Var.b() != f1Var) {
                i10 = i11;
            }
            addRule(i10, viewB.getId());
        }

        private boolean g(e1 e1Var, e1 e1Var2, int i10, int i11) {
            if (i11 <= 0 || e1Var == null || e1Var2 == null) {
                return false;
            }
            addRule(i10);
            return true;
        }

        private void j(e1 e1Var, e1 e1Var2, List list) {
            f(e1Var, f1.Top, 6, 3, 10, list);
            f(e1Var2, f1.Bottom, 8, 2, 12, list);
        }

        public void c(float f10) {
            this.f72009d = f10;
        }

        public void d(Context context, z zVar, List list) {
            i(zVar.m());
            c(zVar.b());
            setMargins(zVar.f(context), zVar.h(context), -zVar.g(context), -zVar.e(context));
            e1 e1VarJ = zVar.j();
            e1 e1VarA = zVar.a();
            if (!g(e1VarJ, e1VarA, 15, zVar.n(context))) {
                j(e1VarJ, e1VarA, list);
            }
            e1 e1VarD = zVar.d();
            e1 e1VarI = zVar.i();
            if (g(e1VarD, e1VarI, 14, zVar.c(context))) {
                return;
            }
            e(e1VarD, e1VarI, list);
        }

        public void i(float f10) {
            this.f72008c = f10;
        }
    }

    public g(Context context) {
        super(context);
    }

    private void c(int i10, int i11, View view, a aVar) {
        Integer numA;
        Integer numA2;
        float f10 = aVar.f72008c;
        if (f10 > 0.0f && f10 < 1.0f && (numA2 = a(aVar.f72006a, i10, view.getMeasuredWidth(), f10)) != null) {
            ((RelativeLayout.LayoutParams) aVar).width = numA2.intValue();
        }
        float f11 = aVar.f72009d;
        if (f11 <= 0.0f || f11 >= 1.0f || (numA = a(aVar.f72007b, i11, view.getMeasuredHeight(), f11)) == null) {
            return;
        }
        ((RelativeLayout.LayoutParams) aVar).height = numA.intValue();
    }

    Integer a(int i10, int i11, int i12, float f10) {
        if (i10 <= 0) {
            if (i10 == -1) {
                i10 = i11;
            } else {
                if (i10 != -2 || i12 == 0) {
                    return null;
                }
                i10 = i12;
            }
        }
        if (i10 == 0) {
            return null;
        }
        return Integer.valueOf(Math.round(i10 * f10));
    }

    void b(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof a) {
                c(size, size2, childAt, (a) layoutParams);
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        b(i10, i11);
        super.onMeasure(i10, i11);
    }
}
