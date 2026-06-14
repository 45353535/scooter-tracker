package c0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.collection.SieveCacheKt;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil.base.R$id;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import hh.t;
import java.io.Closeable;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r.a;
import t.b;
import z.c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Bitmap.Config[] f6436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Bitmap.Config f6437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final hh.t f6438c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[q.f.values().length];
            iArr[q.f.MEMORY_CACHE.ordinal()] = 1;
            iArr[q.f.MEMORY.ordinal()] = 2;
            iArr[q.f.DISK.ordinal()] = 3;
            iArr[q.f.NETWORK.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[z.h.values().length];
            iArr3[z.h.FILL.ordinal()] = 1;
            iArr3[z.h.FIT.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f6436a = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f6437b = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f6438c = new t.a().e();
    }

    public static final void a(a.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    public static final t.a b(t.a aVar, String str) {
        int iU0 = StringsKt.u0(str, ':', 0, false, 6, null);
        if (iU0 == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iU0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String string = StringsKt.v1(strSubstring).toString();
        String strSubstring2 = str.substring(iU0 + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        aVar.d(string, strSubstring2);
        return aVar;
    }

    public static final int c(Context context, double d10) {
        int largeMemoryClass;
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        double d11 = 1024;
        return (int) (d10 * ((double) largeMemoryClass) * d11 * d11);
    }

    public static final void d(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final double e(Context context) {
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Bitmap.Config f() {
        return f6437b;
    }

    public static final o.c g(b.a aVar) {
        return aVar instanceof t.c ? ((t.c) aVar).d() : o.c.f96189b;
    }

    public static final String h(Uri uri) {
        return (String) CollectionsKt.firstOrNull((List) uri.getPathSegments());
    }

    public static final int i(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final String j(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || StringsKt.y0(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt.i1(StringsKt.k1(StringsKt.s1(StringsKt.s1(str, '#', null, 2, null), '?', null, 2, null), IOUtils.DIR_SEPARATOR_UNIX, null, 2, null), '.', ""));
    }

    public static final int k(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final y.s l(View view) {
        y.s sVar;
        int i10 = R$id.f6861a;
        Object tag = view.getTag(i10);
        y.s sVar2 = tag instanceof y.s ? (y.s) tag : null;
        if (sVar2 != null) {
            return sVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(i10);
                sVar = tag2 instanceof y.s ? (y.s) tag2 : null;
                if (sVar == null) {
                    sVar = new y.s(view);
                    view.addOnAttachStateChangeListener(sVar);
                    view.setTag(i10, sVar);
                }
            } finally {
            }
        }
        return sVar;
    }

    public static final File m(Context context) {
        File cacheDir = context.getCacheDir();
        cacheDir.mkdirs();
        return cacheDir;
    }

    public static final z.h n(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i10 = scaleType == null ? -1 : a.$EnumSwitchMapping$1[scaleType.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? z.h.FIT : z.h.FILL;
    }

    public static final Bitmap.Config[] o() {
        return f6436a;
    }

    public static final int p(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean q(Uri uri) {
        return Intrinsics.areEqual(uri.getScheme(), C4240b4.i.f42616b) && Intrinsics.areEqual(h(uri), "android_asset");
    }

    public static final boolean r() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean s(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    public static final boolean t(b.a aVar) {
        return (aVar instanceof t.c) && ((t.c) aVar).e();
    }

    public static final boolean u(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
    }

    public static final hh.t v(hh.t tVar) {
        return tVar == null ? f6438c : tVar;
    }

    public static final y.n w(y.n nVar) {
        return nVar == null ? y.n.f108315d : nVar;
    }

    public static final y.q x(y.q qVar) {
        return qVar == null ? y.q.f108329c : qVar;
    }

    public static final int y(String str, int i10) {
        Long lX = StringsKt.x(str);
        if (lX == null) {
            return i10;
        }
        long jLongValue = lX.longValue();
        if (jLongValue > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final int z(z.c cVar, z.h hVar) {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).f119120a;
        }
        int i10 = a.$EnumSwitchMapping$2[hVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new lf.m();
    }
}
