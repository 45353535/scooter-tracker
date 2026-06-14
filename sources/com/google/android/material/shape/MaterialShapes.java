package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.graphics.shapes.CornerRounding;
import androidx.graphics.shapes.RoundedPolygon;
import androidx.graphics.shapes.RoundedPolygonKt;
import androidx.graphics.shapes.ShapesKt;
import androidx.graphics.shapes.Shapes_androidKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialShapes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CornerRounding f27522a = new CornerRounding(0.15f, 0.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CornerRounding f27523b = new CornerRounding(0.2f, 0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final CornerRounding f27524c = new CornerRounding(0.3f, 0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final CornerRounding f27525d = new CornerRounding(0.5f, 0.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final CornerRounding f27526e = new CornerRounding(1.0f, 0.0f);
    public static final RoundedPolygon CIRCLE = normalize(i(), true);
    public static final RoundedPolygon SQUARE = normalize(K(), true);
    public static final RoundedPolygon SLANTED_SQUARE = normalize(H(), true);
    public static final RoundedPolygon ARCH = normalize(d(), true);
    public static final RoundedPolygon FAN = normalize(s(), true);
    public static final RoundedPolygon ARROW = normalize(e(), true);
    public static final RoundedPolygon SEMI_CIRCLE = normalize(G(), true);
    public static final RoundedPolygon OVAL = normalize(z(-45.0f), true);
    public static final RoundedPolygon PILL = normalize(B(), true);
    public static final RoundedPolygon TRIANGLE = normalize(N(-90.0f), true);
    public static final RoundedPolygon DIAMOND = normalize(r(), true);
    public static final RoundedPolygon CLAM_SHELL = normalize(j(), true);
    public static final RoundedPolygon PENTAGON = normalize(A(), true);
    public static final RoundedPolygon GEM = normalize(v(-90.0f), true);
    public static final RoundedPolygon SUNNY = normalize(L(), true);
    public static final RoundedPolygon VERY_SUNNY = normalize(O(), true);
    public static final RoundedPolygon COOKIE_4 = normalize(n(), true);
    public static final RoundedPolygon COOKIE_6 = normalize(o(), true);
    public static final RoundedPolygon COOKIE_7 = normalize(p(), true);
    public static final RoundedPolygon COOKIE_9 = normalize(q(), true);
    public static final RoundedPolygon COOKIE_12 = normalize(m(), true);
    public static final RoundedPolygon GHOSTISH = normalize(w(), true);
    public static final RoundedPolygon CLOVER_4 = normalize(k(), true);
    public static final RoundedPolygon CLOVER_8 = normalize(l(), true);
    public static final RoundedPolygon BURST = normalize(h(), true);
    public static final RoundedPolygon SOFT_BURST = normalize(J(), true);
    public static final RoundedPolygon BOOM = normalize(f(), true);
    public static final RoundedPolygon SOFT_BOOM = normalize(I(), true);
    public static final RoundedPolygon FLOWER = normalize(t(), true);
    public static final RoundedPolygon PUFFY = normalize(E(), true);
    public static final RoundedPolygon PUFFY_DIAMOND = normalize(F(), true);
    public static final RoundedPolygon PIXEL_CIRCLE = normalize(C(), true);
    public static final RoundedPolygon PIXEL_TRIANGLE = normalize(D(), true);
    public static final RoundedPolygon BUN = normalize(g(), true);
    public static final RoundedPolygon HEART = normalize(x(), true);

    private static RoundedPolygon A() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, -0.009f), new CornerRounding(0.172f, 0.0f)));
        return c(arrayList, 5, 0.5f, 0.5f, false);
    }

    private static RoundedPolygon B() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.961f, 0.039f), new CornerRounding(0.426f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(1.001f, 0.428f)));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 0.609f), f27526e));
        return c(arrayList, 2, 0.5f, 0.5f, true);
    }

    private static RoundedPolygon C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.704f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.704f, 0.065f)));
        arrayList.add(new VertexAndRounding(new PointF(0.843f, 0.065f)));
        arrayList.add(new VertexAndRounding(new PointF(0.843f, 0.148f)));
        arrayList.add(new VertexAndRounding(new PointF(0.926f, 0.148f)));
        arrayList.add(new VertexAndRounding(new PointF(0.926f, 0.296f)));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 0.296f)));
        return c(arrayList, 2, 0.5f, 0.5f, true);
    }

    private static RoundedPolygon D() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.11f, 0.5f)));
        arrayList.add(new VertexAndRounding(new PointF(0.113f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.287f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.287f, 0.087f)));
        arrayList.add(new VertexAndRounding(new PointF(0.421f, 0.087f)));
        arrayList.add(new VertexAndRounding(new PointF(0.421f, 0.17f)));
        arrayList.add(new VertexAndRounding(new PointF(0.56f, 0.17f)));
        arrayList.add(new VertexAndRounding(new PointF(0.56f, 0.265f)));
        arrayList.add(new VertexAndRounding(new PointF(0.674f, 0.265f)));
        arrayList.add(new VertexAndRounding(new PointF(0.675f, 0.344f)));
        arrayList.add(new VertexAndRounding(new PointF(0.789f, 0.344f)));
        arrayList.add(new VertexAndRounding(new PointF(0.789f, 0.439f)));
        arrayList.add(new VertexAndRounding(new PointF(0.888f, 0.439f)));
        return c(arrayList, 1, 0.5f, 0.5f, true);
    }

    private static RoundedPolygon E() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.053f)));
        arrayList.add(new VertexAndRounding(new PointF(0.545f, -0.04f), new CornerRounding(0.405f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.67f, -0.035f), new CornerRounding(0.426f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.717f, 0.066f), new CornerRounding(0.574f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.722f, 0.128f)));
        arrayList.add(new VertexAndRounding(new PointF(0.777f, 0.002f), new CornerRounding(0.36f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.914f, 0.149f), new CornerRounding(0.66f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.926f, 0.289f), new CornerRounding(0.66f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.881f, 0.346f)));
        arrayList.add(new VertexAndRounding(new PointF(0.94f, 0.344f), new CornerRounding(0.126f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(1.003f, 0.437f), new CornerRounding(0.255f, 0.0f)));
        return Shapes_androidKt.transformed(c(arrayList, 2, 0.5f, 0.5f, true), b(1.0f, 0.742f));
    }

    private static RoundedPolygon F() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.87f, 0.13f), new CornerRounding(0.146f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.818f, 0.357f)));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 0.332f), new CornerRounding(0.853f, 0.0f)));
        return c(arrayList, 4, 0.5f, 0.5f, true);
    }

    private static RoundedPolygon G() {
        RoundedPolygon.Companion companion = RoundedPolygon.INSTANCE;
        CornerRounding cornerRounding = CornerRounding.Unrounded;
        CornerRounding cornerRounding2 = f27523b;
        CornerRounding cornerRounding3 = f27526e;
        return ShapesKt.rectangle(companion, 1.6f, 1.0f, cornerRounding, Arrays.asList(cornerRounding2, cornerRounding2, cornerRounding3, cornerRounding3), 0.0f, 0.0f);
    }

    private static RoundedPolygon H() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.926f, 0.97f), new CornerRounding(0.189f, 0.811f)));
        arrayList.add(new VertexAndRounding(new PointF(-0.021f, 0.967f), new CornerRounding(0.187f, 0.057f)));
        return c(arrayList, 2, 0.5f, 0.5f, false);
    }

    private static RoundedPolygon I() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.733f, 0.454f)));
        arrayList.add(new VertexAndRounding(new PointF(0.839f, 0.437f), new CornerRounding(0.532f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.949f, 0.449f), new CornerRounding(0.439f, 1.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.998f, 0.478f), new CornerRounding(0.174f, 0.0f)));
        return c(arrayList, 16, 0.5f, 0.5f, true);
    }

    private static RoundedPolygon J() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.193f, 0.277f), new CornerRounding(0.053f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.176f, 0.055f), new CornerRounding(0.053f, 0.0f)));
        return c(arrayList, 10, 0.5f, 0.5f, false);
    }

    private static RoundedPolygon K() {
        return ShapesKt.rectangle(RoundedPolygon.INSTANCE, 1.0f, 1.0f, f27524c, null, 0.0f, 0.0f);
    }

    private static RoundedPolygon L() {
        return ShapesKt.star(RoundedPolygon.INSTANCE, 8, 1.0f, 0.8f, f27522a);
    }

    private static RoundedPolygon M() {
        return RoundedPolygonKt.RoundedPolygon(3, 1.0f, 0.0f, 0.0f, f27523b);
    }

    private static RoundedPolygon N(float f10) {
        return Shapes_androidKt.transformed(M(), a(f10));
    }

    private static RoundedPolygon O() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 1.08f), new CornerRounding(0.085f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.358f, 0.843f), new CornerRounding(0.085f, 0.0f)));
        return c(arrayList, 8, 0.5f, 0.5f, false);
    }

    private static void P(List list, List list2, int i10, float f10, float f11, boolean z10) {
        list2.clear();
        R(list, f10, f11);
        float f12 = (float) (6.283185307179586d / ((double) i10));
        if (z10) {
            int i11 = i10 * 2;
            float f13 = f12 / 2.0f;
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < list.size(); i13++) {
                    boolean z11 = i12 % 2 != 0;
                    int size = z11 ? (list.size() - 1) - i13 : i13;
                    VertexAndRounding vertexAndRounding = (VertexAndRounding) list.get(size);
                    if (size > 0 || !z11) {
                        list2.add(new VertexAndRounding(new PointF((i12 * f13) + (z11 ? (f13 - vertexAndRounding.f27527a.x) + (((VertexAndRounding) list.get(0)).f27527a.x * 2.0f) : vertexAndRounding.f27527a.x), vertexAndRounding.f27527a.y), vertexAndRounding.f27528b));
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < i10; i14++) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    VertexAndRounding vertexAndRounding2 = (VertexAndRounding) it.next();
                    list2.add(new VertexAndRounding(new PointF((i14 * f12) + vertexAndRounding2.f27527a.x, vertexAndRounding2.f27527a.y), vertexAndRounding2.f27528b));
                }
            }
        }
        Q(list2, f10, f11);
    }

    private static void Q(List list, float f10, float f11) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((VertexAndRounding) it.next()).e(f10, f11);
        }
    }

    private static void R(List list, float f10, float f11) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((VertexAndRounding) it.next()).f(f10, f11);
        }
    }

    private static List S(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(((VertexAndRounding) list.get(i10)).f27528b);
        }
        return arrayList;
    }

    private static float[] T(List list) {
        float[] fArr = new float[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = i10 * 2;
            fArr[i11] = ((VertexAndRounding) list.get(i10)).f27527a.x;
            fArr[i11 + 1] = ((VertexAndRounding) list.get(i10)).f27527a.y;
        }
        return fArr;
    }

    static Matrix a(float f10) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f10);
        return matrix;
    }

    static Matrix b(float f10, float f11) {
        Matrix matrix = new Matrix();
        matrix.setScale(f10, f11);
        return matrix;
    }

    private static RoundedPolygon c(List list, int i10, float f10, float f11, boolean z10) {
        ArrayList arrayList = new ArrayList();
        P(list, arrayList, i10, f10, f11, z10);
        return RoundedPolygonKt.RoundedPolygon(T(arrayList), CornerRounding.Unrounded, (List<CornerRounding>) S(arrayList), f10, f11);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static ShapeDrawable createShapeDrawable(@NonNull RoundedPolygon roundedPolygon) {
        return new ShapeDrawable(new PathShape(Shapes_androidKt.toPath(roundedPolygon), 1.0f, 1.0f));
    }

    private static RoundedPolygon d() {
        CornerRounding cornerRounding = CornerRounding.Unrounded;
        CornerRounding cornerRounding2 = f27526e;
        CornerRounding cornerRounding3 = f27523b;
        return Shapes_androidKt.transformed(RoundedPolygonKt.RoundedPolygon(4, 1.0f, 0.0f, 0.0f, cornerRounding, Arrays.asList(cornerRounding2, cornerRounding2, cornerRounding3, cornerRounding3)), a(-135.0f));
    }

    private static RoundedPolygon e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.892f), new CornerRounding(0.313f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(-0.216f, 1.05f), new CornerRounding(0.207f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.499f, -0.16f), new CornerRounding(0.215f, 1.0f)));
        arrayList.add(new VertexAndRounding(new PointF(1.225f, 1.06f), new CornerRounding(0.211f, 0.0f)));
        return c(arrayList, 1, 0.5f, 0.5f, false);
    }

    private static RoundedPolygon f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.457f, 0.296f), new CornerRounding(0.007f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.5f, -0.051f), new CornerRounding(0.007f, 0.0f)));
        return c(arrayList, 15, 0.5f, 0.5f, false);
    }

    private static RoundedPolygon g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.796f, 0.5f)));
        PointF pointF = new PointF(0.853f, 0.518f);
        CornerRounding cornerRounding = f27526e;
        arrayList.add(new VertexAndRounding(pointF, cornerRounding));
        arrayList.add(new VertexAndRounding(new PointF(0.992f, 0.631f), cornerRounding));
        arrayList.add(new VertexAndRounding(new PointF(0.968f, 1.0f), cornerRounding));
        return c(arrayList, 2, 0.5f, 0.5f, true);
    }

    private static RoundedPolygon h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, -0.006f), new CornerRounding(0.006f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.592f, 0.158f), new CornerRounding(0.006f, 0.0f)));
        return c(arrayList, 12, 0.5f, 0.5f, false);
    }

    private static RoundedPolygon i() {
        return ShapesKt.circle(RoundedPolygon.INSTANCE, 10);
    }

    private static RoundedPolygon j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.171f, 0.841f), new CornerRounding(0.159f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(-0.02f, 0.5f), new CornerRounding(0.14f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.17f, 0.159f), new CornerRounding(0.159f, 0.0f)));
        return c(arrayList, 2, 0.5f, 0.5f, false);
    }

    private static RoundedPolygon k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.074f)));
        arrayList.add(new VertexAndRounding(new PointF(0.725f, -0.099f), new CornerRounding(0.476f, 0.0f)));
        return c(arrayList, 4, 0.5f, 0.5f, true);
    }

    private static RoundedPolygon l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.036f)));
        arrayList.add(new VertexAndRounding(new PointF(0.758f, -0.101f), new CornerRounding(0.209f, 0.0f)));
        return c(arrayList, 8, 0.5f, 0.5f, false);
    }

    private static RoundedPolygon m() {
        return Shapes_androidKt.transformed(ShapesKt.star(RoundedPolygon.INSTANCE, 12, 1.0f, 0.8f, f27525d), a(-90.0f));
    }

    private static RoundedPolygon n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(1.237f, 1.236f), new CornerRounding(0.258f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.918f), new CornerRounding(0.233f, 0.0f)));
        return c(arrayList, 4, 0.5f, 0.5f, false);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static RoundedPolygon normalize(@NonNull RoundedPolygon roundedPolygon, boolean z10, @NonNull RectF rectF) {
        float[] fArr = new float[4];
        if (z10) {
            roundedPolygon.calculateMaxBounds(fArr);
        } else {
            roundedPolygon.calculateBounds(fArr);
        }
        RectF rectF2 = new RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
        float fMin = Math.min(rectF.width() / rectF2.width(), rectF.height() / rectF2.height());
        Matrix matrixB = b(fMin, fMin);
        matrixB.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        matrixB.postTranslate(rectF.centerX(), rectF.centerY());
        return Shapes_androidKt.transformed(roundedPolygon, matrixB);
    }

    private static RoundedPolygon o() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.723f, 0.884f), new CornerRounding(0.394f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 1.099f), new CornerRounding(0.398f, 0.0f)));
        return c(arrayList, 6, 0.5f, 0.5f, false);
    }

    private static RoundedPolygon p() {
        return Shapes_androidKt.transformed(ShapesKt.star(RoundedPolygon.INSTANCE, 7, 1.0f, 0.75f, f27525d), a(-90.0f));
    }

    private static RoundedPolygon q() {
        return Shapes_androidKt.transformed(ShapesKt.star(RoundedPolygon.INSTANCE, 9, 1.0f, 0.8f, f27525d), a(-90.0f));
    }

    private static RoundedPolygon r() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 1.096f), new CornerRounding(0.151f, 0.524f)));
        arrayList.add(new VertexAndRounding(new PointF(0.04f, 0.5f), new CornerRounding(0.159f, 0.0f)));
        return c(arrayList, 2, 0.5f, 0.5f, false);
    }

    private static RoundedPolygon s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 1.0f), new CornerRounding(0.148f, 0.417f)));
        arrayList.add(new VertexAndRounding(new PointF(0.0f, 1.0f), new CornerRounding(0.151f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.0f, 0.0f), new CornerRounding(0.148f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.978f, 0.02f), new CornerRounding(0.803f, 0.0f)));
        return c(arrayList, 1, 0.5f, 0.5f, false);
    }

    private static RoundedPolygon t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.37f, 0.187f)));
        arrayList.add(new VertexAndRounding(new PointF(0.416f, 0.049f), new CornerRounding(0.381f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.479f, 0.0f), new CornerRounding(0.095f, 0.0f)));
        return c(arrayList, 8, 0.5f, 0.5f, true);
    }

    private static RoundedPolygon u() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.499f, 1.023f), new CornerRounding(0.241f, 0.778f)));
        arrayList.add(new VertexAndRounding(new PointF(-0.005f, 0.792f), new CornerRounding(0.208f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.073f, 0.258f), new CornerRounding(0.228f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.433f, -0.0f), new CornerRounding(0.491f, 0.0f)));
        return c(arrayList, 1, 0.5f, 0.5f, true);
    }

    private static RoundedPolygon v(float f10) {
        return Shapes_androidKt.transformed(u(), a(f10));
    }

    private static RoundedPolygon w() {
        ArrayList arrayList = new ArrayList();
        PointF pointF = new PointF(0.5f, 0.0f);
        CornerRounding cornerRounding = f27526e;
        arrayList.add(new VertexAndRounding(pointF, cornerRounding));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 0.0f), cornerRounding));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 1.14f), new CornerRounding(0.254f, 0.106f)));
        arrayList.add(new VertexAndRounding(new PointF(0.575f, 0.906f), new CornerRounding(0.253f, 0.0f)));
        return c(arrayList, 1, 0.5f, 0.5f, true);
    }

    private static RoundedPolygon x() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.268f), new CornerRounding(0.016f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.792f, -0.066f), new CornerRounding(0.958f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(1.064f, 0.276f), f27526e));
        arrayList.add(new VertexAndRounding(new PointF(0.501f, 0.946f), new CornerRounding(0.129f, 0.0f)));
        return c(arrayList, 1, 0.5f, 0.5f, true);
    }

    private static RoundedPolygon y() {
        return Shapes_androidKt.transformed(ShapesKt.circle(RoundedPolygon.INSTANCE), b(1.0f, 0.64f));
    }

    private static RoundedPolygon z(float f10) {
        return Shapes_androidKt.transformed(y(), a(f10));
    }

    static class VertexAndRounding {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PointF f27527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CornerRounding f27528b;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(float f10, float f11) {
            float fCos = (float) ((((double) this.f27527a.y) * Math.cos(r0.x)) + ((double) f10));
            float fSin = (float) ((((double) this.f27527a.y) * Math.sin(r0.x)) + ((double) f11));
            PointF pointF = this.f27527a;
            pointF.x = fCos;
            pointF.y = fSin;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(float f10, float f11) {
            this.f27527a.offset(-f10, -f11);
            PointF pointF = this.f27527a;
            float fAtan2 = (float) Math.atan2(pointF.y, pointF.x);
            PointF pointF2 = this.f27527a;
            float fHypot = (float) Math.hypot(pointF2.x, pointF2.y);
            PointF pointF3 = this.f27527a;
            pointF3.x = fAtan2;
            pointF3.y = fHypot;
        }

        private VertexAndRounding(PointF pointF) {
            this(pointF, CornerRounding.Unrounded);
        }

        private VertexAndRounding(PointF pointF, CornerRounding cornerRounding) {
            this.f27527a = pointF;
            this.f27528b = cornerRounding;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static RoundedPolygon normalize(@NonNull RoundedPolygon roundedPolygon, boolean z10) {
        return normalize(roundedPolygon, z10, new RectF(0.0f, 0.0f, 1.0f, 1.0f));
    }
}
