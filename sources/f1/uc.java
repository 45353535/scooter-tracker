package f1;

import android.os.Build;
import f1.bd;
import f1.z2;
import g1.a;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public class uc implements Runnable, Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f71289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hd f71290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f71291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i8 f71292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t6 f71293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bd f71294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Cif f71295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ke f71296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ef f71297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f71298k = true;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71299a;

        static {
            int[] iArr = new int[bd.b.values().length];
            f71299a = iArr;
            try {
                iArr[bd.b.f69464b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71299a[bd.b.f69465c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public uc(Executor executor, hd hdVar, i iVar, i8 i8Var, t6 t6Var, bd bdVar, Cif cif) {
        this.f71289b = executor;
        this.f71290c = hdVar;
        this.f71291d = iVar;
        this.f71292e = i8Var;
        this.f71293f = t6Var;
        this.f71294g = bdVar;
        this.f71295h = cif;
    }

    public static boolean r(int i10) {
        return ((100 <= i10 && i10 < 200) || i10 == 204 || i10 == 304) ? false : true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(uc ucVar) {
        return this.f71294g.i().g() - ucVar.f71294g.i().g();
    }

    public final long d(HttpsURLConnection httpsURLConnection) {
        return Build.VERSION.SDK_INT < 24 ? httpsURLConnection.getContentLength() : httpsURLConnection.getContentLengthLong();
    }

    public final ke e() {
        return ke.a(new g1.a(a.c.f72140c, "Internet Unavailable"));
    }

    public final ke f(int i10) {
        return ke.a(new g1.a(a.c.f72143f, "Failure due to HTTP status code " + i10));
    }

    public final ke g(IOException iOException) {
        return ke.a(new g1.a(a.c.f72143f, iOException.toString()));
    }

    public final ke h(Throwable th2) {
        return ke.a(new g1.a(a.c.f72139b, th2.toString()));
    }

    public final ef i(bd bdVar) throws SocketTimeoutException {
        int i10 = 10000;
        int i11 = 0;
        while (true) {
            try {
                return j(bdVar, i10);
            } catch (SocketTimeoutException e10) {
                if (i11 >= 1) {
                    throw e10;
                }
                i10 *= 2;
                i11++;
            }
        }
    }

    public final ef j(bd bdVar, int i10) throws IOException {
        this.f71298k = true;
        qd qdVarA = bdVar.a();
        Map map = qdVarA.f70854a;
        HttpsURLConnection httpsURLConnectionA = this.f71290c.a(bdVar);
        httpsURLConnectionA.setSSLSocketFactory(g1.a());
        httpsURLConnectionA.setConnectTimeout(i10);
        httpsURLConnectionA.setReadTimeout(i10);
        httpsURLConnectionA.setUseCaches(false);
        httpsURLConnectionA.setDoInput(true);
        try {
            o(map, httpsURLConnectionA);
            httpsURLConnectionA.setRequestMethod(bdVar.h().name());
            l(qdVarA, httpsURLConnectionA);
            long jB = this.f71292e.b();
            try {
                int responseCode = httpsURLConnectionA.getResponseCode();
                long jB2 = this.f71292e.b();
                bdVar.f69461h = jB2 - jB;
                if (responseCode != -1) {
                    return new ef(responseCode, p(httpsURLConnectionA, responseCode, jB2));
                }
                throw new IOException("Could not retrieve response code from HttpsURLConnection.");
            } catch (Throwable th2) {
                bdVar.f69461h = this.f71292e.b() - jB;
                throw th2;
            }
        } finally {
            httpsURLConnectionA.disconnect();
        }
    }

    public final void k(z2 z2Var, String str) {
        try {
            t();
            this.f71295h.mo4436e(w3.s(z2Var, str));
        } catch (Exception unused) {
        }
    }

    public final void l(qd qdVar, HttpsURLConnection httpsURLConnection) throws IOException {
        if (!bd.c.f69469c.equals(this.f71294g.h()) || qdVar.f70855b == null) {
            return;
        }
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setFixedLengthStreamingMode(qdVar.f70855b.length);
        if (qdVar.a() != null) {
            httpsURLConnection.addRequestProperty("Content-Type", qdVar.a());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        try {
            dataOutputStream.write(qdVar.f70855b);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void m(String str) {
        this.f71295h.mo4436e(w3.s(z2.h.f71742e, str));
    }

    public final void n(String str, long j10) {
        if (this.f71298k) {
            this.f71298k = false;
            this.f71294g.f(str, j10);
        }
    }

    public final void o(Map map, HttpsURLConnection httpsURLConnection) {
        if (map != null) {
            for (String str : map.keySet()) {
                httpsURLConnection.addRequestProperty(str, (String) map.get(str));
            }
        }
    }

    public final byte[] p(HttpsURLConnection httpsURLConnection, int i10, long j10) {
        byte[] bArrS;
        byte[] bArr = new byte[0];
        try {
            if (!r(i10)) {
                bArrS = new byte[0];
            } else {
                if (this.f71294g.f69458e != null) {
                    u(httpsURLConnection);
                    return bArr;
                }
                bArrS = s(httpsURLConnection);
            }
            bArr = bArrS;
            return bArr;
        } finally {
            this.f71294g.f69462i = this.f71292e.b() - j10;
        }
    }

    public final /* synthetic */ Unit q() {
        run();
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5 A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:40:0x00a5, B:42:0x00ad, B:46:0x00bd, B:45:0x00b7, B:52:0x00ed, B:54:0x00f5, B:56:0x0102, B:55:0x00fc, B:17:0x003b, B:19:0x0043, B:21:0x0051, B:32:0x006a, B:33:0x0077), top: B:71:0x003b, inners: #5, #5, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:40:0x00a5, B:42:0x00ad, B:46:0x00bd, B:45:0x00b7, B:52:0x00ed, B:54:0x00f5, B:56:0x0102, B:55:0x00fc, B:17:0x003b, B:19:0x0043, B:21:0x0051, B:32:0x006a, B:33:0x0077), top: B:71:0x003b, inners: #5, #5, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.uc.run():void");
    }

    public final byte[] s(HttpsURLConnection httpsURLConnection) {
        InputStream errorStream;
        InputStream inputStream = null;
        try {
            try {
                errorStream = httpsURLConnection.getInputStream();
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException unused2) {
            errorStream = httpsURLConnection.getErrorStream();
        }
        InputStream inputStream2 = errorStream;
        byte[] bArrD = inputStream2 != null ? d7.f69595a.d(new BufferedInputStream(inputStream2)) : new byte[0];
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused3) {
            }
        }
        return bArrD;
    }

    public final void t() {
        bd bdVar = this.f71294g;
        if (bdVar == null || bdVar.f69458e == null || !(bdVar instanceof q3)) {
            return;
        }
        File file = new File(this.f71294g.f69458e.getParentFile(), this.f71294g.f69458e.getName() + ".tmp");
        if (file.exists()) {
            file.delete();
        }
    }

    public final void u(HttpsURLConnection httpsURLConnection) throws IOException {
        File file = new File(this.f71294g.f69458e.getParentFile(), this.f71294g.f69458e.getName() + ".tmp");
        if (this.f71294g instanceof q3) {
            if (file.exists()) {
                return;
            }
            if (!file.createNewFile()) {
                throw new IOException("Video temp file was not created and doesn't exist");
            }
        }
        bd bdVar = this.f71294g;
        if (bdVar instanceof q3) {
            n(bdVar.j(), d(httpsURLConnection));
        }
        InputStream inputStream = httpsURLConnection.getInputStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                if (this.f71294g instanceof q3) {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i10 = inputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        } else {
                            if (!file.exists()) {
                                throw new IOException("Temp file was deleted during download");
                            }
                            fileOutputStream.write(bArr, 0, i10);
                        }
                    }
                } else {
                    d7.f69595a.a(inputStream, fileOutputStream);
                }
                fileOutputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                if (file.renameTo(this.f71294g.f69458e)) {
                    return;
                }
                if (file.delete()) {
                    String str = "Unable to move " + file.getAbsolutePath() + " to " + this.f71294g.f69458e.getAbsolutePath();
                    m(str);
                    throw new IOException(str);
                }
                String str2 = "Unable to delete " + file.getAbsolutePath() + " after failing to rename to " + this.f71294g.f69458e.getAbsolutePath();
                m(str2);
                throw new IOException(str2);
            } finally {
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
