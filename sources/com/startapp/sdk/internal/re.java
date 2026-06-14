package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f65216a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yj f65217b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f65218c = null;

    public final String a(Context context, URL url, String str, hj hjVar) {
        InputStream inputStream;
        File file;
        DataInputStream dataInputStream;
        FileOutputStream fileOutputStreamOpenFileOutput;
        int contentLength;
        int i10;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        this.f65218c = url.toString();
        this.f65216a = true;
        try {
            int iK = AdsCommonMetaData.k().F().k();
            String str2 = context.getFilesDir() + "/" + str;
            File file2 = new File(str2);
            if (file2.exists()) {
                this.f65218c = null;
                WeakHashMap weakHashMap = vi.f65408a;
                return str2;
            }
            String str3 = str + ".temp";
            String str4 = str2 + ".temp";
            file = new File(context.getFilesDir() + "/" + str3);
            try {
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.connect();
                contentLength = uRLConnectionOpenConnection.getContentLength();
                inputStream = uRLConnectionOpenConnection.getInputStream();
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
            try {
                dataInputStream = new DataInputStream(inputStream);
            } catch (Throwable th3) {
                th = th3;
                dataInputStream = null;
            }
            try {
                byte[] bArr = new byte[4096];
                int i11 = 0;
                fileOutputStreamOpenFileOutput = context.openFileOutput(str3, 0);
                int i12 = 0;
                boolean z10 = false;
                int i13 = 0;
                while (true) {
                    try {
                        i10 = dataInputStream.read(bArr);
                        if (i10 <= 0 || !this.f65216a) {
                            break;
                        }
                        fileOutputStreamOpenFileOutput.write(bArr, i11, i10);
                        i12 += i10;
                        FileOutputStream fileOutputStream2 = fileOutputStreamOpenFileOutput;
                        int i14 = (int) ((((double) i12) * 100.0d) / ((double) contentLength));
                        if (i14 >= iK) {
                            if (!z10) {
                                try {
                                    new Handler(Looper.getMainLooper()).post(new ne(hjVar, str4));
                                    z10 = true;
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileOutputStreamOpenFileOutput = fileOutputStream2;
                                }
                            }
                            if (i14 >= i13 + 1) {
                                if (this.f65217b != null) {
                                    new Handler(Looper.getMainLooper()).post(new oe(this, i14));
                                }
                                fileOutputStreamOpenFileOutput = fileOutputStream2;
                                i13 = i14;
                            }
                            i11 = 0;
                        }
                        fileOutputStreamOpenFileOutput = fileOutputStream2;
                        i11 = 0;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                FileOutputStream fileOutputStream3 = fileOutputStreamOpenFileOutput;
                if (!this.f65216a && i10 > 0) {
                    file.delete();
                    this.f65218c = null;
                    vi.a(inputStream);
                    vi.a(dataInputStream);
                    vi.a(fileOutputStream3);
                    return "downloadInterrupted";
                }
                try {
                    try {
                        fileInputStream = new FileInputStream(file);
                        try {
                            fileOutputStream = new FileOutputStream(file2);
                        } catch (Exception unused) {
                            fileOutputStream = null;
                            fileInputStream.close();
                            fileOutputStream.close();
                            this.f65218c = null;
                            vi.a(inputStream);
                            vi.a(dataInputStream);
                            vi.a(fileOutputStream3);
                            return str2;
                        } catch (Throwable th6) {
                            th = th6;
                            fileOutputStream = null;
                            try {
                                fileInputStream.close();
                                fileOutputStream.close();
                            } catch (Exception unused2) {
                            }
                            throw th;
                        }
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int i15 = fileInputStream.read(bArr2);
                                if (i15 <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr2, 0, i15);
                            }
                            fileInputStream.close();
                        } catch (Exception unused3) {
                            fileInputStream.close();
                        } catch (Throwable th7) {
                            th = th7;
                            fileInputStream.close();
                            fileOutputStream.close();
                            throw th;
                        }
                    } catch (Exception unused4) {
                        fileInputStream = null;
                    } catch (Throwable th8) {
                        th = th8;
                        fileInputStream = null;
                    }
                    fileOutputStream.close();
                } catch (Exception unused5) {
                }
                this.f65218c = null;
                vi.a(inputStream);
                vi.a(dataInputStream);
                vi.a(fileOutputStream3);
                return str2;
            } catch (Throwable th9) {
                th = th9;
                fileOutputStreamOpenFileOutput = null;
            }
        } catch (Throwable th10) {
            th = th10;
            inputStream = null;
            file = null;
        }
        dataInputStream = null;
        fileOutputStreamOpenFileOutput = null;
        if (file != null) {
            try {
                file.delete();
            } finally {
                this.f65218c = null;
                vi.a(inputStream);
                vi.a(dataInputStream);
                vi.a(fileOutputStreamOpenFileOutput);
            }
        }
        if (!(th instanceof IOException) && !(th instanceof OutOfMemoryError)) {
            g9.a(th);
        }
        return null;
    }
}
