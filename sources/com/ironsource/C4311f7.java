package com.ironsource;

import android.text.TextUtils;
import com.ironsource.InterfaceC4345h7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.r;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4311f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f43088a = 15000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f43089b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f43090c = "POST";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f43091d = "UTF-8";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f43092e = "ERROR:";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f43093f = "Bad Request - 400";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ExecutorService f43094g = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.ironsource.f7$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC4328g7 f43097c;

        a(String str, String str2, InterfaceC4328g7 interfaceC4328g7) {
            this.f43095a = str;
            this.f43096b = str2;
            this.f43097c = interfaceC4328g7;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            HttpURLConnection httpURLConnectionB;
            OutputStream outputStream;
            try {
                httpURLConnectionB = C4311f7.b(this.f43095a);
                try {
                    outputStream = httpURLConnectionB.getOutputStream();
                } catch (Exception e10) {
                    e = e10;
                    outputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    C4311f7.a(outputStream, httpURLConnectionB, (BufferedReader) null);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                httpURLConnectionB = null;
                outputStream = null;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnectionB = null;
                outputStream = null;
            }
            try {
                try {
                    C4311f7.a(this.f43096b, outputStream);
                    int responseCode = httpURLConnectionB.getResponseCode();
                    boolean z10 = responseCode == 200;
                    if (!z10) {
                        IronLog.INTERNAL.error("invalid response code " + responseCode + " sending request");
                    }
                    this.f43097c.a(z10);
                } catch (Throwable th4) {
                    th = th4;
                    C4311f7.a(outputStream, httpURLConnectionB, (BufferedReader) null);
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                C4462o4.d().a(e);
                IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                this.f43097c.a(false);
            }
            C4311f7.a(outputStream, httpURLConnectionB, (BufferedReader) null);
        }
    }

    public static String a(String str) throws Exception {
        return a(str, (r.b) null);
    }

    public static String a(String str, r.b bVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Exception e10;
        BufferedReader bufferedReader2;
        Throwable th2;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Exception e11) {
            e = e11;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            bufferedReader = null;
        }
        try {
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 400) {
                if (bVar != null) {
                    bVar.a("Bad Request - 400");
                }
                a((OutputStream) null, httpURLConnection, (BufferedReader) null);
                return null;
            }
            bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            try {
                String strA = a(bufferedReader2);
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                return strA;
            } catch (Exception e12) {
                e10 = e12;
                try {
                    C4462o4.d().a(e10);
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    return null;
                } catch (Throwable th4) {
                    bufferedReader = bufferedReader2;
                    th = th4;
                    BufferedReader bufferedReader3 = bufferedReader;
                    th2 = th;
                    bufferedReader2 = bufferedReader3;
                    a((OutputStream) null, httpURLConnection, bufferedReader2);
                    throw th2;
                }
            } catch (Throwable th5) {
                th2 = th5;
                a((OutputStream) null, httpURLConnection, bufferedReader2);
                throw th2;
            }
        } catch (Exception e13) {
            e = e13;
            e10 = e;
            bufferedReader2 = null;
            C4462o4.d().a(e10);
            a((OutputStream) null, httpURLConnection, bufferedReader2);
            return null;
        } catch (Throwable th6) {
            th = th6;
            bufferedReader = null;
            BufferedReader bufferedReader32 = bufferedReader;
            th2 = th;
            bufferedReader2 = bufferedReader32;
            a((OutputStream) null, httpURLConnection, bufferedReader2);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HttpURLConnection b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    public static void a(String str, String str2, InterfaceC4328g7 interfaceC4328g7) {
        f43094g.submit(new a(str, str2, interfaceC4328g7));
    }

    @Nullable
    public static String a(String str, String str2, r.b bVar) {
        InterfaceC4345h7 interfaceC4345h7A = a(str, str2);
        if (interfaceC4345h7A instanceof InterfaceC4345h7.a) {
            InterfaceC4345h7.a aVar = (InterfaceC4345h7.a) interfaceC4345h7A;
            if (aVar.b()) {
                return null;
            }
            bVar.a(aVar.a());
            return null;
        }
        return ((InterfaceC4345h7.b) interfaceC4345h7A).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    public static InterfaceC4345h7 a(String str, String str2) throws Throwable {
        OutputStream outputStream;
        Exception e10;
        Exception e11;
        BufferedReader bufferedReader;
        ?? r02 = 0;
        r02 = 0;
        r02 = 0;
        try {
            try {
                str = b(str);
                try {
                    str.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                    outputStream = str.getOutputStream();
                    try {
                        a(str2, outputStream);
                        int responseCode = str.getResponseCode();
                        if (responseCode == 200) {
                            bufferedReader = new BufferedReader(new InputStreamReader(str.getInputStream()));
                            try {
                                String strA = a(bufferedReader);
                                if (strA != null) {
                                    InterfaceC4345h7.b bVar = new InterfaceC4345h7.b(strA);
                                    a(outputStream, (HttpURLConnection) str, bufferedReader);
                                    return bVar;
                                }
                                InterfaceC4345h7.a.c cVar = new InterfaceC4345h7.a.c();
                                a(outputStream, (HttpURLConnection) str, bufferedReader);
                                return cVar;
                            } catch (Exception e12) {
                                e11 = e12;
                                C4462o4.d().a(e11);
                                IronLog.INTERNAL.error("exception while sending request " + e11.getMessage());
                                InterfaceC4345h7.a.C0464a c0464a = new InterfaceC4345h7.a.C0464a(e11);
                                a(outputStream, (HttpURLConnection) str, bufferedReader);
                                return c0464a;
                            }
                        }
                        InterfaceC4345h7.a.b bVar2 = new InterfaceC4345h7.a.b(responseCode, str.getResponseMessage());
                        a(outputStream, (HttpURLConnection) str, (BufferedReader) null);
                        return bVar2;
                    } catch (Exception e13) {
                        e10 = e13;
                        e11 = e10;
                        bufferedReader = null;
                        C4462o4.d().a(e11);
                        IronLog.INTERNAL.error("exception while sending request " + e11.getMessage());
                        InterfaceC4345h7.a.C0464a c0464a2 = new InterfaceC4345h7.a.C0464a(e11);
                        a(outputStream, (HttpURLConnection) str, bufferedReader);
                        return c0464a2;
                    } catch (Throwable th2) {
                        th = th2;
                        a(outputStream, (HttpURLConnection) str, (BufferedReader) r02);
                        throw th;
                    }
                } catch (Exception e14) {
                    e10 = e14;
                    outputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = null;
                }
            } catch (Exception e15) {
                e10 = e15;
                str = 0;
                outputStream = null;
            } catch (Throwable th4) {
                th = th4;
                str = 0;
                outputStream = null;
            }
        } catch (Throwable th5) {
            r02 = str2;
            th = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    @Nullable
    private static String a(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb2.append(line);
        }
        String string = sb2.toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(OutputStream outputStream, HttpURLConnection httpURLConnection, BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error("exception while closing output stream " + e10.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e11) {
                C4462o4.d().a(e11);
                IronLog.INTERNAL.error("exception while closing reader " + e11.getMessage());
            }
        }
    }
}
