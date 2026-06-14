package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C4288e1;
import com.ironsource.C4388k0;
import com.ironsource.mediationsdk.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class LevelPlayAdSize {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f67867f = 320;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f67868g = 50;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f67869h = 320;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f67870i = 90;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f67871j = 300;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f67872k = 250;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f67874m = 90;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f67875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f67876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f67877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f67878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final LevelPlayAdSize f67879e;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final LevelPlayAdSize BANNER = new LevelPlayAdSize(320, 50, "BANNER", false, null, 16, null);

    @NotNull
    public static final LevelPlayAdSize MEDIUM_RECTANGLE = new LevelPlayAdSize(300, 250, l.f44067g, false, null, 16, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f67873l = 728;

    @NotNull
    public static final LevelPlayAdSize LEADERBOARD = new LevelPlayAdSize(f67873l, 90, l.f44064d, false, null, 16, null);

    @NotNull
    public static final LevelPlayAdSize LARGE = new LevelPlayAdSize(320, 90, l.f44062b, false, null, 16, null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ LevelPlayAdSize createAdaptiveAdSize$default(Companion companion, Context context, Integer num, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        @NotNull
        public final LevelPlayAdSize createAdSize$mediationsdk_release(@NotNull String adSize) {
            Intrinsics.checkNotNullParameter(adSize, "adSize");
            int iHashCode = adSize.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && adSize.equals("BANNER")) {
                            return LevelPlayAdSize.BANNER;
                        }
                    } else if (adSize.equals(l.f44064d)) {
                        return LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (adSize.equals(l.f44062b)) {
                    return LevelPlayAdSize.LARGE;
                }
            } else if (adSize.equals(l.f44067g)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            throw new IllegalArgumentException("Wrong Ad Size");
        }

        @Nullable
        public final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }

        @NotNull
        public final LevelPlayAdSize createCustomSize(int i10, int i11) {
            return new LevelPlayAdSize(i10, i11, "CUSTOM", false, null, 16, null);
        }

        private Companion() {
        }

        @Nullable
        public final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C4288e1(new C4388k0()).a(context, num);
        }
    }

    public LevelPlayAdSize(int i10, int i11, @Nullable String str, boolean z10, @Nullable LevelPlayAdSize levelPlayAdSize) {
        this.f67875a = i10;
        this.f67876b = i11;
        this.f67877c = str;
        this.f67878d = z10;
        this.f67879e = levelPlayAdSize;
    }

    @Nullable
    public static final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context) {
        return Companion.createAdaptiveAdSize(context);
    }

    @NotNull
    public static final LevelPlayAdSize createCustomSize(int i10, int i11) {
        return Companion.createCustomSize(i10, i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(LevelPlayAdSize.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.unity3d.mediation.LevelPlayAdSize");
        LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
        return this.f67875a == levelPlayAdSize.f67875a && this.f67876b == levelPlayAdSize.f67876b && Intrinsics.areEqual(this.f67877c, levelPlayAdSize.f67877c);
    }

    @NotNull
    public final String getDescription() {
        return String.valueOf(this.f67877c);
    }

    @Nullable
    public final LevelPlayAdSize getFallbackAdSize$mediationsdk_release() {
        return this.f67879e;
    }

    public final int getHeight() {
        return this.f67876b;
    }

    public final int getWidth() {
        return this.f67875a;
    }

    public int hashCode() {
        int i10 = ((this.f67875a * 31) + this.f67876b) * 31;
        String str = this.f67877c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAdaptive() {
        return this.f67878d;
    }

    @NotNull
    public String toString() {
        return this.f67877c + " " + this.f67875a + "x" + this.f67876b;
    }

    @Nullable
    public static final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context, @Nullable Integer num) {
        return Companion.createAdaptiveAdSize(context, num);
    }

    public /* synthetic */ LevelPlayAdSize(int i10, int i11, String str, boolean z10, LevelPlayAdSize levelPlayAdSize, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? null : str, z10, (i12 & 16) != 0 ? null : levelPlayAdSize);
    }
}
