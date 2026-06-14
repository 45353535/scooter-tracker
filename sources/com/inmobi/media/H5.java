package com.inmobi.media;

import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class H5 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f36976p = Pattern.compile("[a-z0-9_-]{1,64}");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final A5 f36977q = new A5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f36979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f36980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f36981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f36982e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F5 f36984g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f36987j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BufferedWriter f36989l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f36990m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f36978a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f36986i = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f36988k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f36991n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final B5 f36992o = new B5(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36983f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f36985h = 2;

    public H5(File file, long j10, F5 f52) {
        this.f36979b = file;
        this.f36980c = new File(file, com.taurusx.tax.g.n0.y.f66202v);
        this.f36981d = new File(file, com.taurusx.tax.g.n0.y.f66199l);
        this.f36982e = new File(file, com.taurusx.tax.g.n0.y.f66195e);
        this.f36987j = j10;
        this.f36984g = f52;
    }

    public final void a() throws IOException {
        File file = this.f36981d;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.f36986i.values().iterator();
        while (it.hasNext()) {
            E5 e52 = (E5) it.next();
            int i10 = 0;
            if (e52.f36774d == null) {
                while (i10 < this.f36985h) {
                    this.f36988k += e52.f36772b[i10];
                    i10++;
                }
            } else {
                e52.f36774d = null;
                while (i10 < this.f36985h) {
                    File fileA = e52.a(i10);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                    File fileB = e52.b(i10);
                    if (fileB.exists() && !fileB.delete()) {
                        throw new IOException();
                    }
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void b() {
        Gj gj = new Gj(new FileInputStream(this.f36980c), AbstractC3612bl.f38288a);
        try {
            String strA = gj.a();
            String strA2 = gj.a();
            String strA3 = gj.a();
            String strA4 = gj.a();
            String strA5 = gj.a();
            if (!com.taurusx.tax.g.n0.y.f66198k.equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f36983f).equals(strA3) || !Integer.toString(this.f36985h).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + C4240b4.j.f42674e);
            }
            int i10 = 0;
            while (true) {
                try {
                    c(gj.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f36990m = i10 - this.f36986i.size();
                    AbstractC3612bl.a(gj);
                    return;
                }
            }
        } catch (Throwable th2) {
            AbstractC3612bl.a(gj);
            throw th2;
        }
    }

    public final void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith(com.taurusx.tax.g.n0.y.f66193b)) {
                this.f36986i.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        E5 e52 = (E5) this.f36986i.get(strSubstring);
        if (e52 == null) {
            e52 = new E5(this, strSubstring);
            this.f36986i.put(strSubstring, e52);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith(com.taurusx.tax.g.n0.y.f66196h)) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(com.taurusx.tax.g.n0.y.f66197j)) {
                e52.f36774d = new D5(this, e52);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith(com.taurusx.tax.g.n0.y.f66194d)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        e52.f36773c = true;
        e52.f36774d = null;
        if (strArrSplit.length != e52.f36775e.f36985h) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            try {
                e52.f36772b[i11] = Long.parseLong(strArrSplit[i11]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f36989l == null) {
                return;
            }
            Iterator it = new ArrayList(this.f36986i.values()).iterator();
            while (it.hasNext()) {
                D5 d52 = ((E5) it.next()).f36774d;
                if (d52 != null) {
                    d52.f36711d.a(d52, false);
                }
            }
            while (this.f36988k > this.f36987j) {
                d((String) ((Map.Entry) this.f36986i.entrySet().iterator().next()).getKey());
            }
            this.f36989l.close();
            this.f36989l = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(String str) {
        if (this.f36989l == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!f36976p.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        E5 e52 = (E5) this.f36986i.get(str);
        if (e52 != null && e52.f36774d == null) {
            for (int i10 = 0; i10 < this.f36985h; i10++) {
                File file = e52.a(i10);
                if (this.f36984g != null) {
                    Intrinsics.checkNotNullParameter(file, "file");
                    if (str != null && i10 == 0) {
                        String str2 = "";
                        try {
                            String strA = AbstractC3612bl.a(new InputStreamReader(new FileInputStream(file), AbstractC3612bl.f38289b));
                            Intrinsics.checkNotNullExpressionValue(strA, "readFully(...)");
                            str2 = strA;
                        } catch (Exception unused) {
                        }
                        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("urlKey", str), TuplesKt.to("url", str2));
                        Wj wj = Wj.f37959a;
                        Wj.b("ResourceDiskCacheFileEvicted", mapMutableMapOf, EnumC3585ak.f38215a);
                    }
                }
                if (file.exists() && !file.delete()) {
                    throw new IOException("failed to delete " + file);
                }
                long j10 = this.f36988k;
                long[] jArr = e52.f36772b;
                this.f36988k = j10 - jArr[i10];
                jArr[i10] = 0;
            }
            this.f36990m++;
            this.f36989l.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f36986i.remove(str);
            int i11 = this.f36990m;
            if (i11 >= 2000 && i11 >= this.f36986i.size()) {
                this.f36978a.submit(this.f36992o);
            }
        }
    }

    public final D5 a(String str) {
        synchronized (this) {
            try {
                if (this.f36989l != null) {
                    if (f36976p.matcher(str).matches()) {
                        E5 e52 = (E5) this.f36986i.get(str);
                        if (e52 == null) {
                            e52 = new E5(this, str);
                            this.f36986i.put(str, e52);
                        } else if (e52.f36774d != null) {
                            return null;
                        }
                        D5 d52 = new D5(this, e52);
                        e52.f36774d = d52;
                        this.f36989l.write("DIRTY " + str + '\n');
                        this.f36989l.flush();
                        return d52;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized G5 b(String key) {
        InputStream inputStream;
        synchronized (this) {
            if (this.f36989l != null) {
                if (f36976p.matcher(key).matches()) {
                    E5 e52 = (E5) this.f36986i.get(key);
                    if (e52 == null) {
                        return null;
                    }
                    if (!e52.f36773c) {
                        return null;
                    }
                    InputStream[] inputStreamArr = new InputStream[this.f36985h];
                    for (int i10 = 0; i10 < this.f36985h; i10++) {
                        try {
                            inputStreamArr[i10] = new FileInputStream(e52.a(i10));
                        } catch (FileNotFoundException unused) {
                            if (this.f36984g != null) {
                                Intrinsics.checkNotNullParameter(key, "key");
                                Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("urlKey", key));
                                Wj wj = Wj.f37959a;
                                Wj.b("ResourceDiskCacheFileMissing", mapMutableMapOf, EnumC3585ak.f38215a);
                            }
                            for (int i11 = 0; i11 < this.f36985h && (inputStream = inputStreamArr[i11]) != null; i11++) {
                                AbstractC3612bl.a(inputStream);
                            }
                            return null;
                        }
                    }
                    this.f36990m++;
                    this.f36989l.append((CharSequence) ("READ " + key + '\n'));
                    int i12 = this.f36990m;
                    if (i12 >= 2000 && i12 >= this.f36986i.size()) {
                        this.f36978a.submit(this.f36992o);
                    }
                    return new G5(inputStreamArr);
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + key + "\"");
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void c() {
        try {
            BufferedWriter bufferedWriter = this.f36989l;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f36981d), AbstractC3612bl.f38288a));
            try {
                bufferedWriter2.write(com.taurusx.tax.g.n0.y.f66198k);
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write("1");
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(Integer.toString(this.f36983f));
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(Integer.toString(this.f36985h));
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                for (E5 e52 : this.f36986i.values()) {
                    if (e52.f36774d != null) {
                        bufferedWriter2.write("DIRTY " + e52.f36771a + '\n');
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(e52.f36771a);
                        StringBuilder sb3 = new StringBuilder();
                        for (long j10 : e52.f36772b) {
                            sb3.append(' ');
                            sb3.append(j10);
                        }
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        bufferedWriter2.write(sb2.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.f36980c.exists()) {
                    File file = this.f36980c;
                    File file2 = this.f36982e;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (this.f36981d.renameTo(this.f36980c)) {
                    this.f36982e.delete();
                    this.f36989l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f36980c, true), AbstractC3612bl.f38288a));
                } else {
                    throw new IOException();
                }
            } catch (Throwable th2) {
                bufferedWriter2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void a(D5 d52, boolean z10) {
        int i10;
        E5 e52 = d52.f36708a;
        if (e52.f36774d == d52) {
            if (z10 && !e52.f36773c) {
                for (int i11 = 0; i11 < this.f36985h; i11++) {
                    if (d52.f36709b[i11]) {
                        if (!e52.b(i11).exists()) {
                            d52.f36711d.a(d52, false);
                            return;
                        }
                    } else {
                        d52.f36711d.a(d52, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                }
            }
            for (int i12 = 0; i12 < this.f36985h; i12++) {
                File fileB = e52.b(i12);
                if (z10) {
                    if (fileB.exists()) {
                        File fileA = e52.a(i12);
                        fileB.renameTo(fileA);
                        long j10 = e52.f36772b[i12];
                        long length = fileA.length();
                        e52.f36772b[i12] = length;
                        this.f36988k = (this.f36988k - j10) + length;
                    }
                } else if (fileB.exists() && !fileB.delete()) {
                    throw new IOException();
                }
            }
            this.f36990m++;
            e52.f36774d = null;
            if (e52.f36773c | z10) {
                e52.f36773c = true;
                BufferedWriter bufferedWriter = this.f36989l;
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(e52.f36771a);
                StringBuilder sb3 = new StringBuilder();
                for (long j11 : e52.f36772b) {
                    sb3.append(' ');
                    sb3.append(j11);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
                if (z10) {
                    this.f36991n++;
                }
            } else {
                this.f36986i.remove(e52.f36771a);
                this.f36989l.write("REMOVE " + e52.f36771a + '\n');
            }
            this.f36989l.flush();
            if (this.f36988k > this.f36987j || ((i10 = this.f36990m) >= 2000 && i10 >= this.f36986i.size())) {
                this.f36978a.submit(this.f36992o);
                return;
            }
            return;
        }
        throw new IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
    }
}
