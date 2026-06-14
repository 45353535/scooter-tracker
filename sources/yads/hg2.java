package yads;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class hg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final or f111584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f111585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f111586c;

    public /* synthetic */ hg2(Context context) {
        this(new or(context, 0));
    }

    public final Bitmap a(d31 d31Var) {
        String str = d31Var.f109733c;
        Bitmap bitmap = (Bitmap) this.f111585b.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        c83 c83Var = j72.f112253c.a(this.f111584a.f114394a).f112256b;
        String str2 = d31Var.f109733c;
        Bitmap bitmapA = c83Var.a(str2);
        if (bitmapA != null && bitmapA.getWidth() == 1 && bitmapA.getHeight() == 1) {
            bitmapA = Bitmap.createScaledBitmap(bitmapA, d31Var.f109731a, d31Var.f109732b, false);
            c83Var.a(str2, bitmapA);
        }
        if (bitmapA == null) {
            return null;
        }
        this.f111585b.put(str, bitmapA);
        return bitmapA;
    }

    public hg2(or orVar) {
        this.f111584a = orVar;
        this.f111585b = new LinkedHashMap();
        this.f111586c = new LinkedHashMap();
    }
}
