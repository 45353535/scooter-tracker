package pd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f98234a = new i();

    private i() {
    }

    public static final BitmapFactory.Options a() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return options;
    }

    public static final Bitmap b(byte[] byteImage, BitmapFactory.Options bitmapFactoryOptions) {
        Intrinsics.checkNotNullParameter(byteImage, "byteImage");
        Intrinsics.checkNotNullParameter(bitmapFactoryOptions, "bitmapFactoryOptions");
        return j.c(byteImage, bitmapFactoryOptions);
    }
}
