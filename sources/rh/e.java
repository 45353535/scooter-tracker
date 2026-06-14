package rh;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f99483i = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f99484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f99485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f99486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f99487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f99488h;

    private static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f99489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f99490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f99491c;

        public a(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            this.f99489a = protocols;
        }

        public final String a() {
            return this.f99491c;
        }

        public final boolean b() {
            return this.f99490b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.areEqual(name, "supports") && Intrinsics.areEqual(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics.areEqual(name, "unsupported") && Intrinsics.areEqual(Void.TYPE, returnType)) {
                this.f99490b = true;
                return null;
            }
            if (Intrinsics.areEqual(name, "protocols") && objArr.length == 0) {
                return this.f99489a;
            }
            if ((Intrinsics.areEqual(name, "selectProtocol") || Intrinsics.areEqual(name, "select")) && Intrinsics.areEqual(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            Object obj2 = list.get(i10);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!this.f99489a.contains(str)) {
                                if (i10 == size) {
                                    break;
                                }
                                i10++;
                            } else {
                                this.f99491c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) this.f99489a.get(0);
                    this.f99491c = str2;
                    return str2;
                }
            }
            if ((!Intrinsics.areEqual(name, "protocolSelected") && !Intrinsics.areEqual(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f99491c = (String) obj3;
            return null;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
                Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
                Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
                Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
                Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
                return new e(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        private b() {
        }
    }

    public e(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.f99484d = putMethod;
        this.f99485e = getMethod;
        this.f99486f = removeMethod;
        this.f99487g = clientProviderClass;
        this.f99488h = serverProviderClass;
    }

    @Override // rh.h
    public void b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.f99486f.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // rh.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            this.f99484d.invoke(null, sslSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f99487g, this.f99488h}, new a(h.f99497a.b(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // rh.h
    public String h(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f99485e.invoke(null, sslSocket));
            Intrinsics.checkNotNull(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                h.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
