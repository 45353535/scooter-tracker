package e2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class e implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f68807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f68808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f68809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f68810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f68811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f68812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f68813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Float f68814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Float f68815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f68816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f68817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f68818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f68819n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f68820o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Integer f68821p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Integer f68822q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f68823r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f68824s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Float f68825t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Float f68826u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Float f68827v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f68828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Float f68829x;

    public e() {
    }

    public Integer A(Context context) {
        return Integer.valueOf(this.f68818m != null ? g.k(context, r0.intValue()) : 0);
    }

    public Integer B() {
        Integer num = this.f68807b;
        return num != null ? num : Integer.valueOf(a.f68788a);
    }

    public Float C(Context context) {
        return Float.valueOf(this.f68825t != null ? g.k(context, r0.floatValue()) : 0.0f);
    }

    public String D() {
        return this.f68813h;
    }

    public Integer E() {
        Integer num = this.f68812g;
        if (num != null) {
            return num;
        }
        return 48;
    }

    public Integer F(Context context) {
        Float f10 = this.f68826u;
        return Integer.valueOf(f10 != null ? (f10.floatValue() == -1.0f || this.f68826u.floatValue() == -2.0f) ? this.f68826u.intValue() : g.k(context, this.f68826u.floatValue()) : -2);
    }

    public boolean G() {
        return this.f68808c != null;
    }

    public boolean H() {
        return this.f68807b != null;
    }

    public Boolean I() {
        Boolean bool = this.f68809d;
        return bool != null ? bool : Boolean.FALSE;
    }

    public Boolean J() {
        Boolean bool = this.f68810e;
        return bool != null ? bool : Boolean.TRUE;
    }

    public void K(e eVar) {
        if (eVar == null) {
            return;
        }
        Integer num = eVar.f68807b;
        if (num != null) {
            this.f68807b = num;
        }
        Integer num2 = eVar.f68808c;
        if (num2 != null) {
            this.f68808c = num2;
        }
        Boolean bool = eVar.f68809d;
        if (bool != null) {
            this.f68809d = bool;
        }
        Boolean bool2 = eVar.f68810e;
        if (bool2 != null) {
            this.f68810e = bool2;
        }
        Integer num3 = eVar.f68811f;
        if (num3 != null) {
            this.f68811f = num3;
        }
        Integer num4 = eVar.f68812g;
        if (num4 != null) {
            this.f68812g = num4;
        }
        String str = eVar.f68813h;
        if (str != null) {
            this.f68813h = str;
        }
        Float f10 = eVar.f68814i;
        if (f10 != null) {
            this.f68814i = f10;
        }
        Float f11 = eVar.f68815j;
        if (f11 != null) {
            this.f68815j = f11;
        }
        Integer num5 = eVar.f68816k;
        if (num5 != null) {
            this.f68816k = num5;
        }
        Integer num6 = eVar.f68817l;
        if (num6 != null) {
            this.f68817l = num6;
        }
        Integer num7 = eVar.f68818m;
        if (num7 != null) {
            this.f68818m = num7;
        }
        Integer num8 = eVar.f68819n;
        if (num8 != null) {
            this.f68819n = num8;
        }
        Integer num9 = eVar.f68820o;
        if (num9 != null) {
            this.f68820o = num9;
        }
        Integer num10 = eVar.f68822q;
        if (num10 != null) {
            this.f68822q = num10;
        }
        Integer num11 = eVar.f68821p;
        if (num11 != null) {
            this.f68821p = num11;
        }
        Integer num12 = eVar.f68823r;
        if (num12 != null) {
            this.f68823r = num12;
        }
        String str2 = eVar.f68824s;
        if (str2 != null) {
            this.f68824s = str2;
        }
        Float f12 = eVar.f68825t;
        if (f12 != null) {
            this.f68825t = f12;
        }
        Float f13 = eVar.f68826u;
        if (f13 != null) {
            this.f68826u = f13;
        }
        Float f14 = eVar.f68827v;
        if (f14 != null) {
            this.f68827v = f14;
        }
        Integer num13 = eVar.f68828w;
        if (num13 != null) {
            this.f68828w = num13;
        }
        Float f15 = eVar.f68829x;
        if (f15 != null) {
            this.f68829x = f15;
        }
    }

    public int L() {
        return E().intValue() | n().intValue();
    }

    public void M(String str) {
        this.f68824s = str;
    }

    public void N(Integer num) {
        this.f68808c = num;
    }

    public void O(Float f10) {
        this.f68829x = f10;
    }

    public void P(Integer num) {
        this.f68828w = num;
    }

    public void Q(Number number) {
        this.f68827v = Float.valueOf(number.floatValue());
    }

    public void S(Float f10) {
        this.f68815j = f10;
    }

    public void T(Integer num) {
        this.f68811f = num;
    }

    public void U(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f68820o = num;
        this.f68821p = num2;
        this.f68822q = num3;
        this.f68823r = num4;
    }

    public void V(String str) {
        if (TextUtils.isEmpty(str)) {
            U(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length == 1) {
            int iIntValue = g.j(strArrSplit[0]).intValue();
            U(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = g.j(strArrSplit[0]).intValue();
            int iIntValue3 = g.j(strArrSplit[1]).intValue();
            U(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = g.j(strArrSplit[0]).intValue();
                int iIntValue5 = g.j(strArrSplit[1]).intValue();
                U(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(g.j(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                U(Integer.valueOf(g.j(strArrSplit[3]).intValue()), Integer.valueOf(g.j(strArrSplit[0]).intValue()), Integer.valueOf(g.j(strArrSplit[1]).intValue()), Integer.valueOf(g.j(strArrSplit[2]).intValue()));
            }
        }
    }

    public void W(Float f10) {
        this.f68814i = f10;
    }

    public void X(Boolean bool) {
        this.f68809d = bool;
    }

    public void Y(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f68816k = num;
        this.f68818m = num2;
        this.f68817l = num3;
        this.f68819n = num4;
    }

    public void Z(String str) {
        if (TextUtils.isEmpty(str)) {
            Y(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length == 1) {
            int iIntValue = g.j(strArrSplit[0]).intValue();
            Y(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = g.j(strArrSplit[0]).intValue();
            int iIntValue3 = g.j(strArrSplit[1]).intValue();
            Y(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = g.j(strArrSplit[0]).intValue();
                int iIntValue5 = g.j(strArrSplit[1]).intValue();
                Y(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(g.j(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                Y(Integer.valueOf(g.j(strArrSplit[3]).intValue()), Integer.valueOf(g.j(strArrSplit[0]).intValue()), Integer.valueOf(g.j(strArrSplit[1]).intValue()), Integer.valueOf(g.j(strArrSplit[2]).intValue()));
            }
        }
    }

    public void a(FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = L();
    }

    public void a0(Integer num) {
        this.f68807b = num;
    }

    public void b(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginLayoutParams.leftMargin = q(context).intValue();
        marginLayoutParams.topMargin = s(context).intValue();
        marginLayoutParams.rightMargin = r(context).intValue();
        marginLayoutParams.bottomMargin = o(context).intValue();
    }

    public void b0(Float f10) {
        this.f68825t = f10;
    }

    public void c(Context context, View view) {
        view.setPadding(v(context).intValue(), A(context).intValue(), x(context).intValue(), u(context).intValue());
    }

    public void c0(String str) {
        this.f68813h = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r0 != 17) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(android.widget.RelativeLayout.LayoutParams r4) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.n()
            int r0 = r0.intValue()
            r1 = 1
            r2 = 17
            if (r0 == r1) goto L1f
            r1 = 3
            if (r0 == r1) goto L1c
            r1 = 5
            if (r0 == r1) goto L16
            if (r0 == r2) goto L1f
            goto L22
        L16:
            r0 = 11
        L18:
            r4.addRule(r0)
            goto L22
        L1c:
            r0 = 9
            goto L18
        L1f:
            r0 = 14
            goto L18
        L22:
            java.lang.Integer r0 = r3.E()
            int r0 = r0.intValue()
            r1 = 16
            if (r0 == r1) goto L42
            if (r0 == r2) goto L42
            r1 = 48
            if (r0 == r1) goto L3f
            r1 = 80
            if (r0 == r1) goto L39
            return
        L39:
            r0 = 12
        L3b:
            r4.addRule(r0)
            return
        L3f:
            r0 = 10
            goto L3b
        L42:
            r0 = 15
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.e.d(android.widget.RelativeLayout$LayoutParams):void");
    }

    public void d0(Integer num) {
        this.f68812g = num;
    }

    public void e0(Boolean bool) {
        this.f68810e = bool;
    }

    public void f0(Number number) {
        this.f68826u = Float.valueOf(number.floatValue());
    }

    public e g(e eVar) {
        e eVar2 = new e();
        eVar2.K(this);
        eVar2.K(eVar);
        return eVar2;
    }

    public String h() {
        return this.f68824s;
    }

    public Integer i() {
        Integer num = this.f68808c;
        return num != null ? num : Integer.valueOf(a.f68790c);
    }

    public Float j(Context context) {
        return Float.valueOf(g.k(context, this.f68829x != null ? r0.floatValue() : 16.0f));
    }

    public Integer k() {
        Integer num = this.f68828w;
        if (num != null) {
            return num;
        }
        return 0;
    }

    public Integer l(Context context) {
        Float f10 = this.f68827v;
        return Integer.valueOf(f10 != null ? (f10.floatValue() == -1.0f || this.f68827v.floatValue() == -2.0f) ? this.f68827v.intValue() : g.k(context, this.f68827v.floatValue()) : -2);
    }

    public Float m() {
        return this.f68815j;
    }

    public Integer n() {
        Integer num = this.f68811f;
        if (num != null) {
            return num;
        }
        return 3;
    }

    public Integer o(Context context) {
        return Integer.valueOf(this.f68823r != null ? g.k(context, r0.intValue()) : 0);
    }

    public Integer q(Context context) {
        return Integer.valueOf(this.f68820o != null ? g.k(context, r0.intValue()) : 0);
    }

    public Integer r(Context context) {
        return Integer.valueOf(this.f68822q != null ? g.k(context, r0.intValue()) : 0);
    }

    public Integer s(Context context) {
        return Integer.valueOf(this.f68821p != null ? g.k(context, r0.intValue()) : 0);
    }

    public Float t() {
        Float f10 = this.f68814i;
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    public Integer u(Context context) {
        return Integer.valueOf(this.f68819n != null ? g.k(context, r0.intValue()) : 0);
    }

    public Integer v(Context context) {
        return Integer.valueOf(this.f68816k != null ? g.k(context, r0.intValue()) : 0);
    }

    public Integer x(Context context) {
        return Integer.valueOf(this.f68817l != null ? g.k(context, r0.intValue()) : 0);
    }

    public e(e eVar) {
        K(eVar);
    }
}
