package s9;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes12.dex */
public final class z extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f99905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f99906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DatagramPacket f99907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f99908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DatagramSocket f99909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MulticastSocket f99910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InetAddress f99911k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f99912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f99913m;

    public static final class a extends h {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public z() {
        this(2000);
    }

    @Override // s9.g
    public long b(k kVar) throws a {
        Uri uri = kVar.f99819a;
        this.f99908h = uri;
        String str = (String) q9.a.e(uri.getHost());
        int port = this.f99908h.getPort();
        e(kVar);
        try {
            this.f99911k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f99911k, port);
            if (this.f99911k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f99910j = multicastSocket;
                multicastSocket.joinGroup(this.f99911k);
                this.f99909i = this.f99910j;
            } else {
                this.f99909i = new DatagramSocket(inetSocketAddress);
            }
            this.f99909i.setSoTimeout(this.f99905e);
            this.f99912l = true;
            f(kVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override // s9.g
    public void close() {
        this.f99908h = null;
        MulticastSocket multicastSocket = this.f99910j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) q9.a.e(this.f99911k));
            } catch (IOException unused) {
            }
            this.f99910j = null;
        }
        DatagramSocket datagramSocket = this.f99909i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f99909i = null;
        }
        this.f99911k = null;
        this.f99913m = 0;
        if (this.f99912l) {
            this.f99912l = false;
            d();
        }
    }

    @Override // s9.g
    public Uri getUri() {
        return this.f99908h;
    }

    @Override // n9.h
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f99913m == 0) {
            try {
                ((DatagramSocket) q9.a.e(this.f99909i)).receive(this.f99907g);
                int length = this.f99907g.getLength();
                this.f99913m = length;
                c(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f99907g.getLength();
        int i12 = this.f99913m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f99906f, length2 - i12, bArr, i10, iMin);
        this.f99913m -= iMin;
        return iMin;
    }

    public z(int i10) {
        this(i10, 8000);
    }

    public z(int i10, int i11) {
        super(true);
        this.f99905e = i11;
        byte[] bArr = new byte[i10];
        this.f99906f = bArr;
        this.f99907g = new DatagramPacket(bArr, 0, i10);
    }
}
