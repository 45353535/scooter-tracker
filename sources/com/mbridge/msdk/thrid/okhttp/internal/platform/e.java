package com.mbridge.msdk.thrid.okhttp.internal.platform;

import com.mbridge.msdk.thrid.okhttp.w;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes10.dex */
class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f51535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f51536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f51537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class<?> f51538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class<?> f51539g;

    private static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f51540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f51541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f51542c;

        a(List<String> list) {
            this.f51540a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = com.mbridge.msdk.thrid.okhttp.internal.c.f51202b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f51541b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f51540a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f51540a.contains(list.get(i10))) {
                            String str = (String) list.get(i10);
                            this.f51542c = str;
                            return str;
                        }
                    }
                    String str2 = this.f51540a.get(0);
                    this.f51542c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f51542c = (String) objArr[0];
            return null;
        }
    }

    e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f51535c = method;
        this.f51536d = method2;
        this.f51537e = method3;
        this.f51538f = cls;
        this.f51539g = cls2;
    }

    public static g h() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new e(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(SSLSocket sSLSocket, String str, List<w> list) {
        try {
            this.f51535c.invoke(null, sSLSocket, Proxy.newProxyInstance(g.class.getClassLoader(), new Class[]{this.f51538f, this.f51539g}, new a(g.a(list))));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to set alpn", (Exception) e10);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public String b(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f51536d.invoke(null, sSLSocket));
            boolean z10 = aVar.f51541b;
            if (!z10 && aVar.f51542c == null) {
                g.d().a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (z10) {
                return null;
            }
            return aVar.f51542c;
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to get selected protocol", (Exception) e10);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(SSLSocket sSLSocket) {
        try {
            this.f51537e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to remove alpn", (Exception) e10);
        }
    }
}
