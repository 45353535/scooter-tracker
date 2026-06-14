package com.taurusx.tax.g.n0;

import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.g.n;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public final class y implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f66193b = "REMOVE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f66194d = "READ";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f66195e = "journal.bkp";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f66196h = "CLEAN";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f66197j = "DIRTY";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f66198k = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f66199l = "journal.tmp";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f66200r = Pattern.compile("[a-z0-9_-]{1,64}");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f66201u = "1";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f66202v = "journal";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f66203x = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66204a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f66206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f66207g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final File f66210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Writer f66211o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final File f66214t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f66215w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f66216y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f66217z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f66205c = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashMap<String, C0796y> f66213s = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f66209m = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ThreadPoolExecutor f66212p = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Callable<Void> f66208i = new z();

    public final class c implements Closeable, AutoCloseable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f66218c;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final long f66220w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final InputStream[] f66221y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final String f66222z;

        public /* synthetic */ c(y yVar, String str, long j10, InputStream[] inputStreamArr, long[] jArr, z zVar) {
            this(str, j10, inputStreamArr, jArr);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f66221y) {
                y.this.z((Closeable) inputStream);
            }
        }

        public long w(int i10) {
            return this.f66218c[i10];
        }

        public String y(int i10) throws IOException {
            return y.w(z(i10));
        }

        public w z() throws IOException {
            return y.this.z(this.f66222z, this.f66220w);
        }

        public c(String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.f66222z = str;
            this.f66220w = j10;
            this.f66221y = inputStreamArr;
            this.f66218c = jArr;
        }

        public InputStream z(int i10) {
            return this.f66221y[i10];
        }
    }

    public final class w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f66223c;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean[] f66225w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f66226y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final C0796y f66227z;

        /* JADX INFO: renamed from: com.taurusx.tax.g.n0.y$w$w, reason: collision with other inner class name */
        public class C0795w extends FilterOutputStream implements AutoCloseable {
            public /* synthetic */ C0795w(w wVar, OutputStream outputStream, z zVar) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    w.this.f66226y = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    w.this.f66226y = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    w.this.f66226y = true;
                }
            }

            public C0795w(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    w.this.f66226y = true;
                }
            }
        }

        public class z extends OutputStream {
            public z() {
            }

            @Override // java.io.OutputStream
            public void write(int i10) throws IOException {
            }
        }

        public /* synthetic */ w(y yVar, C0796y c0796y, z zVar) {
            this(c0796y);
        }

        public OutputStream y(int i10) throws IOException {
            FileOutputStream fileOutputStream;
            C0795w c0795w;
            synchronized (y.this) {
                try {
                    if (this.f66227z.f66230c != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f66227z.f66234y) {
                        this.f66225w[i10] = true;
                    }
                    File fileW = this.f66227z.w(i10);
                    try {
                        fileOutputStream = new FileOutputStream(fileW);
                    } catch (FileNotFoundException unused) {
                        y.this.f66210n.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(fileW);
                        } catch (FileNotFoundException unused2) {
                            return new z();
                        }
                    }
                    c0795w = new C0795w(this, fileOutputStream, null);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c0795w;
        }

        public w(C0796y c0796y) {
            this.f66227z = c0796y;
            this.f66225w = c0796y.f66234y ? null : new boolean[y.this.f66216y];
        }

        public InputStream w(int i10) throws IOException {
            synchronized (y.this) {
                if (this.f66227z.f66230c != this) {
                    throw new IllegalStateException();
                }
                if (!this.f66227z.f66234y) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f66227z.z(i10));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public String z(int i10) throws IOException {
            InputStream inputStreamW = w(i10);
            if (inputStreamW != null) {
                return y.w(inputStreamW);
            }
            return null;
        }

        public void z(int i10, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter;
            try {
                outputStreamWriter = new OutputStreamWriter(y(i10), n.f66179w);
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter = null;
            }
            try {
                outputStreamWriter.write(str);
                y.this.z(outputStreamWriter);
            } catch (Throwable th3) {
                th = th3;
                y.this.z(outputStreamWriter);
                throw th;
            }
        }

        public void z() throws IOException {
            y.this.z(this, false);
        }

        public void w() {
            if (this.f66223c) {
                return;
            }
            try {
                z();
            } catch (IOException unused) {
            }
        }

        public void y() throws IOException {
            if (this.f66226y) {
                y.this.z(this, false);
                y.this.c(this.f66227z.f66235z);
            } else {
                y.this.z(this, true);
            }
            this.f66223c = true;
        }
    }

    /* JADX INFO: renamed from: com.taurusx.tax.g.n0.y$y, reason: collision with other inner class name */
    public final class C0796y {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public w f66230c;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f66231o;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final long[] f66233w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f66234y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final String f66235z;

        public /* synthetic */ C0796y(y yVar, String str, z zVar) {
            this(str);
        }

        public C0796y(String str) {
            this.f66235z = str;
            this.f66233w = new long[y.this.f66216y];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(String[] strArr) throws IOException {
            if (strArr.length != y.this.f66216y) {
                throw z(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f66233w[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw z(strArr);
                }
            }
        }

        public String z() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f66233w) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        public File w(int i10) {
            return new File(y.this.f66210n, this.f66235z + "." + i10 + ".tmp");
        }

        private IOException z(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File z(int i10) {
            return new File(y.this.f66210n, this.f66235z + "." + i10);
        }
    }

    public class z implements Callable<Void> {
        public z() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (y.this) {
                try {
                    if (y.this.f66211o == null) {
                        return null;
                    }
                    y.this.m();
                    if (y.this.a()) {
                        y.this.t();
                        y.this.f66204a = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public y(File file, int i10, int i11, long j10) {
        this.f66210n = file;
        this.f66217z = i10;
        this.f66214t = new File(file, f66202v);
        this.f66207g = new File(file, f66199l);
        this.f66206f = new File(file, f66195e);
        this.f66216y = i11;
        this.f66215w = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        int i10 = this.f66204a;
        return i10 >= 2000 && i10 >= this.f66213s.size();
    }

    private void g() throws IOException {
        com.taurusx.tax.g.n0.w wVar = new com.taurusx.tax.g.n0.w(new FileInputStream(this.f66214t), n.f66182z);
        try {
            String strW = wVar.w();
            String strW2 = wVar.w();
            String strW3 = wVar.w();
            String strW4 = wVar.w();
            String strW5 = wVar.w();
            if (!f66198k.equals(strW) || !"1".equals(strW2) || !Integer.toString(this.f66217z).equals(strW3) || !Integer.toString(this.f66216y).equals(strW4) || !"".equals(strW5)) {
                throw new IOException("unexpected journal header: [" + strW + ", " + strW2 + ", " + strW4 + ", " + strW5 + C4240b4.j.f42674e);
            }
            int i10 = 0;
            while (true) {
                try {
                    y(wVar.w());
                    i10++;
                } catch (EOFException unused) {
                    this.f66204a = i10 - this.f66213s.size();
                    z(wVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            z(wVar);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() throws IOException {
        while (this.f66205c > this.f66215w) {
            c(this.f66213s.entrySet().iterator().next().getKey());
        }
    }

    private void n() throws IOException {
        w(this.f66207g);
        Iterator<C0796y> it = this.f66213s.values().iterator();
        while (it.hasNext()) {
            C0796y next = it.next();
            int i10 = 0;
            if (next.f66230c == null) {
                while (i10 < this.f66216y) {
                    this.f66205c += next.f66233w[i10];
                    i10++;
                }
            } else {
                next.f66230c = null;
                while (i10 < this.f66216y) {
                    w(next.z(i10));
                    w(next.w(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void t() throws IOException {
        try {
            Writer writer = this.f66211o;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f66207g), n.f66182z));
            try {
                bufferedWriter.write(f66198k);
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write("1");
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(Integer.toString(this.f66217z));
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(Integer.toString(this.f66216y));
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                for (C0796y c0796y : this.f66213s.values()) {
                    if (c0796y.f66230c != null) {
                        bufferedWriter.write("DIRTY " + c0796y.f66235z + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + c0796y.f66235z + c0796y.z() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.f66214t.exists()) {
                    z(this.f66214t, this.f66206f, true);
                }
                z(this.f66207g, this.f66214t, false);
                this.f66206f.delete();
                this.f66211o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f66214t, true), n.f66182z));
            } catch (Throwable th2) {
                bufferedWriter.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f66211o == null) {
                return;
            }
            for (C0796y c0796y : new ArrayList(this.f66213s.values())) {
                if (c0796y.f66230c != null) {
                    c0796y.f66230c.z();
                }
            }
            m();
            this.f66211o.close();
            this.f66211o = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long f() {
        return this.f66205c;
    }

    public static void w(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private void y(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith(f66193b)) {
                this.f66213s.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        C0796y c0796y = this.f66213s.get(strSubstring);
        z zVar = null;
        if (c0796y == null) {
            c0796y = new C0796y(this, strSubstring, zVar);
            this.f66213s.put(strSubstring, c0796y);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(f66196h)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            c0796y.f66234y = true;
            c0796y.f66230c = null;
            c0796y.w(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(f66197j)) {
            c0796y.f66230c = new w(this, c0796y, zVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith(f66194d)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public File c() {
        return this.f66210n;
    }

    public synchronized long o() {
        return this.f66215w;
    }

    public synchronized boolean s() {
        return this.f66211o == null;
    }

    private void o(String str) {
        if (f66200r.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
    }

    public synchronized boolean c(String str) throws IOException {
        try {
            z();
            o(str);
            C0796y c0796y = this.f66213s.get(str);
            if (c0796y != null && c0796y.f66230c == null) {
                for (int i10 = 0; i10 < this.f66216y; i10++) {
                    File fileZ = c0796y.z(i10);
                    if (fileZ.exists() && !fileZ.delete()) {
                        throw new IOException("failed to delete " + fileZ);
                    }
                    this.f66205c -= c0796y.f66233w[i10];
                    c0796y.f66233w[i10] = 0;
                }
                this.f66204a++;
                this.f66211o.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f66213s.remove(str);
                if (a()) {
                    this.f66212p.submit(this.f66208i);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public synchronized c w(String str) throws Throwable {
        Throwable th2;
        InputStream inputStream;
        try {
            z();
            o(str);
            C0796y c0796y = this.f66213s.get(str);
            if (c0796y == null) {
                return null;
            }
            if (!c0796y.f66234y) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.f66216y];
            for (int i10 = 0; i10 < this.f66216y; i10++) {
                try {
                    try {
                        try {
                            inputStreamArr[i10] = new FileInputStream(c0796y.z(i10));
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i11 = 0; i11 < this.f66216y && (inputStream = inputStreamArr[i11]) != null; i11++) {
                            z((Closeable) inputStream);
                        }
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                }
            }
            this.f66204a++;
            this.f66211o.append((CharSequence) ("READ " + str + '\n'));
            if (a()) {
                this.f66212p.submit(this.f66208i);
            }
            return new c(this, str, c0796y.f66231o, inputStreamArr, c0796y.f66233w, null);
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    public static y z(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 > 0) {
            File file2 = new File(file, f66195e);
            if (file2.exists()) {
                File file3 = new File(file, f66202v);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    z(file2, file3, false);
                }
            }
            y yVar = new y(file, i10, i11, j10);
            if (yVar.f66214t.exists()) {
                try {
                    yVar.g();
                    yVar.n();
                    yVar.f66211o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(yVar.f66214t, true), n.f66182z));
                    return yVar;
                } catch (IOException e10) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    yVar.w();
                }
            }
            file.mkdirs();
            y yVar2 = new y(file, i10, i11, j10);
            yVar2.t();
            return yVar2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public void w() throws IOException {
        close();
        z(this.f66210n);
    }

    public static String w(InputStream inputStream) throws IOException {
        return z((Reader) new InputStreamReader(inputStream, n.f66179w));
    }

    public synchronized void y() throws IOException {
        z();
        m();
        this.f66211o.flush();
    }

    public static void z(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            w(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public w z(String str) throws IOException {
        return z(str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized w z(String str, long j10) throws IOException {
        z();
        o(str);
        C0796y c0796y = this.f66213s.get(str);
        z zVar = null;
        if (j10 != -1 && (c0796y == null || c0796y.f66231o != j10)) {
            return null;
        }
        if (c0796y != null) {
            if (c0796y.f66230c != null) {
                return null;
            }
        } else {
            c0796y = new C0796y(this, str, zVar);
            this.f66213s.put(str, c0796y);
        }
        w wVar = new w(this, c0796y, zVar);
        c0796y.f66230c = wVar;
        this.f66211o.write("DIRTY " + str + '\n');
        this.f66211o.flush();
        return wVar;
    }

    public synchronized void z(long j10) {
        this.f66215w = j10;
        this.f66212p.submit(this.f66208i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void z(w wVar, boolean z10) throws IOException {
        C0796y c0796y = wVar.f66227z;
        if (c0796y.f66230c == wVar) {
            if (z10 && !c0796y.f66234y) {
                for (int i10 = 0; i10 < this.f66216y; i10++) {
                    if (wVar.f66225w[i10]) {
                        if (!c0796y.w(i10).exists()) {
                            wVar.z();
                            return;
                        }
                    } else {
                        wVar.z();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f66216y; i11++) {
                File fileW = c0796y.w(i11);
                if (z10) {
                    if (fileW.exists()) {
                        File fileZ = c0796y.z(i11);
                        fileW.renameTo(fileZ);
                        long j10 = c0796y.f66233w[i11];
                        long length = fileZ.length();
                        c0796y.f66233w[i11] = length;
                        this.f66205c = (this.f66205c - j10) + length;
                    }
                } else {
                    w(fileW);
                }
            }
            this.f66204a++;
            c0796y.f66230c = null;
            if (!(c0796y.f66234y | z10)) {
                this.f66213s.remove(c0796y.f66235z);
                this.f66211o.write("REMOVE " + c0796y.f66235z + '\n');
            } else {
                c0796y.f66234y = true;
                this.f66211o.write("CLEAN " + c0796y.f66235z + c0796y.z() + '\n');
                if (z10) {
                    long j11 = this.f66209m;
                    this.f66209m = 1 + j11;
                    c0796y.f66231o = j11;
                }
            }
            this.f66211o.flush();
            if (this.f66205c > this.f66215w || a()) {
                this.f66212p.submit(this.f66208i);
            }
            return;
        }
        throw new IllegalStateException();
    }

    private void z() {
        if (this.f66211o == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static String z(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i10 = reader.read(cArr);
                if (i10 != -1) {
                    stringWriter.write(cArr, 0, i10);
                } else {
                    String string = stringWriter.toString();
                    reader.close();
                    return string;
                }
            }
        } catch (Throwable th2) {
            reader.close();
            throw th2;
        }
    }

    private void z(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    z(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }
}
