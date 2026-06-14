package ze;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 implements w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f119349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f119350d;

    public a0(boolean z10, Map values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f119349c = z10;
        Map mapA = z10 ? n.a() : new LinkedHashMap();
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add((String) list.get(i10));
            }
            mapA.put(str, arrayList);
        }
        this.f119350d = mapA;
    }

    private final List d(String str) {
        return (List) this.f119350d.get(str);
    }

    @Override // ze.w
    public List a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return d(name);
    }

    @Override // ze.w
    public final boolean b() {
        return this.f119349c;
    }

    @Override // ze.w
    public void c(Function2 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        for (Map.Entry entry : this.f119350d.entrySet()) {
            body.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // ze.w
    public Set entries() {
        return m.a(this.f119350d.entrySet());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f119349c != wVar.b()) {
            return false;
        }
        return b0.d(entries(), wVar.entries());
    }

    @Override // ze.w
    public String get(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List listD = d(name);
        if (listD != null) {
            return (String) CollectionsKt.firstOrNull(listD);
        }
        return null;
    }

    public int hashCode() {
        return b0.e(entries(), androidx.compose.foundation.c.a(this.f119349c) * 31);
    }

    @Override // ze.w
    public boolean isEmpty() {
        return this.f119350d.isEmpty();
    }

    @Override // ze.w
    public Set names() {
        return m.a(this.f119350d.keySet());
    }
}
