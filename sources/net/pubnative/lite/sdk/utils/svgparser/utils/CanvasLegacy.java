package net.pubnative.lite.sdk.utils.svgparser.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class CanvasLegacy {
    public static final int ALL_SAVE_FLAG;
    public static final int MATRIX_SAVE_FLAG;
    private static final Method SAVE;
    private static final Method SAVE_LAYER;

    static {
        try {
            MATRIX_SAVE_FLAG = ((Integer) Canvas.class.getField("MATRIX_SAVE_FLAG").get(null)).intValue();
            ALL_SAVE_FLAG = ((Integer) Canvas.class.getField("ALL_SAVE_FLAG").get(null)).intValue();
            Class cls = Integer.TYPE;
            SAVE = Canvas.class.getMethod("save", cls);
            SAVE_LAYER = Canvas.class.getMethod("saveLayer", RectF.class, Paint.class, cls);
        } catch (Throwable th2) {
            throw sneakyThrow(th2);
        }
    }

    public static void save(Canvas canvas, int i10) {
        try {
            SAVE.invoke(canvas, Integer.valueOf(i10));
        } catch (Throwable th2) {
            throw sneakyThrow(th2);
        }
    }

    public static void saveLayer(Canvas canvas, RectF rectF, Paint paint, int i10) {
        try {
            SAVE_LAYER.invoke(canvas, rectF, paint, Integer.valueOf(i10));
        } catch (Throwable th2) {
            throw sneakyThrow(th2);
        }
    }

    private static RuntimeException sneakyThrow(Throwable th2) {
        if (th2 != null) {
            return (RuntimeException) sneakyThrow0(th2);
        }
        throw new NullPointerException(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP);
    }

    private static <T extends Throwable> T sneakyThrow0(Throwable th2) throws Throwable {
        throw th2;
    }
}
