package hh;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f73733a = a.f73735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f73734b = new a.C0912a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f73735a = new a();

        /* JADX INFO: renamed from: hh.q$a$a, reason: collision with other inner class name */
        private static final class C0912a implements q {
            @Override // hh.q
            public List lookup(String hostname) throws UnknownHostException {
                Intrinsics.checkNotNullParameter(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
                    return ArraysKt.toList(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    List lookup(String str);
}
