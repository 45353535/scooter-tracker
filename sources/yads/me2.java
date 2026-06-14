package yads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class me2 extends SSLSocketFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f113450b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f113451a;

    public me2(SSLSocketFactory sSLSocketFactory) {
        this.f113451a = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) throws IOException {
        Socket socketCreateSocket = this.f113451a.createSocket(str, i10);
        String[] strArrA = le2.a(this.f113451a);
        Intrinsics.checkNotNull(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return le2.a(this.f113451a);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return le2.b(this.f113451a);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        Socket socketCreateSocket = this.f113451a.createSocket(str, i10, inetAddress, i11);
        String[] strArrA = le2.a(this.f113451a);
        Intrinsics.checkNotNull(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        Socket socketCreateSocket = this.f113451a.createSocket(inetAddress, i10);
        String[] strArrA = le2.a(this.f113451a);
        Intrinsics.checkNotNull(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        Socket socketCreateSocket = this.f113451a.createSocket(inetAddress, i10, inetAddress2, i11);
        String[] strArrA = le2.a(this.f113451a);
        Intrinsics.checkNotNull(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        Socket socketCreateSocket = this.f113451a.createSocket(socket, str, i10, z10);
        String[] strArrA = le2.a(this.f113451a);
        Intrinsics.checkNotNull(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }
}
