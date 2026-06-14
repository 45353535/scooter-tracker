package nh;

import hh.u;
import hh.z;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f96169a = new i();

    private i() {
    }

    private final boolean b(z zVar, Proxy.Type type) {
        return !zVar.g() && type == Proxy.Type.HTTP;
    }

    public final String a(z request, Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.h());
        sb2.append(' ');
        i iVar = f96169a;
        if (iVar.b(request, proxyType)) {
            sb2.append(request.l());
        } else {
            sb2.append(iVar.c(request.l()));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String c(u url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strD = url.d();
        String strF = url.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + strF;
    }
}
