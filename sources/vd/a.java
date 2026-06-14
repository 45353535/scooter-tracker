package vd;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import pd.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f106488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f106489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f106490c;

    public a(Context context, File file, File file2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        this.f106488a = file;
        this.f106489b = file2;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f106490c = applicationContext;
    }

    @Override // vd.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public File a(URLConnection urlConnection) {
        Intrinsics.checkNotNullParameter(urlConnection, "urlConnection");
        File cacheDir = this.f106489b;
        if (cacheDir == null) {
            cacheDir = this.f106490c.getCacheDir();
        }
        if (cacheDir == null) {
            throw new IllegalStateException("Can't create temp file, temp dir is null");
        }
        cacheDir.mkdirs();
        if (!cacheDir.exists()) {
            throw new IllegalStateException(("Can't create temp dir " + cacheDir.getPath()).toString());
        }
        File fileD = td.b.d(cacheDir, null, 1, null);
        long contentLength = urlConnection.getContentLength();
        try {
            InputStream inputStream = urlConnection.getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "urlConnection.getInputStream()");
            if (g0.C(inputStream, fileD) != contentLength) {
                throw new IllegalStateException("The downloaded file size does not match the stated size");
            }
            File parentFile = this.f106488a.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            File parentFile2 = this.f106488a.getParentFile();
            if (parentFile2 != null && parentFile2.exists()) {
                if (!fileD.renameTo(this.f106488a) && !td.b.i(this.f106488a)) {
                    throw new IllegalStateException("Can't rename temp file");
                }
                return this.f106488a;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't create target file dir ");
            File parentFile3 = this.f106488a.getParentFile();
            sb2.append(parentFile3 != null ? parentFile3.getPath() : null);
            throw new IllegalStateException(sb2.toString().toString());
        } catch (Throwable th2) {
            td.b.f(fileD);
            throw th2;
        }
    }
}
