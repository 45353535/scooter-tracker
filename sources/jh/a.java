package jh;

import com.google.common.net.HttpHeaders;
import hh.b;
import hh.b0;
import hh.d0;
import hh.h;
import hh.o;
import hh.q;
import hh.u;
import hh.z;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f85925d;

    /* JADX INFO: renamed from: jh.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1027a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(q defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.f85925d = defaultDns;
    }

    private final InetAddress b(Proxy proxy, u uVar, q qVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C1027a.$EnumSwitchMapping$0[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.first(qVar.lookup(uVar.h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        Intrinsics.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // hh.b
    public z a(d0 d0Var, b0 response) {
        Proxy proxy;
        q qVarC;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        hh.a aVarA;
        Intrinsics.checkNotNullParameter(response, "response");
        List<h> listP = response.p();
        z zVarR0 = response.r0();
        u uVarL = zVarR0.l();
        boolean z10 = response.q() == 407;
        if (d0Var == null || (proxy = d0Var.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : listP) {
            if (StringsKt.N("Basic", hVar.c(), true)) {
                if (d0Var == null || (aVarA = d0Var.a()) == null || (qVarC = aVarA.c()) == null) {
                    qVarC = this.f85925d;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxy.address();
                    Intrinsics.checkNotNull(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, uVarL, qVarC), inetSocketAddress.getPort(), uVarL.p(), hVar.b(), hVar.c(), uVarL.r(), Authenticator.RequestorType.PROXY);
                } else {
                    String strH = uVarL.h();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strH, b(proxy, uVarL, qVarC), uVarL.l(), uVarL.p(), hVar.b(), hVar.c(), uVarL.r(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? HttpHeaders.PROXY_AUTHORIZATION : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    return zVarR0.i().f(str, o.a(userName, new String(password), hVar.a())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ a(q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q.f73734b : qVar);
    }
}
