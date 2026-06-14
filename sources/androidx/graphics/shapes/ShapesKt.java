package androidx.graphics.shapes;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.collection.FloatFloatPair;
import androidx.graphics.shapes.RoundedPolygon;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001aH\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002\u001a0\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002\u001a4\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007\u001a>\u0010\u0012\u001a\u00020\u000f*\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007\u001a\u0084\u0001\u0010\u0014\u001a\u00020\u000f*\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a2\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007\u001aN\u0010\u001b\u001a\u00020\u000f*\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u001ad\u0010\u001c\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007¨\u0006\u001d"}, d2 = {"pillStarVerticesFromNumVerts", "", "numVerticesPerRadius", "", "width", "", "height", "innerRadius", "vertexSpacing", "startLocation", "centerX", "centerY", "starVerticesFromNumVerts", "radius", "circle", "Landroidx/graphics/shapes/RoundedPolygon;", "Landroidx/graphics/shapes/RoundedPolygon$Companion;", "numVertices", "pill", "smoothing", "pillStar", "innerRadiusRatio", "rounding", "Landroidx/graphics/shapes/CornerRounding;", "innerRounding", "perVertexRounding", "", "rectangle", "star", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ShapesKt {
    @NotNull
    public static final RoundedPolygon circle(@NotNull RoundedPolygon.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return circle$default(companion, 0, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ RoundedPolygon circle$default(RoundedPolygon.Companion companion, int i10, float f10, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8;
        }
        if ((i11 & 2) != 0) {
            f10 = 1.0f;
        }
        if ((i11 & 4) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            f12 = 0.0f;
        }
        return circle(companion, i10, f10, f11, f12);
    }

    @NotNull
    public static final RoundedPolygon pill(@NotNull RoundedPolygon.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
    }

    public static /* synthetic */ RoundedPolygon pill$default(RoundedPolygon.Companion companion, float f10, float f11, float f12, float f13, float f14, int i10, Object obj) {
        float f15;
        float f16;
        float f17;
        float f18;
        RoundedPolygon.Companion companion2;
        float f19;
        if ((i10 & 1) != 0) {
            f10 = 2.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        if ((i10 & 16) != 0) {
            f15 = 0.0f;
            f18 = f12;
            f16 = f13;
            f19 = f10;
            f17 = f11;
            companion2 = companion;
        } else {
            f15 = f14;
            f16 = f13;
            f17 = f11;
            f18 = f12;
            companion2 = companion;
            f19 = f10;
        }
        return pill(companion2, f19, f17, f18, f16, f15);
    }

    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, 0.0f, 0.0f, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2047, null);
    }

    public static /* synthetic */ RoundedPolygon pillStar$default(RoundedPolygon.Companion companion, float f10, float f11, int i10, float f12, CornerRounding cornerRounding, CornerRounding cornerRounding2, List list, float f13, float f14, float f15, float f16, int i11, Object obj) {
        float f17;
        float f18;
        float f19;
        float f20;
        CornerRounding cornerRounding3;
        List list2;
        float f21;
        CornerRounding cornerRounding4;
        float f22;
        int i12;
        RoundedPolygon.Companion companion2;
        float f23;
        if ((i11 & 1) != 0) {
            f10 = 2.0f;
        }
        if ((i11 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i11 & 4) != 0) {
            i10 = 8;
        }
        if ((i11 & 8) != 0) {
            f12 = 0.5f;
        }
        if ((i11 & 16) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i11 & 32) != 0) {
            cornerRounding2 = null;
        }
        if ((i11 & 64) != 0) {
            list = null;
        }
        if ((i11 & 128) != 0) {
            f13 = 0.5f;
        }
        if ((i11 & 256) != 0) {
            f14 = 0.0f;
        }
        if ((i11 & 512) != 0) {
            f15 = 0.0f;
        }
        if ((i11 & 1024) != 0) {
            f17 = 0.0f;
            f20 = f14;
            f18 = f15;
            list2 = list;
            f19 = f13;
            cornerRounding4 = cornerRounding;
            cornerRounding3 = cornerRounding2;
            i12 = i10;
            f21 = f12;
            f23 = f10;
            f22 = f11;
            companion2 = companion;
        } else {
            f17 = f16;
            f18 = f15;
            f19 = f13;
            f20 = f14;
            cornerRounding3 = cornerRounding2;
            list2 = list;
            f21 = f12;
            cornerRounding4 = cornerRounding;
            f22 = f11;
            i12 = i10;
            companion2 = companion;
            f23 = f10;
        }
        return pillStar(companion2, f23, f22, i12, f21, cornerRounding4, cornerRounding3, list2, f19, f20, f18, f17);
    }

    private static final float[] pillStarVerticesFromNumVerts(int i10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        int i11;
        float f17;
        float f18;
        float f19;
        long jM4constructorimpl;
        float fMin = Math.min(f10, f11);
        float fD = g.d(f11 - f10, 0.0f);
        float fD2 = g.d(f10 - f11, 0.0f);
        float f20 = 2;
        float f21 = fD / f20;
        float f22 = fD2 / f20;
        float twoPi = Utils.getTwoPi() * fMin * Utils.interpolate(f12, 1.0f, f13);
        float f23 = (f20 * fD2) + (f20 * fD) + twoPi;
        float f24 = twoPi / 4;
        float f25 = f21 + f24;
        float f26 = f25 + fD2;
        float f27 = f26 + f24;
        float f28 = f27 + fD;
        float f29 = f28 + f24;
        float f30 = f29 + fD2;
        float f31 = f30 + f24;
        float[] fArr = {0.0f, f21, f25, f26, f27, f28, f29, f30, f31, f31 + f21, f23};
        int i12 = i10 * 2;
        float f32 = f23 / i12;
        float f33 = f14 * f23;
        float[] fArr2 = new float[i10 * 4];
        long jM4constructorimpl2 = FloatFloatPair.m4constructorimpl(f22, f21);
        float f34 = -f22;
        long jM4constructorimpl3 = FloatFloatPair.m4constructorimpl(f34, f21);
        float f35 = -f21;
        long jM4constructorimpl4 = FloatFloatPair.m4constructorimpl(f34, f35);
        long jM4constructorimpl5 = FloatFloatPair.m4constructorimpl(f22, f35);
        float f36 = f21;
        int i13 = 0;
        float f37 = 0.0f;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i12) {
            float f38 = f33 % f23;
            if (f38 < f37) {
                i14 = 0;
            }
            while (true) {
                int i16 = (i14 + 1) % 11;
                float f39 = fArr[i16];
                if (f38 >= f39) {
                    f36 = fArr[(i16 + 1) % 11];
                    i14 = i16;
                    f37 = f39;
                } else {
                    float f40 = (f38 - f37) / (f36 - f37);
                    if (z10) {
                        i11 = i13;
                        f17 = fMin * f12;
                    } else {
                        i11 = i13;
                        f17 = fMin;
                    }
                    switch (i14) {
                        case 0:
                            f18 = f21;
                            float f41 = f17;
                            f19 = f22;
                            jM4constructorimpl = FloatFloatPair.m4constructorimpl(f41, f40 * f18);
                            break;
                        case 1:
                            f18 = f21;
                            float f42 = f17;
                            f19 = f22;
                            jM4constructorimpl = PointKt.m4225plusybeJwSQ(Utils.m4241radialToCartesianL6JJ3z0$default(f42, (f40 * Utils.getFloatPi()) / f20, 0L, 4, null), jM4constructorimpl2);
                            break;
                        case 2:
                            f18 = f21;
                            float f43 = f17;
                            f19 = f22;
                            jM4constructorimpl = FloatFloatPair.m4constructorimpl(f19 - (f40 * fD2), f43);
                            break;
                        case 3:
                            f18 = f21;
                            float f44 = f17;
                            f19 = f22;
                            jM4constructorimpl = PointKt.m4225plusybeJwSQ(Utils.m4241radialToCartesianL6JJ3z0$default(f44, (Utils.getFloatPi() / f20) + ((f40 * Utils.getFloatPi()) / f20), 0L, 4, null), jM4constructorimpl3);
                            break;
                        case 4:
                            f18 = f21;
                            float f45 = f17;
                            f19 = f22;
                            jM4constructorimpl = FloatFloatPair.m4constructorimpl(-f45, f18 - (f40 * fD));
                            break;
                        case 5:
                            f18 = f21;
                            float f46 = f17;
                            f19 = f22;
                            jM4constructorimpl = PointKt.m4225plusybeJwSQ(Utils.m4241radialToCartesianL6JJ3z0$default(f46, Utils.getFloatPi() + ((f40 * Utils.getFloatPi()) / f20), 0L, 4, null), jM4constructorimpl4);
                            break;
                        case 6:
                            f18 = f21;
                            float f47 = f17;
                            f19 = f22;
                            jM4constructorimpl = FloatFloatPair.m4constructorimpl(f34 + (f40 * fD2), -f47);
                            break;
                        case 7:
                            f18 = f21;
                            float f48 = f17;
                            f19 = f22;
                            jM4constructorimpl = PointKt.m4225plusybeJwSQ(Utils.m4241radialToCartesianL6JJ3z0$default(f48, (Utils.getFloatPi() * 1.5f) + ((f40 * Utils.getFloatPi()) / f20), 0L, 4, null), jM4constructorimpl5);
                            break;
                        default:
                            f18 = f21;
                            jM4constructorimpl = FloatFloatPair.m4constructorimpl(f17, f35 + (f40 * f21));
                            f19 = f22;
                            break;
                    }
                    int i17 = i15 + 1;
                    fArr2[i15] = PointKt.m4221getXDnnuFBc(jM4constructorimpl) + f15;
                    i15 += 2;
                    fArr2[i17] = PointKt.m4222getYDnnuFBc(jM4constructorimpl) + f16;
                    f33 += f32;
                    z10 = !z10;
                    f22 = f19;
                    i13 = i11 + 1;
                    f21 = f18;
                }
            }
        }
        return fArr2;
    }

    @NotNull
    public static final RoundedPolygon rectangle(@NotNull RoundedPolygon.Companion companion, float f10, float f11, @NotNull CornerRounding rounding, @Nullable List<CornerRounding> list, float f12, float f13) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        float f14 = 2;
        float f15 = f10 / f14;
        float f16 = f12 - f15;
        float f17 = f11 / f14;
        float f18 = f13 - f17;
        float f19 = f15 + f12;
        float f20 = f17 + f13;
        return RoundedPolygonKt.RoundedPolygon(new float[]{f19, f20, f16, f20, f16, f18, f19, f18}, rounding, list, f12, f13);
    }

    public static /* synthetic */ RoundedPolygon rectangle$default(RoundedPolygon.Companion companion, float f10, float f11, CornerRounding cornerRounding, List list, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 2.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 2.0f;
        }
        if ((i10 & 4) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        if ((i10 & 16) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 32) != 0) {
            f13 = 0.0f;
        }
        return rectangle(companion, f10, f11, cornerRounding, list, f12, f13);
    }

    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i10) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return star$default(companion, i10, 0.0f, 0.0f, null, null, null, 0.0f, 0.0f, 254, null);
    }

    public static /* synthetic */ RoundedPolygon star$default(RoundedPolygon.Companion companion, int i10, float f10, float f11, CornerRounding cornerRounding, CornerRounding cornerRounding2, List list, float f12, float f13, int i11, Object obj) {
        return star(companion, i10, (i11 & 2) != 0 ? 1.0f : f10, (i11 & 4) != 0 ? 0.5f : f11, (i11 & 8) != 0 ? CornerRounding.Unrounded : cornerRounding, (i11 & 16) != 0 ? null : cornerRounding2, (i11 & 32) == 0 ? list : null, (i11 & 64) != 0 ? 0.0f : f12, (i11 & 128) != 0 ? 0.0f : f13);
    }

    private static final float[] starVerticesFromNumVerts(int i10, float f10, float f11, float f12, float f13) {
        float[] fArr = new float[i10 * 4];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f14 = i10;
            long jM4241radialToCartesianL6JJ3z0$default = Utils.m4241radialToCartesianL6JJ3z0$default(f10, (Utils.getFloatPi() / f14) * 2 * i12, 0L, 4, null);
            fArr[i11] = PointKt.m4221getXDnnuFBc(jM4241radialToCartesianL6JJ3z0$default) + f12;
            fArr[i11 + 1] = PointKt.m4222getYDnnuFBc(jM4241radialToCartesianL6JJ3z0$default) + f13;
            long jM4241radialToCartesianL6JJ3z0$default2 = Utils.m4241radialToCartesianL6JJ3z0$default(f11, (Utils.getFloatPi() / f14) * ((i12 * 2) + 1), 0L, 4, null);
            int i13 = i11 + 3;
            fArr[i11 + 2] = PointKt.m4221getXDnnuFBc(jM4241radialToCartesianL6JJ3z0$default2) + f12;
            i11 += 4;
            fArr[i13] = PointKt.m4222getYDnnuFBc(jM4241radialToCartesianL6JJ3z0$default2) + f13;
        }
        return fArr;
    }

    @NotNull
    public static final RoundedPolygon circle(@NotNull RoundedPolygon.Companion companion, @IntRange(from = 3) int i10) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return circle$default(companion, i10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @NotNull
    public static final RoundedPolygon pill(@NotNull RoundedPolygon.Companion companion, float f10) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, f10, 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
    }

    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f10) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, f10, 0.0f, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2046, null);
    }

    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i10, float f10) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return star$default(companion, i10, f10, 0.0f, null, null, null, 0.0f, 0.0f, 252, null);
    }

    @NotNull
    public static final RoundedPolygon circle(@NotNull RoundedPolygon.Companion companion, @IntRange(from = 3) int i10, float f10) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return circle$default(companion, i10, f10, 0.0f, 0.0f, 12, null);
    }

    @NotNull
    public static final RoundedPolygon pill(@NotNull RoundedPolygon.Companion companion, float f10, float f11) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, f10, f11, 0.0f, 0.0f, 0.0f, 28, null);
    }

    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f10, float f11) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, f10, f11, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2044, null);
    }

    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return star$default(companion, i10, f10, f11, null, null, null, 0.0f, 0.0f, 248, null);
    }

    @NotNull
    public static final RoundedPolygon circle(@NotNull RoundedPolygon.Companion companion, @IntRange(from = 3) int i10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return circle$default(companion, i10, f10, f11, 0.0f, 8, null);
    }

    @NotNull
    public static final RoundedPolygon pill(@NotNull RoundedPolygon.Companion companion, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, f10, f11, f12, 0.0f, 0.0f, 24, null);
    }

    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f10, float f11, int i10) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, f10, f11, i10, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, IronSourceError.ERROR_INIT_ALREADY_FINISHED, null);
    }

    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i10, float f10, float f11, @NotNull CornerRounding rounding) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return star$default(companion, i10, f10, f11, rounding, null, null, 0.0f, 0.0f, 240, null);
    }

    @NotNull
    public static final RoundedPolygon circle(@NotNull RoundedPolygon.Companion companion, @IntRange(from = 3) int i10, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        if (i10 >= 3) {
            return RoundedPolygonKt.RoundedPolygon$default(i10, f10 / ((float) Math.cos(Utils.getFloatPi() / i10)), f11, f12, new CornerRounding(f10, 0.0f, 2, null), null, 32, null);
        }
        throw new IllegalArgumentException("Circle must have at least three vertices");
    }

    @NotNull
    public static final RoundedPolygon pill(@NotNull RoundedPolygon.Companion companion, float f10, float f11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, f10, f11, f12, f13, 0.0f, 16, null);
    }

    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f10, float f11, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f12) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, f10, f11, i10, f12, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2032, null);
    }

    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i10, float f10, float f11, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return star$default(companion, i10, f10, f11, rounding, cornerRounding, null, 0.0f, 0.0f, 224, null);
    }

    @NotNull
    public static final RoundedPolygon pill(@NotNull RoundedPolygon.Companion companion, float f10, float f11, float f12, float f13, float f14) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        if (f10 > 0.0f && f11 > 0.0f) {
            float f15 = 2;
            float f16 = f10 / f15;
            float f17 = f11 / f15;
            float f18 = f16 + f13;
            float f19 = f17 + f14;
            float f20 = (-f16) + f13;
            float f21 = (-f17) + f14;
            return RoundedPolygonKt.RoundedPolygon$default(new float[]{f18, f19, f20, f19, f20, f21, f18, f21}, new CornerRounding(Math.min(f16, f17), f12), null, f13, f14, 4, null);
        }
        throw new IllegalArgumentException("Pill shapes must have positive width and height");
    }

    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f10, float f11, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f12, @NotNull CornerRounding rounding) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f10, f11, i10, f12, rounding, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2016, null);
    }

    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i10, float f10, float f11, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return star$default(companion, i10, f10, f11, rounding, cornerRounding, list, 0.0f, 0.0f, 192, null);
    }

    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f10, float f11, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f12, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f10, f11, i10, f12, rounding, cornerRounding, null, 0.0f, 0.0f, 0.0f, 0.0f, 1984, null);
    }

    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i10, float f10, float f11, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list, float f12) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return star$default(companion, i10, f10, f11, rounding, cornerRounding, list, f12, 0.0f, 128, null);
    }

    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f10, float f11, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f12, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f10, f11, i10, f12, rounding, cornerRounding, list, 0.0f, 0.0f, 0.0f, 0.0f, 1920, null);
    }

    @NotNull
    public static final RoundedPolygon star(@NotNull RoundedPolygon.Companion companion, int i10, float f10, float f11, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list, float f12, float f13) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        if (f10 <= 0.0f || f11 <= 0.0f) {
            throw new IllegalArgumentException("Star radii must both be greater than 0");
        }
        if (f11 < f10) {
            if (list == null && cornerRounding != null) {
                kotlin.ranges.IntRange intRangeV = g.v(0, i10);
                list = new ArrayList<>();
                Iterator it = intRangeV.iterator();
                while (it.hasNext()) {
                    ((IntIterator) it).nextInt();
                    CollectionsKt.addAll(list, CollectionsKt.listOf((Object[]) new CornerRounding[]{rounding, cornerRounding}));
                }
            }
            return RoundedPolygonKt.RoundedPolygon(starVerticesFromNumVerts(i10, f10, f11, f12, f13), rounding, list, f12, f13);
        }
        throw new IllegalArgumentException("innerRadius must be less than radius");
    }

    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f10, float f11, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f12, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list, @FloatRange(from = 0.0d, to = 1.0d) float f13) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f10, f11, i10, f12, rounding, cornerRounding, list, f13, 0.0f, 0.0f, 0.0f, 1792, null);
    }

    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f10, float f11, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f12, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list, @FloatRange(from = 0.0d, to = 1.0d) float f13, @FloatRange(from = 0.0d, to = 1.0d) float f14) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f10, f11, i10, f12, rounding, cornerRounding, list, f13, f14, 0.0f, 0.0f, 1536, null);
    }

    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f10, float f11, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f12, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list, @FloatRange(from = 0.0d, to = 1.0d) float f13, @FloatRange(from = 0.0d, to = 1.0d) float f14, float f15) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f10, f11, i10, f12, rounding, cornerRounding, list, f13, f14, f15, 0.0f, 1024, null);
    }

    @NotNull
    public static final RoundedPolygon pillStar(@NotNull RoundedPolygon.Companion companion, float f10, float f11, int i10, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f12, @NotNull CornerRounding rounding, @Nullable CornerRounding cornerRounding, @Nullable List<CornerRounding> list, @FloatRange(from = 0.0d, to = 1.0d) float f13, @FloatRange(from = 0.0d, to = 1.0d) float f14, float f15, float f16) {
        List<CornerRounding> arrayList;
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        if (f10 <= 0.0f || f11 <= 0.0f) {
            throw new IllegalArgumentException("Pill shapes must have positive width and height");
        }
        if (f12 > 0.0f && f12 <= 1.0f) {
            if (list != null || cornerRounding == null) {
                arrayList = list;
            } else {
                kotlin.ranges.IntRange intRangeV = g.v(0, i10);
                arrayList = new ArrayList<>();
                Iterator it = intRangeV.iterator();
                while (it.hasNext()) {
                    ((IntIterator) it).nextInt();
                    CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new CornerRounding[]{rounding, cornerRounding}));
                }
            }
            return RoundedPolygonKt.RoundedPolygon(pillStarVerticesFromNumVerts(i10, f10, f11, f12, f13, f14, f15, f16), rounding, arrayList, f15, f16);
        }
        throw new IllegalArgumentException("innerRadius must be between 0 and 1");
    }
}
