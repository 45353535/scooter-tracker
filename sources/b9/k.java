package b9;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class k implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f5896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f5897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f5898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f5899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f5900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f5901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f5902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Float f5903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Float f5904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f5905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f5906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f5907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f5908n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f5909o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Integer f5910p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Integer f5911q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f5912r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f5913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Float f5914t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Float f5915u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Float f5916v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f5917w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Float f5918x;

    public k() {
    }

    public Integer A(Context context) {
        if (this.f5907m != null) {
            return Integer.valueOf(u.p(context, r0.intValue()));
        }
        return 0;
    }

    public Integer B() {
        Integer num = this.f5896b;
        return num != null ? num : Integer.valueOf(a.f5837a);
    }

    public Float C(Context context) {
        return this.f5914t != null ? Float.valueOf(u.p(context, r0.floatValue())) : Float.valueOf(0.0f);
    }

    public String D() {
        return this.f5902h;
    }

    public Integer E() {
        Integer num = this.f5901g;
        if (num != null) {
            return num;
        }
        return 48;
    }

    public Integer F(Context context) {
        Float f10 = this.f5915u;
        if (f10 != null) {
            return f10.floatValue() == -1.0f ? Integer.valueOf(this.f5915u.intValue()) : this.f5915u.floatValue() == -2.0f ? Integer.valueOf(this.f5915u.intValue()) : Integer.valueOf(u.p(context, this.f5915u.floatValue()));
        }
        return -2;
    }

    public boolean G() {
        return this.f5897c != null;
    }

    public boolean H() {
        return this.f5896b != null;
    }

    public Boolean I() {
        Boolean bool = this.f5898d;
        return bool != null ? bool : Boolean.FALSE;
    }

    public Boolean J() {
        Boolean bool = this.f5899e;
        return bool != null ? bool : Boolean.TRUE;
    }

    public void K(k kVar) {
        if (kVar == null) {
            return;
        }
        Integer num = kVar.f5896b;
        if (num != null) {
            this.f5896b = num;
        }
        Integer num2 = kVar.f5897c;
        if (num2 != null) {
            this.f5897c = num2;
        }
        Boolean bool = kVar.f5898d;
        if (bool != null) {
            this.f5898d = bool;
        }
        Boolean bool2 = kVar.f5899e;
        if (bool2 != null) {
            this.f5899e = bool2;
        }
        Integer num3 = kVar.f5900f;
        if (num3 != null) {
            this.f5900f = num3;
        }
        Integer num4 = kVar.f5901g;
        if (num4 != null) {
            this.f5901g = num4;
        }
        String str = kVar.f5902h;
        if (str != null) {
            this.f5902h = str;
        }
        Float f10 = kVar.f5903i;
        if (f10 != null) {
            this.f5903i = f10;
        }
        Float f11 = kVar.f5904j;
        if (f11 != null) {
            this.f5904j = f11;
        }
        Integer num5 = kVar.f5905k;
        if (num5 != null) {
            this.f5905k = num5;
        }
        Integer num6 = kVar.f5906l;
        if (num6 != null) {
            this.f5906l = num6;
        }
        Integer num7 = kVar.f5907m;
        if (num7 != null) {
            this.f5907m = num7;
        }
        Integer num8 = kVar.f5908n;
        if (num8 != null) {
            this.f5908n = num8;
        }
        Integer num9 = kVar.f5909o;
        if (num9 != null) {
            this.f5909o = num9;
        }
        Integer num10 = kVar.f5911q;
        if (num10 != null) {
            this.f5911q = num10;
        }
        Integer num11 = kVar.f5910p;
        if (num11 != null) {
            this.f5910p = num11;
        }
        Integer num12 = kVar.f5912r;
        if (num12 != null) {
            this.f5912r = num12;
        }
        String str2 = kVar.f5913s;
        if (str2 != null) {
            this.f5913s = str2;
        }
        Float f12 = kVar.f5914t;
        if (f12 != null) {
            this.f5914t = f12;
        }
        Float f13 = kVar.f5915u;
        if (f13 != null) {
            this.f5915u = f13;
        }
        Float f14 = kVar.f5916v;
        if (f14 != null) {
            this.f5916v = f14;
        }
        Integer num13 = kVar.f5917w;
        if (num13 != null) {
            this.f5917w = num13;
        }
        Float f15 = kVar.f5918x;
        if (f15 != null) {
            this.f5918x = f15;
        }
    }

    public int L() {
        return E().intValue() | n().intValue();
    }

    public void M(String str) {
        this.f5913s = str;
    }

    public void N(Integer num) {
        this.f5897c = num;
    }

    public void O(Float f10) {
        this.f5918x = f10;
    }

    public void P(Integer num) {
        this.f5917w = num;
    }

    public void Q(Number number) {
        this.f5916v = number != null ? Float.valueOf(number.floatValue()) : null;
    }

    public void S(Float f10) {
        this.f5904j = f10;
    }

    public void T(Integer num) {
        this.f5900f = num;
    }

    public void U(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f5909o = num;
        this.f5910p = num2;
        this.f5911q = num3;
        this.f5912r = num4;
    }

    public void V(String str) {
        if (TextUtils.isEmpty(str)) {
            U(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length == 1) {
            int iIntValue = u.o(strArrSplit[0]).intValue();
            U(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = u.o(strArrSplit[0]).intValue();
            int iIntValue3 = u.o(strArrSplit[1]).intValue();
            U(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = u.o(strArrSplit[0]).intValue();
                int iIntValue5 = u.o(strArrSplit[1]).intValue();
                U(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(u.o(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                U(Integer.valueOf(u.o(strArrSplit[3]).intValue()), Integer.valueOf(u.o(strArrSplit[0]).intValue()), Integer.valueOf(u.o(strArrSplit[1]).intValue()), Integer.valueOf(u.o(strArrSplit[2]).intValue()));
            }
        }
    }

    public void W(Float f10) {
        this.f5903i = f10;
    }

    public void X(Boolean bool) {
        this.f5898d = bool;
    }

    public void Y(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f5905k = num;
        this.f5907m = num2;
        this.f5906l = num3;
        this.f5908n = num4;
    }

    public void Z(String str) {
        if (TextUtils.isEmpty(str)) {
            Y(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length == 1) {
            int iIntValue = u.o(strArrSplit[0]).intValue();
            Y(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = u.o(strArrSplit[0]).intValue();
            int iIntValue3 = u.o(strArrSplit[1]).intValue();
            Y(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = u.o(strArrSplit[0]).intValue();
                int iIntValue5 = u.o(strArrSplit[1]).intValue();
                Y(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(u.o(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                Y(Integer.valueOf(u.o(strArrSplit[3]).intValue()), Integer.valueOf(u.o(strArrSplit[0]).intValue()), Integer.valueOf(u.o(strArrSplit[1]).intValue()), Integer.valueOf(u.o(strArrSplit[2]).intValue()));
            }
        }
    }

    public void a(FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = L();
    }

    public void a0(Integer num) {
        this.f5896b = num;
    }

    public void b(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginLayoutParams.leftMargin = q(context).intValue();
        marginLayoutParams.topMargin = s(context).intValue();
        marginLayoutParams.rightMargin = r(context).intValue();
        marginLayoutParams.bottomMargin = o(context).intValue();
    }

    public void b0(Float f10) {
        this.f5914t = f10;
    }

    public void c(Context context, View view) {
        view.setPadding(v(context).intValue(), A(context).intValue(), x(context).intValue(), u(context).intValue());
    }

    public void c0(String str) {
        this.f5902h = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
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
            if (r0 == r1) goto L22
            r1 = 3
            if (r0 == r1) goto L1c
            r1 = 5
            if (r0 == r1) goto L16
            if (r0 == r2) goto L22
            goto L27
        L16:
            r0 = 11
            r4.addRule(r0)
            goto L27
        L1c:
            r0 = 9
            r4.addRule(r0)
            goto L27
        L22:
            r0 = 14
            r4.addRule(r0)
        L27:
            java.lang.Integer r0 = r3.E()
            int r0 = r0.intValue()
            r1 = 16
            if (r0 == r1) goto L4a
            if (r0 == r2) goto L4a
            r1 = 48
            if (r0 == r1) goto L44
            r1 = 80
            if (r0 == r1) goto L3e
            return
        L3e:
            r0 = 12
            r4.addRule(r0)
            return
        L44:
            r0 = 10
            r4.addRule(r0)
            return
        L4a:
            r0 = 15
            r4.addRule(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.k.d(android.widget.RelativeLayout$LayoutParams):void");
    }

    public void d0(Integer num) {
        this.f5901g = num;
    }

    public void e0(Boolean bool) {
        this.f5899e = bool;
    }

    public void f0(Number number) {
        this.f5915u = number != null ? Float.valueOf(number.floatValue()) : null;
    }

    public k g(k kVar) {
        k kVar2 = new k();
        kVar2.K(this);
        kVar2.K(kVar);
        return kVar2;
    }

    public String h() {
        return this.f5913s;
    }

    public Integer i() {
        Integer num = this.f5897c;
        return num != null ? num : Integer.valueOf(a.f5839c);
    }

    public Float j(Context context) {
        return this.f5918x != null ? Float.valueOf(u.p(context, r0.floatValue())) : Float.valueOf(u.p(context, 16.0f));
    }

    public Integer k() {
        Integer num = this.f5917w;
        if (num != null) {
            return num;
        }
        return 0;
    }

    public Integer l(Context context) {
        Float f10 = this.f5916v;
        if (f10 != null) {
            return f10.floatValue() == -1.0f ? Integer.valueOf(this.f5916v.intValue()) : this.f5916v.floatValue() == -2.0f ? Integer.valueOf(this.f5916v.intValue()) : Integer.valueOf(u.p(context, this.f5916v.floatValue()));
        }
        return -2;
    }

    public Float m() {
        return this.f5904j;
    }

    public Integer n() {
        Integer num = this.f5900f;
        if (num != null) {
            return num;
        }
        return 3;
    }

    public Integer o(Context context) {
        if (this.f5912r != null) {
            return Integer.valueOf(u.p(context, r0.intValue()));
        }
        return 0;
    }

    public Integer q(Context context) {
        if (this.f5909o != null) {
            return Integer.valueOf(u.p(context, r0.intValue()));
        }
        return 0;
    }

    public Integer r(Context context) {
        if (this.f5911q != null) {
            return Integer.valueOf(u.p(context, r0.intValue()));
        }
        return 0;
    }

    public Integer s(Context context) {
        if (this.f5910p != null) {
            return Integer.valueOf(u.p(context, r0.intValue()));
        }
        return 0;
    }

    public Float t() {
        Float f10 = this.f5903i;
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    public Integer u(Context context) {
        if (this.f5908n != null) {
            return Integer.valueOf(u.p(context, r0.intValue()));
        }
        return 0;
    }

    public Integer v(Context context) {
        if (this.f5905k != null) {
            return Integer.valueOf(u.p(context, r0.intValue()));
        }
        return 0;
    }

    public Integer x(Context context) {
        if (this.f5906l != null) {
            return Integer.valueOf(u.p(context, r0.intValue()));
        }
        return 0;
    }

    public k(k kVar) {
        K(kVar);
    }
}
