package net.pubnative.lite.sdk.vpaid.helpers;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.enums.VastError;
import net.pubnative.lite.sdk.vpaid.utils.FileUtils;
import net.pubnative.lite.sdk.vpaid.utils.Utils;

/* JADX INFO: loaded from: classes3.dex */
public class FileLoader {
    private static final int CONNECT_TIMEOUT = 10000;
    private static final String LOG_TAG = "FileLoader";
    private static final int READ_TIMEOUT = 10000;
    private static boolean useMobileNetworkForCaching;
    private boolean firstQuartile;
    private final Callback mCallback;
    private volatile HttpURLConnection mConnection;
    private final Context mContext;
    private boolean mIsEndCard;
    private volatile boolean mIsFileFullyDownloaded;
    private final File mLoadingFile;
    private final String mRemoteFileUrl;
    private volatile boolean mStop;
    private boolean midpoint;
    private boolean thirdQuartile;

    public interface Callback {
        void onError(PlayerInfo playerInfo);

        void onFileLoaded(String str);

        void onProgress(double d10);
    }

    public FileLoader(String str, Context context, Callback callback, Boolean bool) {
        this.mCallback = callback;
        this.mContext = context;
        this.mRemoteFileUrl = str;
        this.mIsEndCard = bool.booleanValue();
        this.mLoadingFile = new File(FileUtils.getParentDir(context), FileUtils.obtainHashName(str));
    }

    private int appendFile(File file, String str, int i10, FileHeaders fileHeaders) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        FileOutputStream fileOutputStream2;
        InputStream inputStream2 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream3 = null;
        try {
            this.mConnection = obtainGetConnection(str, i10, fileHeaders);
            inputStream = this.mConnection.getInputStream();
            try {
                try {
                    fileOutputStream2 = new FileOutputStream(file, true);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i11 = inputStream.read(bArr);
                            if (i11 == -1) {
                                closeStream(inputStream);
                                closeStream(fileOutputStream2);
                                return i10;
                            }
                            fileOutputStream2.write(bArr, 0, i11);
                            i10 += i11;
                            handelProgress(((double) i10) / ((double) fileHeaders.fileLength));
                        }
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream3 = fileOutputStream2;
                        Logger.e(LOG_TAG, "appendFile interrupted: " + e.getMessage());
                        closeStream(inputStream);
                        closeStream(fileOutputStream3);
                        return i10;
                    } catch (Throwable th2) {
                        th = th2;
                        closeStream(inputStream);
                        closeStream(fileOutputStream2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    FileOutputStream fileOutputStream4 = fileOutputStream3;
                    inputStream2 = inputStream;
                    fileOutputStream = fileOutputStream4;
                    fileOutputStream2 = fileOutputStream;
                    inputStream = inputStream2;
                    closeStream(inputStream);
                    closeStream(fileOutputStream2);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            fileOutputStream2 = fileOutputStream;
            inputStream = inputStream2;
            closeStream(inputStream);
            closeStream(fileOutputStream2);
            throw th;
        }
    }

    public static /* synthetic */ void b(FileLoader fileLoader) {
        fileLoader.getClass();
        Logger.e(LOG_TAG, "disconnect()");
        fileLoader.mConnection.disconnect();
    }

    public static /* synthetic */ void c(FileLoader fileLoader) {
        Callback callback = fileLoader.mCallback;
        if (callback != null) {
            callback.onFileLoaded(fileLoader.mLoadingFile.getAbsolutePath());
        }
    }

    private static void closeStream(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Logger.e(LOG_TAG, "Can't close stream");
            }
        }
    }

    private void handelProgress(double d10) {
        Callback callback = this.mCallback;
        if (callback != null) {
            if (!this.firstQuartile) {
                if (d10 > 0.25d) {
                    this.firstQuartile = true;
                    callback.onProgress(0.25d);
                    return;
                }
                return;
            }
            if (!this.midpoint) {
                if (d10 > 0.5d) {
                    this.midpoint = true;
                    callback.onProgress(0.5d);
                    return;
                }
                return;
            }
            if (this.thirdQuartile || d10 <= 0.75d) {
                return;
            }
            this.thirdQuartile = true;
            callback.onProgress(0.75d);
        }
    }

    private void handleEmulator() {
        if (Utils.isEmulator()) {
            Logger.e(LOG_TAG, "running on emulator");
            useMobileNetworkForCaching = true;
        }
    }

    private void handleFileFullDownloaded() {
        this.mIsFileFullyDownloaded = true;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.helpers.a
            @Override // java.lang.Runnable
            public final void run() {
                FileLoader.c(this.f96065b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void load() throws Throwable {
        try {
            if (this.mStop) {
                return;
            }
            FileHeaders fileHeadersObtainHeaders = obtainHeaders(this.mRemoteFileUrl);
            if (fileHeadersObtainHeaders == null) {
                Callback callback = this.mCallback;
                if (callback != null) {
                    callback.onError(new PlayerInfo("Error during loading file"));
                    return;
                }
                return;
            }
            Logger.d(LOG_TAG, "File length: " + fileHeadersObtainHeaders.fileLength);
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iAppendFile = 0;
            int i10 = 0;
            while (!this.mStop && iAppendFile < fileHeadersObtainHeaders.fileLength) {
                iAppendFile = appendFile(this.mLoadingFile, this.mRemoteFileUrl, iAppendFile, fileHeadersObtainHeaders);
                i10++;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            String str = LOG_TAG;
            Logger.d(str, "Load time: " + (jCurrentTimeMillis2 / 1000.0d));
            Logger.d(str, "AttemptsCount: " + i10);
            if (iAppendFile == fileHeadersObtainHeaders.fileLength) {
                handleFileFullDownloaded();
                return;
            }
            Bitmap bitmap = fileHeadersObtainHeaders.bitmap;
            if (bitmap != null) {
                saveBitmapIntoFile(bitmap);
                handleFileFullDownloaded();
                return;
            }
            Callback callback2 = this.mCallback;
            if (callback2 != null) {
                callback2.onError(new PlayerInfo("Error during file loading, attemptsCount: " + i10));
            }
        } catch (Exception e10) {
            Logger.e(LOG_TAG, "Unexpected FileLoader error: " + e10.getMessage());
        }
    }

    private void maybeLoadFile() {
        if (RequestParametersProvider.getConnectionType(this.mContext) == 2 || useMobileNetworkForCaching) {
            ExecutorHelper.getExecutor().submit(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.helpers.c
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f96067b.load();
                }
            });
            return;
        }
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onError(new PlayerInfo("Mobile network. File will not be cached"));
        }
    }

    private HttpURLConnection obtainGetConnection(String str, int i10, FileHeaders fileHeaders) throws ProtocolException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setRequestMethod("GET");
        return httpURLConnection;
    }

    private FileHeaders obtainHeaders(String str) {
        try {
            try {
                try {
                    this.mConnection = (HttpURLConnection) new URL(str).openConnection();
                    if (this.mConnection != null && this.mConnection.getHeaderFields() != null && this.mConnection.getHeaderFields().get("content-Length") != null && this.mConnection.getHeaderFields().get("content-Length").isEmpty()) {
                        Logger.e(LOG_TAG, "File not found by URL: " + this.mRemoteFileUrl);
                        ErrorLog.postError(this.mContext, VastError.TRAFFICKING);
                        if (this.mConnection != null) {
                            this.mConnection.disconnect();
                        }
                        return null;
                    }
                    this.mConnection.setRequestMethod("GET");
                    if (this.mConnection.getResponseCode() == 200) {
                        String headerField = this.mConnection.getHeaderField("ETag");
                        int contentLength = this.mConnection.getContentLength();
                        FileHeaders fileHeaders = new FileHeaders(headerField, contentLength, (contentLength == -1 && this.mIsEndCard) ? EndCardFileDownloader.mLoad(this.mRemoteFileUrl) : null);
                        if (this.mConnection != null) {
                            this.mConnection.disconnect();
                        }
                        return fileHeaders;
                    }
                    if (this.mConnection.getResponseCode() != 403 && this.mConnection.getResponseCode() != 206 && this.mConnection.getResponseCode() != 404) {
                        if (this.mConnection != null) {
                            this.mConnection.disconnect();
                        }
                        return null;
                    }
                    Logger.e(LOG_TAG, "File not found by URL: " + this.mRemoteFileUrl);
                    ErrorLog.postError(this.mContext, VastError.TRAFFICKING);
                    if (this.mConnection != null) {
                        this.mConnection.disconnect();
                    }
                    return null;
                } catch (SocketTimeoutException unused) {
                    Logger.e(LOG_TAG, "Timeout by URL: " + this.mRemoteFileUrl);
                    ErrorLog.postError(this.mContext, VastError.TIMEOUT);
                    if (this.mConnection != null) {
                        this.mConnection.disconnect();
                    }
                    return null;
                }
            } catch (IOException unused2) {
                Logger.e(LOG_TAG, "File not found by URL: " + this.mRemoteFileUrl);
                ErrorLog.postError(this.mContext, VastError.FILE_NOT_FOUND);
                if (this.mConnection != null) {
                    this.mConnection.disconnect();
                }
                return null;
            }
        } catch (Throwable th2) {
            if (this.mConnection != null) {
                this.mConnection.disconnect();
            }
            throw th2;
        }
    }

    private void saveBitmapIntoFile(Bitmap bitmap) {
        new AndroidBmpUtil().save(bitmap, this.mLoadingFile.getAbsolutePath());
    }

    public static void setUseMobileNetworkForCaching(boolean z10) {
        useMobileNetworkForCaching = z10;
    }

    public void start() {
        String str = LOG_TAG;
        Logger.d(str, "start");
        handleEmulator();
        Logger.d(str, "Use mobile network for caching: " + useMobileNetworkForCaching);
        if (TextUtils.isEmpty(this.mRemoteFileUrl)) {
            this.mCallback.onError(new PlayerInfo("FileUrl is empty"));
        } else if (!this.mLoadingFile.exists()) {
            maybeLoadFile();
        } else {
            Logger.d(str, "File already exists");
            handleFileFullDownloaded();
        }
    }

    public void stop() {
        File file;
        String str = LOG_TAG;
        Logger.e(str, "stop()");
        this.mStop = true;
        if (this.mConnection != null) {
            ExecutorHelper.getExecutor().submit(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.helpers.b
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoader.b(this.f96066b);
                }
            });
        }
        if (this.mIsFileFullyDownloaded || (file = this.mLoadingFile) == null || !file.exists()) {
            return;
        }
        Logger.e(str, "remove bad file");
        this.mLoadingFile.delete();
    }

    private static class FileHeaders {
        final Bitmap bitmap;
        final String eTag;
        final int fileLength;

        FileHeaders(String str, int i10) {
            this.eTag = str;
            this.fileLength = i10;
            this.bitmap = null;
        }

        FileHeaders(String str, int i10, Bitmap bitmap) {
            this.eTag = str;
            this.fileLength = i10;
            this.bitmap = bitmap;
        }
    }
}
