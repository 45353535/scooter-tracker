package sg.bigo.ads.core.player.a;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import sg.bigo.ads.common.m;

/* JADX INFO: loaded from: classes4.dex */
final class f extends ProxySelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Proxy> f104571a = Arrays.asList(Proxy.NO_PROXY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProxySelector f104572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f104573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f104574d;

    private f(ProxySelector proxySelector, String str, int i10) {
        this.f104572b = (ProxySelector) m.a(proxySelector);
        this.f104573c = (String) m.a(str);
        this.f104574d = i10;
    }

    static void a(String str, int i10) {
        ProxySelector.setDefault(new f(ProxySelector.getDefault(), str, i10));
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f104572b.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        return (this.f104573c.equals(uri.getHost()) && this.f104574d == uri.getPort()) ? f104571a : this.f104572b.select(uri);
    }
}
