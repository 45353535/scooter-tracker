package net.pubnative.lite.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.RejectedExecutionException;
import net.pubnative.lite.sdk.utils.svgparser.SVG;

/* JADX INFO: loaded from: classes3.dex */
public class PNBitmapDownloader {
    private static final String TAG = "PNBitmapDownloader";
    private final Runnable downloadTask = new Runnable() { // from class: net.pubnative.lite.sdk.utils.PNBitmapDownloader.1
        HttpURLConnection connection = null;

        @Override // java.lang.Runnable
        public void run() {
            HttpURLConnection httpURLConnection;
            Bitmap bitmapDecodeStream;
            try {
                try {
                    try {
                        try {
                            URL url = new URL(PNBitmapDownloader.this.mURL);
                            this.connection = (HttpURLConnection) url.openConnection();
                            InputStream inputStream = url.openConnection().getInputStream();
                            BitmapFactory.decodeStream(inputStream, new Rect(), PNBitmapDownloader.this.getBitmapOptionsDecodingBounds(true));
                            inputStream.close();
                            InputStream inputStream2 = url.openConnection().getInputStream();
                            if (url.openConnection().getContentType().equals("image/svg+xml")) {
                                Picture pictureRenderToPicture = SVG.getFromInputStream(inputStream2).renderToPicture();
                                bitmapDecodeStream = Bitmap.createBitmap(pictureRenderToPicture.getWidth(), pictureRenderToPicture.getHeight(), Bitmap.Config.ARGB_8888);
                                new Canvas(bitmapDecodeStream).drawPicture(pictureRenderToPicture);
                            } else {
                                bitmapDecodeStream = BitmapFactory.decodeStream(inputStream2, null, PNBitmapDownloader.this.getBitmapOptionsDecodingBounds(false));
                            }
                            inputStream2.close();
                            PNBitmapLruCache.addBitmapToMemoryCache(PNBitmapDownloader.this.mURL, bitmapDecodeStream);
                            PNBitmapDownloader.this.invokeLoad(bitmapDecodeStream);
                            HttpURLConnection httpURLConnection2 = this.connection;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                        } catch (RuntimeException e10) {
                            PNBitmapDownloader.this.invokeFail(e10);
                            httpURLConnection = this.connection;
                            if (httpURLConnection == null) {
                                return;
                            }
                            httpURLConnection.disconnect();
                        }
                    } catch (Exception e11) {
                        PNBitmapDownloader.this.invokeFail(e11);
                        httpURLConnection = this.connection;
                        if (httpURLConnection == null) {
                            return;
                        }
                        httpURLConnection.disconnect();
                    }
                } catch (Error e12) {
                    PNBitmapDownloader.this.invokeFail(new Exception(e12.toString()));
                    httpURLConnection = this.connection;
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                HttpURLConnection httpURLConnection3 = this.connection;
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                throw th2;
            }
        }
    };
    private final Runnable loadFromFileSystemTask = new Runnable() { // from class: net.pubnative.lite.sdk.utils.PNBitmapDownloader.2
        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(Uri.parse(PNBitmapDownloader.this.mURL).getEncodedPath(), PNBitmapDownloader.this.getBitmapOptionsDecodingBounds(false));
                PNBitmapLruCache.addBitmapToMemoryCache(PNBitmapDownloader.this.mURL, bitmapDecodeFile);
                PNBitmapDownloader.this.invokeLoad(bitmapDecodeFile);
            } catch (Error e10) {
                PNBitmapDownloader.this.invokeFail(new Exception(e10.toString()));
            } catch (RuntimeException e11) {
                PNBitmapDownloader.this.invokeFail(e11);
            } catch (Exception e12) {
                PNBitmapDownloader.this.invokeFail(e12);
            }
        }
    };
    private DownloadListener mDownloadListener;
    private Handler mHandler;
    private int mHeight;
    private String mURL;
    private int mWidth;

    public interface DownloadListener {
        void onDownloadFailed(String str, Exception exc);

        void onDownloadFinish(String str, Bitmap bitmap);
    }

    public static /* synthetic */ void a(PNBitmapDownloader pNBitmapDownloader, Bitmap bitmap) {
        DownloadListener downloadListener = pNBitmapDownloader.mDownloadListener;
        pNBitmapDownloader.mDownloadListener = null;
        if (downloadListener != null) {
            downloadListener.onDownloadFinish(pNBitmapDownloader.mURL, bitmap);
        }
    }

    public static /* synthetic */ void b(PNBitmapDownloader pNBitmapDownloader, Exception exc) {
        DownloadListener downloadListener = pNBitmapDownloader.mDownloadListener;
        pNBitmapDownloader.mDownloadListener = null;
        if (downloadListener != null) {
            downloadListener.onDownloadFailed(pNBitmapDownloader.mURL, exc);
        }
    }

    private synchronized void downloadImage() {
        try {
            BitmapDownloaderExecutor.getExecutor().submit(this.downloadTask);
        } catch (RejectedExecutionException e10) {
            Logger.e(TAG, "Task submission rejected: " + e10.getMessage());
            invokeFail(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BitmapFactory.Options getBitmapOptionsDecodingBounds(boolean z10) {
        int i10;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i11 = this.mWidth;
        if (i11 > 0 && (i10 = this.mHeight) > 0 && !z10) {
            options.inSampleSize = calculateInSampleSize(options, i11, i10);
        }
        options.inJustDecodeBounds = z10;
        return options;
    }

    private void loadCachedImage() {
        BitmapDownloaderExecutor.getExecutor().submit(this.loadFromFileSystemTask);
    }

    protected int calculateInSampleSize(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 <= i11 && i13 <= i10) {
            return 1;
        }
        int i15 = i12 / 2;
        int i16 = i13 / 2;
        while (i15 / i14 >= i11 && i16 / i14 >= i10) {
            i14 *= 2;
        }
        return i14;
    }

    public synchronized void download(String str, DownloadListener downloadListener) {
        download(str, 0, 0, downloadListener);
    }

    protected void invokeFail(final Exception exc) {
        this.mHandler.post(new Runnable() { // from class: net.pubnative.lite.sdk.utils.f
            @Override // java.lang.Runnable
            public final void run() {
                PNBitmapDownloader.b(this.f95973b, exc);
            }
        });
    }

    protected void invokeLoad(final Bitmap bitmap) {
        this.mHandler.post(new Runnable() { // from class: net.pubnative.lite.sdk.utils.e
            @Override // java.lang.Runnable
            public final void run() {
                PNBitmapDownloader.a(this.f95971b, bitmap);
            }
        });
    }

    public synchronized void download(String str, int i10, int i11, DownloadListener downloadListener) {
        this.mHandler = new Handler(Looper.getMainLooper());
        if (downloadListener == null) {
            Log.w(TAG, "download won't start since there is no assigned listener to It");
            return;
        }
        this.mDownloadListener = downloadListener;
        this.mURL = str;
        this.mWidth = i10;
        this.mHeight = i11;
        if (TextUtils.isEmpty(str)) {
            invokeFail(new Exception("Image URL is empty"));
            return;
        }
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            if (URLUtil.isFileUrl(str)) {
                loadCachedImage();
                return;
            } else {
                invokeFail(new Exception("Wrong file URL!"));
                return;
            }
        }
        downloadImage();
    }
}
