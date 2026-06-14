package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.g.n0.y;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f21448p = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f21449q = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f21450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f21451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f21452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f21453d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f21455f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BufferedWriter f21458i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f21461l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21457h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f21459j = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f21462m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f21463n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f21464o = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21454e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21456g = 1;

    public g(File file, long j10) {
        this.f21450a = file;
        this.f21451b = new File(file, y.f66202v);
        this.f21452c = new File(file, y.f66199l);
        this.f21453d = new File(file, y.f66195e);
        this.f21455f = j10;
    }

    public static void a(g gVar, d dVar, boolean z10) {
        int i10;
        synchronized (gVar) {
            e eVar = dVar.f21439a;
            if (eVar.f21446d != dVar) {
                throw new IllegalStateException();
            }
            if (z10 && !eVar.f21445c) {
                for (int i11 = 0; i11 < gVar.f21456g; i11++) {
                    if (!dVar.f21440b[i11]) {
                        a(dVar.f21442d, dVar, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                    if (!eVar.b(i11).exists()) {
                        a(dVar.f21442d, dVar, false);
                        return;
                    }
                }
            }
            for (int i12 = 0; i12 < gVar.f21456g; i12++) {
                File fileB = eVar.b(i12);
                if (!z10) {
                    a(fileB);
                } else if (fileB.exists()) {
                    File fileA = eVar.a(i12);
                    fileB.renameTo(fileA);
                    long j10 = eVar.f21444b[i12];
                    long length = fileA.length();
                    eVar.f21444b[i12] = length;
                    gVar.f21457h = (gVar.f21457h - j10) + length;
                }
            }
            gVar.f21460k++;
            eVar.f21446d = null;
            if (eVar.f21445c || z10) {
                eVar.f21445c = true;
                BufferedWriter bufferedWriter = gVar.f21458i;
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(eVar.f21443a);
                StringBuilder sb3 = new StringBuilder();
                for (long j11 : eVar.f21444b) {
                    sb3.append(' ');
                    sb3.append(j11);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
                if (z10) {
                    gVar.f21462m++;
                }
            } else {
                gVar.f21459j.remove(eVar.f21443a);
                gVar.f21458i.write("REMOVE " + eVar.f21443a + '\n');
            }
            gVar.f21458i.flush();
            if (gVar.f21457h > gVar.f21455f || ((i10 = gVar.f21460k) >= 2000 && i10 >= gVar.f21459j.size())) {
                gVar.f21463n.submit(gVar.f21464o);
            }
        }
    }

    public final void b() {
        FileInputStream fileInputStream = new FileInputStream(this.f21451b);
        Charset charset = l.f21472a;
        k kVar = new k(fileInputStream);
        try {
            String strA = kVar.a();
            String strA2 = kVar.a();
            String strA3 = kVar.a();
            String strA4 = kVar.a();
            String strA5 = kVar.a();
            if (!y.f66198k.equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f21454e).equals(strA3) || !Integer.toString(this.f21456g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + C4240b4.j.f42674e);
            }
            int i10 = 0;
            while (true) {
                try {
                    b(kVar.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f21460k = i10 - this.f21459j.size();
                    if (kVar.f21471e == -1) {
                        c();
                    } else {
                        this.f21458i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f21451b, true), l.f21472a));
                    }
                    try {
                        kVar.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                kVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final synchronized void c() {
        try {
            BufferedWriter bufferedWriter = this.f21458i;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f21452c), l.f21472a));
            try {
                bufferedWriter2.write(y.f66198k);
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write("1");
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(Integer.toString(this.f21454e));
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(Integer.toString(this.f21456g));
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                for (e eVar : this.f21459j.values()) {
                    if (eVar.f21446d != null) {
                        bufferedWriter2.write("DIRTY " + eVar.f21443a + '\n');
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(eVar.f21443a);
                        StringBuilder sb3 = new StringBuilder();
                        for (long j10 : eVar.f21444b) {
                            sb3.append(' ');
                            sb3.append(j10);
                        }
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        bufferedWriter2.write(sb2.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.f21451b.exists()) {
                    File file = this.f21451b;
                    File file2 = this.f21453d;
                    a(file2);
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.f21452c.renameTo(this.f21451b)) {
                    throw new IOException();
                }
                this.f21453d.delete();
                this.f21458i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f21451b, true), l.f21472a));
            } catch (Throwable th2) {
                bufferedWriter2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f21458i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f21459j.values()).iterator();
            while (it.hasNext()) {
                d dVar = ((e) it.next()).f21446d;
                if (dVar != null) {
                    a(dVar.f21442d, dVar, false);
                }
            }
            d();
            this.f21458i.close();
            this.f21458i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d() {
        while (this.f21457h > this.f21455f) {
            String str = (String) ((Map.Entry) this.f21459j.entrySet().iterator().next()).getKey();
            f fVar = this.f21461l;
            if (fVar == null) {
                c(str);
            } else if (fVar.a(str)) {
                c(str);
            } else {
                boolean zC = false;
                for (String str2 : this.f21459j.keySet()) {
                    if (this.f21461l.a(str2)) {
                        zC |= c(str2);
                    }
                }
                if (!zC) {
                    return;
                }
            }
        }
    }

    public final void b(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != -1) {
            int i10 = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(32, i10);
            if (iIndexOf2 == -1) {
                strSubstring = str.substring(i10);
                if (iIndexOf == 6 && str.startsWith(y.f66193b)) {
                    this.f21459j.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i10, iIndexOf2);
            }
            e eVar = (e) this.f21459j.get(strSubstring);
            if (eVar == null) {
                eVar = new e(this, strSubstring);
                this.f21459j.put(strSubstring, eVar);
            }
            if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(y.f66196h)) {
                String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
                eVar.f21445c = true;
                eVar.f21446d = null;
                if (strArrSplit.length == eVar.f21447e.f21456g) {
                    for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                        try {
                            eVar.f21444b[i11] = Long.parseLong(strArrSplit[i11]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(y.f66197j)) {
                eVar.f21446d = new d(this, eVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith(y.f66194d)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized boolean c(String str) {
        synchronized (this) {
            try {
                IAlog.e("DiskLruCache remove %s", str);
                if (this.f21458i != null) {
                    if (f21448p.matcher(str).matches()) {
                        e eVar = (e) this.f21459j.get(str);
                        if (eVar != null && eVar.f21446d == null) {
                            for (int i10 = 0; i10 < this.f21456g; i10++) {
                                File fileA = eVar.a(i10);
                                if (fileA.exists() && !fileA.delete()) {
                                    throw new IOException("failed to delete " + fileA);
                                }
                                long j10 = this.f21457h;
                                long[] jArr = eVar.f21444b;
                                this.f21457h = j10 - jArr[i10];
                                jArr[i10] = 0;
                            }
                            this.f21460k++;
                            this.f21458i.append((CharSequence) ("REMOVE " + str + '\n'));
                            this.f21459j.remove(str);
                            int i11 = this.f21460k;
                            if (i11 >= 2000 && i11 >= this.f21459j.size()) {
                                this.f21463n.submit(this.f21464o);
                            }
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } finally {
            }
        }
    }

    public static g a(File file, long j10) throws IOException {
        if (j10 > 0) {
            File file2 = new File(file, y.f66195e);
            if (file2.exists()) {
                File file3 = new File(file, y.f66202v);
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            g gVar = new g(file, j10);
            if (gVar.f21451b.exists()) {
                try {
                    gVar.b();
                    gVar.a();
                    return gVar;
                } catch (IOException e10) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    IAlog.e("DiskLruCache delete cache", new Object[0]);
                    gVar.close();
                    l.a(gVar.f21450a);
                }
            }
            file.mkdirs();
            g gVar2 = new g(file, j10);
            gVar2.c();
            return gVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void a() throws IOException {
        a(this.f21452c);
        Iterator it = this.f21459j.values().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            int i10 = 0;
            if (eVar.f21446d == null) {
                while (i10 < this.f21456g) {
                    this.f21457h += eVar.f21444b[i10];
                    i10++;
                }
            } else {
                eVar.f21446d = null;
                while (i10 < this.f21456g) {
                    a(eVar.a(i10));
                    a(eVar.b(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public static void a(File file) throws IOException {
        IAlog.e("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final d a(String str) {
        synchronized (this) {
            try {
                if (this.f21458i != null) {
                    if (f21448p.matcher(str).matches()) {
                        e eVar = (e) this.f21459j.get(str);
                        if (eVar == null) {
                            eVar = new e(this, str);
                            this.f21459j.put(str, eVar);
                        } else if (eVar.f21446d != null) {
                            return null;
                        }
                        d dVar = new d(this, eVar);
                        eVar.f21446d = dVar;
                        this.f21458i.write("DIRTY " + str + '\n');
                        this.f21458i.flush();
                        return dVar;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
