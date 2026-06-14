package cc;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Size;
import android.widget.ImageView;
import com.ironsource.Sd;
import io.bidmachine.core.h;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: cc.a$a, reason: collision with other inner class name */
    class C0148a implements c {
        C0148a() {
        }

        @Override // cc.a.c
        public void a(ImageView imageView, Drawable drawable) {
            imageView.setImageDrawable(drawable);
        }

        @Override // cc.a.c
        public void onError(String str) {
            io.bidmachine.core.a.d(str);
        }
    }

    private static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f6683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f6684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final WeakReference f6685d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final c f6686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Drawable f6687f;

        /* JADX INFO: renamed from: cc.a$b$a, reason: collision with other inner class name */
        class RunnableC0149a implements Runnable {
            RunnableC0149a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ImageView imageView = (ImageView) b.this.f6685d.get();
                if (imageView == null || b.this.f6687f == null) {
                    b.this.f6686e.onError("Target ImageView or Bitmap is invalid");
                } else {
                    b.this.f6686e.a(imageView, b.this.f6687f);
                }
            }
        }

        b(Context context, Uri uri, ImageView imageView, c cVar) {
            this.f6684c = context;
            this.f6683b = uri;
            this.f6685d = new WeakReference(imageView);
            this.f6686e = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                InputStream inputStreamOpenInputStream = this.f6684c.getContentResolver().openInputStream(this.f6683b);
                try {
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    h.i(inputStreamOpenInputStream);
                    if (options.outWidth != 0 && options.outHeight != 0) {
                        int iC = a.c(this.f6684c);
                        options.inSampleSize = a.a(options, iC, a.b(iC));
                        options.inJustDecodeBounds = false;
                        inputStreamOpenInputStream = this.f6684c.getContentResolver().openInputStream(this.f6683b);
                        try {
                            this.f6687f = new BitmapDrawable(this.f6684c.getResources(), BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options));
                            h.i(inputStreamOpenInputStream);
                            h.U(new RunnableC0149a());
                            return;
                        } finally {
                        }
                    }
                    this.f6686e.onError("Image size is (0;0)");
                } finally {
                }
            } catch (Throwable th2) {
                String message = th2.getMessage();
                c cVar = this.f6686e;
                if (message == null) {
                    message = "ImagePreparation error";
                }
                cVar.onError(message);
            }
        }
    }

    public interface c {
        void a(ImageView imageView, Drawable drawable);

        void onError(String str);
    }

    public static int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outWidth;
        int i13 = options.outHeight;
        int i14 = 1;
        while (true) {
            if (i12 / i14 <= i10 && i13 / i14 <= i11) {
                return i14;
            }
            i14 *= 2;
        }
    }

    public static int b(int i10) {
        if (i10 > 700) {
            return 700;
        }
        return i10;
    }

    public static int c(Context context) {
        Size sizeB = h.B(context);
        return Math.min(Sd.c.f41756d, Math.min(sizeB.getWidth(), sizeB.getHeight()));
    }

    public static void d(Context context, ImageView imageView, Uri uri, Drawable drawable) {
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            e(context, uri, imageView, new C0148a());
        }
    }

    private static void e(Context context, Uri uri, ImageView imageView, c cVar) {
        if (cVar == null) {
            return;
        }
        if (uri == null || TextUtils.isEmpty(uri.getPath())) {
            cVar.onError("ImagePath is invalid");
        } else if (imageView == null) {
            cVar.onError("Target ImageView is null");
        } else {
            cc.b.a().execute(new b(context, uri, imageView, cVar));
        }
    }
}
