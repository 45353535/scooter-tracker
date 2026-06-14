package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public final class f51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.json.b f110600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bn f110601b;

    public f51(kotlinx.serialization.json.b bVar, bn bnVar) {
        this.f110600a = bVar;
        this.f110601b = bnVar;
    }

    public final String a(z70 z70Var) {
        kotlinx.serialization.json.b bVar = this.f110600a;
        kotlinx.serialization.json.b.f93658d.a();
        String strB = bVar.b(z70.Companion.serializer(), z70Var);
        this.f110601b.getClass();
        String strA = bn.a(strB);
        if (strA == null) {
            strA = "";
        }
        List listPlus = CollectionsKt.plus((Iterable) new kotlin.ranges.b('A', 'Z'), (Iterable) new kotlin.ranges.b('a', 'z'));
        IntRange intRange = new IntRange(1, 3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator it = intRange.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            Character ch2 = (Character) CollectionsKt.random(listPlus, kotlin.random.d.f93341b);
            ch2.getClass();
            arrayList.add(ch2);
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null) + strA;
    }
}
