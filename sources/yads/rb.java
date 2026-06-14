package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f115392a = (long) (Math.floor(Math.random() * 4294967295L) + ((double) 1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f115393b = 0;

    public static Bitmap a(String str) {
        try {
            String strSubstring = str.substring(StringsKt.v0(str, StringUtils.COMMA, 0, false, 6, null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring.length() <= 0) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String a(Object obj) {
        String string = obj != null ? obj.toString() : null;
        return string == null ? "" : string;
    }

    public static boolean a(du duVar) {
        return duVar == null || duVar.a();
    }

    public static final boolean a(Context context) {
        try {
            return cl3.a(context) != null;
        } catch (Throwable unused) {
            return false;
        }
    }
}
