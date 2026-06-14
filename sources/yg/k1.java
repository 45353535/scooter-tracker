package yg;

import com.ironsource.C4240b4;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wg.m;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SerialDescriptor f119014c;

    private static final class a implements Map.Entry, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f119015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f119016c;

        public a(Object obj, Object obj2) {
            this.f119015b = obj;
            this.f119016c = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f119015b, aVar.f119015b) && Intrinsics.areEqual(this.f119016c, aVar.f119016c);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f119015b;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f119016c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f119015b;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f119016c;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f119015b + ", value=" + this.f119016c + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(final KSerializer keySerializer, final KSerializer valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.f119014c = wg.k.d("kotlin.collections.Map.Entry", m.c.f108010a, new SerialDescriptor[0], new Function1() { // from class: yg.j1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1.g(keySerializer, valueSerializer, (wg.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(KSerializer kSerializer, KSerializer kSerializer2, wg.a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        wg.a.b(buildSerialDescriptor, C4240b4.i.W, kSerializer.getDescriptor(), null, false, 12, null);
        wg.a.b(buildSerialDescriptor, "value", kSerializer2.getDescriptor(), null, false, 12, null);
        return Unit.f93236a;
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return this.f119014c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a1
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object a(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Object c(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a1
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map.Entry e(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
