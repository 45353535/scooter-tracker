package yg;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
final class u implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f119078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f119079b;

    public static final class a implements Function0 {
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new a2();
        }
    }

    public u(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f119078a = compute;
        this.f119079b = new v();
    }

    @Override // yg.b2
    public Object a(KClass key, List types) {
        Object objB;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        Object obj = this.f119079b.get(xf.a.b(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        n1 n1Var = (n1) obj;
        Object objA = n1Var.f119035a.get();
        if (objA == null) {
            objA = n1Var.a(new a());
        }
        a2 a2Var = (a2) objA;
        List list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new z0((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = a2Var.f118934a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                Result.Companion companion = Result.f93230c;
                objB = Result.b((KSerializer) this.f119078a.invoke(key, types));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            Result resultA = Result.a(objB);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, resultA);
            obj2 = objPutIfAbsent == null ? resultA : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return ((Result) obj2).l();
    }
}
