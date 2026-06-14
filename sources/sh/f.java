package sh;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import sh.j;

/* JADX INFO: loaded from: classes11.dex */
public class f implements k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f104704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j.a f104705g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f104706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f104707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f104708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f104709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f104710e;

    public static final class a {

        /* JADX INFO: renamed from: sh.f$a$a, reason: collision with other inner class name */
        public static final class C1302a implements j.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f104711a;

            C1302a(String str) {
                this.f104711a = str;
            }

            @Override // sh.j.a
            public k create(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return f.f104704f.b(sslSocket.getClass());
            }

            @Override // sh.j.a
            public boolean matchesSocket(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                return StringsKt.a0(name, this.f104711a + '.', false, 2, null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.checkNotNull(superclass);
            return new f(superclass);
        }

        public final j.a c(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new C1302a(packageName);
        }

        public final j.a d() {
            return f.f104705g;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f104704f = aVar;
        f104705g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public f(Class sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f104706a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f104707b = declaredMethod;
        this.f104708c = sslSocketClass.getMethod("setHostname", String.class);
        this.f104709d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f104710e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // sh.k
    public void configureTlsExtensions(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            try {
                this.f104707b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f104708c.invoke(sslSocket, str);
                }
                this.f104710e.invoke(sslSocket, rh.h.f99497a.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // sh.k
    public String getSelectedProtocol(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!matchesSocket(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f104709d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // sh.k
    public boolean isSupported() {
        return rh.b.f99470f.b();
    }

    @Override // sh.k
    public boolean matchesSocket(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f104706a.isInstance(sslSocket);
    }
}
