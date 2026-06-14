package net.pubnative.lite.sdk.views.shape.path.parser;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public class PathInfo {
    private final float height;
    private final Path path;
    private final float width;

    PathInfo(Path path, float f10, float f11) {
        this.path = path;
        path.computeBounds(new RectF(), true);
        if (f10 <= 0.0f && f11 <= 0.0f) {
            f10 = (float) Math.ceil(r0.width());
            f11 = (float) Math.ceil(r0.height());
            path.offset(((float) Math.floor(r0.left)) * (-1.0f), Math.round(r0.top) * (-1.0f));
        }
        this.width = f10;
        this.height = f11;
    }

    public float getHeight() {
        return this.height;
    }

    public float getWidth() {
        return this.width;
    }

    public void transform(Matrix matrix, Path path) {
        this.path.transform(matrix, path);
    }
}
