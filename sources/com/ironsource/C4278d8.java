package com.ironsource;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLException;

/* JADX INFO: renamed from: com.ironsource.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4278d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f42889a = "POST";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f42890b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f42891c = "ISHttpService";

    /* JADX INFO: renamed from: com.ironsource.d8$a */
    public static class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f42892h = 15000;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f42893i = 15000;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f42894j = "UTF-8";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f42895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f42896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f42897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f42898d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f42899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f42900f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ArrayList<Pair<String, String>> f42901g;

        /* JADX INFO: renamed from: com.ironsource.d8$a$a, reason: collision with other inner class name */
        static class C0460a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            String f42903b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            String f42905d;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            List<Pair<String, String>> f42902a = new ArrayList();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            String f42904c = "POST";

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f42906e = 15000;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f42907f = 15000;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            String f42908g = "UTF-8";

            C0460a() {
            }

            C0460a a(String str) {
                this.f42905d = str;
                return this;
            }

            C0460a b(String str) {
                this.f42908g = str;
                return this;
            }

            C0460a c(String str) {
                this.f42903b = str;
                return this;
            }

            C0460a d(String str) {
                this.f42904c = str;
                return this;
            }

            C0460a a(int i10) {
                this.f42906e = i10;
                return this;
            }

            C0460a b(int i10) {
                this.f42907f = i10;
                return this;
            }

            C0460a a(Pair<String, String> pair) {
                this.f42902a.add(pair);
                return this;
            }

            C0460a a(List<Pair<String, String>> list) {
                this.f42902a.addAll(list);
                return this;
            }

            a a() {
                return new a(this);
            }
        }

        public a(C0460a c0460a) {
            this.f42895a = c0460a.f42903b;
            this.f42896b = c0460a.f42904c;
            this.f42897c = c0460a.f42905d;
            this.f42901g = new ArrayList<>(c0460a.f42902a);
            this.f42898d = c0460a.f42906e;
            this.f42899e = c0460a.f42907f;
            this.f42900f = c0460a.f42908g;
        }

        boolean a() {
            return "POST".equals(this.f42896b);
        }
    }

    public static C4640yd a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri uriBuild = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0460a c0460a = new a.C0460a();
        c0460a.c(uriBuild.toString()).a(str2).d("GET").a(list);
        return b(c0460a.a());
    }

    public static C4640yd b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C0460a c0460a = new a.C0460a();
        c0460a.c(str).a(str2).d("POST").a(list);
        return b(c0460a.a());
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0067: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:32:0x0067 */
    public static C4640yd b(a aVar) throws Exception {
        HttpURLConnection httpURLConnectionA;
        InputStream inputStream;
        InputStream inputStream2;
        if (a(aVar.f42895a, aVar.f42897c)) {
            C4640yd c4640yd = new C4640yd();
            InputStream inputStream3 = null;
            inputStream3 = null;
            inputStream3 = null;
            inputStream3 = null;
            inputStream3 = null;
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    httpURLConnectionA = a(aVar);
                } catch (InterruptedIOException e10) {
                    e = e10;
                    Log.d(f42891c, "Failed post to " + aVar.f42895a + " exception: " + e.getMessage());
                    throw e;
                } catch (SSLException e11) {
                    e = e11;
                    Log.d(f42891c, "Failed post to " + aVar.f42895a + " exception: " + e.getMessage());
                    throw e;
                } catch (IOException e12) {
                    e = e12;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnectionA = null;
                }
                try {
                    a(httpURLConnectionA, aVar.f42901g);
                    a(httpURLConnectionA, aVar);
                    inputStream3 = httpURLConnectionA.getInputStream();
                    c4640yd.f45886a = httpURLConnectionA.getResponseCode();
                    if (inputStream3 != null) {
                        c4640yd.f45887b = Yf.a(inputStream3);
                    }
                } catch (InterruptedIOException e13) {
                    e = e13;
                    Log.d(f42891c, "Failed post to " + aVar.f42895a + " exception: " + e.getMessage());
                    throw e;
                } catch (SSLException e14) {
                    e = e14;
                    Log.d(f42891c, "Failed post to " + aVar.f42895a + " exception: " + e.getMessage());
                    throw e;
                } catch (IOException e15) {
                    e = e15;
                    inputStream = inputStream3;
                    httpURLConnection = httpURLConnectionA;
                    C4462o4.d().a(e);
                    if (httpURLConnection != null && httpURLConnection.getHeaderFields().isEmpty()) {
                        throw new Cc(e);
                    }
                    if (httpURLConnection != null) {
                        int responseCode = httpURLConnection.getResponseCode();
                        c4640yd.f45886a = responseCode;
                        if (responseCode >= 400) {
                            Log.d(f42891c, "Failed post to " + aVar.f42895a + " StatusCode: " + c4640yd.f45886a);
                            if (inputStream != null) {
                                InputStream inputStream4 = inputStream;
                                httpURLConnectionA = httpURLConnection;
                                inputStream3 = inputStream4;
                                inputStream3.close();
                            } else {
                                httpURLConnectionA = httpURLConnection;
                            }
                        }
                    }
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    if (httpURLConnectionA != null) {
                        httpURLConnectionA.disconnect();
                    }
                    throw th;
                }
                if (inputStream3 != null) {
                    inputStream3.close();
                }
                httpURLConnectionA.disconnect();
                return c4640yd;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnectionA = null;
                inputStream3 = inputStream2;
            }
        } else {
            throw new InvalidParameterException("not valid params");
        }
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.f42897c.getBytes(aVar.f42900f);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    private static HttpURLConnection a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.f42895a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.f42898d);
        httpURLConnection.setReadTimeout(aVar.f42899e);
        httpURLConnection.setRequestMethod(aVar.f42896b);
        return httpURLConnection;
    }
}
