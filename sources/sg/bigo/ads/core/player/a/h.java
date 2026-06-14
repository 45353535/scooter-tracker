package sg.bigo.ads.core.player.a;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sg.bigo.ads.common.m;

/* JADX INFO: loaded from: classes4.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f104578a = Executors.newSingleThreadExecutor(new sg.bigo.ads.common.n.c("Ping"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f104579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f104580c;

    class a implements Callable<Boolean> {
        private a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Boolean call() {
            return Boolean.valueOf(h.this.b());
        }

        /* synthetic */ a(h hVar, byte b10) {
            this();
        }
    }

    h(String str, int i10) {
        this.f104579b = (String) m.a(str);
        this.f104580c = i10;
    }

    private List<Proxy> c() {
        ArrayList arrayList = new ArrayList();
        try {
            return ProxySelector.getDefault().select(new URI(d()));
        } catch (URISyntaxException e10) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Pinger#getDefaultProxies, error message is : " + e10.toString());
            return arrayList;
        }
    }

    private String d() {
        return String.format(Locale.US, "http://%s:%d/%s", this.f104579b, Integer.valueOf(this.f104580c), "ping");
    }

    final boolean a() {
        String str;
        int i10 = 70;
        byte b10 = 0;
        int i11 = 0;
        while (i11 < 3) {
            try {
            } catch (InterruptedException | ExecutionException unused) {
                str = "Error pinging server due to unexpected error";
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", str);
            } catch (TimeoutException unused2) {
                str = "Error pinging server (attempt: " + i11 + ", timeout: " + i10 + "). ";
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", str);
            }
            if (((Boolean) this.f104578a.submit(new a(this, b10)).get(i10, TimeUnit.MILLISECONDS)).booleanValue()) {
                return true;
            }
            i11++;
            i10 *= 2;
        }
        sg.bigo.ads.common.t.a.a(0, "ProxyCache", String.format(Locale.US, "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s", Integer.valueOf(i11), Integer.valueOf(i10 / 2), c()));
        return false;
    }

    final boolean b() {
        g gVar = new g(d());
        try {
            byte[] bytes = "ping ok".getBytes();
            try {
                HttpURLConnection httpURLConnectionB = gVar.b();
                gVar.f104575a = httpURLConnectionB;
                if (httpURLConnectionB != null) {
                    gVar.f104576b = new BufferedInputStream(gVar.f104575a.getInputStream(), 8192);
                }
            } catch (IOException e10) {
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error opening connection for " + gVar.f104577c + " with offset 0, error message is : " + e10.toString());
            }
            byte[] bArr = new byte[bytes.length];
            gVar.a(bArr);
            boolean zEquals = Arrays.equals(bytes, bArr);
            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Ping response: `" + new String(bArr) + "`, pinged? " + zEquals);
            return zEquals;
        } finally {
            gVar.a();
        }
    }
}
