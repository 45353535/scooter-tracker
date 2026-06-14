package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.KeylineState;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class KeylineStateList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KeylineState f25884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f25885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f25886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f25887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f25888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f25889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f25890g;

    /* JADX INFO: renamed from: com.google.android.material.carousel.KeylineStateList$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25891a;

        static {
            int[] iArr = new int[CarouselStrategy.StrategyType.values().length];
            f25891a = iArr;
            try {
                iArr[CarouselStrategy.StrategyType.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private KeylineStateList(KeylineState keylineState, List list, List list2) {
        this.f25884a = keylineState;
        this.f25885b = DesugarCollections.unmodifiableList(list);
        this.f25886c = DesugarCollections.unmodifiableList(list2);
        float f10 = ((KeylineState) list.get(list.size() - 1)).d().f25876a - keylineState.d().f25876a;
        this.f25889f = f10;
        float f11 = keylineState.k().f25876a - ((KeylineState) list2.get(list2.size() - 1)).k().f25876a;
        this.f25890g = f11;
        this.f25887d = l(f10, list, true);
        this.f25888e = l(f11, list2, false);
    }

    private KeylineState a(List list, float f10, float[] fArr) {
        float[] fArrN = n(list, f10, fArr);
        return fArrN[0] >= 0.5f ? (KeylineState) list.get((int) fArrN[2]) : (KeylineState) list.get((int) fArrN[1]);
    }

    private static int b(KeylineState keylineState, float f10) {
        for (int iJ = keylineState.j(); iJ < keylineState.h().size(); iJ++) {
            if (f10 == ((KeylineState.Keyline) keylineState.h().get(iJ)).f25878c) {
                return iJ;
            }
        }
        return keylineState.h().size() - 1;
    }

    private static int c(KeylineState keylineState) {
        for (int i10 = 0; i10 < keylineState.h().size(); i10++) {
            if (!((KeylineState.Keyline) keylineState.h().get(i10)).f25880e) {
                return i10;
            }
        }
        return -1;
    }

    private static int d(KeylineState keylineState, float f10) {
        for (int iC = keylineState.c() - 1; iC >= 0; iC--) {
            if (f10 == ((KeylineState.Keyline) keylineState.h().get(iC)).f25878c) {
                return iC;
            }
        }
        return 0;
    }

    private static int e(KeylineState keylineState) {
        for (int size = keylineState.h().size() - 1; size >= 0; size--) {
            if (!((KeylineState.Keyline) keylineState.h().get(size)).f25880e) {
                return size;
            }
        }
        return -1;
    }

    static KeylineStateList f(Carousel carousel, KeylineState keylineState, float f10, float f11, float f12, CarouselStrategy.StrategyType strategyType) {
        return new KeylineStateList(keylineState, o(carousel, keylineState, f10, f11, strategyType), m(carousel, keylineState, f10, f12, strategyType));
    }

    private static float[] l(float f10, List list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            KeylineState keylineState = (KeylineState) list.get(i11);
            KeylineState keylineState2 = (KeylineState) list.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? keylineState2.d().f25876a - keylineState.d().f25876a : keylineState.k().f25876a - keylineState2.k().f25876a) / f10);
            i10++;
        }
        return fArr;
    }

    private static List m(Carousel carousel, KeylineState keylineState, float f10, float f11, CarouselStrategy.StrategyType strategyType) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int iE = e(keylineState);
        int containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (!q(carousel, keylineState) && iE != -1) {
            int iJ = iE - keylineState.j();
            float f12 = keylineState.d().f25877b - (keylineState.d().f25879d / 2.0f);
            if (iJ <= 0 && keylineState.i().f25881f > 0.0f) {
                arrayList.add(w(keylineState, (f12 - keylineState.i().f25881f) - f11, containerWidth));
                return arrayList;
            }
            float f13 = 0.0f;
            int i10 = 0;
            while (i10 < iJ) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i11 = iE - i10;
                float f14 = f13 + ((KeylineState.Keyline) keylineState.h().get(i11)).f25881f;
                int i12 = i11 + 1;
                int i13 = containerWidth;
                KeylineState keylineStateS = s(keylineState2, iE, i12 < keylineState.h().size() ? d(keylineState2, ((KeylineState.Keyline) keylineState.h().get(i12)).f25878c) + 1 : 0, f12 - f14, keylineState.c() + i10 + 1, keylineState.j() + i10 + 1, i13);
                if (i10 == iJ - 1 && f11 > 0.0f) {
                    keylineStateS = t(keylineStateS, f11, i13, false, f10, strategyType);
                    i13 = i13;
                }
                arrayList.add(keylineStateS);
                i10++;
                containerWidth = i13;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(t(keylineState, f11, containerWidth, false, f10, strategyType));
        }
        return arrayList;
    }

    private static float[] n(List list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f11, f12, f10), i10 - 1, i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List o(Carousel carousel, KeylineState keylineState, float f10, float f11, CarouselStrategy.StrategyType strategyType) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int iC = c(keylineState);
        int containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (!p(keylineState) && iC != -1) {
            int iC2 = keylineState.c() - iC;
            float f12 = keylineState.d().f25877b - (keylineState.d().f25879d / 2.0f);
            if (iC2 <= 0 && keylineState.b().f25881f > 0.0f) {
                arrayList.add(w(keylineState, f12 + keylineState.b().f25881f + f11, containerWidth));
                return arrayList;
            }
            float f13 = 0.0f;
            for (int i10 = 0; i10 < iC2; i10++) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i11 = iC + i10;
                int size = keylineState.h().size() - 1;
                f13 += ((KeylineState.Keyline) keylineState.h().get(i11)).f25881f;
                int i12 = i11 - 1;
                if (i12 >= 0) {
                    size = b(keylineState2, ((KeylineState.Keyline) keylineState.h().get(i12)).f25878c) - 1;
                }
                int i13 = containerWidth;
                KeylineState keylineStateS = s(keylineState2, iC, size, f12 + f13, (keylineState.c() - i10) - 1, (keylineState.j() - i10) - 1, i13);
                containerWidth = i13;
                if (i10 == iC2 - 1 && f11 > 0.0f) {
                    keylineStateS = t(keylineStateS, f11, containerWidth, true, f10, strategyType);
                }
                arrayList.add(keylineStateS);
            }
        } else if (f11 > 0.0f) {
            arrayList.add(t(keylineState, f11, containerWidth, true, f10, strategyType));
        }
        return arrayList;
    }

    private static boolean p(KeylineState keylineState) {
        return keylineState.b().f25877b - (keylineState.b().f25879d / 2.0f) >= 0.0f && keylineState.b() == keylineState.e();
    }

    private static boolean q(Carousel carousel, KeylineState keylineState) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        return keylineState.i().f25877b + (keylineState.i().f25879d / 2.0f) <= ((float) containerHeight) && keylineState.i() == keylineState.l();
    }

    private static KeylineState r(List list, float f10, float[] fArr) {
        float[] fArrN = n(list, f10, fArr);
        return KeylineState.o((KeylineState) list.get((int) fArrN[1]), (KeylineState) list.get((int) fArrN[2]), fArrN[0]);
    }

    private static KeylineState s(KeylineState keylineState, int i10, int i11, float f10, int i12, int i13, int i14) {
        ArrayList arrayList = new ArrayList(keylineState.h());
        arrayList.add(i11, (KeylineState.Keyline) arrayList.remove(i10));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.g(), i14);
        int i15 = 0;
        while (i15 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i15);
            float f11 = keyline.f25879d;
            builder.addKeyline(f10 + (f11 / 2.0f), keyline.f25878c, f11, i15 >= i12 && i15 <= i13, keyline.f25880e, keyline.f25881f);
            f10 += keyline.f25879d;
            i15++;
        }
        return builder.build();
    }

    private static KeylineState t(KeylineState keylineState, float f10, int i10, boolean z10, float f11, CarouselStrategy.StrategyType strategyType) {
        return AnonymousClass1.f25891a[strategyType.ordinal()] != 1 ? v(keylineState, f10, i10, z10) : u(keylineState, f10, i10, z10, f11);
    }

    private static KeylineState u(KeylineState keylineState, float f10, int i10, boolean z10, float f11) {
        ArrayList arrayList = new ArrayList(keylineState.h());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.g(), i10);
        float fM = f10 / keylineState.m();
        float f12 = z10 ? f10 : 0.0f;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i11);
            if (keyline.f25880e) {
                builder.addKeyline(keyline.f25877b, keyline.f25878c, keyline.f25879d, false, true, keyline.f25881f);
            } else {
                boolean z11 = i11 >= keylineState.c() && i11 <= keylineState.j();
                float f13 = keyline.f25879d - fM;
                float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(f13, keylineState.g(), f11);
                float f14 = (f13 / 2.0f) + f12;
                float fAbs = Math.abs(f14 - keyline.f25877b);
                builder.addKeyline(f14, childMaskPercentage, f13, z11, false, keyline.f25881f, z10 ? fAbs : 0.0f, z10 ? 0.0f : fAbs);
                f12 += f13;
            }
            i11++;
        }
        return builder.build();
    }

    private static KeylineState v(KeylineState keylineState, float f10, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(keylineState.h());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.g(), i10);
        boolean z11 = true;
        int size = z10 ? 0 : arrayList.size() - 1;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i11);
            if (keyline.f25880e && i11 == size) {
                builder.addKeyline(keyline.f25877b, keyline.f25878c, keyline.f25879d, false, true, keyline.f25881f);
            } else {
                float f11 = keyline.f25877b;
                float f12 = z10 ? f11 + f10 : f11 - f10;
                float f13 = z10 ? f10 : 0.0f;
                float f14 = z10 ? 0.0f : f10;
                boolean z12 = (i11 < keylineState.c() || i11 > keylineState.j()) ? false : z11;
                float f15 = f12;
                float f16 = keyline.f25878c;
                float f17 = keyline.f25879d;
                builder.addKeyline(f15, f16, f17, z12, keyline.f25880e, Math.abs(z10 ? Math.max(0.0f, ((f17 / 2.0f) + f15) - i10) : Math.min(0.0f, f15 - (f17 / 2.0f))), f13, f14);
            }
            i11++;
            z11 = true;
        }
        return builder.build();
    }

    private static KeylineState w(KeylineState keylineState, float f10, int i10) {
        return s(keylineState, 0, 0, f10, keylineState.c(), keylineState.j(), i10);
    }

    KeylineState g() {
        return this.f25884a;
    }

    @NonNull
    public KeylineState getShiftedState(float f10, float f11, float f12) {
        return j(f10, f11, f12, false);
    }

    KeylineState h() {
        return (KeylineState) this.f25886c.get(r0.size() - 1);
    }

    Map i(int i10, int i11, int i12, boolean z10) {
        float fG = this.f25884a.g();
        HashMap map = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = z10 ? (i10 - i13) - 1 : i13;
            if (i15 * fG * (z10 ? -1 : 1) > i12 - this.f25890g || i13 >= i10 - this.f25886c.size()) {
                Integer numValueOf = Integer.valueOf(i15);
                List list = this.f25886c;
                map.put(numValueOf, (KeylineState) list.get(MathUtils.clamp(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i10 - 1; i17 >= 0; i17--) {
            int i18 = z10 ? (i10 - i17) - 1 : i17;
            if (i18 * fG * (z10 ? -1 : 1) < i11 + this.f25889f || i17 < this.f25885b.size()) {
                Integer numValueOf2 = Integer.valueOf(i18);
                List list2 = this.f25885b;
                map.put(numValueOf2, (KeylineState) list2.get(MathUtils.clamp(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return map;
    }

    KeylineState j(float f10, float f11, float f12, boolean z10) {
        float fLerp;
        List list;
        float[] fArr;
        float f13 = this.f25889f + f11;
        float f14 = f12 - this.f25890g;
        float f15 = k().b().f25882g;
        float f16 = h().b().f25883h;
        if (this.f25889f == f15) {
            f13 += f15;
        }
        if (this.f25890g == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            fLerp = AnimationUtils.lerp(1.0f, 0.0f, f11, f13, f10);
            list = this.f25885b;
            fArr = this.f25887d;
        } else {
            if (f10 <= f14) {
                return this.f25884a;
            }
            fLerp = AnimationUtils.lerp(0.0f, 1.0f, f14, f12, f10);
            list = this.f25886c;
            fArr = this.f25888e;
        }
        return z10 ? a(list, fLerp, fArr) : r(list, fLerp, fArr);
    }

    KeylineState k() {
        return (KeylineState) this.f25885b.get(r0.size() - 1);
    }
}
