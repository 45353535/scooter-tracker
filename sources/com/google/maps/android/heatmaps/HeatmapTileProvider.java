package com.google.maps.android.heatmaps;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.collection.LongSparseArray;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.quadtree.PointQuadTree;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class HeatmapTileProvider implements TileProvider {
    public static final Gradient DEFAULT_GRADIENT;
    public static final double DEFAULT_OPACITY = 0.7d;
    public static final int DEFAULT_RADIUS = 20;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f34031k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f34032l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PointQuadTree f34033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Collection f34034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bounds f34035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Gradient f34037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f34038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double[] f34039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f34040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double[] f34041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f34042j;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Collection f34043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f34044b = 20;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Gradient f34045c = HeatmapTileProvider.DEFAULT_GRADIENT;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private double f34046d = 0.7d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private double f34047e = 0.0d;

        public HeatmapTileProvider build() {
            if (this.f34043a != null) {
                return new HeatmapTileProvider(this);
            }
            throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
        }

        public Builder data(Collection<LatLng> collection) {
            return weightedData(HeatmapTileProvider.i(collection));
        }

        public Builder gradient(Gradient gradient) {
            this.f34045c = gradient;
            return this;
        }

        public Builder maxIntensity(double d10) {
            this.f34047e = d10;
            return this;
        }

        public Builder opacity(double d10) {
            this.f34046d = d10;
            if (d10 < 0.0d || d10 > 1.0d) {
                throw new IllegalArgumentException("Opacity must be in range [0, 1]");
            }
            return this;
        }

        public Builder radius(int i10) {
            this.f34044b = i10;
            if (i10 < 10 || i10 > 50) {
                throw new IllegalArgumentException("Radius not within bounds.");
            }
            return this;
        }

        public Builder weightedData(Collection<WeightedLatLng> collection) {
            this.f34043a = collection;
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("No input points.");
            }
            return this;
        }
    }

    static {
        int[] iArr = {Color.rgb(102, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 0), Color.rgb(255, 0, 0)};
        f34031k = iArr;
        float[] fArr = {0.2f, 1.0f};
        f34032l = fArr;
        DEFAULT_GRADIENT = new Gradient(iArr, fArr);
    }

    static Bitmap b(double[][] dArr, int[] iArr, double d10) {
        int i10 = iArr[iArr.length - 1];
        double length = ((double) (iArr.length - 1)) / d10;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i11 = 0; i11 < length2; i11++) {
            for (int i12 = 0; i12 < length2; i12++) {
                double d11 = dArr[i12][i11];
                int i13 = (i11 * length2) + i12;
                int i14 = (int) (d11 * length);
                if (d11 == 0.0d) {
                    iArr2[i13] = 0;
                } else if (i14 < iArr.length) {
                    iArr2[i13] = iArr[i14];
                } else {
                    iArr2[i13] = i10;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return bitmapCreateBitmap;
    }

    private static Tile c(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(512, 512, byteArrayOutputStream.toByteArray());
    }

    static double[][] d(double[][] dArr, double[] dArr2) {
        boolean z10;
        int i10;
        double d10;
        int iFloor = (int) Math.floor(((double) dArr2.length) / 2.0d);
        int length = dArr.length;
        int i11 = length - (iFloor * 2);
        int i12 = iFloor + i11;
        int i13 = i12 - 1;
        boolean z11 = true;
        int i14 = 0;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, length, length);
        int i15 = 0;
        while (true) {
            double d11 = 0.0d;
            if (i15 >= length) {
                break;
            }
            int i16 = i14;
            while (i16 < length) {
                double d12 = dArr[i15][i16];
                if (d12 != d11) {
                    z10 = z11;
                    int i17 = i15 + iFloor;
                    if (i13 < i17) {
                        i17 = i13;
                    }
                    int i18 = i17 + 1;
                    i10 = i14;
                    int i19 = i15 - iFloor;
                    d10 = d11;
                    for (int i20 = iFloor > i19 ? iFloor : i19; i20 < i18; i20++) {
                        double[] dArr4 = dArr3[i20];
                        dArr4[i16] = dArr4[i16] + (dArr2[i20 - i19] * d12);
                    }
                } else {
                    z10 = z11;
                    i10 = i14;
                    d10 = d11;
                }
                i16++;
                z11 = z10;
                i14 = i10;
                d11 = d10;
            }
            i15++;
        }
        int i21 = i14;
        int[] iArr = new int[2];
        iArr[z11 ? 1 : 0] = i11;
        iArr[i21] = i11;
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        for (int i22 = iFloor; i22 < i12; i22++) {
            for (int i23 = i21; i23 < length; i23++) {
                double d13 = dArr3[i22][i23];
                if (d13 != 0.0d) {
                    int i24 = i23 + iFloor;
                    if (i13 < i24) {
                        i24 = i13;
                    }
                    int i25 = i24 + 1;
                    int i26 = i23 - iFloor;
                    for (int i27 = iFloor > i26 ? iFloor : i26; i27 < i25; i27++) {
                        double[] dArr6 = dArr5[i22 - iFloor];
                        int i28 = i27 - iFloor;
                        dArr6[i28] = dArr6[i28] + (dArr2[i27 - i26] * d13);
                    }
                }
            }
        }
        return dArr5;
    }

    static double[] e(int i10, double d10) {
        double[] dArr = new double[(i10 * 2) + 1];
        for (int i11 = -i10; i11 <= i10; i11++) {
            dArr[i11 + i10] = Math.exp(((double) ((-i11) * i11)) / ((2.0d * d10) * d10));
        }
        return dArr;
    }

    static Bounds f(Collection collection) {
        Iterator it = collection.iterator();
        WeightedLatLng weightedLatLng = (WeightedLatLng) it.next();
        double d10 = weightedLatLng.getPoint().f34025x;
        double d11 = weightedLatLng.getPoint().f34025x;
        double d12 = d10;
        double d13 = d11;
        double d14 = weightedLatLng.getPoint().f34026y;
        double d15 = weightedLatLng.getPoint().f34026y;
        while (it.hasNext()) {
            WeightedLatLng weightedLatLng2 = (WeightedLatLng) it.next();
            double d16 = weightedLatLng2.getPoint().f34025x;
            double d17 = weightedLatLng2.getPoint().f34026y;
            if (d16 < d12) {
                d12 = d16;
            }
            if (d16 > d13) {
                d13 = d16;
            }
            if (d17 < d14) {
                d14 = d17;
            }
            if (d17 > d15) {
                d15 = d17;
            }
        }
        return new Bounds(d12, d13, d14, d15);
    }

    private double[] g(int i10) {
        int i11;
        double[] dArr = new double[22];
        if (this.f34042j != 0.0d) {
            for (int i12 = 0; i12 < 22; i12++) {
                dArr[i12] = this.f34042j;
            }
        } else {
            int i13 = 5;
            while (true) {
                if (i13 >= 11) {
                    break;
                }
                dArr[i13] = h(this.f34034b, this.f34035c, i10, (int) (Math.pow(2.0d, i13 - 3) * 1280.0d));
                if (i13 == 5) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        dArr[i14] = dArr[i13];
                    }
                }
                i13++;
            }
            for (i11 = 11; i11 < 22; i11++) {
                dArr[i11] = dArr[10];
            }
        }
        return dArr;
    }

    static double h(Collection collection, Bounds bounds, int i10, int i11) {
        double d10 = bounds.minX;
        double d11 = bounds.maxX;
        double d12 = bounds.minY;
        double d13 = d11 - d10;
        double d14 = bounds.maxY - d12;
        if (d13 <= d14) {
            d13 = d14;
        }
        double d15 = ((double) ((int) (((double) (i11 / (i10 * 2))) + 0.5d))) / d13;
        LongSparseArray longSparseArray = new LongSparseArray();
        Iterator it = collection.iterator();
        double d16 = 0.0d;
        while (it.hasNext()) {
            WeightedLatLng weightedLatLng = (WeightedLatLng) it.next();
            double d17 = weightedLatLng.getPoint().f34025x;
            int i12 = (int) ((weightedLatLng.getPoint().f34026y - d12) * d15);
            long j10 = (int) ((d17 - d10) * d15);
            LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j10);
            if (longSparseArray2 == null) {
                longSparseArray2 = new LongSparseArray();
                longSparseArray.put(j10, longSparseArray2);
            }
            long j11 = i12;
            Double dValueOf = (Double) longSparseArray2.get(j11);
            if (dValueOf == null) {
                dValueOf = Double.valueOf(0.0d);
            }
            double dDoubleValue = dValueOf.doubleValue() + weightedLatLng.getIntensity();
            longSparseArray2.put(j11, Double.valueOf(dDoubleValue));
            if (dDoubleValue > d16) {
                d16 = dDoubleValue;
            }
        }
        return d16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection i(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new WeightedLatLng((LatLng) it.next()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public Tile getTile(int i10, int i11, int i12) {
        double d10 = 1.0d;
        double dPow = 1.0d / Math.pow(2.0d, i12);
        int i13 = this.f34036d;
        double d11 = (((double) i13) * dPow) / 512.0d;
        double d12 = ((2.0d * d11) + dPow) / ((double) ((i13 * 2) + 512));
        double d13 = (((double) i10) * dPow) - d11;
        double d14 = (((double) (i10 + 1)) * dPow) + d11;
        double d15 = (((double) i11) * dPow) - d11;
        double d16 = (((double) (i11 + 1)) * dPow) + d11;
        Collection<WeightedLatLng> arrayList = new ArrayList();
        if (d13 < 0.0d) {
            arrayList = this.f34033a.search(new Bounds(d13 + 1.0d, 1.0d, d15, d16));
            d10 = -1.0d;
        } else if (d14 > 1.0d) {
            arrayList = this.f34033a.search(new Bounds(0.0d, d14 - 1.0d, d15, d16));
        } else {
            d10 = 0.0d;
        }
        Bounds bounds = new Bounds(d13, d14, d15, d16);
        Bounds bounds2 = this.f34035c;
        if (!bounds.intersects(new Bounds(bounds2.minX - d11, bounds2.maxX + d11, bounds2.minY - d11, bounds2.maxY + d11))) {
            return TileProvider.NO_TILE;
        }
        Collection<WeightedLatLng> collectionSearch = this.f34033a.search(bounds);
        if (collectionSearch.isEmpty()) {
            return TileProvider.NO_TILE;
        }
        int i14 = this.f34036d;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, (i14 * 2) + 512, (i14 * 2) + 512);
        for (WeightedLatLng weightedLatLng : collectionSearch) {
            Point point = weightedLatLng.getPoint();
            int i15 = (int) ((point.f34025x - d13) / d12);
            int i16 = (int) ((point.f34026y - d15) / d12);
            double[] dArr2 = dArr[i15];
            dArr2[i16] = dArr2[i16] + weightedLatLng.getIntensity();
        }
        for (WeightedLatLng weightedLatLng2 : arrayList) {
            Point point2 = weightedLatLng2.getPoint();
            int i17 = (int) (((point2.f34025x + d10) - d13) / d12);
            int i18 = (int) ((point2.f34026y - d15) / d12);
            double[] dArr3 = dArr[i17];
            dArr3[i18] = dArr3[i18] + weightedLatLng2.getIntensity();
        }
        return c(b(d(dArr, this.f34039g), this.f34038f, this.f34041i[i12]));
    }

    public void setData(Collection<LatLng> collection) {
        setWeightedData(i(collection));
    }

    public void setGradient(Gradient gradient) {
        this.f34037e = gradient;
        this.f34038f = gradient.b(this.f34040h);
    }

    public void setMaxIntensity(double d10) {
        this.f34042j = d10;
        setWeightedData(this.f34034b);
    }

    public void setOpacity(double d10) {
        this.f34040h = d10;
        setGradient(this.f34037e);
    }

    public void setRadius(int i10) {
        this.f34036d = i10;
        this.f34039g = e(i10, ((double) i10) / 3.0d);
        this.f34041i = g(this.f34036d);
    }

    public void setWeightedData(Collection<WeightedLatLng> collection) {
        this.f34034b = collection;
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("No input points.");
        }
        Bounds boundsF = f(this.f34034b);
        this.f34035c = boundsF;
        this.f34033a = new PointQuadTree(boundsF);
        Iterator it = this.f34034b.iterator();
        while (it.hasNext()) {
            this.f34033a.add((WeightedLatLng) it.next());
        }
        this.f34041i = g(this.f34036d);
    }

    private HeatmapTileProvider(Builder builder) {
        this.f34034b = builder.f34043a;
        this.f34036d = builder.f34044b;
        this.f34037e = builder.f34045c;
        this.f34040h = builder.f34046d;
        this.f34042j = builder.f34047e;
        int i10 = this.f34036d;
        this.f34039g = e(i10, ((double) i10) / 3.0d);
        setGradient(this.f34037e);
        setWeightedData(this.f34034b);
    }
}
