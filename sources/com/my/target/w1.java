package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class w1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f60987b = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FilenameFilter f60988c = new FilenameFilter() { // from class: k5.q2
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("mytrg_");
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FilenameFilter f60989d = new FilenameFilter() { // from class: k5.r2
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.endsWith(".mp4");
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile w1 f60990e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f60991a;

    public w1(File file) {
        this.f60991a = file;
    }

    public final void c() {
        File[] fileArrListFiles = this.f60991a.listFiles(f60989d);
        if (fileArrListFiles == null || fileArrListFiles.length < 10) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator() { // from class: k5.p2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            }
        });
        for (int length = fileArrListFiles.length - 1; length >= 10; length--) {
            String path = fileArrListFiles[length].getPath();
            gb.a("DiskCache: Remove redundant video - " + path);
            if (!fileArrListFiles[length].delete()) {
                gb.a("DiskCache: Unable to remove file - " + path);
            }
        }
    }

    public synchronized void d() {
        try {
            if (!this.f60991a.exists()) {
                a();
            } else {
                b();
                c();
            }
        } catch (Throwable th2) {
            gb.c("DiskCache: exception - " + th2);
        }
    }

    public static File a(Context context) throws Exception {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new Exception("can't get context cache dir");
        }
        File file = new File(cacheDir, "mytargetcache");
        if (!file.exists() && !file.mkdirs()) {
            throw new Exception("can't create mytarget cache dir");
        }
        if (file.isDirectory() && file.canWrite()) {
            return file;
        }
        throw new Exception("can't write to mytarget cache dir");
    }

    public static w1 b(Context context) {
        w1 w1Var;
        w1 w1Var2 = f60990e;
        if (w1Var2 != null) {
            return w1Var2;
        }
        synchronized (w1.class) {
            w1Var = f60990e;
            if (w1Var == null) {
                try {
                    w1Var = new w1(a(context));
                    f60990e = w1Var;
                } catch (Exception e10) {
                    gb.c("DiskCache: unable to create cache dir: " + e10);
                    return null;
                }
            }
        }
        return w1Var;
    }

    public synchronized File a(InputStream inputStream, String str) {
        File fileA;
        d();
        fileA = a(str, ".img");
        gb.a("DiskCache: Save image - " + fileA.getPath());
        return a(inputStream, fileA);
    }

    public synchronized File b(InputStream inputStream, String str) {
        File fileA;
        d();
        fileA = a(str, ".mp4");
        gb.a("DiskCache: Save video - " + fileA.getPath());
        return a(inputStream, fileA);
    }

    public synchronized File a(int i10, String str, boolean z10) {
        File fileA;
        d();
        fileA = a(Integer.toString(i10), ".json");
        gb.a("DiskCache: Save text - " + fileA.getPath());
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (fileA.exists() && z10) {
            jCurrentTimeMillis = fileA.lastModified();
        }
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileA), StandardCharsets.UTF_8.newEncoder());
            try {
                outputStreamWriter.write(str);
                outputStreamWriter.close();
                if (!fileA.setLastModified(jCurrentTimeMillis)) {
                    gb.a("DiskCache: Unable to set last modified to file - " + fileA.getPath());
                }
                outputStreamWriter.close();
            } finally {
            }
        } catch (Throwable th2) {
            gb.c("DiskCache: exception - " + th2);
            return null;
        }
        return fileA;
    }

    public String b(String str) {
        return b(str, ".mp4");
    }

    public final synchronized String b(String str, String str2) {
        d();
        File fileA = a(str, str2);
        if (!fileA.exists()) {
            return null;
        }
        gb.a("DiskCache: Get path - " + fileA.getPath());
        try {
            return fileA.getAbsolutePath();
        } catch (Throwable th2) {
            gb.c("DiskCache: exception - " + th2);
            return null;
        }
    }

    public final void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f60991a.lastModified() <= f60987b) {
            return;
        }
        File[] fileArrListFiles = this.f60991a.listFiles(f60988c);
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && jCurrentTimeMillis - file.lastModified() > f60987b) {
                    gb.a("DiskCache: Remove expired file - " + file.getPath());
                    if (!file.delete()) {
                        gb.a("DiskCache: Unable to delete file - " + file.getAbsolutePath());
                    }
                }
            }
        }
        if (this.f60991a.setLastModified(jCurrentTimeMillis)) {
            return;
        }
        gb.a("DiskCache: Unable to set last modified to dir - " + this.f60991a.getAbsolutePath());
    }

    public synchronized Bitmap a(String str) {
        try {
            d();
            File fileA = a(str, ".img");
            if (!fileA.exists()) {
                return null;
            }
            gb.a("DiskCache: Get image - " + fileA.getPath());
            try {
                return BitmapFactory.decodeFile(fileA.getAbsolutePath());
            } catch (OutOfMemoryError e10) {
                System.gc();
                gb.c("DiskCache: OutOfMemoryError, trying once again");
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    return BitmapFactory.decodeFile(fileA.getAbsolutePath(), options);
                } catch (OutOfMemoryError unused) {
                    gb.c("DiskCache: OutOfMemoryError, called twice - " + e10);
                    return null;
                }
            } catch (Throwable th2) {
                gb.c("DiskCache: exception - " + th2);
                return null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized String a(int i10, long j10) {
        FileInputStream fileInputStream;
        StringBuilder sb2;
        d();
        File fileA = a(Integer.toString(i10), ".json");
        if (!fileA.exists()) {
            return null;
        }
        if (fileA.isFile() && System.currentTimeMillis() - fileA.lastModified() > j10) {
            gb.a("DiskCache: Remove expired file - " + fileA.getPath());
            if (!fileA.delete()) {
                gb.a("DiskCache: Unable to delete file - " + fileA.getAbsolutePath());
            }
            return null;
        }
        gb.a("DiskCache: Get text - " + fileA.getPath());
        try {
            fileInputStream = new FileInputStream(fileA);
            try {
                sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8));
                char[] cArr = new char[1024];
                while (true) {
                    int i11 = bufferedReader.read(cArr);
                    if (i11 == -1) {
                        break;
                    }
                    sb2.append(new String(cArr, 0, i11));
                }
            } finally {
            }
        } catch (Throwable th2) {
            gb.c("DiskCache: exception - " + th2);
        }
        if (sb2.length() == 0) {
            gb.a("DiskCache: Error - cache file is empty");
            fileInputStream.close();
            return null;
        }
        String string = sb2.toString();
        fileInputStream.close();
        return string;
    }

    public final File a(InputStream inputStream, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                a(inputStream, fileOutputStream);
                fileOutputStream.close();
                return file;
            } finally {
            }
        } catch (Throwable th2) {
            gb.c("DiskCache: exception - " + th2);
            return null;
        }
    }

    public final int a(InputStream inputStream, OutputStream outputStream) {
        BufferedOutputStream bufferedOutputStream;
        int i10;
        byte[] bArr = new byte[8192];
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
            try {
                bufferedOutputStream = new BufferedOutputStream(outputStream, 8192);
                i10 = 0;
            } finally {
            }
            while (true) {
                try {
                    int i11 = bufferedInputStream.read(bArr, 0, 8192);
                    if (i11 != -1) {
                        bufferedOutputStream.write(bArr, 0, i11);
                        i10 += i11;
                    } else {
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        bufferedInputStream.close();
                        return i10;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            gb.a("DiskCache: Error - " + th2.getMessage());
            throw th2;
        }
    }

    public final File a(String str, String str2) {
        return new File(this.f60991a.getAbsolutePath() + File.separator + ("mytrg_" + y1.c(str) + str2));
    }

    public final void a() throws Exception {
        gb.a("DiskCache: cache dir was deleted during runtime, re-creating...");
        if (!this.f60991a.mkdirs()) {
            throw new Exception("can't re-create cache dir in runtime");
        }
    }
}
