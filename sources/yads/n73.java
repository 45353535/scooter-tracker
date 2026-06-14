package yads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class n73 extends wn {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f113745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f113746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f113747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f113748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatagramSocket f113749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MulticastSocket f113750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InetAddress f113751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f113752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f113753m;

    public n73(int i10) {
        super(true);
        this.f113745e = 8000;
        byte[] bArr = new byte[2000];
        this.f113746f = bArr;
        this.f113747g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // yads.c30
    public final long a(h30 h30Var) throws m73 {
        Uri uri = h30Var.f111452a;
        this.f113748h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f113748h.getPort();
        h();
        try {
            this.f113751k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f113751k, port);
            if (this.f113751k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f113750j = multicastSocket;
                multicastSocket.joinGroup(this.f113751k);
                this.f113749i = this.f113750j;
            } else {
                this.f113749i = new DatagramSocket(inetSocketAddress);
            }
            this.f113749i.setSoTimeout(this.f113745e);
            this.f113752l = true;
            b(h30Var);
            return -1L;
        } catch (IOException e10) {
            throw new m73(e10, 2001);
        } catch (SecurityException e11) {
            throw new m73(e11, 2006);
        }
    }

    @Override // yads.y20
    public final int c(byte[] bArr, int i10, int i11) throws m73 {
        if (i11 == 0) {
            return 0;
        }
        if (this.f113753m == 0) {
            try {
                DatagramSocket datagramSocket = this.f113749i;
                datagramSocket.getClass();
                datagramSocket.receive(this.f113747g);
                int length = this.f113747g.getLength();
                this.f113753m = length;
                c(length);
            } catch (SocketTimeoutException e10) {
                throw new m73(e10, 2002);
            } catch (IOException e11) {
                throw new m73(e11, 2001);
            }
        }
        int length2 = this.f113747g.getLength();
        int i12 = this.f113753m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f113746f, length2 - i12, bArr, i10, iMin);
        this.f113753m -= iMin;
        return iMin;
    }

    @Override // yads.c30
    public final void close() {
        this.f113748h = null;
        MulticastSocket multicastSocket = this.f113750j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f113751k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f113750j = null;
        }
        DatagramSocket datagramSocket = this.f113749i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f113749i = null;
        }
        this.f113751k = null;
        this.f113753m = 0;
        if (this.f113752l) {
            this.f113752l = false;
            g();
        }
    }

    @Override // yads.c30
    public final Uri e() {
        return this.f113748h;
    }
}
