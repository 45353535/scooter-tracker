package androidx.graphics.shapes;

import androidx.graphics.shapes.MeasuredPolygon;
import com.taurusx.tax.f.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013J2\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190\u001dH\u0087\bø\u0001\u0000R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"Landroidx/graphics/shapes/Morph;", "", "start", "Landroidx/graphics/shapes/RoundedPolygon;", "end", "(Landroidx/graphics/shapes/RoundedPolygon;Landroidx/graphics/shapes/RoundedPolygon;)V", "_morphMatch", "", "Lkotlin/Pair;", "Landroidx/graphics/shapes/Cubic;", "morphMatch", "getMorphMatch$annotations", "()V", "getMorphMatch", "()Ljava/util/List;", "asCubics", "progress", "", "calculateBounds", "", "bounds", "approximate", "", "calculateMaxBounds", "forEachCubic", "", "mutableCubic", "Landroidx/graphics/shapes/MutableCubic;", "callback", "Lkotlin/Function1;", y.f66058y, "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Morph {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<Pair<Cubic, Cubic>> _morphMatch;

    @NotNull
    private final RoundedPolygon end;

    @NotNull
    private final RoundedPolygon start;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/graphics/shapes/Morph$Companion;", "", "()V", "match", "", "Lkotlin/Pair;", "Landroidx/graphics/shapes/Cubic;", "p1", "Landroidx/graphics/shapes/RoundedPolygon;", "p2", "match$graphics_shapes_release", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<Pair<Cubic, Cubic>> match$graphics_shapes_release(@NotNull RoundedPolygon p12, @NotNull RoundedPolygon p22) {
            Pair<MeasuredPolygon.MeasuredCubic, MeasuredPolygon.MeasuredCubic> pairCutAtProgress;
            Pair<MeasuredPolygon.MeasuredCubic, MeasuredPolygon.MeasuredCubic> pairCutAtProgress2;
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p22, "p2");
            MeasuredPolygon.Companion companion = MeasuredPolygon.INSTANCE;
            MeasuredPolygon measuredPolygonMeasurePolygon$graphics_shapes_release = companion.measurePolygon$graphics_shapes_release(new AngleMeasurer(p12.getCenterX(), p12.getCenterY()), p12);
            MeasuredPolygon measuredPolygonMeasurePolygon$graphics_shapes_release2 = companion.measurePolygon$graphics_shapes_release(new AngleMeasurer(p22.getCenterX(), p22.getCenterY()), p22);
            DoubleMapper doubleMapperFeatureMapper = FeatureMappingKt.featureMapper(measuredPolygonMeasurePolygon$graphics_shapes_release.getFeatures(), measuredPolygonMeasurePolygon$graphics_shapes_release2.getFeatures());
            float map = doubleMapperFeatureMapper.map(0.0f);
            String unused = MorphKt.LOG_TAG;
            MeasuredPolygon measuredPolygonCutAndShift = measuredPolygonMeasurePolygon$graphics_shapes_release2.cutAndShift(map);
            ArrayList arrayList = new ArrayList();
            MeasuredPolygon.MeasuredCubic measuredCubicComponent2 = (MeasuredPolygon.MeasuredCubic) CollectionsKt.getOrNull(measuredPolygonMeasurePolygon$graphics_shapes_release, 0);
            MeasuredPolygon.MeasuredCubic measuredCubicComponent22 = (MeasuredPolygon.MeasuredCubic) CollectionsKt.getOrNull(measuredPolygonCutAndShift, 0);
            int i10 = 1;
            int i11 = 1;
            while (measuredCubicComponent2 != null && measuredCubicComponent22 != null) {
                float endOutlineProgress = i10 == measuredPolygonMeasurePolygon$graphics_shapes_release.size() ? 1.0f : measuredCubicComponent2.getEndOutlineProgress();
                float fMapBack = i11 == measuredPolygonCutAndShift.size() ? 1.0f : doubleMapperFeatureMapper.mapBack(Utils.positiveModulo(measuredCubicComponent22.getEndOutlineProgress() + map, 1.0f));
                float fMin = Math.min(endOutlineProgress, fMapBack);
                String unused2 = MorphKt.LOG_TAG;
                float f10 = 1.0E-6f + fMin;
                if (endOutlineProgress > f10) {
                    String unused3 = MorphKt.LOG_TAG;
                    pairCutAtProgress = measuredCubicComponent2.cutAtProgress(fMin);
                } else {
                    pairCutAtProgress = TuplesKt.to(measuredCubicComponent2, CollectionsKt.getOrNull(measuredPolygonMeasurePolygon$graphics_shapes_release, i10));
                    i10++;
                }
                MeasuredPolygon.MeasuredCubic measuredCubicComponent1 = pairCutAtProgress.component1();
                measuredCubicComponent2 = pairCutAtProgress.component2();
                if (fMapBack > f10) {
                    String unused4 = MorphKt.LOG_TAG;
                    pairCutAtProgress2 = measuredCubicComponent22.cutAtProgress(Utils.positiveModulo(doubleMapperFeatureMapper.map(fMin) - map, 1.0f));
                } else {
                    pairCutAtProgress2 = TuplesKt.to(measuredCubicComponent22, CollectionsKt.getOrNull(measuredPolygonCutAndShift, i11));
                    i11++;
                }
                MeasuredPolygon.MeasuredCubic measuredCubicComponent12 = pairCutAtProgress2.component1();
                measuredCubicComponent22 = pairCutAtProgress2.component2();
                String unused5 = MorphKt.LOG_TAG;
                arrayList.add(TuplesKt.to(measuredCubicComponent1.getCubic(), measuredCubicComponent12.getCubic()));
            }
            if (measuredCubicComponent2 == null && measuredCubicComponent22 == null) {
                return arrayList;
            }
            throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
        }

        private Companion() {
        }
    }

    public Morph(@NotNull RoundedPolygon start, @NotNull RoundedPolygon end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.start = start;
        this.end = end;
        this._morphMatch = INSTANCE.match$graphics_shapes_release(start, end);
    }

    public static /* synthetic */ float[] calculateBounds$default(Morph morph, float[] fArr, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fArr = new float[4];
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return morph.calculateBounds(fArr, z10);
    }

    public static /* synthetic */ float[] calculateMaxBounds$default(Morph morph, float[] fArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fArr = new float[4];
        }
        return morph.calculateMaxBounds(fArr);
    }

    public static /* synthetic */ void forEachCubic$default(Morph morph, float f10, MutableCubic mutableCubic, Function1 callback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            mutableCubic = new MutableCubic();
        }
        Intrinsics.checkNotNullParameter(mutableCubic, "mutableCubic");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int size = morph.getMorphMatch().size();
        for (int i11 = 0; i11 < size; i11++) {
            mutableCubic.interpolate(morph.getMorphMatch().get(i11).getFirst(), morph.getMorphMatch().get(i11).getSecond(), f10);
            callback.invoke(mutableCubic);
        }
    }

    public static /* synthetic */ void getMorphMatch$annotations() {
    }

    @NotNull
    public final List<Cubic> asCubics(float progress) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int size = this._morphMatch.size();
        Cubic cubic = null;
        Cubic cubic2 = null;
        int i10 = 0;
        while (i10 < size) {
            float[] fArr = new float[8];
            for (int i11 = 0; i11 < 8; i11++) {
                fArr[i11] = Utils.interpolate(this._morphMatch.get(i10).getFirst().getPoints()[i11], this._morphMatch.get(i10).getSecond().getPoints()[i11], progress);
            }
            Cubic cubic3 = new Cubic(fArr);
            if (cubic2 == null) {
                cubic2 = cubic3;
            }
            if (cubic != null) {
                listCreateListBuilder.add(cubic);
            }
            i10++;
            cubic = cubic3;
        }
        if (cubic != null && cubic2 != null) {
            listCreateListBuilder.add(CubicKt.Cubic(cubic.getAnchor0X(), cubic.getAnchor0Y(), cubic.getControl0X(), cubic.getControl0Y(), cubic.getControl1X(), cubic.getControl1Y(), cubic2.getAnchor0X(), cubic2.getAnchor0Y()));
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    @NotNull
    public final float[] calculateBounds() {
        return calculateBounds$default(this, null, false, 3, null);
    }

    @NotNull
    public final float[] calculateMaxBounds(@NotNull float[] bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.start.calculateMaxBounds(bounds);
        float f10 = bounds[0];
        float f11 = bounds[1];
        float f12 = bounds[2];
        float f13 = bounds[3];
        this.end.calculateMaxBounds(bounds);
        bounds[0] = Math.min(f10, bounds[0]);
        bounds[1] = Math.min(f11, bounds[1]);
        bounds[2] = Math.max(f12, bounds[2]);
        bounds[3] = Math.max(f13, bounds[3]);
        return bounds;
    }

    public final void forEachCubic(float progress, @NotNull MutableCubic mutableCubic, @NotNull Function1<? super MutableCubic, Unit> callback) {
        Intrinsics.checkNotNullParameter(mutableCubic, "mutableCubic");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int size = getMorphMatch().size();
        for (int i10 = 0; i10 < size; i10++) {
            mutableCubic.interpolate(getMorphMatch().get(i10).getFirst(), getMorphMatch().get(i10).getSecond(), progress);
            callback.invoke(mutableCubic);
        }
    }

    @NotNull
    public final List<Pair<Cubic, Cubic>> getMorphMatch() {
        return this._morphMatch;
    }

    @NotNull
    public final float[] calculateBounds(@NotNull float[] bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return calculateBounds$default(this, bounds, false, 2, null);
    }

    @NotNull
    public final float[] calculateBounds(@NotNull float[] bounds, boolean approximate) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.start.calculateBounds(bounds, approximate);
        float f10 = bounds[0];
        float f11 = bounds[1];
        float f12 = bounds[2];
        float f13 = bounds[3];
        this.end.calculateBounds(bounds, approximate);
        bounds[0] = Math.min(f10, bounds[0]);
        bounds[1] = Math.min(f11, bounds[1]);
        bounds[2] = Math.max(f12, bounds[2]);
        bounds[3] = Math.max(f13, bounds[3]);
        return bounds;
    }

    public final void forEachCubic(float f10, @NotNull Function1<? super MutableCubic, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        MutableCubic mutableCubic = new MutableCubic();
        int size = getMorphMatch().size();
        for (int i10 = 0; i10 < size; i10++) {
            mutableCubic.interpolate(getMorphMatch().get(i10).getFirst(), getMorphMatch().get(i10).getSecond(), f10);
            callback.invoke(mutableCubic);
        }
    }
}
