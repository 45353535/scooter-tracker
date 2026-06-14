package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Hct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f26133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f26134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f26135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26136d;

    private Hct(int i10) {
        a(i10);
    }

    private void a(int i10) {
        this.f26136d = i10;
        Cam16 cam16FromInt = Cam16.fromInt(i10);
        this.f26133a = cam16FromInt.getHue();
        this.f26134b = cam16FromInt.getChroma();
        this.f26135c = ColorUtils.lstarFromArgb(i10);
    }

    public static Hct from(double d10, double d11, double d12) {
        return new Hct(HctSolver.solveToInt(d10, d11, d12));
    }

    public static Hct fromInt(int i10) {
        return new Hct(i10);
    }

    public double getChroma() {
        return this.f26134b;
    }

    public double getHue() {
        return this.f26133a;
    }

    public double getTone() {
        return this.f26135c;
    }

    public Hct inViewingConditions(ViewingConditions viewingConditions) {
        double[] dArrE = Cam16.fromInt(toInt()).e(viewingConditions, null);
        Cam16 cam16C = Cam16.c(dArrE[0], dArrE[1], dArrE[2], ViewingConditions.DEFAULT);
        return from(cam16C.getHue(), cam16C.getChroma(), ColorUtils.lstarFromY(dArrE[1]));
    }

    public void setChroma(double d10) {
        a(HctSolver.solveToInt(this.f26133a, d10, this.f26135c));
    }

    public void setHue(double d10) {
        a(HctSolver.solveToInt(d10, this.f26134b, this.f26135c));
    }

    public void setTone(double d10) {
        a(HctSolver.solveToInt(this.f26133a, this.f26134b, d10));
    }

    public int toInt() {
        return this.f26136d;
    }
}
