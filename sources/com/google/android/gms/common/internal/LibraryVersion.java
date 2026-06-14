package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.IOUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
@Deprecated
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger("LibraryVersion", "");
    private static final LibraryVersion zzb = new LibraryVersion();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();

    @VisibleForTesting
    protected LibraryVersion() {
    }

    @NonNull
    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @NonNull
    @KeepForSdk
    @Deprecated
    public String getVersion(@NonNull String str) throws Throwable {
        ?? r32;
        InputStream resourceAsStream;
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.zzc;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        ?? r42 = 0;
        r42 = 0;
        r42 = 0;
        InputStream inputStream = null;
        try {
            try {
                resourceAsStream = LibraryVersion.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        String property = properties.getProperty("version", null);
                        GmsLogger gmsLogger = zza;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                        sb2.append(str);
                        sb2.append(" version is ");
                        sb2.append(property);
                        gmsLogger.v("LibraryVersion", sb2.toString());
                        r42 = property;
                    } else {
                        GmsLogger gmsLogger2 = zza;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb3.append("Failed to get app version for libraryName: ");
                        sb3.append(str);
                        gmsLogger2.w("LibraryVersion", sb3.toString());
                    }
                } catch (IOException e10) {
                    e = e10;
                    r32 = r42;
                    inputStream = resourceAsStream;
                    GmsLogger gmsLogger3 = zza;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb4.append("Failed to get app version for libraryName: ");
                    sb4.append(str);
                    gmsLogger3.e("LibraryVersion", sb4.toString(), e);
                    resourceAsStream = inputStream;
                    r42 = r32;
                } catch (Throwable th2) {
                    th = th2;
                    r42 = resourceAsStream;
                    if (r42 != 0) {
                        IOUtils.closeQuietly((Closeable) r42);
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                r32 = 0;
            }
            if (resourceAsStream != null) {
                IOUtils.closeQuietly(resourceAsStream);
            }
            if (r42 == 0) {
                zza.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                r42 = "UNKNOWN";
            }
            this.zzc.put(str, r42);
            return r42;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
