package rh;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sh.i;
import sh.j;
import sh.k;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1185a f99467e = new C1185a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f99468f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f99469d;

    /* JADX INFO: renamed from: rh.a$a, reason: collision with other inner class name */
    public static final class C1185a {
        public /* synthetic */ C1185a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f99468f;
        }

        private C1185a() {
        }
    }

    static {
        f99468f = h.f99497a.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new k[]{sh.a.f104696a.a(), new j(sh.f.f104704f.d()), new j(i.f104718a.a()), new j(sh.g.f104712a.a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((k) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f99469d = arrayList;
    }

    @Override // rh.h
    public uh.c c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        sh.b bVarA = sh.b.f104697d.a(trustManager);
        return bVarA != null ? bVarA : super.c(trustManager);
    }

    @Override // rh.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f99469d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((k) next).matchesSocket(sslSocket)) {
                    break;
                }
            }
        }
        k kVar = (k) next;
        if (kVar != null) {
            kVar.configureTlsExtensions(sslSocket, str, protocols);
        }
    }

    @Override // rh.h
    public String h(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f99469d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((k) next).matchesSocket(sslSocket)) {
                break;
            }
        }
        k kVar = (k) next;
        if (kVar != null) {
            return kVar.getSelectedProtocol(sslSocket);
        }
        return null;
    }

    @Override // rh.h
    public boolean j(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
