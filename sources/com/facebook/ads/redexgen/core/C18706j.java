package com.facebook.ads.redexgen.core;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C18706j extends AbstractC2983g0 {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"5", "w4FteHoxEZNBcBknXysU1QdwgOlgu", "XTfmSewcFvVIPqcU8HiF2JwhBroc2", "gTOT0dcLAsFp3JXaujmr6eSvv", "MioH3rC6822UBFONR3LUPujrkCbYq", "9Rk7JcSITmrZ17kamSQ7i6v9RKdnt", "plmSW6Ql", "PR6dCqey"};
    public ArrayList<AbstractC2367Qg> A0A = new ArrayList<>();
    public ArrayList<AbstractC2367Qg> A07 = new ArrayList<>();
    public ArrayList<C2357Pw> A09 = new ArrayList<>();
    public ArrayList<C2356Pv> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC2367Qg>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C2357Pw>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<C2356Pv>> A03 = new ArrayList<>();
    public ArrayList<AbstractC2367Qg> A00 = new ArrayList<>();
    public ArrayList<AbstractC2367Qg> A04 = new ArrayList<>();
    public ArrayList<AbstractC2367Qg> A06 = new ArrayList<>();
    public ArrayList<AbstractC2367Qg> A02 = new ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.QK
    public final void A0H() {
        int size;
        for (int size2 = this.A09.size() - 1; size2 >= 0; size2--) {
            C2357Pw c2357Pw = this.A09.get(size2);
            View view = c2357Pw.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0U(c2357Pw.A04);
            this.A09.remove(size2);
        }
        for (int size3 = this.A0A.size() - 1; size3 >= 0; size3--) {
            A0V(this.A0A.get(size3));
            this.A0A.remove(size3);
        }
        for (int size4 = this.A07.size() - 1; size4 >= 0; size4--) {
            AbstractC2367Qg abstractC2367Qg = this.A07.get(size4);
            abstractC2367Qg.A0H.setAlpha(1.0f);
            A0T(abstractC2367Qg);
            this.A07.remove(size4);
        }
        for (int size5 = this.A08.size() - 1; size5 >= 0; size5--) {
            ArrayList<C2356Pv> arrayList = this.A08;
            String[] strArr = A0C;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "IUveBZzBDFrSzC13ImzzVKkvQDdr2";
            strArr2[5] = "sCoWws78k8eiD0jPt8s7ggXNZv987";
            A00(arrayList.get(size5));
        }
        this.A08.clear();
        if (A0M()) {
            for (int size6 = this.A05.size() - 1; size6 >= 0; size6--) {
                ArrayList<C2357Pw> arrayList2 = this.A05.get(size6);
                for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                    C2357Pw c2357Pw2 = arrayList2.get(size7);
                    View view2 = c2357Pw2.A04.A0H;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    A0U(c2357Pw2.A04);
                    arrayList2.remove(size7);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(arrayList2);
                    }
                }
            }
            for (int size8 = this.A01.size() - 1; size8 >= 0; size8--) {
                ArrayList<AbstractC2367Qg> arrayList3 = this.A01.get(size8);
                for (int size9 = arrayList3.size() - 1; size9 >= 0; size9--) {
                    AbstractC2367Qg abstractC2367Qg2 = arrayList3.get(size9);
                    abstractC2367Qg2.A0H.setAlpha(1.0f);
                    A0T(abstractC2367Qg2);
                    arrayList3.remove(size9);
                    if (arrayList3.isEmpty()) {
                        ArrayList<ArrayList<AbstractC2367Qg>> arrayList4 = this.A01;
                        String[] strArr3 = A0C;
                        if (strArr3[0].length() != strArr3[3].length()) {
                            String[] strArr4 = A0C;
                            strArr4[7] = "VBPMrKBD";
                            strArr4[6] = "WZFlfD4M";
                            arrayList4.remove(arrayList3);
                        } else {
                            arrayList4.remove(arrayList3);
                        }
                    }
                }
            }
            ArrayList<ArrayList<C2356Pv>> arrayList5 = this.A03;
            String[] strArr5 = A0C;
            if (strArr5[7].length() != strArr5[6].length()) {
                size = arrayList5.size() - 1;
            } else {
                String[] strArr6 = A0C;
                strArr6[2] = "1rfkrkAxI3SWkdgenr27gUX73o6p1";
                strArr6[1] = "SSeA7srmTqf1oxxrlzMYS1BTDHSjo";
                size = arrayList5.size() - 1;
            }
            while (size >= 0) {
                ArrayList<C2356Pv> arrayList6 = this.A03.get(size);
                for (int size10 = arrayList6.size() - 1; size10 >= 0; size10--) {
                    A00(arrayList6.get(size10));
                    if (arrayList6.isEmpty()) {
                        this.A03.remove(arrayList6);
                    }
                }
                size--;
            }
            A03(this.A06);
            A03(this.A04);
            A03(this.A00);
            A03(this.A02);
            A0G();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC2983g0
    public final boolean A0Z(AbstractC2367Qg abstractC2367Qg, int i10, int i11, int i12, int i13) {
        View view = abstractC2367Qg.A0H;
        int translationX = i10 + ((int) abstractC2367Qg.A0H.getTranslationX());
        int translationY = i11 + ((int) abstractC2367Qg.A0H.getTranslationY());
        A02(abstractC2367Qg);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            A0U(abstractC2367Qg);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.A09.add(new C2357Pw(abstractC2367Qg, translationX, translationY, i12, i13));
        return true;
    }

    private void A00(C2356Pv c2356Pv) {
        if (c2356Pv.A05 != null) {
            A05(c2356Pv, c2356Pv.A05);
        }
        if (c2356Pv.A04 != null) {
            A05(c2356Pv, c2356Pv.A04);
        }
    }

    private void A01(AbstractC2367Qg abstractC2367Qg) {
        View view = abstractC2367Qg.A0H;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A06.add(abstractC2367Qg);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.setDuration(A0D());
        animation.alpha(0.0f).setListener(new C2351Pq(this, abstractC2367Qg, viewPropertyAnimatorAnimate, view)).start();
    }

    private void A02(AbstractC2367Qg abstractC2367Qg) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC2367Qg.A0H.animate().setInterpolator(A0B);
        A0L(abstractC2367Qg);
    }

    private final void A03(List<AbstractC2367Qg> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A04(List<C2356Pv> list, AbstractC2367Qg abstractC2367Qg) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C2356Pv changeInfo = list.get(size);
            if (A05(changeInfo, abstractC2367Qg) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A05(C2356Pv c2356Pv, AbstractC2367Qg abstractC2367Qg) {
        boolean z10 = false;
        if (c2356Pv.A04 == abstractC2367Qg) {
            c2356Pv.A04 = null;
        } else {
            AbstractC2367Qg abstractC2367Qg2 = c2356Pv.A05;
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "F";
            strArr2[3] = "q2hYYatvKRTsdUwOPBYP5pb4s";
            if (abstractC2367Qg2 == abstractC2367Qg) {
                c2356Pv.A05 = null;
                z10 = true;
            } else {
                return false;
            }
        }
        abstractC2367Qg.A0H.setAlpha(1.0f);
        abstractC2367Qg.A0H.setTranslationX(0.0f);
        abstractC2367Qg.A0H.setTranslationY(0.0f);
        A0W(abstractC2367Qg, z10);
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    @Override // com.facebook.ads.redexgen.core.QK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0I() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C18706j.A0I():void");
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final void A0L(AbstractC2367Qg abstractC2367Qg) {
        View view = abstractC2367Qg.A0H;
        view.animate().cancel();
        for (int i10 = this.A09.size() - 1; i10 >= 0; i10--) {
            if (this.A09.get(i10).A04 == abstractC2367Qg) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0U(abstractC2367Qg);
                this.A09.remove(i10);
            }
        }
        A04(this.A08, abstractC2367Qg);
        if (this.A0A.remove(abstractC2367Qg)) {
            view.setAlpha(1.0f);
            A0V(abstractC2367Qg);
        }
        if (this.A07.remove(abstractC2367Qg)) {
            view.setAlpha(1.0f);
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "yxRUaByjpu2evyevZXzo5CX3I8dRP";
            strArr2[5] = "IuT2zeZcrCaCkdpAEhiSgQgKuQzMH";
            A0T(abstractC2367Qg);
        }
        for (int i11 = this.A03.size() - 1; i11 >= 0; i11--) {
            ArrayList<C2356Pv> arrayList = this.A03.get(i11);
            A04(arrayList, abstractC2367Qg);
            if (arrayList.isEmpty()) {
                this.A03.remove(i11);
            }
        }
        for (int size = this.A05.size() - 1; size >= 0; size--) {
            ArrayList<C2357Pw> arrayList2 = this.A05.get(size);
            int i12 = arrayList2.size() - 1;
            while (true) {
                if (i12 < 0) {
                    break;
                }
                if (arrayList2.get(i12).A04 == abstractC2367Qg) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A0U(abstractC2367Qg);
                    arrayList2.remove(i12);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(size);
                    }
                } else {
                    i12--;
                }
            }
        }
        for (int size2 = this.A01.size() - 1; size2 >= 0; size2--) {
            ArrayList<AbstractC2367Qg> arrayList3 = this.A01.get(size2);
            if (arrayList3.remove(abstractC2367Qg)) {
                view.setAlpha(1.0f);
                A0T(abstractC2367Qg);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(size2);
                }
            }
        }
        this.A06.remove(abstractC2367Qg);
        this.A00.remove(abstractC2367Qg);
        this.A02.remove(abstractC2367Qg);
        this.A04.remove(abstractC2367Qg);
        A0b();
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0M() {
        return (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty() && this.A04.isEmpty() && this.A06.isEmpty() && this.A00.isEmpty() && this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty() && this.A03.isEmpty()) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0S(AbstractC2367Qg abstractC2367Qg, List<Object> payloads) {
        return !payloads.isEmpty() || super.A0S(abstractC2367Qg, payloads);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2983g0
    public final boolean A0X(AbstractC2367Qg abstractC2367Qg) {
        A02(abstractC2367Qg);
        abstractC2367Qg.A0H.setAlpha(0.0f);
        this.A07.add(abstractC2367Qg);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2983g0
    public final boolean A0Y(AbstractC2367Qg abstractC2367Qg) {
        A02(abstractC2367Qg);
        this.A0A.add(abstractC2367Qg);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2983g0
    public final boolean A0a(AbstractC2367Qg abstractC2367Qg, AbstractC2367Qg abstractC2367Qg2, int i10, int i11, int i12, int i13) {
        if (abstractC2367Qg == abstractC2367Qg2) {
            return A0Z(abstractC2367Qg, i10, i11, i12, i13);
        }
        float translationX = abstractC2367Qg.A0H.getTranslationX();
        float translationY = abstractC2367Qg.A0H.getTranslationY();
        float prevTranslationY = abstractC2367Qg.A0H.getAlpha();
        A02(abstractC2367Qg);
        float prevTranslationX = i12 - i10;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i13 - i11;
        int deltaX = (int) (prevTranslationX2 - translationY);
        abstractC2367Qg.A0H.setTranslationX(translationX);
        abstractC2367Qg.A0H.setTranslationY(translationY);
        abstractC2367Qg.A0H.setAlpha(prevTranslationY);
        if (abstractC2367Qg2 != null) {
            A02(abstractC2367Qg2);
            float prevTranslationX3 = -deltaY;
            abstractC2367Qg2.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            abstractC2367Qg2.A0H.setTranslationY(prevTranslationX4);
            abstractC2367Qg2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new C2356Pv(abstractC2367Qg, abstractC2367Qg2, i10, i11, i12, i13));
        return true;
    }

    public final void A0b() {
        if (!A0M()) {
            A0G();
        }
    }

    public final void A0c(C2356Pv c2356Pv) {
        View view;
        AbstractC2367Qg holder = c2356Pv.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        AbstractC2367Qg holder2 = c2356Pv.A04;
        View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A0B());
            this.A02.add(c2356Pv.A05);
            oldViewAnim.translationX(c2356Pv.A02 - c2356Pv.A00);
            oldViewAnim.translationY(c2356Pv.A03 - c2356Pv.A01);
            oldViewAnim.alpha(0.0f).setListener(new C2354Pt(this, c2356Pv, oldViewAnim, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.A02.add(c2356Pv.A04);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(A0B()).alpha(1.0f).setListener(new C2355Pu(this, c2356Pv, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public final void A0d(AbstractC2367Qg abstractC2367Qg) {
        View view = abstractC2367Qg.A0H;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A00.add(abstractC2367Qg);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(A0A());
        animation.setListener(new C2352Pr(this, abstractC2367Qg, view, viewPropertyAnimatorAnimate)).start();
    }

    public final void A0e(AbstractC2367Qg abstractC2367Qg, int i10, int i11, int i12, int i13) {
        View view = abstractC2367Qg.A0H;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A04.add(abstractC2367Qg);
        viewPropertyAnimatorAnimate.setDuration(A0C()).setListener(new C2353Ps(this, abstractC2367Qg, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }
}
