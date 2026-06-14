package la;

import android.os.SystemClock;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import ka.o;
import ka.p;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f94083a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f94084b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f94085c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f94086d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f94087e = "time.android.com";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f94088f = 1000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f94089g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f94090h = -9223372036854775807L;

    public interface b {
        void onInitializationFailed(IOException iOException);

        void onInitialized();
    }

    private static void h(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        }
        if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    public static long i() {
        long j10;
        synchronized (f94084b) {
            try {
                j10 = f94085c ? f94086d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    public static String j() {
        String str;
        synchronized (f94084b) {
            str = f94087e;
        }
        return str;
    }

    public static int k() {
        int i10;
        synchronized (f94084b) {
            i10 = f94088f;
        }
        return i10;
    }

    public static void l(o oVar, b bVar) {
        if (m()) {
            if (bVar != null) {
                bVar.onInitialized();
            }
        } else {
            if (oVar == null) {
                oVar = new o("SntpClient");
            }
            oVar.m(new d(), new C1077c(bVar), 1);
        }
    }

    public static boolean m() {
        boolean z10;
        synchronized (f94084b) {
            try {
                if (f94090h != -9223372036854775807L && f94089g != -9223372036854775807L) {
                    f94085c = f94085c && SystemClock.elapsedRealtime() - f94090h < f94089g;
                }
                z10 = f94085c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long n() {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(k());
            InetAddress[] allByName = InetAddress.getAllByName(j());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i10], 123);
                bArr[0] = Ascii.ESC;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                q(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j10 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                    byte b10 = bArr[0];
                    int i12 = bArr[1] & 255;
                    long jP = p(bArr, 24);
                    long jP2 = p(bArr, 32);
                    long jP3 = p(bArr, 40);
                    h((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i12, jP3);
                    long j11 = (j10 + (((jP2 - jP) + (jP3 - j10)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j11;
                } catch (SocketTimeoutException e10) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e10;
                    } else {
                        socketTimeoutException.addSuppressed(e10);
                    }
                    int i13 = i11 + 1;
                    if (i11 >= 10) {
                        throw ((SocketTimeoutException) q9.a.e(socketTimeoutException));
                    }
                    i10++;
                    i11 = i13;
                }
            }
            throw ((SocketTimeoutException) q9.a.e(socketTimeoutException));
        } finally {
        }
    }

    private static long o(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    private static long p(byte[] bArr, int i10) {
        long jO = o(bArr, i10);
        long jO2 = o(bArr, i10 + 4);
        if (jO == 0 && jO2 == 0) {
            return 0L;
        }
        return ((jO - 2208988800L) * 1000) + ((jO2 * 1000) / 4294967296L);
    }

    private static void q(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        bArr[i10] = (byte) (r2 >> 24);
        bArr[i10 + 1] = (byte) (r2 >> 16);
        bArr[i10 + 2] = (byte) (r2 >> 8);
        bArr[i10 + 3] = (byte) (j11 + 2208988800L);
        long j13 = (j12 * 4294967296L) / 1000;
        bArr[i10 + 4] = (byte) (j13 >> 24);
        bArr[i10 + 5] = (byte) (j13 >> 16);
        bArr[i10 + 6] = (byte) (j13 >> 8);
        bArr[i10 + 7] = (byte) (Math.random() * 255.0d);
    }

    private static final class d implements o.e {
        private d() {
        }

        @Override // ka.o.e
        public void load() {
            synchronized (c.f94083a) {
                synchronized (c.f94084b) {
                    if (c.f94085c) {
                        return;
                    }
                    long jN = c.n();
                    synchronized (c.f94084b) {
                        long unused = c.f94090h = SystemClock.elapsedRealtime();
                        long unused2 = c.f94086d = jN;
                        boolean unused3 = c.f94085c = true;
                    }
                }
            }
        }

        @Override // ka.o.e
        public void cancelLoad() {
        }
    }

    /* JADX INFO: renamed from: la.c$c, reason: collision with other inner class name */
    private static final class C1077c implements o.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f94091b;

        public C1077c(b bVar) {
            this.f94091b = bVar;
        }

        @Override // ka.o.b
        public void f(o.e eVar, long j10, long j11) {
            if (this.f94091b != null) {
                if (c.m()) {
                    this.f94091b.onInitialized();
                } else {
                    this.f94091b.onInitializationFailed(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // ka.o.b
        public o.c g(o.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f94091b;
            if (bVar != null) {
                bVar.onInitializationFailed(iOException);
            }
            return o.f93115f;
        }

        @Override // ka.o.b
        public /* synthetic */ void i(o.e eVar, long j10, long j11, int i10) {
            p.a(this, eVar, j10, j11, i10);
        }

        @Override // ka.o.b
        public void h(o.e eVar, long j10, long j11, boolean z10) {
        }
    }
}
