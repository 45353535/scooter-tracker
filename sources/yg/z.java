package yg;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
final class z implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f119106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f119107b;

    public z(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f119106a = compute;
        this.f119107b = new ConcurrentHashMap();
    }

    @Override // yg.b2
    public Object a(KClass key, List types) {
        Object objB;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap concurrentHashMap = this.f119107b;
        Class clsB = xf.a.b(key);
        Object a2Var = concurrentHashMap.get(clsB);
        if (a2Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsB, (a2Var = new a2()))) != null) {
            a2Var = objPutIfAbsent;
        }
        a2 a2Var2 = (a2) a2Var;
        List list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new z0((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = a2Var2.f118934a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                Result.Companion companion = Result.f93230c;
                objB = Result.b((KSerializer) this.f119106a.invoke(key, types));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            Result resultA = Result.a(objB);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList, resultA);
            obj = objPutIfAbsent2 == null ? resultA : objPutIfAbsent2;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return ((Result) obj).l();
    }
}
