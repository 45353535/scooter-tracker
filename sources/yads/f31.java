package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f31 {
    public static boolean a(d31 d31Var, Map map) {
        Bitmap bitmap = (Bitmap) map.get(d31Var.f109733c);
        return (bitmap != null && bitmap.getWidth() > 1 && bitmap.getHeight() > 1) || !d31Var.f109736f;
    }
}
