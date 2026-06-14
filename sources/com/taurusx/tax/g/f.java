package com.taurusx.tax.g;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.taurusx.tax.g.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66124z = "FileUtil";

    public static byte[] c(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Error | Exception unused) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            try {
                fileInputStream.close();
            } catch (Error | Exception unused2) {
            }
            return bArr;
        } catch (Error | Exception unused3) {
            try {
                fileInputStream.close();
            } catch (Error | Exception unused4) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            try {
                fileInputStream2.close();
            } catch (Error | Exception unused5) {
            }
            throw th;
        }
    }

    public static File w(Context context, String str) {
        return d.z(context, str, d.w.FILES);
    }

    public static String y(File file) throws Throwable {
        Throwable th2;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        StringBuilder sb2 = new StringBuilder();
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                    } catch (Error | Exception unused) {
                        try {
                            fileInputStream.close();
                        } catch (Error | Exception unused2) {
                        }
                        try {
                            bufferedReader.close();
                        } catch (Error | Exception unused3) {
                        }
                        return null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        fileInputStream2 = fileInputStream;
                        try {
                            fileInputStream2.close();
                        } catch (Error | Exception unused4) {
                        }
                        try {
                            bufferedReader.close();
                            throw th2;
                        } catch (Error | Exception unused5) {
                            throw th2;
                        }
                    }
                }
                String string = sb2.toString();
                try {
                    fileInputStream.close();
                } catch (Error | Exception unused6) {
                }
                try {
                    bufferedReader.close();
                } catch (Error | Exception unused7) {
                }
                return string;
            } catch (Error | Exception unused8) {
                bufferedReader = null;
            } catch (Throwable th4) {
                th2 = th4;
                bufferedReader = null;
            }
        } catch (Error | Exception unused9) {
            bufferedReader = null;
            fileInputStream = null;
        } catch (Throwable th5) {
            th2 = th5;
            bufferedReader = null;
        }
    }

    public static File z(Context context, String str) {
        return d.z(context, str, d.w.CACHE);
    }

    public static void w(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                w(file2);
            }
            file.delete();
        }
    }

    public static boolean z() {
        return d.z();
    }

    public static File z(String str) {
        return z((File) null, str, false);
    }

    public static File z(File file, String str) {
        return z(file, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.io.File z(java.io.File r3, java.lang.String r4, boolean r5) {
        /*
            java.lang.Class<com.taurusx.tax.g.f> r0 = com.taurusx.tax.g.f.class
            monitor-enter(r0)
            r1 = 0
            if (r4 != 0) goto L8
            monitor-exit(r0)
            return r1
        L8:
            if (r3 == 0) goto L18
            boolean r2 = r3.isDirectory()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L18
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L16
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L16
            goto L21
        L16:
            r3 = move-exception
            goto L2b
        L18:
            if (r3 != 0) goto L20
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L16
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L16
            goto L21
        L20:
            r2 = r1
        L21:
            if (r5 == 0) goto L2d
            boolean r3 = z(r2)     // Catch: java.lang.Throwable -> L16
            if (r3 != 0) goto L2d
            monitor-exit(r0)
            return r1
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
        L2d:
            monitor-exit(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.g.f.z(java.io.File, java.lang.String, boolean):java.io.File");
    }

    public static boolean z(File file) {
        try {
            if (file.exists()) {
                return true;
            }
            return file.createNewFile();
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public static boolean w(String str) throws Throwable {
        boolean z10 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            try {
                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever2.setDataSource(str);
                    String strExtractMetadata = mediaMetadataRetriever2.extractMetadata(9);
                    if (strExtractMetadata != null) {
                        if (Long.parseLong(strExtractMetadata) > 0) {
                            z10 = true;
                        }
                    }
                    try {
                        mediaMetadataRetriever2.release();
                        return z10;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return z10;
                    }
                } catch (Exception e11) {
                    e = e11;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                    e.printStackTrace();
                    if (mediaMetadataRetriever != null) {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                    if (mediaMetadataRetriever != null) {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void z(byte[] bArr, File file, String str, boolean z10) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(z(file, str, true), z10);
            } catch (Error | Exception unused) {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Error | Exception unused2) {
                fileOutputStream2 = fileOutputStream;
                fileOutputStream2.close();
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                try {
                    fileOutputStream2.close();
                } catch (Error | Exception unused3) {
                }
                throw th;
            }
        } catch (Error | Exception unused4) {
        }
    }

    public static void z(String str, File file, String str2, boolean z10) throws Throwable {
        z(str.getBytes(), file, str2, z10);
    }

    public static String z(InputStream inputStream) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
            String strConcat = "";
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line != null) {
                        strConcat = strConcat.concat(line);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                } catch (Error | Exception unused2) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            }
            bufferedReader2.close();
            return strConcat;
        } catch (Error | Exception unused5) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean z(java.io.File r2, java.lang.String r3, java.lang.String r4) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r2.write(r4)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r2.flush()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r3 = 1
            r2.close()     // Catch: java.io.IOException -> L1b
            return r3
        L1b:
            r2 = move-exception
            r2.printStackTrace()
            return r3
        L20:
            r3 = move-exception
            r0 = r2
            goto L3a
        L23:
            r3 = move-exception
            r0 = r2
            goto L2a
        L26:
            r2 = move-exception
            goto L3b
        L28:
            r2 = move-exception
            r3 = r2
        L2a:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L37
            r0.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r2 = move-exception
            r2.printStackTrace()
        L37:
            r2 = 0
            return r2
        L39:
            r3 = move-exception
        L3a:
            r2 = r3
        L3b:
            if (r0 == 0) goto L45
            r0.close()     // Catch: java.io.IOException -> L41
            goto L45
        L41:
            r3 = move-exception
            r3.printStackTrace()
        L45:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.g.f.z(java.io.File, java.lang.String, java.lang.String):boolean");
    }
}
