package dd;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;
import pd.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f68657a = new a();

    /* JADX INFO: renamed from: dd.a$a, reason: collision with other inner class name */
    public static final class PixelCopyOnPixelCopyFinishedListenerC0855a implements PixelCopy$OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f68658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f68659b;

        PixelCopyOnPixelCopyFinishedListenerC0855a(b bVar, Bitmap bitmap) {
            this.f68658a = bVar;
            this.f68659b = bitmap;
        }

        public void onPixelCopyFinished(int i10) {
            if (i10 == 0) {
                this.f68658a.a(this.f68659b);
            } else {
                this.f68658a.a();
            }
        }
    }

    private a() {
    }

    public final void a(View view, Handler handler, Bitmap.Config config, b screenshotListener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(screenshotListener, "screenshotListener");
        if (Build.VERSION.SDK_INT < 26) {
            screenshotListener.a();
            return;
        }
        Window windowH = k0.h(view);
        if (windowH == null) {
            screenshotListener.a();
            return;
        }
        Rect rectI = k0.i(view);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rectI.width(), rectI.height(), config);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "{\n            Bitmap.cre…ight(), config)\n        }");
            try {
                PixelCopy.request(windowH, rectI, bitmapCreateBitmap, new PixelCopyOnPixelCopyFinishedListenerC0855a(screenshotListener, bitmapCreateBitmap), handler);
            } catch (Throwable unused) {
                screenshotListener.a();
            }
        } catch (Throwable unused2) {
            screenshotListener.a();
        }
    }
}
