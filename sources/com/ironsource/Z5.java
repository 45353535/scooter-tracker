package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
class Z5 implements Callable<C4292e5> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f42236d = "FileWorkerThread";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f42237e = "X-Android-Protocols";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f42238f = "http/1.1,h2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4275d5 f42239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42241c;

    Z5(C4275d5 c4275d5, String str, long j10) {
        this.f42239a = c4275d5;
        this.f42240b = str;
        this.f42241c = j10;
    }

    int a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    boolean a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 8192);
            if (i10 != -1) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4292e5 call() throws Throwable {
        Z5 z52;
        if (this.f42241c == 0) {
            this.f42241c = 1L;
        }
        C4292e5 c4292e5A = null;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f42241c) {
                z52 = this;
                break;
            }
            z52 = this;
            c4292e5A = z52.a(this.f42239a.e(), i10, this.f42239a.a(), this.f42239a.c(), this.f42239a.f());
            int iB = c4292e5A.b();
            if (iB != 1008 && iB != 1009) {
                break;
            }
            i10++;
        }
        C4292e5 c4292e5 = c4292e5A;
        if (c4292e5 != null && c4292e5.a() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z52.f42240b);
            String str = File.separator;
            sb2.append(str);
            sb2.append(z52.f42239a.b().getName());
            String string = sb2.toString();
            String str2 = z52.f42239a.d() + str + C4274d4.E + z52.f42239a.b().getName();
            try {
                if (a(c4292e5.a(), str2) == 0) {
                    c4292e5.a(1006);
                    return c4292e5;
                }
                if (!a(str2, string)) {
                    c4292e5.a(1014);
                    return c4292e5;
                }
            } catch (FileNotFoundException e10) {
                C4462o4.d().a(e10);
                c4292e5.a(1018);
            } catch (Error e11) {
                C4462o4.d().a(e11);
                if (!TextUtils.isEmpty(e11.getMessage())) {
                    Logger.i(f42236d, e11.getMessage());
                }
                c4292e5.a(1019);
            } catch (Exception e12) {
                C4462o4.d().a(e12);
                if (!TextUtils.isEmpty(e12.getMessage())) {
                    Logger.i(f42236d, e12.getMessage());
                }
                c4292e5.a(1009);
            }
        }
        return c4292e5;
    }

    C4292e5 a(String str, int i10, int i11, int i12, boolean z10) throws Throwable {
        HttpURLConnection httpURLConnection;
        C4292e5 c4292e5 = new C4292e5();
        if (TextUtils.isEmpty(str)) {
            c4292e5.a(str);
            c4292e5.a(1007);
            return c4292e5;
        }
        InputStream inputStream = null;
        byte b10 = 0;
        InputStream inputStream2 = null;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        byte b14 = 0;
        byte b15 = 0;
        byte b16 = 0;
        int responseCode = 0;
        try {
            try {
                try {
                    try {
                        URL url = new URL(str);
                        url.toURI();
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                    } catch (FileNotFoundException e10) {
                        e = e10;
                        httpURLConnection = null;
                    } catch (Error e11) {
                        e = e11;
                        httpURLConnection = null;
                    } catch (MalformedURLException e12) {
                        e = e12;
                        httpURLConnection = null;
                    } catch (SocketTimeoutException e13) {
                        e = e13;
                        httpURLConnection = null;
                    } catch (URISyntaxException e14) {
                        e = e14;
                        httpURLConnection = null;
                    } catch (Exception e15) {
                        e = e15;
                        httpURLConnection = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (0 != 0) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                C4462o4.d().a(th3);
                                IronLog.INTERNAL.error(th3.toString());
                                c4292e5.a(str);
                                c4292e5.a(0);
                                throw th;
                            }
                        }
                        if (0 != 0) {
                            (b10 == true ? 1 : 0).disconnect();
                        }
                        c4292e5.a(str);
                        c4292e5.a(0);
                        throw th;
                    }
                    try {
                        httpURLConnection.setRequestMethod("GET");
                        if (z10) {
                            try {
                                httpURLConnection.setRequestProperty(f42237e, f42238f);
                            } catch (IllegalStateException e16) {
                                C4462o4.d().a(e16);
                            }
                        }
                        httpURLConnection.setConnectTimeout(i11);
                        httpURLConnection.setReadTimeout(i12);
                        httpURLConnection.connect();
                        responseCode = httpURLConnection.getResponseCode();
                        if (responseCode >= 200 && responseCode < 400) {
                            inputStream2 = httpURLConnection.getInputStream();
                            c4292e5.a(a(inputStream2));
                        } else {
                            Logger.i(f42236d, " RESPONSE CODE: " + responseCode + " URL: " + str + " ATTEMPT: " + i10);
                            responseCode = 1011;
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        httpURLConnection.disconnect();
                    } catch (FileNotFoundException e17) {
                        e = e17;
                        C4462o4.d().a(e);
                        i10 = 1018;
                        if (0 != 0) {
                            (b11 == true ? 1 : 0).close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c4292e5.a(str);
                        c4292e5.a(i10);
                        return c4292e5;
                    } catch (Error e18) {
                        e = e18;
                        C4462o4.d().a(e);
                        responseCode = 1019;
                        if (!TextUtils.isEmpty(e.getMessage())) {
                            Logger.i(f42236d, e.getMessage());
                        }
                        if (0 != 0) {
                            (b12 == true ? 1 : 0).close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (MalformedURLException e19) {
                        e = e19;
                        C4462o4.d().a(e);
                        i10 = 1004;
                        if (0 != 0) {
                            (b13 == true ? 1 : 0).close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c4292e5.a(str);
                        c4292e5.a(i10);
                        return c4292e5;
                    } catch (SocketTimeoutException e20) {
                        e = e20;
                        C4462o4.d().a(e);
                        i10 = 1008;
                        if (0 != 0) {
                            (b14 == true ? 1 : 0).close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c4292e5.a(str);
                        c4292e5.a(i10);
                        return c4292e5;
                    } catch (URISyntaxException e21) {
                        e = e21;
                        C4462o4.d().a(e);
                        i10 = 1010;
                        if (0 != 0) {
                            (b15 == true ? 1 : 0).close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c4292e5.a(str);
                        c4292e5.a(i10);
                        return c4292e5;
                    } catch (Exception e22) {
                        e = e22;
                        C4462o4.d().a(e);
                        if (!TextUtils.isEmpty(e.getMessage())) {
                            Logger.i(f42236d, e.getMessage());
                        }
                        i10 = 1009;
                        if (0 != 0) {
                            (b16 == true ? 1 : 0).close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c4292e5.a(str);
                        c4292e5.a(i10);
                        return c4292e5;
                    }
                } catch (Throwable th4) {
                    C4462o4.d().a(th4);
                    IronLog.INTERNAL.error(th4.toString());
                    c4292e5.a(str);
                    c4292e5.a(i10);
                    return c4292e5;
                }
            } catch (Throwable th5) {
                C4462o4.d().a(th5);
                IronLog.INTERNAL.error(th5.toString());
            }
            c4292e5.a(str);
            c4292e5.a(responseCode);
            return c4292e5;
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
