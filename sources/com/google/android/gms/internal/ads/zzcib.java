package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes8.dex */
final class zzcib extends SSLSocketFactory {
    final SSLSocketFactory zza;
    final /* synthetic */ zzcic zzb;

    zzcib(zzcic zzcicVar) {
        Objects.requireNonNull(zzcicVar);
        this.zzb = zzcicVar;
        this.zza = (SSLSocketFactory) SSLSocketFactory.getDefault();
    }

    private final Socket zza(Socket socket) throws SocketException {
        zzcic zzcicVar = this.zzb;
        if (zzcicVar.zzm() > 0) {
            socket.setReceiveBufferSize(zzcicVar.zzm());
        }
        zzcicVar.zzl(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(str, i10);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(str, i10, inetAddress, i11);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(inetAddress, i10);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(inetAddress, i10, inetAddress2, i11);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        Socket socketCreateSocket = this.zza.createSocket(socket, str, i10, z10);
        zza(socketCreateSocket);
        return socketCreateSocket;
    }
}
