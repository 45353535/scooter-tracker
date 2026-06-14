package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import j$.util.Comparator;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class TemperatureCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hct f26194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Hct f26195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f26196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f26197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f26198e;

    public TemperatureCache(Hct hct) {
        this.f26194a = hct;
    }

    public static /* synthetic */ Double a(TemperatureCache temperatureCache, Hct hct) {
        return (Double) temperatureCache.e().get(hct);
    }

    private Hct b() {
        return (Hct) d().get(0);
    }

    private List c() {
        List list = this.f26197d;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d10 = 0.0d; d10 <= 360.0d; d10 += 1.0d) {
            arrayList.add(Hct.from(d10, this.f26194a.getChroma(), this.f26194a.getTone()));
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        this.f26197d = listUnmodifiableList;
        return listUnmodifiableList;
    }

    private List d() {
        List list = this.f26196c;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(c());
        arrayList.add(this.f26194a);
        Collections.sort(arrayList, Comparator.CC.comparing(new Function() { // from class: com.google.android.material.color.utilities.j5
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TemperatureCache.a(this.f26249a, (Hct) obj);
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new java.util.Comparator() { // from class: com.google.android.material.color.utilities.k5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        }));
        this.f26196c = arrayList;
        return arrayList;
    }

    private Map e() {
        Map map = this.f26198e;
        if (map != null) {
            return map;
        }
        ArrayList<Hct> arrayList = new ArrayList(c());
        arrayList.add(this.f26194a);
        HashMap map2 = new HashMap();
        for (Hct hct : arrayList) {
            map2.put(hct, Double.valueOf(rawTemperature(hct)));
        }
        this.f26198e = map2;
        return map2;
    }

    private Hct f() {
        return (Hct) d().get(d().size() - 1);
    }

    private static boolean g(double d10, double d11, double d12) {
        return d11 < d12 ? d11 <= d10 && d10 <= d12 : d11 <= d10 || d10 <= d12;
    }

    public static double rawTemperature(Hct hct) {
        double[] dArrLabFromArgb = ColorUtils.labFromArgb(hct.toInt());
        return ((Math.pow(Math.hypot(dArrLabFromArgb[1], dArrLabFromArgb[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(MathUtils.sanitizeDegreesDouble(MathUtils.sanitizeDegreesDouble(Math.toDegrees(Math.atan2(dArrLabFromArgb[2], dArrLabFromArgb[1]))) - 50.0d)))) - 0.5d;
    }

    public List<Hct> getAnalogousColors() {
        return getAnalogousColors(5, 12);
    }

    public Hct getComplement() {
        double d10;
        Hct hct = this.f26195b;
        if (hct != null) {
            return hct;
        }
        double hue = b().getHue();
        double dDoubleValue = ((Double) e().get(b())).doubleValue();
        double hue2 = f().getHue();
        double dDoubleValue2 = ((Double) e().get(f())).doubleValue() - dDoubleValue;
        boolean zG = g(this.f26194a.getHue(), hue, hue2);
        double d11 = zG ? hue2 : hue;
        double d12 = zG ? hue : hue2;
        Hct hct2 = (Hct) c().get((int) Math.round(this.f26194a.getHue()));
        double d13 = 1.0d;
        double relativeTemperature = 1.0d - getRelativeTemperature(this.f26194a);
        double d14 = 1000.0d;
        double d15 = 0.0d;
        while (d15 <= 360.0d) {
            double dSanitizeDegreesDouble = MathUtils.sanitizeDegreesDouble((d13 * d15) + d11);
            if (g(dSanitizeDegreesDouble, d11, d12)) {
                d10 = d13;
                Hct hct3 = (Hct) c().get((int) Math.round(dSanitizeDegreesDouble));
                double dAbs = Math.abs(relativeTemperature - ((((Double) e().get(hct3)).doubleValue() - dDoubleValue) / dDoubleValue2));
                if (dAbs < d14) {
                    hct2 = hct3;
                    d14 = dAbs;
                }
            } else {
                d10 = d13;
            }
            d15 += d10;
            d13 = d10;
        }
        this.f26195b = hct2;
        return hct2;
    }

    public double getRelativeTemperature(Hct hct) {
        double dDoubleValue = ((Double) e().get(f())).doubleValue() - ((Double) e().get(b())).doubleValue();
        double dDoubleValue2 = ((Double) e().get(hct)).doubleValue() - ((Double) e().get(b())).doubleValue();
        if (dDoubleValue == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }

    public List<Hct> getAnalogousColors(int i10, int i11) {
        int iRound = (int) Math.round(this.f26194a.getHue());
        Hct hct = (Hct) c().get(iRound);
        double relativeTemperature = getRelativeTemperature(hct);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hct);
        double dAbs = 0.0d;
        double dAbs2 = 0.0d;
        int i12 = 0;
        while (i12 < 360) {
            double relativeTemperature2 = getRelativeTemperature((Hct) c().get(MathUtils.sanitizeDegreesInt(iRound + i12)));
            dAbs2 += Math.abs(relativeTemperature2 - relativeTemperature);
            i12++;
            relativeTemperature = relativeTemperature2;
        }
        double d10 = dAbs2 / ((double) i11);
        double relativeTemperature3 = getRelativeTemperature(hct);
        int i13 = 1;
        while (true) {
            if (arrayList.size() >= i11) {
                break;
            }
            Hct hct2 = (Hct) c().get(MathUtils.sanitizeDegreesInt(iRound + i13));
            double relativeTemperature4 = getRelativeTemperature(hct2);
            dAbs += Math.abs(relativeTemperature4 - relativeTemperature3);
            boolean z10 = dAbs >= ((double) arrayList.size()) * d10;
            int i14 = 1;
            while (z10 && arrayList.size() < i11) {
                arrayList.add(hct2);
                int i15 = i13;
                z10 = dAbs >= ((double) (arrayList.size() + i14)) * d10;
                i14++;
                i13 = i15;
            }
            i13++;
            if (i13 > 360) {
                while (arrayList.size() < i11) {
                    arrayList.add(hct2);
                }
            } else {
                relativeTemperature3 = relativeTemperature4;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f26194a);
        int iFloor = (int) Math.floor((((double) i10) - 1.0d) / 2.0d);
        for (int i16 = 1; i16 < iFloor + 1; i16++) {
            int size = 0 - i16;
            while (size < 0) {
                size += arrayList.size();
            }
            if (size >= arrayList.size()) {
                size %= arrayList.size();
            }
            arrayList2.add(0, (Hct) arrayList.get(size));
        }
        int i17 = i10 - iFloor;
        for (int i18 = 1; i18 < i17; i18++) {
            int size2 = i18;
            while (size2 < 0) {
                size2 += arrayList.size();
            }
            if (size2 >= arrayList.size()) {
                size2 %= arrayList.size();
            }
            arrayList2.add((Hct) arrayList.get(size2));
        }
        return arrayList2;
    }
}
