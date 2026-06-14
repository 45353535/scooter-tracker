package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class TonalPalette {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map f26199a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Hct f26200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f26201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    double f26202d;

    private static final class KeyColor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f26203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f26204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f26205c = new HashMap();

        public KeyColor(double d10, double d11) {
            this.f26203a = d10;
            this.f26204b = d11;
        }

        private double a(int i10) {
            if (this.f26205c.get(Integer.valueOf(i10)) == null) {
                this.f26205c.put(Integer.valueOf(i10), Double.valueOf(Hct.from(this.f26203a, 200.0d, i10).getChroma()));
            }
            return ((Double) this.f26205c.get(Integer.valueOf(i10))).doubleValue();
        }

        public Hct create() {
            int i10 = 100;
            int i11 = 0;
            while (i11 < i10) {
                int i12 = (i11 + i10) / 2;
                int i13 = i12 + 1;
                boolean z10 = a(i12) < a(i13);
                if (a(i12) >= this.f26204b - 0.01d) {
                    if (Math.abs(i11 - 50) < Math.abs(i10 - 50)) {
                        i10 = i12;
                    } else {
                        if (i11 == i12) {
                            return Hct.from(this.f26203a, this.f26204b, i11);
                        }
                        i11 = i12;
                    }
                } else if (z10) {
                    i11 = i13;
                } else {
                    i10 = i12;
                }
            }
            return Hct.from(this.f26203a, this.f26204b, i11);
        }
    }

    private TonalPalette(double d10, double d11, Hct hct) {
        this.f26201c = d10;
        this.f26202d = d11;
        this.f26200b = hct;
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double d10, double d11) {
        return new TonalPalette(d10, d11, new KeyColor(d10, d11).create());
    }

    public static TonalPalette fromInt(int i10) {
        return fromHct(Hct.fromInt(i10));
    }

    public double getChroma() {
        return this.f26202d;
    }

    public Hct getHct(double d10) {
        return Hct.from(this.f26201c, this.f26202d, d10);
    }

    public double getHue() {
        return this.f26201c;
    }

    public Hct getKeyColor() {
        return this.f26200b;
    }

    public int tone(int i10) {
        Integer numValueOf = (Integer) this.f26199a.get(Integer.valueOf(i10));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Hct.from(this.f26201c, this.f26202d, i10).toInt());
            this.f26199a.put(Integer.valueOf(i10), numValueOf);
        }
        return numValueOf.intValue();
    }
}
