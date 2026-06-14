package yads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class bg0 implements dr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f108993a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f108994b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yf0 f108995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f108996d;

    public bg0(File file, int i10) {
        this.f108995c = new yf0(file);
        this.f108996d = i10;
    }

    @Override // yads.dr
    public final synchronized void a() {
        long length;
        ag0 ag0Var;
        File file = this.f108995c.f118169a;
        if (!file.exists()) {
            if (!file.mkdirs()) {
                file.getAbsolutePath();
                boolean z10 = rj3.f115467a;
                boolean z11 = lb1.f113032a;
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                length = file2.length();
                ag0Var = new ag0(new BufferedInputStream(new FileInputStream(file2)), length);
            } catch (IOException unused) {
                file2.delete();
            } catch (Throwable unused2) {
                file2.delete();
            }
            try {
                try {
                    zf0 zf0VarA = zf0.a(ag0Var);
                    zf0VarA.f118645a = length;
                    String str = zf0VarA.f118646b;
                    if (this.f108993a.containsKey(str)) {
                        this.f108994b = (zf0VarA.f118645a - ((zf0) this.f108993a.get(str)).f118645a) + this.f108994b;
                    } else {
                        this.f108994b += zf0VarA.f118645a;
                    }
                    this.f108993a.put(str, zf0VarA);
                    ag0Var.close();
                } catch (Throwable unused3) {
                    continue;
                }
            } catch (Throwable th2) {
                ag0Var.close();
                throw th2;
            }
        }
    }

    public final void b() {
        if (this.f108994b < this.f108996d) {
            return;
        }
        if (rj3.f115467a) {
            boolean z10 = lb1.f113032a;
        }
        SystemClock.elapsedRealtime();
        Iterator it = this.f108993a.entrySet().iterator();
        while (it.hasNext()) {
            zf0 zf0Var = (zf0) ((Map.Entry) it.next()).getValue();
            String str = zf0Var.f118646b;
            File file = this.f108995c.f118169a;
            int length = str.length() / 2;
            if (new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete()) {
                this.f108994b -= zf0Var.f118645a;
            } else {
                String str2 = zf0Var.f118646b;
                int length2 = str2.length() / 2;
                String.valueOf(str2.substring(0, length2).hashCode());
                String.valueOf(str2.substring(length2).hashCode());
                boolean z11 = lb1.f113032a;
            }
            it.remove();
            if (this.f108994b < this.f108996d * 0.9f) {
                break;
            }
        }
        if (rj3.f115467a) {
            SystemClock.elapsedRealtime();
            boolean z12 = lb1.f113032a;
        }
    }

    @Override // yads.dr
    public final synchronized cr get(String str) {
        zf0 zf0Var = (zf0) this.f108993a.get(str);
        if (zf0Var == null) {
            return null;
        }
        File file = this.f108995c.f118169a;
        int length = str.length() / 2;
        File file2 = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode()));
        try {
            ag0 ag0Var = new ag0(new BufferedInputStream(new FileInputStream(file2)), file2.length());
            try {
                if (TextUtils.equals(str, zf0.a(ag0Var).f118646b)) {
                    return zf0Var.a(a(ag0Var, ag0Var.f108680a - ag0Var.f108681b));
                }
                file2.getAbsolutePath();
                boolean z10 = rj3.f115467a;
                boolean z11 = lb1.f113032a;
                zf0 zf0Var2 = (zf0) this.f108993a.remove(str);
                if (zf0Var2 != null) {
                    this.f108994b -= zf0Var2.f118645a;
                }
                return null;
            } finally {
                ag0Var.close();
            }
        } catch (IOException unused) {
            file2.getAbsolutePath();
            boolean z12 = rj3.f115467a;
            boolean z13 = lb1.f113032a;
            b(str);
            return null;
        }
    }

    @Override // yads.dr
    public final synchronized void a(String str) {
        cr crVar = get(str);
        if (crVar != null) {
            crVar.f109528f = 0L;
            crVar.f109527e = 0L;
            a(str, crVar);
        }
    }

    public static long b(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            long j10 = ((long) i10) & 255;
            int i11 = inputStream.read();
            if (i11 != -1) {
                long j11 = j10 | ((((long) i11) & 255) << 8);
                int i12 = inputStream.read();
                if (i12 != -1) {
                    long j12 = j11 | ((((long) i12) & 255) << 16);
                    int i13 = inputStream.read();
                    if (i13 != -1) {
                        long j13 = j12 | ((((long) i13) & 255) << 24);
                        int i14 = inputStream.read();
                        if (i14 != -1) {
                            long j14 = j13 | ((((long) i14) & 255) << 32);
                            int i15 = inputStream.read();
                            if (i15 != -1) {
                                long j15 = j14 | ((((long) i15) & 255) << 40);
                                int i16 = inputStream.read();
                                if (i16 != -1) {
                                    long j16 = j15 | ((((long) i16) & 255) << 48);
                                    int i17 = inputStream.read();
                                    if (i17 != -1) {
                                        return ((((long) i17) & 255) << 56) | j16;
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new EOFException();
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // yads.dr
    public final synchronized void a(String str, cr crVar) {
        BufferedOutputStream bufferedOutputStream;
        zf0 zf0Var;
        long length = this.f108994b + ((long) crVar.f109523a.length);
        int i10 = this.f108996d;
        if (length <= i10 || r2.length <= i10 * 0.9f) {
            File file = this.f108995c.f118169a;
            int length2 = str.length() / 2;
            File file2 = new File(file, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode()));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                zf0Var = new zf0(str, crVar.f109524b, crVar.f109525c, crVar.f109526d, crVar.f109527e, crVar.f109528f, zf0.a(crVar));
            } catch (IOException unused) {
                if (!file2.delete()) {
                    file2.getAbsolutePath();
                    boolean z10 = rj3.f115467a;
                    boolean z11 = lb1.f113032a;
                }
                if (!this.f108995c.f118169a.exists()) {
                    boolean z12 = rj3.f115467a;
                    boolean z13 = lb1.f113032a;
                    this.f108993a.clear();
                    this.f108994b = 0L;
                    a();
                }
            }
            if (zf0Var.a(bufferedOutputStream)) {
                bufferedOutputStream.write(crVar.f109523a);
                bufferedOutputStream.close();
                zf0Var.f118645a = file2.length();
                if (!this.f108993a.containsKey(str)) {
                    this.f108994b += zf0Var.f118645a;
                } else {
                    this.f108994b = (zf0Var.f118645a - ((zf0) this.f108993a.get(str)).f118645a) + this.f108994b;
                }
                this.f108993a.put(str, zf0Var);
                b();
                return;
            }
            bufferedOutputStream.close();
            file2.getAbsolutePath();
            boolean z14 = rj3.f115467a;
            boolean z15 = lb1.f113032a;
            throw new IOException();
        }
    }

    public final synchronized void b(String str) {
        try {
            File file = this.f108995c.f118169a;
            int length = str.length() / 2;
            boolean zDelete = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete();
            zf0 zf0Var = (zf0) this.f108993a.remove(str);
            if (zf0Var != null) {
                this.f108994b -= zf0Var.f118645a;
            }
            if (!zDelete) {
                int length2 = str.length() / 2;
                String.valueOf(str.substring(0, length2).hashCode());
                String.valueOf(str.substring(length2).hashCode());
                boolean z10 = rj3.f115467a;
                boolean z11 = lb1.f113032a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int a(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            int i11 = inputStream.read();
            if (i11 != -1) {
                int i12 = i10 | (i11 << 8);
                int i13 = inputStream.read();
                if (i13 != -1) {
                    int i14 = i12 | (i13 << 16);
                    int i15 = inputStream.read();
                    if (i15 != -1) {
                        return (i15 << 24) | i14;
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public static byte[] a(ag0 ag0Var, long j10) throws IOException {
        long j11 = ag0Var.f108680a - ag0Var.f108681b;
        if (j10 >= 0 && j10 <= j11) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(ag0Var).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + j11);
    }

    public static void a(BufferedOutputStream bufferedOutputStream, int i10) throws IOException {
        bufferedOutputStream.write(i10 & 255);
        bufferedOutputStream.write((i10 >> 8) & 255);
        bufferedOutputStream.write((i10 >> 16) & 255);
        bufferedOutputStream.write((i10 >> 24) & 255);
    }

    public static void a(BufferedOutputStream bufferedOutputStream, long j10) throws IOException {
        bufferedOutputStream.write((byte) j10);
        bufferedOutputStream.write((byte) (j10 >>> 8));
        bufferedOutputStream.write((byte) (j10 >>> 16));
        bufferedOutputStream.write((byte) (j10 >>> 24));
        bufferedOutputStream.write((byte) (j10 >>> 32));
        bufferedOutputStream.write((byte) (j10 >>> 40));
        bufferedOutputStream.write((byte) (j10 >>> 48));
        bufferedOutputStream.write((byte) (j10 >>> 56));
    }
}
