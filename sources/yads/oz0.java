package yads;

import j$.util.concurrent.ConcurrentHashMap;
import java.net.InetAddress;
import kotlin.Result;

/* JADX INFO: loaded from: classes4.dex */
public final class oz0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f114453b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f114454a = f114453b;

    public final boolean a(int i10, String str) {
        Object objB;
        ConcurrentHashMap concurrentHashMap = this.f114454a;
        Object objValueOf = concurrentHashMap.get(str);
        if (objValueOf == null) {
            try {
                Result.Companion companion = Result.f93230c;
                objB = Result.b(Boolean.valueOf(InetAddress.getByName(str).isReachable(i10)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            if (Result.i(objB)) {
                objB = null;
            }
            Boolean bool = (Boolean) objB;
            objValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, objValueOf);
            if (objPutIfAbsent != null) {
                objValueOf = objPutIfAbsent;
            }
        }
        return ((Boolean) objValueOf).booleanValue();
    }
}
