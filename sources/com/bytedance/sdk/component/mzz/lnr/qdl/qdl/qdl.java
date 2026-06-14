package com.bytedance.sdk.component.mzz.lnr.qdl.qdl;

import android.util.Log;
import com.bytedance.sdk.component.utils.to;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.g.n0.y;
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
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class qdl implements Closeable, AutoCloseable {
    private Writer fs;
    private final int jpc;
    private final File mml;
    private final File mo;
    private final File mzz;
    private int rdp;
    private final int to;
    private long tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    final ExecutorService f16592ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final File f16593wd;
    static final Pattern qdl = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream lnr = new OutputStream() { // from class: com.bytedance.sdk.component.mzz.lnr.qdl.qdl.qdl.2
        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
        }
    };
    private long rq = 0;
    private final LinkedHashMap<String, ud> exu = new LinkedHashMap<>(0, 0.75f, true);
    private long bjy = -1;
    private long jtx = 0;
    private final Callable<Void> yt = new Callable<Void>() { // from class: com.bytedance.sdk.component.mzz.lnr.qdl.qdl.qdl.1
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (qdl.this) {
                try {
                    if (qdl.this.fs == null) {
                        return null;
                    }
                    qdl.this.jpc();
                    if (qdl.this.mo()) {
                        qdl.this.mzz();
                        qdl.this.rdp = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    public final class lnr implements Closeable, AutoCloseable {
        private final long lnr;
        private final InputStream[] mml;
        private final long[] mzz;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final String f16594ud;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.mml) {
                to.qdl(inputStream);
            }
        }

        public InputStream qdl(int i10) {
            return this.mml[i10];
        }

        private lnr(String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.f16594ud = str;
            this.lnr = j10;
            this.mml = inputStreamArr;
            this.mzz = jArr;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.mzz.lnr.qdl.qdl.qdl$qdl, reason: collision with other inner class name */
    public final class C0232qdl {
        private final boolean[] lnr;
        private boolean mml;
        private boolean mzz;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final ud f16595ud;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.mzz.lnr.qdl.qdl.qdl$qdl$qdl, reason: collision with other inner class name */
        private class C0233qdl extends FilterOutputStream implements AutoCloseable {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0232qdl.this.mml = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0232qdl.this.mml = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    C0232qdl.this.mml = true;
                }
            }

            private C0233qdl(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    C0232qdl.this.mml = true;
                }
            }
        }

        private C0232qdl(ud udVar) {
            this.f16595ud = udVar;
            this.lnr = udVar.mml ? null : new boolean[qdl.this.to];
        }

        public void ud() throws IOException {
            qdl.this.qdl(this, false);
        }

        public OutputStream qdl(int i10) throws IOException {
            FileOutputStream fileOutputStream;
            C0233qdl c0233qdl;
            if (i10 < 0 || i10 >= qdl.this.to) {
                throw new IllegalArgumentException("Expected index " + i10 + " to be greater than 0 and less than the maximum value count of " + qdl.this.to);
            }
            synchronized (qdl.this) {
                try {
                    if (this.f16595ud.mzz == this) {
                        if (!this.f16595ud.mml) {
                            this.lnr[i10] = true;
                        }
                        File fileUd = this.f16595ud.ud(i10);
                        try {
                            fileOutputStream = new FileOutputStream(fileUd);
                        } catch (FileNotFoundException unused) {
                            qdl.this.mml.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(fileUd);
                            } catch (FileNotFoundException unused2) {
                                return qdl.lnr;
                            }
                        }
                        c0233qdl = new C0233qdl(fileOutputStream);
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c0233qdl;
        }

        public void qdl() throws IOException {
            if (this.mml) {
                qdl.this.qdl(this, false);
                qdl.this.lnr(this.f16595ud.f16596ud);
            } else {
                qdl.this.qdl(this, true);
            }
            this.mzz = true;
        }
    }

    private final class ud {
        private final long[] lnr;
        private boolean mml;
        private long mo;
        private C0232qdl mzz;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final String f16596ud;

        private ud(String str) {
            this.f16596ud = str;
            this.lnr = new long[qdl.this.to];
        }

        private IOException ud(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File ud(int i10) {
            return new File(qdl.this.mml, this.f16596ud + "." + i10 + ".tmp");
        }

        public String qdl() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.lnr) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qdl(String[] strArr) throws IOException {
            if (strArr.length == qdl.this.to) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.lnr[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw ud(strArr);
                    }
                }
                return;
            }
            throw ud(strArr);
        }

        public File qdl(int i10) {
            return new File(qdl.this.mml, this.f16596ud + "." + i10);
        }
    }

    private qdl(File file, int i10, int i11, long j10, ExecutorService executorService) {
        this.mml = file;
        this.jpc = i10;
        this.mzz = new File(file, y.f66202v);
        this.mo = new File(file, y.f66199l);
        this.f16593wd = new File(file, y.f66195e);
        this.to = i11;
        this.tvp = j10;
        this.f16592ud = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpc() throws IOException {
        long j10 = this.tvp;
        long j11 = this.bjy;
        if (j11 >= 0) {
            j10 = j11;
        }
        while (this.rq > j10) {
            lnr(this.exu.entrySet().iterator().next().getKey());
        }
        this.bjy = -1L;
    }

    private void wd() {
        if (this.fs == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.fs == null) {
                return;
            }
            for (ud udVar : new ArrayList(this.exu.values())) {
                if (udVar.mzz != null) {
                    udVar.mzz.ud();
                }
            }
            jpc();
            this.fs.close();
            this.fs = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void lnr() throws IOException {
        com.bytedance.sdk.component.mzz.lnr.qdl.qdl.lnr lnrVar = new com.bytedance.sdk.component.mzz.lnr.qdl.qdl.lnr(new FileInputStream(this.mzz), mml.qdl);
        try {
            String strQdl = lnrVar.qdl();
            String strQdl2 = lnrVar.qdl();
            String strQdl3 = lnrVar.qdl();
            String strQdl4 = lnrVar.qdl();
            String strQdl5 = lnrVar.qdl();
            if (!y.f66198k.equals(strQdl) || !"1".equals(strQdl2) || !Integer.toString(this.jpc).equals(strQdl3) || !Integer.toString(this.to).equals(strQdl4) || !"".equals(strQdl5)) {
                throw new IOException("unexpected journal header: [" + strQdl + ", " + strQdl2 + ", " + strQdl4 + ", " + strQdl5 + C4240b4.j.f42674e);
            }
            int i10 = 0;
            while (true) {
                try {
                    mml(lnrVar.qdl());
                    i10++;
                } catch (EOFException unused) {
                    this.rdp = i10 - this.exu.size();
                    if (lnrVar.ud()) {
                        mzz();
                    } else {
                        this.fs = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mzz, true), mml.qdl));
                    }
                    to.qdl(lnrVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            to.qdl(lnrVar);
            throw th2;
        }
    }

    private void mml(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith(y.f66193b)) {
                this.exu.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        ud udVar = this.exu.get(strSubstring);
        if (udVar == null) {
            udVar = new ud(strSubstring);
            this.exu.put(strSubstring, udVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(y.f66196h)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            udVar.mml = true;
            udVar.mzz = null;
            udVar.qdl(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(y.f66197j)) {
            udVar.mzz = new C0232qdl(udVar);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith(y.f66194d)) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean mo() {
        int i10 = this.rdp;
        return i10 >= 2000 && i10 >= this.exu.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void mzz() throws IOException {
        try {
            Writer writer = this.fs;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mo), mml.qdl));
            try {
                bufferedWriter.write(y.f66198k);
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write("1");
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(Integer.toString(this.jpc));
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(Integer.toString(this.to));
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                for (ud udVar : this.exu.values()) {
                    if (udVar.mzz != null) {
                        bufferedWriter.write("DIRTY " + udVar.f16596ud + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + udVar.f16596ud + udVar.qdl() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.mzz.exists()) {
                    qdl(this.mzz, this.f16593wd, true);
                }
                qdl(this.mo, this.mzz, false);
                this.f16593wd.delete();
                this.fs = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mzz, true), mml.qdl));
            } catch (Throwable th2) {
                bufferedWriter.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public C0232qdl ud(String str) throws IOException {
        return qdl(str, -1L);
    }

    public void ud() throws IOException {
        close();
        mml.qdl(this.mml);
    }

    public static qdl qdl(File file, int i10, int i11, long j10, ExecutorService executorService) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 > 0) {
            File file2 = new File(file, y.f66195e);
            if (file2.exists()) {
                File file3 = new File(file, y.f66202v);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    qdl(file2, file3, false);
                }
            }
            qdl qdlVar = new qdl(file, i10, i11, j10, executorService);
            if (qdlVar.mzz.exists()) {
                try {
                    qdlVar.lnr();
                    qdlVar.mml();
                    return qdlVar;
                } catch (IOException e10) {
                    Log.w("DiskLruCache ", file + " is corrupt: " + e10.getMessage() + ", removing");
                    qdlVar.ud();
                }
            }
            file.mkdirs();
            qdl qdlVar2 = new qdl(file, i10, i11, j10, executorService);
            qdlVar2.mzz();
            return qdlVar2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public synchronized boolean lnr(String str) throws IOException {
        try {
            wd();
            mzz(str);
            ud udVar = this.exu.get(str);
            if (udVar != null && udVar.mzz == null) {
                for (int i10 = 0; i10 < this.to; i10++) {
                    File fileQdl = udVar.qdl(i10);
                    if (fileQdl.exists() && !fileQdl.delete()) {
                        throw new IOException("failed to delete ".concat(String.valueOf(fileQdl)));
                    }
                    this.rq -= udVar.lnr[i10];
                    udVar.lnr[i10] = 0;
                }
                this.rdp++;
                this.fs.append((CharSequence) ("REMOVE " + str + '\n'));
                this.exu.remove(str);
                if (mo()) {
                    this.f16592ud.submit(this.yt);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    private void mml() throws IOException {
        qdl(this.mo);
        Iterator<ud> it = this.exu.values().iterator();
        while (it.hasNext()) {
            ud next = it.next();
            int i10 = 0;
            if (next.mzz != null) {
                next.mzz = null;
                while (i10 < this.to) {
                    qdl(next.qdl(i10));
                    qdl(next.ud(i10));
                    i10++;
                }
                it.remove();
            } else {
                while (i10 < this.to) {
                    this.rq += next.lnr[i10];
                    i10++;
                }
            }
        }
    }

    private static void qdl(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void qdl(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            qdl(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void mzz(String str) {
        if (qdl.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    public synchronized lnr qdl(String str) throws Throwable {
        Throwable th2;
        InputStream inputStream;
        try {
            wd();
            mzz(str);
            ud udVar = this.exu.get(str);
            if (udVar == null) {
                return null;
            }
            if (!udVar.mml) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.to];
            for (int i10 = 0; i10 < this.to; i10++) {
                try {
                    try {
                        try {
                            inputStreamArr[i10] = new FileInputStream(udVar.qdl(i10));
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i11 = 0; i11 < this.to && (inputStream = inputStreamArr[i11]) != null; i11++) {
                            to.qdl(inputStream);
                        }
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                }
            }
            this.rdp++;
            this.fs.append((CharSequence) ("READ " + str + '\n'));
            if (mo()) {
                this.f16592ud.submit(this.yt);
            }
            return new lnr(str, udVar.mo, inputStreamArr, udVar.lnr);
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    private synchronized C0232qdl qdl(String str, long j10) throws IOException {
        wd();
        mzz(str);
        ud udVar = this.exu.get(str);
        if (j10 != -1 && (udVar == null || udVar.mo != j10)) {
            return null;
        }
        if (udVar != null) {
            if (udVar.mzz != null) {
                return null;
            }
        } else {
            udVar = new ud(str);
            this.exu.put(str, udVar);
        }
        C0232qdl c0232qdl = new C0232qdl(udVar);
        udVar.mzz = c0232qdl;
        this.fs.write("DIRTY " + str + '\n');
        this.fs.flush();
        return c0232qdl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void qdl(C0232qdl c0232qdl, boolean z10) throws IOException {
        ud udVar = c0232qdl.f16595ud;
        if (udVar.mzz == c0232qdl) {
            if (z10 && !udVar.mml) {
                for (int i10 = 0; i10 < this.to; i10++) {
                    if (c0232qdl.lnr[i10]) {
                        if (!udVar.ud(i10).exists()) {
                            c0232qdl.ud();
                            return;
                        }
                    } else {
                        c0232qdl.ud();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i10)));
                    }
                }
            }
            for (int i11 = 0; i11 < this.to; i11++) {
                File fileUd = udVar.ud(i11);
                if (z10) {
                    if (fileUd.exists()) {
                        File fileQdl = udVar.qdl(i11);
                        fileUd.renameTo(fileQdl);
                        long j10 = udVar.lnr[i11];
                        long length = fileQdl.length();
                        udVar.lnr[i11] = length;
                        this.rq = (this.rq - j10) + length;
                    }
                } else {
                    qdl(fileUd);
                }
            }
            this.rdp++;
            udVar.mzz = null;
            if (!(udVar.mml | z10)) {
                this.exu.remove(udVar.f16596ud);
                this.fs.write("REMOVE " + udVar.f16596ud + '\n');
            } else {
                udVar.mml = true;
                this.fs.write("CLEAN " + udVar.f16596ud + udVar.qdl() + '\n');
                if (z10) {
                    long j11 = this.jtx;
                    this.jtx = 1 + j11;
                    udVar.mo = j11;
                }
            }
            this.fs.flush();
            if (this.rq > this.tvp || mo()) {
                this.f16592ud.submit(this.yt);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized void qdl() throws IOException {
        wd();
        jpc();
        this.fs.flush();
    }
}
