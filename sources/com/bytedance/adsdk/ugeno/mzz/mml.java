package com.bytedance.adsdk.ugeno.mzz;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
class mml {
    static final /* synthetic */ boolean lnr = true;
    private final com.bytedance.adsdk.ugeno.mzz.qdl mml;
    private long[] mo;
    private boolean[] mzz;
    int[] qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    long[] f16206ud;

    static class qdl {
        List<lnr> qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        int f16207ud;

        qdl() {
        }

        void qdl() {
            this.qdl = null;
            this.f16207ud = 0;
        }
    }

    private static class ud implements Comparable<ud> {
        int qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        int f16208ud;

        private ud() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public int compareTo(ud udVar) {
            int i10 = this.f16208ud;
            int i11 = udVar.f16208ud;
            return i10 != i11 ? i10 - i11 : this.qdl - udVar.qdl;
        }

        public String toString() {
            return "Order{order=" + this.f16208ud + ", index=" + this.qdl + '}';
        }
    }

    mml(com.bytedance.adsdk.ugeno.mzz.qdl qdlVar) {
        this.mml = qdlVar;
    }

    private int lnr(boolean z10) {
        return z10 ? this.mml.getPaddingTop() : this.mml.getPaddingStart();
    }

    private int mml(boolean z10) {
        return z10 ? this.mml.getPaddingBottom() : this.mml.getPaddingEnd();
    }

    private int mo(com.bytedance.adsdk.ugeno.mzz.ud udVar, boolean z10) {
        return z10 ? udVar.jtx() : udVar.bjy();
    }

    private int mzz(com.bytedance.adsdk.ugeno.mzz.ud udVar, boolean z10) {
        return z10 ? udVar.rdp() : udVar.exu();
    }

    int qdl(long j10) {
        return (int) j10;
    }

    int ud(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] qdl(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.mml.getFlexItemCount();
        List<ud> listUd = ud(flexItemCount);
        ud udVar = new ud();
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.mzz.ud)) {
            udVar.f16208ud = 1;
        } else {
            udVar.f16208ud = ((com.bytedance.adsdk.ugeno.mzz.ud) layoutParams).lnr();
        }
        if (i10 == -1 || i10 == flexItemCount || i10 >= this.mml.getFlexItemCount()) {
            udVar.qdl = flexItemCount;
        } else {
            udVar.qdl = i10;
            while (i10 < flexItemCount) {
                listUd.get(i10).qdl++;
                i10++;
            }
        }
        listUd.add(udVar);
        return qdl(flexItemCount + 1, listUd, sparseIntArray);
    }

    long ud(int i10, int i11) {
        return (((long) i10) & 4294967295L) | (((long) i11) << 32);
    }

    private int lnr(com.bytedance.adsdk.ugeno.mzz.ud udVar, boolean z10) {
        if (z10) {
            return udVar.exu();
        }
        return udVar.rdp();
    }

    private int mml(com.bytedance.adsdk.ugeno.mzz.ud udVar, boolean z10) {
        if (z10) {
            return udVar.bjy();
        }
        return udVar.jtx();
    }

    private List<ud> ud(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) this.mml.qdl(i11).getLayoutParams();
            ud udVar2 = new ud();
            udVar2.f16208ud = udVar.lnr();
            udVar2.qdl = i11;
            arrayList.add(udVar2);
        }
        return arrayList;
    }

    private void lnr(int i10) {
        boolean[] zArr = this.mzz;
        if (zArr == null) {
            this.mzz = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.mzz = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    boolean ud(SparseIntArray sparseIntArray) {
        int flexItemCount = this.mml.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View viewQdl = this.mml.qdl(i10);
            if (viewQdl != null && ((com.bytedance.adsdk.ugeno.mzz.ud) viewQdl.getLayoutParams()).lnr() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    void ud(qdl qdlVar, int i10, int i11) {
        qdl(qdlVar, i11, i10, Integer.MAX_VALUE, 0, -1, (List<lnr>) null);
    }

    private int ud(boolean z10) {
        if (z10) {
            return this.mml.getPaddingEnd();
        }
        return this.mml.getPaddingBottom();
    }

    int[] qdl(SparseIntArray sparseIntArray) {
        int flexItemCount = this.mml.getFlexItemCount();
        return qdl(flexItemCount, ud(flexItemCount), sparseIntArray);
    }

    private int ud(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] qdl(int i10, List<ud> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (ud udVar : list) {
            int i12 = udVar.qdl;
            iArr[i11] = i12;
            sparseIntArray.append(i12, udVar.f16208ud);
            i11++;
        }
        return iArr;
    }

    private int ud(com.bytedance.adsdk.ugeno.mzz.ud udVar, boolean z10) {
        if (z10) {
            return udVar.ud();
        }
        return udVar.qdl();
    }

    private void ud(int i10, int i11, lnr lnrVar, int i12, int i13, boolean z10) {
        float f10;
        float f11;
        int iMax;
        int iWd;
        int i14 = lnrVar.mzz;
        float f12 = lnrVar.rq;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 > i14) {
            return;
        }
        float f14 = (i14 - i12) / f12;
        lnrVar.mzz = i13 + lnrVar.mo;
        if (!z10) {
            lnrVar.f16205wd = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z11 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < lnrVar.jpc) {
            int i17 = lnrVar.bjy + i15;
            View viewUd = this.mml.ud(i17);
            if (viewUd == null || viewUd.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
            } else {
                com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) viewUd.getLayoutParams();
                int flexDirection = this.mml.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewUd.getMeasuredHeight();
                    long[] jArr = this.mo;
                    if (jArr != null) {
                        measuredHeight = ud(jArr[i17]);
                    }
                    int measuredWidth = viewUd.getMeasuredWidth();
                    long[] jArr2 = this.mo;
                    if (jArr2 != null) {
                        measuredWidth = qdl(jArr2[i17]);
                    }
                    if (!this.mzz[i17] && udVar.mzz() > f10) {
                        float fMzz = measuredHeight - (udVar.mzz() * f14);
                        if (i15 == lnrVar.jpc - 1) {
                            fMzz += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fMzz);
                        if (iRound < udVar.jpc()) {
                            iRound = udVar.jpc();
                            this.mzz[i17] = true;
                            lnrVar.rq -= udVar.mzz();
                            z11 = true;
                        } else {
                            f15 += fMzz - iRound;
                            double d10 = f15;
                            if (d10 > 1.0d) {
                                iRound++;
                                f15 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                iRound--;
                                f15 += 1.0f;
                            }
                        }
                        int iQdl = qdl(i10, udVar, lnrVar.exu);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewUd.measure(iQdl, iMakeMeasureSpec);
                        int measuredWidth2 = viewUd.getMeasuredWidth();
                        int measuredHeight2 = viewUd.getMeasuredHeight();
                        qdl(i17, iQdl, iMakeMeasureSpec, viewUd);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i16, measuredWidth + udVar.exu() + udVar.bjy() + this.mml.qdl(viewUd));
                    lnrVar.mzz += measuredHeight + udVar.rdp() + udVar.jtx();
                    f11 = f14;
                } else {
                    int measuredWidth3 = viewUd.getMeasuredWidth();
                    long[] jArr3 = this.mo;
                    if (jArr3 != null) {
                        measuredWidth3 = qdl(jArr3[i17]);
                    }
                    int measuredHeight3 = viewUd.getMeasuredHeight();
                    long[] jArr4 = this.mo;
                    f11 = f14;
                    if (jArr4 != null) {
                        measuredHeight3 = ud(jArr4[i17]);
                    }
                    if (!this.mzz[i17] && udVar.mzz() > f10) {
                        float fMzz2 = measuredWidth3 - (f11 * udVar.mzz());
                        if (i15 == lnrVar.jpc - 1) {
                            fMzz2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fMzz2);
                        if (iRound2 < udVar.wd()) {
                            iWd = udVar.wd();
                            this.mzz[i17] = true;
                            lnrVar.rq -= udVar.mzz();
                            z11 = true;
                        } else {
                            f15 += fMzz2 - iRound2;
                            double d11 = f15;
                            if (d11 > 1.0d) {
                                iWd = iRound2 + 1;
                                f15 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                iWd = iRound2 - 1;
                                f15 += 1.0f;
                            } else {
                                iWd = iRound2;
                            }
                        }
                        int iUd = ud(i11, udVar, lnrVar.exu);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iWd, 1073741824);
                        viewUd.measure(iMakeMeasureSpec2, iUd);
                        int measuredWidth4 = viewUd.getMeasuredWidth();
                        int measuredHeight4 = viewUd.getMeasuredHeight();
                        qdl(i17, iMakeMeasureSpec2, iUd, viewUd);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i16, measuredHeight3 + udVar.rdp() + udVar.jtx() + this.mml.qdl(viewUd));
                    lnrVar.mzz += measuredWidth3 + udVar.exu() + udVar.bjy();
                    iMax = iMax2;
                }
                lnrVar.f16205wd = Math.max(lnrVar.f16205wd, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == lnrVar.mzz) {
            return;
        }
        ud(i10, i11, lnrVar, i12, i13, true);
    }

    void qdl(qdl qdlVar, int i10, int i11) {
        qdl(qdlVar, i10, i11, Integer.MAX_VALUE, 0, -1, (List<lnr>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void qdl(qdl qdlVar, int i10, int i11, int i12, int i13, int i14, List<lnr> list) {
        int i15;
        qdl qdlVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iQdl;
        int i21;
        int i22;
        lnr lnrVar;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28 = i10;
        boolean zQdl = this.mml.qdl();
        int mode = View.MeasureSpec.getMode(i28);
        int size = View.MeasureSpec.getSize(i28);
        List<lnr> arrayList = list == null ? new ArrayList() : list;
        qdlVar.qdl = arrayList;
        boolean z10 = i14 == -1;
        int iQdl2 = qdl(zQdl);
        int iUd = ud(zQdl);
        int iLnr = lnr(zQdl);
        int iMml = mml(zQdl);
        lnr lnrVar2 = new lnr();
        int i29 = i13;
        lnrVar2.bjy = i29;
        int i30 = iQdl2 + iUd;
        lnrVar2.mzz = i30;
        int flexItemCount = this.mml.getFlexItemCount();
        boolean z11 = z10;
        lnr lnrVar3 = lnrVar2;
        int i31 = Integer.MIN_VALUE;
        int i32 = 0;
        int iCombineMeasuredStates = 0;
        int i33 = 0;
        while (true) {
            if (i29 >= flexItemCount) {
                i15 = iCombineMeasuredStates;
                qdlVar2 = qdlVar;
                break;
            }
            View viewUd = this.mml.ud(i29);
            if (viewUd == null) {
                if (qdl(i29, flexItemCount, lnrVar3)) {
                    qdl(arrayList, lnrVar3, i29, i32);
                }
                i16 = i30;
            } else {
                i16 = i30;
                if (viewUd.getVisibility() == 8) {
                    lnrVar3.tvp++;
                    lnrVar3.jpc++;
                    if (qdl(i29, flexItemCount, lnrVar3)) {
                        qdl(arrayList, lnrVar3, i29, i32);
                    }
                } else {
                    if (viewUd instanceof CompoundButton) {
                        qdl((CompoundButton) viewUd);
                    }
                    com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) viewUd.getLayoutParams();
                    int i34 = flexItemCount;
                    if (udVar.mo() == 4) {
                        lnrVar3.rdp.add(Integer.valueOf(i29));
                    }
                    int iQdl3 = qdl(udVar, zQdl);
                    if (udVar.fs() != -1.0f && mode == 1073741824) {
                        iQdl3 = Math.round(size * udVar.fs());
                    }
                    if (zQdl) {
                        i18 = mode;
                        iQdl = this.mml.qdl(i28, i16 + lnr(udVar, true) + mml(udVar, true), iQdl3);
                        i17 = size;
                        i19 = i32;
                        int iUd2 = this.mml.ud(i11, iLnr + iMml + mzz(udVar, true) + mo(udVar, true) + i32, ud(udVar, true));
                        viewUd.measure(iQdl, iUd2);
                        qdl(i29, iQdl, iUd2, viewUd);
                        i20 = 0;
                    } else {
                        i17 = size;
                        i18 = mode;
                        i19 = i32;
                        i20 = 0;
                        int iQdl4 = this.mml.qdl(i11, iLnr + iMml + mzz(udVar, false) + mo(udVar, false) + i19, ud(udVar, false));
                        int iUd3 = this.mml.ud(i28, i16 + lnr(udVar, false) + mml(udVar, false), iQdl3);
                        viewUd.measure(iQdl4, iUd3);
                        qdl(i29, iQdl4, iUd3, viewUd);
                        iQdl = iUd3;
                    }
                    qdl(viewUd, i29);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewUd.getMeasuredState());
                    int i35 = i20;
                    i21 = i29;
                    int i36 = iQdl;
                    lnr lnrVar4 = lnrVar3;
                    int i37 = i33;
                    i22 = i19;
                    size = i17;
                    if (qdl(viewUd, i18, size, lnrVar3.mzz, qdl(viewUd, zQdl) + lnr(udVar, zQdl) + mml(udVar, zQdl), udVar, i21, i37, arrayList.size())) {
                        if (lnrVar4.ud() > 0) {
                            qdl(arrayList, lnrVar4, i21 > 0 ? i21 - 1 : i35, i22);
                            i27 = i22 + lnrVar4.f16205wd;
                        } else {
                            i27 = i22;
                        }
                        if (zQdl) {
                            if (udVar.ud() == -1) {
                                com.bytedance.adsdk.ugeno.mzz.qdl qdlVar3 = this.mml;
                                viewUd.measure(i36, qdlVar3.ud(i11, qdlVar3.getPaddingTop() + this.mml.getPaddingBottom() + udVar.rdp() + udVar.jtx() + i27, udVar.ud()));
                                qdl(viewUd, i21);
                            }
                        } else if (udVar.qdl() == -1) {
                            com.bytedance.adsdk.ugeno.mzz.qdl qdlVar4 = this.mml;
                            viewUd.measure(qdlVar4.qdl(i11, qdlVar4.getPaddingLeft() + this.mml.getPaddingRight() + udVar.exu() + udVar.bjy() + i27, udVar.qdl()), i36);
                            qdl(viewUd, i21);
                        }
                        lnr lnrVar5 = new lnr();
                        lnrVar5.jpc = 1;
                        i23 = i16;
                        lnrVar5.mzz = i23;
                        lnrVar5.bjy = i21;
                        i22 = i27;
                        i25 = Integer.MIN_VALUE;
                        lnrVar = lnrVar5;
                        i24 = i35;
                    } else {
                        lnrVar = lnrVar4;
                        i23 = i16;
                        lnrVar.jpc++;
                        i24 = i37 + 1;
                        i25 = i31;
                    }
                    lnrVar.yt = (lnrVar.yt ? 1 : 0) | (udVar.mml() != 0.0f ? 1 : i35);
                    lnrVar.jl = (lnrVar.jl ? 1 : 0) | (udVar.mzz() != 0.0f ? 1 : i35);
                    int[] iArr = this.qdl;
                    if (iArr != null) {
                        iArr[i21] = arrayList.size();
                    }
                    lnrVar.mzz += qdl(viewUd, zQdl) + lnr(udVar, zQdl) + mml(udVar, zQdl);
                    lnrVar.to += udVar.mml();
                    lnrVar.rq += udVar.mzz();
                    this.mml.qdl(viewUd, i21, i24, lnrVar);
                    int iMax = Math.max(i25, ud(viewUd, zQdl) + mzz(udVar, zQdl) + mo(udVar, zQdl) + this.mml.qdl(viewUd));
                    lnrVar.f16205wd = Math.max(lnrVar.f16205wd, iMax);
                    if (zQdl) {
                        if (this.mml.getFlexWrap() != 2) {
                            lnrVar.fs = Math.max(lnrVar.fs, viewUd.getBaseline() + udVar.rdp());
                        } else {
                            lnrVar.fs = Math.max(lnrVar.fs, (viewUd.getMeasuredHeight() - viewUd.getBaseline()) + udVar.jtx());
                        }
                    }
                    i26 = i34;
                    if (qdl(i21, i26, lnrVar)) {
                        qdl(arrayList, lnrVar, i21, i22);
                        i22 += lnrVar.f16205wd;
                    }
                    if (i14 != -1 && arrayList.size() > 0) {
                        if (arrayList.get(arrayList.size() - 1).jtx >= i14 && i21 >= i14 && !z11) {
                            i22 = -lnrVar.qdl();
                            z11 = true;
                        }
                    }
                    if (i22 > i12 && z11) {
                        qdlVar2 = qdlVar;
                        i15 = iCombineMeasuredStates;
                        break;
                    }
                    i33 = i24;
                    i31 = iMax;
                    flexItemCount = i26;
                    i29 = i21 + 1;
                    i30 = i23;
                    lnrVar3 = lnrVar;
                    i32 = i22;
                    mode = i18;
                    i28 = i10;
                }
            }
            i21 = i29;
            i18 = mode;
            i26 = flexItemCount;
            i22 = i32;
            i23 = i16;
            lnrVar = lnrVar3;
            flexItemCount = i26;
            i29 = i21 + 1;
            i30 = i23;
            lnrVar3 = lnrVar;
            i32 = i22;
            mode = i18;
            i28 = i10;
        }
        qdlVar2.f16207ud = i15;
    }

    private int ud(int i10, com.bytedance.adsdk.ugeno.mzz.ud udVar, int i11) {
        com.bytedance.adsdk.ugeno.mzz.qdl qdlVar = this.mml;
        int iUd = qdlVar.ud(i10, qdlVar.getPaddingTop() + this.mml.getPaddingBottom() + udVar.rdp() + udVar.jtx() + i11, udVar.ud());
        int size = View.MeasureSpec.getSize(iUd);
        if (size > udVar.to()) {
            return View.MeasureSpec.makeMeasureSpec(udVar.to(), View.MeasureSpec.getMode(iUd));
        }
        return size < udVar.jpc() ? View.MeasureSpec.makeMeasureSpec(udVar.jpc(), View.MeasureSpec.getMode(iUd)) : iUd;
    }

    void ud(int i10, int i11, int i12) {
        int mode;
        int size;
        int flexDirection = this.mml.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
        } else {
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            mode = mode2;
            size = size2;
        }
        List<lnr> flexLinesInternal = this.mml.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.mml.getSumOfCrossSize() + i12;
            int i13 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f16205wd = size - i12;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.mml.getAlignContent();
                if (alignContent == 1) {
                    int i14 = size - sumOfCrossSize;
                    lnr lnrVar = new lnr();
                    lnrVar.f16205wd = i14;
                    flexLinesInternal.add(0, lnrVar);
                    return;
                }
                if (alignContent == 2) {
                    this.mml.setFlexLines(qdl(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f10 = 0.0f;
                        while (i13 < size4) {
                            arrayList.add(flexLinesInternal.get(i13));
                            if (i13 != flexLinesInternal.size() - 1) {
                                lnr lnrVar2 = new lnr();
                                if (i13 == flexLinesInternal.size() - 2) {
                                    lnrVar2.f16205wd = Math.round(f10 + size3);
                                    f10 = 0.0f;
                                } else {
                                    lnrVar2.f16205wd = Math.round(size3);
                                }
                                int i15 = lnrVar2.f16205wd;
                                f10 += size3 - i15;
                                if (f10 > 1.0f) {
                                    lnrVar2.f16205wd = i15 + 1;
                                    f10 -= 1.0f;
                                } else if (f10 < -1.0f) {
                                    lnrVar2.f16205wd = i15 - 1;
                                    f10 += 1.0f;
                                }
                                arrayList.add(lnrVar2);
                            }
                            i13++;
                        }
                        this.mml.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.mml.setFlexLines(qdl(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    lnr lnrVar3 = new lnr();
                    lnrVar3.f16205wd = size5;
                    for (lnr lnrVar4 : flexLinesInternal) {
                        arrayList2.add(lnrVar3);
                        arrayList2.add(lnrVar4);
                        arrayList2.add(lnrVar3);
                    }
                    this.mml.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i13 < size7) {
                        lnr lnrVar5 = flexLinesInternal.get(i13);
                        float f12 = lnrVar5.f16205wd + size6;
                        if (i13 == flexLinesInternal.size() - 1) {
                            f12 += f11;
                            f11 = 0.0f;
                        }
                        int iRound = Math.round(f12);
                        f11 += f12 - iRound;
                        if (f11 > 1.0f) {
                            iRound++;
                            f11 -= 1.0f;
                        } else if (f11 < -1.0f) {
                            iRound--;
                            f11 += 1.0f;
                        }
                        lnrVar5.f16205wd = iRound;
                        i13++;
                    }
                }
            }
        }
    }

    private void qdl(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) compoundButton.getLayoutParams();
        int iWd = udVar.wd();
        int iJpc = udVar.jpc();
        Drawable drawableQdl = com.bytedance.adsdk.ugeno.wd.mzz.qdl(compoundButton);
        int minimumWidth = drawableQdl == null ? 0 : drawableQdl.getMinimumWidth();
        int minimumHeight = drawableQdl != null ? drawableQdl.getMinimumHeight() : 0;
        if (iWd == -1) {
            iWd = minimumWidth;
        }
        udVar.qdl(iWd);
        if (iJpc == -1) {
            iJpc = minimumHeight;
        }
        udVar.ud(iJpc);
    }

    private int qdl(boolean z10) {
        if (z10) {
            return this.mml.getPaddingStart();
        }
        return this.mml.getPaddingTop();
    }

    private int qdl(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private void ud(View view, int i10, int i11) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - udVar.exu()) - udVar.bjy()) - this.mml.qdl(view), udVar.wd()), udVar.tvp());
        long[] jArr = this.mo;
        if (jArr != null) {
            measuredHeight = ud(jArr[i11]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        qdl(i11, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private int qdl(com.bytedance.adsdk.ugeno.mzz.ud udVar, boolean z10) {
        if (z10) {
            return udVar.qdl();
        }
        return udVar.ud();
    }

    private boolean qdl(View view, int i10, int i11, int i12, int i13, com.bytedance.adsdk.ugeno.mzz.ud udVar, int i14, int i15, int i16) {
        if (this.mml.getFlexWrap() == 0) {
            return false;
        }
        if (udVar.rq()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.mml.getMaxLine();
        if (maxLine != -1 && maxLine <= i16 + 1) {
            return false;
        }
        int iQdl = this.mml.qdl(view, i14, i15);
        if (iQdl > 0) {
            i13 += iQdl;
        }
        return i11 < i12 + i13;
    }

    private boolean qdl(int i10, int i11, lnr lnrVar) {
        return i10 == i11 - 1 && lnrVar.ud() != 0;
    }

    private void qdl(List<lnr> list, lnr lnrVar, int i10, int i11) {
        lnrVar.exu = i11;
        this.mml.qdl(lnrVar);
        lnrVar.jtx = i10;
        list.add(lnrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void qdl(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.mzz.ud r0 = (com.bytedance.adsdk.ugeno.mzz.ud) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.wd()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.wd()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.tvp()
            if (r1 <= r3) goto L26
            int r1 = r0.tvp()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.jpc()
            if (r2 >= r5) goto L32
            int r2 = r0.jpc()
            goto L3e
        L32:
            int r5 = r0.to()
            if (r2 <= r5) goto L3d
            int r2 = r0.to()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.qdl(r8, r1, r0, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.mzz.mml.qdl(android.view.View, int):void");
    }

    void qdl(int i10, int i11) {
        qdl(i10, i11, 0);
    }

    void qdl(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        lnr(this.mml.getFlexItemCount());
        if (i12 >= this.mml.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.mml.getFlexDirection();
        int flexDirection2 = this.mml.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.mml.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.mml.getPaddingLeft();
            paddingRight = this.mml.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = this.mml.getLargestMainSize();
            }
            paddingLeft = this.mml.getPaddingTop();
            paddingRight = this.mml.getPaddingBottom();
        }
        int i15 = paddingLeft + paddingRight;
        int i16 = size;
        int[] iArr = this.qdl;
        int i17 = iArr != null ? iArr[i12] : 0;
        List<lnr> flexLinesInternal = this.mml.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i17 < size2) {
            lnr lnrVar = flexLinesInternal.get(i17);
            int i18 = lnrVar.mzz;
            if (i18 < i16 && lnrVar.yt) {
                i13 = i10;
                i14 = i11;
                qdl(i13, i14, lnrVar, i16, i15, false);
            } else {
                i13 = i10;
                i14 = i11;
                if (i18 > i16 && lnrVar.jl) {
                    ud(i13, i14, lnrVar, i16, i15, false);
                }
            }
            i17++;
            i10 = i13;
            i11 = i14;
        }
    }

    private void qdl(int i10, int i11, lnr lnrVar, int i12, int i13, boolean z10) {
        int i14;
        float f10;
        float f11;
        int iMax;
        double d10;
        double d11;
        float f12 = lnrVar.to;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 < (i14 = lnrVar.mzz)) {
            return;
        }
        float f14 = (i12 - i14) / f12;
        lnrVar.mzz = i13 + lnrVar.mo;
        if (!z10) {
            lnrVar.f16205wd = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z11 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < lnrVar.jpc) {
            int i17 = lnrVar.bjy + i15;
            View viewUd = this.mml.ud(i17);
            if (viewUd == null || viewUd.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
                z11 = z11;
            } else {
                com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) viewUd.getLayoutParams();
                int flexDirection = this.mml.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewUd.getMeasuredHeight();
                    long[] jArr = this.mo;
                    if (jArr != null) {
                        measuredHeight = ud(jArr[i17]);
                    }
                    int measuredWidth = viewUd.getMeasuredWidth();
                    long[] jArr2 = this.mo;
                    f11 = f14;
                    boolean z12 = z11;
                    if (jArr2 != null) {
                        measuredWidth = qdl(jArr2[i17]);
                    }
                    if (this.mzz[i17] || udVar.mml() <= f10) {
                        z11 = z12;
                    } else {
                        float fMml = measuredHeight + (udVar.mml() * f11);
                        if (i15 == lnrVar.jpc - 1) {
                            fMml += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fMml);
                        if (iRound > udVar.to()) {
                            iRound = udVar.to();
                            this.mzz[i17] = true;
                            lnrVar.to -= udVar.mml();
                            z11 = true;
                        } else {
                            f15 += fMml - iRound;
                            double d12 = f15;
                            if (d12 > 1.0d) {
                                iRound++;
                                d11 = d12 - 1.0d;
                            } else {
                                if (d12 < -1.0d) {
                                    iRound--;
                                    d11 = d12 + 1.0d;
                                }
                                z11 = z12;
                            }
                            f15 = (float) d11;
                            z11 = z12;
                        }
                        int iQdl = qdl(i10, udVar, lnrVar.exu);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewUd.measure(iQdl, iMakeMeasureSpec);
                        int measuredWidth2 = viewUd.getMeasuredWidth();
                        int measuredHeight2 = viewUd.getMeasuredHeight();
                        qdl(i17, iQdl, iMakeMeasureSpec, viewUd);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i16, measuredWidth + udVar.exu() + udVar.bjy() + this.mml.qdl(viewUd));
                    lnrVar.mzz += measuredHeight + udVar.rdp() + udVar.jtx();
                } else {
                    f11 = f14;
                    boolean z13 = z11;
                    int measuredWidth3 = viewUd.getMeasuredWidth();
                    long[] jArr3 = this.mo;
                    if (jArr3 != null) {
                        measuredWidth3 = qdl(jArr3[i17]);
                    }
                    int measuredHeight3 = viewUd.getMeasuredHeight();
                    long[] jArr4 = this.mo;
                    if (jArr4 != null) {
                        measuredHeight3 = ud(jArr4[i17]);
                    }
                    if (this.mzz[i17] || udVar.mml() <= f10) {
                        z11 = z13;
                    } else {
                        float fMml2 = measuredWidth3 + (udVar.mml() * f11);
                        if (i15 == lnrVar.jpc - 1) {
                            fMml2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fMml2);
                        if (iRound2 > udVar.tvp()) {
                            iRound2 = udVar.tvp();
                            this.mzz[i17] = true;
                            lnrVar.to -= udVar.mml();
                            z11 = true;
                        } else {
                            f15 += fMml2 - iRound2;
                            double d13 = f15;
                            if (d13 > 1.0d) {
                                iRound2++;
                                d10 = d13 - 1.0d;
                            } else {
                                if (d13 < -1.0d) {
                                    iRound2--;
                                    d10 = d13 + 1.0d;
                                }
                                z11 = z13;
                            }
                            f15 = (float) d10;
                            z11 = z13;
                        }
                        int iUd = ud(i11, udVar, lnrVar.exu);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewUd.measure(iMakeMeasureSpec2, iUd);
                        int measuredWidth4 = viewUd.getMeasuredWidth();
                        int measuredHeight4 = viewUd.getMeasuredHeight();
                        qdl(i17, iMakeMeasureSpec2, iUd, viewUd);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i16, measuredHeight3 + udVar.rdp() + udVar.jtx() + this.mml.qdl(viewUd));
                    lnrVar.mzz += measuredWidth3 + udVar.exu() + udVar.bjy();
                    iMax = iMax2;
                }
                lnrVar.f16205wd = Math.max(lnrVar.f16205wd, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == lnrVar.mzz) {
            return;
        }
        qdl(i10, i11, lnrVar, i12, i13, true);
    }

    private int qdl(int i10, com.bytedance.adsdk.ugeno.mzz.ud udVar, int i11) {
        com.bytedance.adsdk.ugeno.mzz.qdl qdlVar = this.mml;
        int iQdl = qdlVar.qdl(i10, qdlVar.getPaddingLeft() + this.mml.getPaddingRight() + udVar.exu() + udVar.bjy() + i11, udVar.qdl());
        int size = View.MeasureSpec.getSize(iQdl);
        if (size > udVar.tvp()) {
            return View.MeasureSpec.makeMeasureSpec(udVar.tvp(), View.MeasureSpec.getMode(iQdl));
        }
        return size < udVar.wd() ? View.MeasureSpec.makeMeasureSpec(udVar.wd(), View.MeasureSpec.getMode(iQdl)) : iQdl;
    }

    private List<lnr> qdl(List<lnr> list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        lnr lnrVar = new lnr();
        lnrVar.f16205wd = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(lnrVar);
            }
            arrayList.add(list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(lnrVar);
            }
        }
        return arrayList;
    }

    void qdl() {
        qdl(0);
    }

    void qdl(int i10) {
        View viewUd;
        if (i10 >= this.mml.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.mml.getFlexDirection();
        if (this.mml.getAlignItems() == 4) {
            int[] iArr = this.qdl;
            List<lnr> flexLinesInternal = this.mml.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i11 = iArr != null ? iArr[i10] : 0; i11 < size; i11++) {
                lnr lnrVar = flexLinesInternal.get(i11);
                int i12 = lnrVar.jpc;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = lnrVar.bjy + i13;
                    if (i13 < this.mml.getFlexItemCount() && (viewUd = this.mml.ud(i14)) != null && viewUd.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) viewUd.getLayoutParams();
                        if (udVar.mo() == -1 || udVar.mo() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                ud(viewUd, lnrVar.f16205wd, i14);
                            } else {
                                qdl(viewUd, lnrVar.f16205wd, i14);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (lnr lnrVar2 : this.mml.getFlexLinesInternal()) {
            for (Integer num : lnrVar2.rdp) {
                View viewUd2 = this.mml.ud(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                    }
                    ud(viewUd2, lnrVar2.f16205wd, num.intValue());
                } else {
                    qdl(viewUd2, lnrVar2.f16205wd, num.intValue());
                }
            }
        }
    }

    private void qdl(View view, int i10, int i11) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - udVar.rdp()) - udVar.jtx()) - this.mml.qdl(view), udVar.jpc()), udVar.to());
        long[] jArr = this.mo;
        if (jArr != null) {
            measuredWidth = qdl(jArr[i11]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        qdl(i11, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    void qdl(View view, lnr lnrVar, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) view.getLayoutParams();
        int alignItems = this.mml.getAlignItems();
        if (udVar.mo() != -1) {
            alignItems = udVar.mo();
        }
        int i14 = lnrVar.f16205wd;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.mml.getFlexWrap() != 2) {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - udVar.jtx(), i12, i15 - udVar.jtx());
                    return;
                } else {
                    view.layout(i10, (i11 - i14) + view.getMeasuredHeight() + udVar.rdp(), i12, (i13 - i14) + view.getMeasuredHeight() + udVar.rdp());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i14 - view.getMeasuredHeight()) + udVar.rdp()) - udVar.jtx()) / 2;
                if (this.mml.getFlexWrap() != 2) {
                    int i16 = i11 + measuredHeight;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                } else {
                    int i17 = i11 - measuredHeight;
                    view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.mml.getFlexWrap() != 2) {
                    int iMax = Math.max(lnrVar.fs - view.getBaseline(), udVar.rdp());
                    view.layout(i10, i11 + iMax, i12, i13 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((lnrVar.fs - view.getMeasuredHeight()) + view.getBaseline(), udVar.jtx());
                    view.layout(i10, i11 - iMax2, i12, i13 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.mml.getFlexWrap() != 2) {
            view.layout(i10, i11 + udVar.rdp(), i12, i13 + udVar.rdp());
        } else {
            view.layout(i10, i11 - udVar.jtx(), i12, i13 - udVar.jtx());
        }
    }

    void qdl(View view, lnr lnrVar, boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) view.getLayoutParams();
        int alignItems = this.mml.getAlignItems();
        if (udVar.mo() != -1) {
            alignItems = udVar.mo();
        }
        int i14 = lnrVar.f16205wd;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z10) {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - udVar.bjy(), i11, ((i12 + i14) - view.getMeasuredWidth()) - udVar.bjy(), i13);
                    return;
                } else {
                    view.layout((i10 - i14) + view.getMeasuredWidth() + udVar.exu(), i11, (i12 - i14) + view.getMeasuredWidth() + udVar.exu(), i13);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i14 - view.getMeasuredWidth()) + com.bytedance.adsdk.ugeno.wd.mo.qdl(marginLayoutParams)) - com.bytedance.adsdk.ugeno.wd.mo.ud(marginLayoutParams)) / 2;
                if (!z10) {
                    view.layout(i10 + measuredWidth, i11, i12 + measuredWidth, i13);
                    return;
                } else {
                    view.layout(i10 - measuredWidth, i11, i12 - measuredWidth, i13);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z10) {
            view.layout(i10 + udVar.exu(), i11, i12 + udVar.exu(), i13);
        } else {
            view.layout(i10 - udVar.bjy(), i11, i12 - udVar.bjy(), i13);
        }
    }

    private void qdl(int i10, int i11, int i12, View view) {
        long[] jArr = this.f16206ud;
        if (jArr != null) {
            jArr[i10] = ud(i11, i12);
        }
        long[] jArr2 = this.mo;
        if (jArr2 != null) {
            jArr2[i10] = ud(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
