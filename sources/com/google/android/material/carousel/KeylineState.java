package com.google.android.material.carousel;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.animation.AnimationUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class KeylineState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f25861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f25863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f25864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f25865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f25866f;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f25867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f25868b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Keyline f25870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Keyline f25871e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f25869c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f25872f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f25873g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f25874h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f25875i = -1;

        public Builder(float f10, int i10) {
            this.f25867a = f10;
            this.f25868b = i10;
        }

        private static float a(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addAnchorKeyline(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12) {
            return addKeyline(f10, f11, f12, false, true);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10) {
            return addKeyline(f10, f11, f12, z10, false);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeylineRange(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12, int i10) {
            return addKeylineRange(f10, f11, f12, i10, false);
        }

        @NonNull
        public KeylineState build() {
            if (this.f25870d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f25869c.size(); i10++) {
                Keyline keyline = (Keyline) this.f25869c.get(i10);
                arrayList.add(new Keyline(a(this.f25870d.f25877b, this.f25867a, this.f25872f, i10), keyline.f25877b, keyline.f25878c, keyline.f25879d, keyline.f25880e, keyline.f25881f, keyline.f25882g, keyline.f25883h));
            }
            return new KeylineState(this.f25867a, arrayList, this.f25872f, this.f25873g, this.f25868b);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12) {
            return addKeyline(f10, f11, f12, false);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeylineRange(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    addKeyline((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (!z10) {
                    int i10 = this.f25875i;
                    if (i10 != -1 && i10 != 0) {
                        throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                    }
                    this.f25875i = this.f25869c.size();
                } else {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
            }
            Keyline keyline = new Keyline(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f25870d == null) {
                    this.f25870d = keyline;
                    this.f25872f = this.f25869c.size();
                }
                if (this.f25873g != -1 && this.f25869c.size() - this.f25873g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 == this.f25870d.f25879d) {
                    this.f25871e = keyline;
                    this.f25873g = this.f25869c.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else {
                if (this.f25870d == null && keyline.f25879d < this.f25874h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f25871e != null && keyline.f25879d > this.f25874h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f25874h = keyline.f25879d;
            this.f25869c.add(keyline);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10, boolean z11, float f13) {
            return addKeyline(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            int i10 = this.f25868b;
            if (f15 > i10) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, i10));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return addKeyline(f10, f11, f12, z10, z11, fAbs);
        }
    }

    static final class Keyline {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f25876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f25877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f25878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f25879d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f25880e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f25881f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f25882g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f25883h;

        Keyline(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        static Keyline a(Keyline keyline, Keyline keyline2, float f10) {
            return new Keyline(AnimationUtils.lerp(keyline.f25876a, keyline2.f25876a, f10), AnimationUtils.lerp(keyline.f25877b, keyline2.f25877b, f10), AnimationUtils.lerp(keyline.f25878c, keyline2.f25878c, f10), AnimationUtils.lerp(keyline.f25879d, keyline2.f25879d, f10));
        }

        Keyline(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f25876a = f10;
            this.f25877b = f11;
            this.f25878c = f12;
            this.f25879d = f13;
            this.f25880e = z10;
            this.f25881f = f14;
            this.f25882g = f15;
            this.f25883h = f16;
        }
    }

    static KeylineState o(KeylineState keylineState, KeylineState keylineState2, float f10) {
        if (keylineState.g() != keylineState2.g()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listH = keylineState.h();
        List listH2 = keylineState2.h();
        if (listH.size() != listH2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < keylineState.h().size(); i10++) {
            arrayList.add(Keyline.a((Keyline) listH.get(i10), (Keyline) listH2.get(i10), f10));
        }
        return new KeylineState(keylineState.g(), arrayList, AnimationUtils.lerp(keylineState.c(), keylineState2.c(), f10), AnimationUtils.lerp(keylineState.j(), keylineState2.j(), f10), keylineState.f25866f);
    }

    static KeylineState p(KeylineState keylineState, int i10) {
        Builder builder = new Builder(keylineState.g(), i10);
        float f10 = (i10 - keylineState.k().f25877b) - (keylineState.k().f25879d / 2.0f);
        int size = keylineState.h().size() - 1;
        while (size >= 0) {
            Keyline keyline = (Keyline) keylineState.h().get(size);
            builder.addKeyline((keyline.f25879d / 2.0f) + f10, keyline.f25878c, keyline.f25879d, size >= keylineState.c() && size <= keylineState.j(), keyline.f25880e);
            f10 += keyline.f25879d;
            size--;
        }
        return builder.build();
    }

    int a() {
        return this.f25866f;
    }

    Keyline b() {
        return (Keyline) this.f25863c.get(this.f25864d);
    }

    int c() {
        return this.f25864d;
    }

    Keyline d() {
        return (Keyline) this.f25863c.get(0);
    }

    Keyline e() {
        for (int i10 = 0; i10 < this.f25863c.size(); i10++) {
            Keyline keyline = (Keyline) this.f25863c.get(i10);
            if (!keyline.f25880e) {
                return keyline;
            }
        }
        return null;
    }

    List f() {
        return this.f25863c.subList(this.f25864d, this.f25865e + 1);
    }

    float g() {
        return this.f25861a;
    }

    List h() {
        return this.f25863c;
    }

    Keyline i() {
        return (Keyline) this.f25863c.get(this.f25865e);
    }

    int j() {
        return this.f25865e;
    }

    Keyline k() {
        return (Keyline) this.f25863c.get(r0.size() - 1);
    }

    Keyline l() {
        for (int size = this.f25863c.size() - 1; size >= 0; size--) {
            Keyline keyline = (Keyline) this.f25863c.get(size);
            if (!keyline.f25880e) {
                return keyline;
            }
        }
        return null;
    }

    int m() {
        Iterator it = this.f25863c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((Keyline) it.next()).f25880e) {
                i10++;
            }
        }
        return this.f25863c.size() - i10;
    }

    int n() {
        return this.f25862b;
    }

    private KeylineState(float f10, List list, int i10, int i11, int i12) {
        this.f25861a = f10;
        this.f25863c = DesugarCollections.unmodifiableList(list);
        this.f25864d = i10;
        this.f25865e = i11;
        while (i10 <= i11) {
            if (((Keyline) list.get(i10)).f25881f == 0.0f) {
                this.f25862b++;
            }
            i10++;
        }
        this.f25866f = i12;
    }
}
