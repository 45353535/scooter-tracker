package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.my.target.common.models.ImageData;
import com.my.target.u5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class a3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WeakHashMap f59091e = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f59093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59094c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f59095d;

    public class a implements u5.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageData f59096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f59097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f59098c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p5 f59099d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f59100e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f59101f;

        public a(ImageData imageData, String str, Context context, p5 p5Var, AtomicInteger atomicInteger, b bVar) {
            this.f59096a = imageData;
            this.f59097b = str;
            this.f59098c = context;
            this.f59099d = p5Var;
            this.f59100e = atomicInteger;
            this.f59101f = bVar;
        }

        public final void b() {
            if (this.f59100e.decrementAndGet() == 0) {
                this.f59101f.a(true);
            }
        }

        @Override // com.my.target.u5.a
        public void a(Bitmap bitmap) {
            this.f59096a.setData(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (this.f59096a.getHeight() == 0 || this.f59096a.getWidth() == 0) {
                this.f59096a.setHeight(height);
                this.f59096a.setWidth(width);
            }
            int width2 = this.f59096a.getWidth();
            int height2 = this.f59096a.getHeight();
            if (width2 != width || height2 != height) {
                String str = String.format(Locale.getDefault(), "JSON image params (%d x %d) differ than loaded bitmap params (%d x %d)", Integer.valueOf(width2), Integer.valueOf(height2), Integer.valueOf(width), Integer.valueOf(height));
                gb.d(str);
                a3.this.a(str, this.f59097b, this.f59098c);
            }
            b();
        }

        @Override // com.my.target.u5.a
        public void a() {
            this.f59099d.f60519b.c(0, 4001, "imageUrl=" + this.f59097b);
            b();
        }
    }

    public interface b {
        void a(boolean z10);
    }

    public a3(List list) {
        this.f59092a = list;
    }

    public static a3 a(ImageData imageData) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(imageData);
        return a(arrayList);
    }

    public static a3 b(List list) {
        return new a3(list);
    }

    public static void b(ImageData imageData, ImageView imageView) {
        a(imageData, imageView, (b) null);
    }

    public void b(Context context) {
        if (this.f59092a.isEmpty()) {
            a();
        } else {
            a(new b() { // from class: k5.e
                @Override // com.my.target.a3.b
                public final void a(boolean z10) {
                    this.f86020a.a(z10);
                }
            }, context.getApplicationContext());
        }
    }

    public static a3 a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new p5((ImageData) it.next(), h0.f59787e));
        }
        return b(arrayList);
    }

    public final /* synthetic */ void b() {
        b bVar = this.f59093b;
        if (bVar != null) {
            bVar.a(true);
            this.f59093b = null;
        }
    }

    public static void a(final ImageData imageData, ImageView imageView, final b bVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            gb.b("ImageLoaderUtils: Method loadAndDisplay called from worker thread");
            return;
        }
        WeakHashMap weakHashMap = f59091e;
        if (weakHashMap.get(imageView) == imageData) {
            return;
        }
        weakHashMap.remove(imageView);
        if (imageData.getBitmap() != null) {
            a(imageData.getBitmap(), imageView);
            return;
        }
        weakHashMap.put(imageView, imageData);
        final WeakReference weakReference = new WeakReference(imageView);
        a(imageData).a(new b() { // from class: k5.d
            @Override // com.my.target.a3.b
            public final void a(boolean z10) {
                com.my.target.a3.a(weakReference, imageData, bVar, z10);
            }
        }).b(imageView.getContext());
    }

    public static /* synthetic */ void a(WeakReference weakReference, ImageData imageData, b bVar, boolean z10) {
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            WeakHashMap weakHashMap = f59091e;
            if (imageData == ((ImageData) weakHashMap.get(imageView))) {
                weakHashMap.remove(imageView);
                Bitmap bitmap = imageData.getBitmap();
                if (bitmap != null) {
                    a(bitmap, imageView);
                }
            }
        }
        if (bVar != null) {
            bVar.a(imageData.getBitmap() != null);
        }
    }

    public static void a(ImageData imageData, ImageView imageView) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            gb.b("ImageLoaderUtils: Method cancel called from worker thread");
            return;
        }
        WeakHashMap weakHashMap = f59091e;
        if (weakHashMap.get(imageView) == imageData) {
            weakHashMap.remove(imageView);
        }
    }

    public static void a(Bitmap bitmap, ImageView imageView) {
        if (imageView instanceof ma) {
            ((ma) imageView).setImageBitmap(bitmap, true);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    public a3 a(b bVar) {
        this.f59093b = bVar;
        return this;
    }

    public a3 a(int i10, String str) {
        this.f59094c = i10;
        this.f59095d = str;
        return this;
    }

    public final /* synthetic */ void a(boolean z10) {
        a();
    }

    public void a(Context context) {
        if (f0.a()) {
            gb.b("ImageLoaderUtils: Method load called from main thread");
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        a(new b() { // from class: k5.c
            @Override // com.my.target.a3.b
            public final void a(boolean z10) {
                countDownLatch.countDown();
            }
        }, context);
        try {
            countDownLatch.await();
            gb.a("ImageLoaderUtils: success media loading");
        } catch (InterruptedException unused) {
            gb.a("ImageLoaderUtils: awaiting media files load failed");
        }
    }

    public void a(String str, String str2, Context context) {
        q5 q5VarC = q5.a("Bad value").f(str).a(Math.max(this.f59094c, 0)).c(str2);
        String str3 = this.f59095d;
        if (str3 == null) {
            str3 = null;
        }
        q5VarC.d(str3).b(context);
    }

    public void a() {
        if (this.f59093b == null) {
            return;
        }
        f0.f(new Runnable() { // from class: k5.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f85990b.b();
            }
        });
    }

    public final void a(b bVar, Context context) {
        AtomicInteger atomicInteger = new AtomicInteger(this.f59092a.size());
        int i10 = 0;
        for (p5 p5Var : this.f59092a) {
            ImageData imageData = (ImageData) p5Var.f60518a;
            if (imageData.getBitmap() != null) {
                atomicInteger.decrementAndGet();
                i10++;
            } else {
                String url = imageData.getUrl();
                b bVar2 = bVar;
                z2.a().b(url, new a(imageData, url, context, p5Var, atomicInteger, bVar2), context);
                bVar = bVar2;
            }
        }
        b bVar3 = bVar;
        if (i10 == this.f59092a.size()) {
            bVar3.a(true);
        }
    }
}
