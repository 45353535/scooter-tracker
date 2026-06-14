package th;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends ProxySelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f105176a = new a();

    private a() {
    }

    @Override // java.net.ProxySelector
    public List select(URI uri) {
        if (uri != null) {
            return CollectionsKt.listOf(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
