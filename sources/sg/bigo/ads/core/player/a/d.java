package sg.bigo.ads.core.player.a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ServerSocket f104553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104554c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Thread f104557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f104558g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f104555d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.common.n.e f104552a = new sg.bigo.ads.common.n.e("Play", 3, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, e> f104556e = new ConcurrentHashMap();

    final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Socket f104560b;

        public a(Socket socket) {
            this.f104560b = socket;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            int i10;
            boolean z11;
            long j10;
            String str;
            String strA;
            String strA2;
            d dVar = d.this;
            Socket socket = this.f104560b;
            try {
                try {
                    try {
                        sg.bigo.ads.core.player.a.b bVarA = sg.bigo.ads.core.player.a.b.a(socket.getInputStream());
                        if (bVarA == null) {
                            d.a(socket);
                            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Opened connections: " + dVar.b());
                            return;
                        }
                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Request to cache proxy:request=".concat(String.valueOf(bVarA)));
                        String strF = q.f(bVarA.f104548a);
                        if ("ping".equals(strF)) {
                            try {
                                OutputStream outputStream = socket.getOutputStream();
                                outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
                                outputStream.write("ping ok".getBytes());
                            } catch (IOException e10) {
                                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Pinger#responseToPing, error message is : " + e10.toString());
                            }
                        } else if (!TextUtils.isEmpty(strF)) {
                            final e eVarA = dVar.a(strF);
                            if (eVarA.a()) {
                                try {
                                    if (SystemClock.elapsedRealtime() - eVarA.f104567e > 300000) {
                                        int andSet = eVarA.f104568f.getAndSet(0);
                                        eVarA.f104567e = SystemClock.elapsedRealtime();
                                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "reset resetRetryCount=".concat(String.valueOf(andSet)));
                                    }
                                    eVarA.f104563a.incrementAndGet();
                                    if (eVarA.f104565c != null && eVarA.f104565c.f102466j != 1 && !eVarA.f104565c.b() && SystemClock.elapsedRealtime() - eVarA.f104566d > 15000 && eVarA.f104568f.getAndIncrement() < 3) {
                                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "keepDownloadTaskAlive retryCount=" + eVarA.f104568f.get());
                                        eVarA.f104566d = SystemClock.elapsedRealtime();
                                        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.e.1
                                            AnonymousClass1() {
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                sg.bigo.ads.core.player.b.a().f104593g.a(e.this.f104565c, true);
                                            }
                                        });
                                    }
                                    c cVar = eVarA.f104564b;
                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
                                    String strF2 = q.f(bVarA.f104548a);
                                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                                    String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(strF2);
                                    String mimeTypeFromExtension = TextUtils.isEmpty(fileExtensionFromUrl) ? null : singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
                                    boolean zIsEmpty = TextUtils.isEmpty(mimeTypeFromExtension);
                                    long jA = cVar.f104551a.c() ? cVar.f104551a.a() : cVar.f104551a.f104544b.f102465i;
                                    if (jA >= 0) {
                                        z10 = true;
                                        i10 = 0;
                                    } else {
                                        z10 = false;
                                        i10 = 0;
                                    }
                                    boolean z12 = bVarA.f104550c;
                                    if (z12) {
                                        z11 = z12;
                                        j10 = jA - bVarA.f104549b;
                                    } else {
                                        z11 = z12;
                                        j10 = jA;
                                    }
                                    int i11 = (z10 && z11) ? 1 : i10;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(bVarA.f104550c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
                                    sb2.append("Accept-Ranges: bytes\n");
                                    String strA3 = "";
                                    if (z10) {
                                        str = "";
                                        Long lValueOf = Long.valueOf(j10);
                                        Object[] objArr = new Object[1];
                                        objArr[i10] = lValueOf;
                                        strA3 = c.a("Content-Length: %d\n", objArr);
                                    } else {
                                        str = "";
                                    }
                                    sb2.append(strA3);
                                    if (i11 != 0) {
                                        Long lValueOf2 = Long.valueOf(bVarA.f104549b);
                                        Long lValueOf3 = Long.valueOf(jA - 1);
                                        Long lValueOf4 = Long.valueOf(jA);
                                        Object[] objArr2 = new Object[3];
                                        objArr2[i10] = lValueOf2;
                                        objArr2[1] = lValueOf3;
                                        objArr2[2] = lValueOf4;
                                        strA = c.a("Content-Range: bytes %d-%d/%d\n", objArr2);
                                    } else {
                                        strA = str;
                                    }
                                    sb2.append(strA);
                                    if (zIsEmpty) {
                                        strA2 = str;
                                    } else {
                                        Object[] objArr3 = new Object[1];
                                        objArr3[i10] = mimeTypeFromExtension;
                                        strA2 = c.a("Content-Type: %s\n", objArr3);
                                    }
                                    sb2.append(strA2);
                                    sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                                    String string = sb2.toString();
                                    sg.bigo.ads.common.t.a.a(i10, 3, "ProxyCache", "newResponseHeaders =".concat(String.valueOf(string)));
                                    bufferedOutputStream.write(string.getBytes("UTF-8"));
                                    cVar.a(bufferedOutputStream, bVarA.f104549b);
                                } catch (Throwable th2) {
                                    eVarA.b();
                                    throw th2;
                                }
                            } else {
                                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "startProcessRequest failed");
                            }
                            eVarA.b();
                        }
                    } catch (SocketException unused) {
                        sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Closing socket… Socket is closed by client.");
                        d.a(socket);
                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Opened connections: " + dVar.b());
                    } catch (IOException e11) {
                        e = e11;
                        sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                        d.a(socket);
                        sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Opened connections: " + dVar.b());
                    }
                } catch (j e12) {
                    e = e12;
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error processing request, error message is : " + e.toString());
                    d.a(socket);
                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Opened connections: " + dVar.b());
                }
            } finally {
                d.a(socket);
                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Opened connections: " + dVar.b());
            }
        }
    }

    final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CountDownLatch f104562b;

        public b(CountDownLatch countDownLatch) {
            this.f104562b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f104562b.countDown();
            d dVar = d.this;
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Socket socketAccept = dVar.f104553b.accept();
                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Accept new socket socket=".concat(String.valueOf(socketAccept)));
                    dVar.f104552a.submit(dVar.new a(socketAccept));
                } catch (Throwable th2) {
                    sg.bigo.ads.core.d.b.a(3005, 10111, th2.toString());
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error during waiting connection, error message is : " + th2.toString());
                    return;
                }
            }
        }
    }

    public d() {
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.f104553b = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.f104554c = localPort;
            f.a("127.0.0.1", localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new b(countDownLatch));
            this.f104557f = thread;
            thread.setName("BGAd-Conn");
            this.f104557f.start();
            countDownLatch.await();
            this.f104558g = new h("127.0.0.1", this.f104554c);
            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Proxy cache server started. Is it alive? " + a());
        } catch (IOException | InterruptedException e10) {
            this.f104552a.shutdown();
            sg.bigo.ads.core.d.b.a(3005, 10110, "Error starting local proxy server, error message is : " + e10.toString());
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error starting local proxy server, error message is : " + e10.toString());
        }
    }

    final e a(String str) {
        e eVar;
        synchronized (this.f104555d) {
            try {
                eVar = this.f104556e.get(str);
                if (eVar == null) {
                    eVar = new e(str);
                    this.f104556e.put(str, eVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    final int b() {
        int i10;
        synchronized (this.f104555d) {
            try {
                Iterator<e> it = this.f104556e.values().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    i10 += it.next().f104563a.get();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    static void a(Socket socket) {
        String str;
        try {
            if (!socket.isInputShutdown()) {
                socket.shutdownInput();
            }
        } catch (SocketException unused) {
            str = "Releasing input stream… Socket is closed by client.";
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", str);
        } catch (IOException e10) {
            str = "Error closing socket input stream, error message is " + e10.getMessage();
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", str);
        }
        try {
            if (!socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        } catch (IOException e11) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Failed to close socket on proxy side: {}. It seems client have already closed connection." + e11.getMessage());
        }
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e12) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error closing socket" + e12.getMessage());
        }
    }

    public final boolean a() {
        h hVar = this.f104558g;
        return hVar != null && hVar.a();
    }
}
