package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.b;
import com.android.volley.v;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class d implements com.android.volley.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f7554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0159d f7555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7556d;

    class a implements InterfaceC0159d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f7557a;

        a(File file) {
            this.f7557a = file;
        }

        @Override // com.android.volley.toolbox.d.InterfaceC0159d
        public File get() {
            return this.f7557a;
        }
    }

    /* JADX INFO: renamed from: com.android.volley.toolbox.d$d, reason: collision with other inner class name */
    public interface InterfaceC0159d {
        File get();
    }

    public d(File file, int i10) {
        this.f7553a = new LinkedHashMap(16, 0.75f, true);
        this.f7554b = 0L;
        this.f7555c = new a(file);
        this.f7556d = i10;
    }

    private String f(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    private void g() {
        if (this.f7555c.get().exists()) {
            return;
        }
        v.b("Re-initializing cache after external clearing.", new Object[0]);
        this.f7553a.clear();
        this.f7554b = 0L;
        initialize();
    }

    private void h() {
        if (this.f7554b < this.f7556d) {
            return;
        }
        if (v.f7589b) {
            v.e("Pruning old cache entries.", new Object[0]);
        }
        long j10 = this.f7554b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f7553a.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            b bVar = (b) ((Map.Entry) it.next()).getValue();
            if (e(bVar.f7560b).delete()) {
                this.f7554b -= bVar.f7559a;
            } else {
                String str = bVar.f7560b;
                v.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
            }
            it.remove();
            i10++;
            if (this.f7554b < this.f7556d * 0.9f) {
                break;
            }
        }
        if (v.f7589b) {
            v.e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i10), Long.valueOf(this.f7554b - j10), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    private void i(String str, b bVar) {
        if (this.f7553a.containsKey(str)) {
            this.f7554b += bVar.f7559a - ((b) this.f7553a.get(str)).f7559a;
        } else {
            this.f7554b += bVar.f7559a;
        }
        this.f7553a.put(str, bVar);
    }

    private static int j(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    static List k(c cVar) throws IOException {
        int iL = l(cVar);
        if (iL < 0) {
            throw new IOException("readHeaderList size=" + iL);
        }
        List arrayList = iL == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i10 = 0; i10 < iL; i10++) {
            arrayList.add(new com.android.volley.g(n(cVar).intern(), n(cVar).intern()));
        }
        return arrayList;
    }

    static int l(InputStream inputStream) {
        return (j(inputStream) << 24) | j(inputStream) | (j(inputStream) << 8) | (j(inputStream) << 16);
    }

    static long m(InputStream inputStream) {
        return (((long) j(inputStream)) & 255) | ((((long) j(inputStream)) & 255) << 8) | ((((long) j(inputStream)) & 255) << 16) | ((((long) j(inputStream)) & 255) << 24) | ((((long) j(inputStream)) & 255) << 32) | ((((long) j(inputStream)) & 255) << 40) | ((((long) j(inputStream)) & 255) << 48) | ((255 & ((long) j(inputStream))) << 56);
    }

    static String n(c cVar) {
        return new String(q(cVar, m(cVar)), "UTF-8");
    }

    private void p(String str) {
        b bVar = (b) this.f7553a.remove(str);
        if (bVar != null) {
            this.f7554b -= bVar.f7559a;
        }
    }

    static byte[] q(c cVar, long j10) throws IOException {
        long jM = cVar.m();
        if (j10 >= 0 && j10 <= jM) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + jM);
    }

    static void r(List list, OutputStream outputStream) throws IOException {
        if (list == null) {
            s(outputStream, 0);
            return;
        }
        s(outputStream, list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.android.volley.g gVar = (com.android.volley.g) it.next();
            u(outputStream, gVar.a());
            u(outputStream, gVar.b());
        }
    }

    static void s(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    static void t(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    static void u(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        t(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.android.volley.b
    public synchronized void a(String str, boolean z10) {
        try {
            b.a aVar = get(str);
            if (aVar != null) {
                aVar.f7496f = 0L;
                if (z10) {
                    aVar.f7495e = 0L;
                }
                b(str, aVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.android.volley.b
    public synchronized void b(String str, b.a aVar) {
        BufferedOutputStream bufferedOutputStream;
        b bVar;
        long length = this.f7554b + ((long) aVar.f7491a.length);
        int i10 = this.f7556d;
        if (length <= i10 || r4.length <= i10 * 0.9f) {
            File fileE = e(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(d(fileE));
                bVar = new b(str, aVar);
            } catch (IOException unused) {
                if (!fileE.delete()) {
                    v.b("Could not clean up file %s", fileE.getAbsolutePath());
                }
                g();
            }
            if (!bVar.d(bufferedOutputStream)) {
                bufferedOutputStream.close();
                v.b("Failed to write header for %s", fileE.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.f7491a);
            bufferedOutputStream.close();
            bVar.f7559a = fileE.length();
            i(str, bVar);
            h();
        }
    }

    InputStream c(File file) {
        return new FileInputStream(file);
    }

    OutputStream d(File file) {
        return new FileOutputStream(file);
    }

    public File e(String str) {
        return new File(this.f7555c.get(), f(str));
    }

    @Override // com.android.volley.b
    public synchronized b.a get(String str) {
        b bVar = (b) this.f7553a.get(str);
        if (bVar == null) {
            return null;
        }
        File fileE = e(str);
        try {
            c cVar = new c(new BufferedInputStream(c(fileE)), fileE.length());
            try {
                b bVarB = b.b(cVar);
                if (TextUtils.equals(str, bVarB.f7560b)) {
                    return bVar.c(q(cVar, cVar.m()));
                }
                v.b("%s: key=%s, found=%s", fileE.getAbsolutePath(), str, bVarB.f7560b);
                p(str);
                return null;
            } finally {
                cVar.close();
            }
        } catch (IOException e10) {
            v.b("%s: %s", fileE.getAbsolutePath(), e10.toString());
            o(str);
            return null;
        }
    }

    @Override // com.android.volley.b
    public synchronized void initialize() {
        synchronized (this) {
            File file = this.f7555c.get();
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    v.c("Unable to create cache dir %s", file.getAbsolutePath());
                }
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                try {
                    long length = file2.length();
                    c cVar = new c(new BufferedInputStream(c(file2)), length);
                    try {
                        b bVarB = b.b(cVar);
                        bVarB.f7559a = length;
                        i(bVarB.f7560b, bVarB);
                        cVar.close();
                    } catch (Throwable th2) {
                        cVar.close();
                        throw th2;
                    }
                } catch (IOException unused) {
                    file2.delete();
                }
            }
        }
    }

    public synchronized void o(String str) {
        boolean zDelete = e(str).delete();
        p(str);
        if (!zDelete) {
            v.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
        }
    }

    static class c extends FilterInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f7567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f7568c;

        c(InputStream inputStream, long j10) {
            super(inputStream);
            this.f7567b = j10;
        }

        long m() {
            return this.f7567b - this.f7568c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i10 = super.read();
            if (i10 != -1) {
                this.f7568c++;
            }
            return i10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = super.read(bArr, i10, i11);
            if (i12 != -1) {
                this.f7568c += (long) i12;
            }
            return i12;
        }
    }

    public d(File file) {
        this(file, 5242880);
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f7559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f7560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f7561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f7562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f7563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final long f7564f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final long f7565g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final List f7566h;

        private b(String str, String str2, long j10, long j11, long j12, long j13, List list) {
            this.f7560b = str;
            this.f7561c = "".equals(str2) ? null : str2;
            this.f7562d = j10;
            this.f7563e = j11;
            this.f7564f = j12;
            this.f7565g = j13;
            this.f7566h = list;
        }

        private static List a(b.a aVar) {
            List list = aVar.f7498h;
            return list != null ? list : e.i(aVar.f7497g);
        }

        static b b(c cVar) throws IOException {
            if (d.l(cVar) == 538247942) {
                return new b(d.n(cVar), d.n(cVar), d.m(cVar), d.m(cVar), d.m(cVar), d.m(cVar), d.k(cVar));
            }
            throw new IOException();
        }

        b.a c(byte[] bArr) {
            b.a aVar = new b.a();
            aVar.f7491a = bArr;
            aVar.f7492b = this.f7561c;
            aVar.f7493c = this.f7562d;
            aVar.f7494d = this.f7563e;
            aVar.f7495e = this.f7564f;
            aVar.f7496f = this.f7565g;
            aVar.f7497g = e.j(this.f7566h);
            aVar.f7498h = DesugarCollections.unmodifiableList(this.f7566h);
            return aVar;
        }

        boolean d(OutputStream outputStream) {
            try {
                d.s(outputStream, 538247942);
                d.u(outputStream, this.f7560b);
                String str = this.f7561c;
                if (str == null) {
                    str = "";
                }
                d.u(outputStream, str);
                d.t(outputStream, this.f7562d);
                d.t(outputStream, this.f7563e);
                d.t(outputStream, this.f7564f);
                d.t(outputStream, this.f7565g);
                d.r(this.f7566h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e10) {
                v.b("%s", e10.toString());
                return false;
            }
        }

        b(String str, b.a aVar) {
            this(str, aVar.f7492b, aVar.f7493c, aVar.f7494d, aVar.f7495e, aVar.f7496f, a(aVar));
        }
    }
}
