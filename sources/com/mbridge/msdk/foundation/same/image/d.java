package com.mbridge.msdk.foundation.same.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f48660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f48661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48662c;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f48663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.image.c f48664b;

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$a$a, reason: collision with other inner class name */
        class RunnableC0515a implements Runnable {
            RunnableC0515a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f48664b.onFailedLoad("create download request error", aVar.f48663a);
            }
        }

        a(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
            this.f48663a = str;
            this.f48664b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadRequest downloadRequestA = d.this.a(o0.d(this.f48663a), this.f48663a, null, this.f48664b);
            if (downloadRequestA != null) {
                downloadRequestA.start();
                return;
            }
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "createDownloadRequest error");
            }
            if (this.f48664b == null) {
                return;
            }
            d.this.f48661b.post(new RunnableC0515a());
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f48667a = new d(null);
    }

    private static final class c implements OnDownloadStateListener<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f48668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f48669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f48670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f48671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f48672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.same.image.c f48673f;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a();
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f48675a;

            b(String str) {
                this.f48675a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f48673f.onFailedLoad(c.this.f48672e, this.f48675a);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "callbackForFailed error", e10);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$c$c, reason: collision with other inner class name */
        class RunnableC0516c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f48677a;

            RunnableC0516c(Bitmap bitmap) {
                this.f48677a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f48673f.onSuccessLoad(this.f48677a, c.this.f48672e);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "callbackForSuccess error", e10);
                    }
                }
            }
        }

        public c(Handler handler, ThreadPoolExecutor threadPoolExecutor, String str, String str2, String str3, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
            this.f48669b = handler;
            this.f48668a = threadPoolExecutor;
            this.f48672e = str;
            this.f48670c = str2;
            this.f48671d = str3;
            this.f48673f = cVar;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            b();
            this.f48668a.execute(new a());
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            if (MBridgeConstans.DEBUG) {
                q0.a("CommonImageLoaderRefactor", "onDownloadError imageUrl = " + downloadError.getException().getLocalizedMessage());
            }
            a(downloadError.getException().getLocalizedMessage());
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage<Object> downloadMessage) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.f48673f == null) {
                return;
            }
            try {
                Bitmap bitmapB = d.b(this.f48670c + this.f48671d);
                if (bitmapB == null) {
                    a("bitmap decode failed");
                    return;
                }
                Bitmap bitmapA = a(bitmapB, null);
                if (bitmapA == null) {
                    a("bitmap transformation failed");
                } else {
                    a(bitmapA);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.a("CommonImageLoaderRefactor", "onDownloadComplete decodeBitmap error = " + e10.getLocalizedMessage());
                }
                a("bitmap decode failed");
            }
        }

        private void b() {
            File file;
            if (MBridgeConstans.DEBUG) {
                q0.a("CommonImageLoaderRefactor", "onDownloadComplete imageUrl = " + this.f48672e + " imagePath = " + this.f48670c + this.f48671d);
                try {
                    file = new File(this.f48670c + this.f48671d);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "onDownloadComplete error", e10);
                    }
                    file = null;
                }
                if (file == null || !file.isFile() || !file.exists()) {
                    q0.b("CommonImageLoaderRefactor", "onDownloadComplete file not exist");
                    return;
                }
                q0.a("CommonImageLoaderRefactor", "onDownloadComplete file size = " + file.length());
            }
        }

        private void a(String str) {
            if (this.f48673f == null) {
                return;
            }
            this.f48669b.post(new b(str));
        }

        private Bitmap a(Bitmap bitmap, g gVar) {
            if (gVar != null) {
                try {
                    return gVar.a(bitmap);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("CommonImageLoaderRefactor", "handlerImageTransformation error", e10);
                    }
                }
            }
            return bitmap;
        }

        private void a(Bitmap bitmap) {
            if (this.f48673f == null) {
                return;
            }
            this.f48669b.post(new RunnableC0516c(bitmap));
        }
    }

    /* synthetic */ d(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap b(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = true;
        return BitmapFactory.decodeFile(str, options);
    }

    public Bitmap c(String str) {
        if (MBridgeConstans.DEBUG) {
            q0.a("CommonImageLoaderRefactor", "getImageBitmapByUrl imageUrl = " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.f48662c + o0.d(str);
        File file = new File(str2);
        if (file.isFile() && file.exists()) {
            try {
                return b(str2);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonImageLoaderRefactor", "getImageBitmapByUrl error", e10);
                }
            }
        }
        return null;
    }

    public boolean d(String str) {
        File file;
        if (MBridgeConstans.DEBUG) {
            q0.a("CommonImageLoaderRefactor", "isImageFileExists imageUrl = " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            try {
                file = new File(this.f48662c + o0.d(str));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("CommonImageLoaderRefactor", "isImageFileExists error", e10);
                }
                file = null;
            }
            if (file == null || !file.isFile()) {
                return false;
            }
            return file.exists();
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "isImageFileExists error", e11);
            }
            return false;
        }
    }

    private d() {
        this.f48661b = new Handler(Looper.getMainLooper());
        this.f48662c = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_IMG) + File.separator;
        this.f48660a = f.b();
    }

    public static d a() {
        return b.f48667a;
    }

    private Runnable a(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        return new a(str, gVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadRequest<?> a(String str, String str2, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        try {
            return MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str2, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_IMAGE)).withReadTimeout(com.mbridge.msdk.foundation.same.a.f48609u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.f48608t).withWriteTimeout(com.mbridge.msdk.foundation.same.a.f48607s).withDownloadPriority(DownloadPriority.LOW).withHttpRetryCounter(1).withDirectoryPathInternal(this.f48662c).withDownloadStateListener(new c(this.f48661b, this.f48660a, str2, this.f48662c, str, gVar, cVar)).with("download_scene", "download_image").withProgressStateListener(null).withTimeout(60000L).with("do_us_fi_re", Boolean.FALSE.toString()).build();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "createDownloadRequest error", e10);
            }
            return null;
        }
    }

    public void b(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        try {
            this.f48660a.execute(a(str, gVar, cVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonImageLoaderRefactor", "loadImage error", e10);
            }
        }
    }
}
