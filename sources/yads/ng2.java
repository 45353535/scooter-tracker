package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.collections.ArraysKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ng2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f113870a = lf.i.a(mg2.f113464b);

    public static Bitmap a(String str) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            byte[] bArrDecode = Base64.decode(StringsKt.P0(str, "data:image/png;base64,"), 0);
            boolean z10 = true;
            if (!StringsKt.a0(str, "data:image/png;base64,", false, 2, null)) {
                bArrDecode = !(bArrDecode.length == 0) ? ArraysKt.plus((byte[]) f113870a.getValue(), bArrDecode) : new byte[0];
            }
            if (bArrDecode.length != 0) {
                z10 = false;
            }
            objB = Result.b(!z10 ? BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (Bitmap) (Result.i(objB) ? null : objB);
    }
}
