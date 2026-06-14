package kotlin.reflect.jvm.internal.impl.util;

import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AttributeArrayOwner<K, T> extends AbstractArrayMapOwner<K, T> {

    @NotNull
    private ArrayMap<T> arrayMap;

    protected AttributeArrayOwner(@NotNull ArrayMap<T> arrayMap) {
        Intrinsics.checkNotNullParameter(arrayMap, "arrayMap");
        this.arrayMap = arrayMap;
    }

    private final String buildDiagnosticMessage(ArrayMap<T> arrayMap, int i10, String str) {
        T next;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Race condition happened, the size of ArrayMap is " + i10 + " but it isn't an `" + str + '`');
        sb2.append('\n');
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Type: ");
        sb3.append(arrayMap.getClass());
        sb2.append(sb3.toString());
        sb2.append('\n');
        StringBuilder sb4 = new StringBuilder();
        Map<String, Integer> mapAllValuesThreadUnsafeForRendering = getTypeRegistry().allValuesThreadUnsafeForRendering();
        sb4.append(C4240b4.j.f42672d);
        sb4.append('\n');
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayMap, 10));
        int i11 = 0;
        for (T t10 : arrayMap) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Iterator<T> it = mapAllValuesThreadUnsafeForRendering.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Number) ((Map.Entry) next).getValue()).intValue() == i11) {
                    break;
                }
            }
            sb4.append("  " + ((Map.Entry) next) + '[' + i11 + "]: " + t10);
            sb4.append('\n');
            arrayList.add(sb4);
            i11 = i12;
        }
        sb4.append(C4240b4.j.f42674e);
        sb4.append('\n');
        sb2.append("Content: " + sb4.toString());
        sb2.append('\n');
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    @NotNull
    protected final ArrayMap<T> getArrayMap() {
        return this.arrayMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    protected final void registerComponent(@NotNull String keyQualifiedName, @NotNull T value) {
        Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
        Intrinsics.checkNotNullParameter(value, "value");
        int id2 = getTypeRegistry().getId(keyQualifiedName);
        int size = this.arrayMap.getSize();
        if (size == 0) {
            ArrayMap<T> arrayMap = this.arrayMap;
            if (!(arrayMap instanceof EmptyArrayMap)) {
                throw new IllegalStateException(buildDiagnosticMessage(arrayMap, 0, "EmptyArrayMap"));
            }
            this.arrayMap = new OneElementArrayMap(value, id2);
            return;
        }
        if (size == 1) {
            ArrayMap<T> arrayMap2 = this.arrayMap;
            try {
                Intrinsics.checkNotNull(arrayMap2, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap2;
                if (oneElementArrayMap.getIndex() == id2) {
                    this.arrayMap = new OneElementArrayMap(value, id2);
                    return;
                } else {
                    ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                    this.arrayMap = arrayMapImpl;
                    arrayMapImpl.set(oneElementArrayMap.getIndex(), oneElementArrayMap.getValue());
                }
            } catch (ClassCastException e10) {
                throw new IllegalStateException(buildDiagnosticMessage(arrayMap2, 1, "OneElementArrayMap"), e10);
            }
        }
        this.arrayMap.set(id2, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AttributeArrayOwner() {
        EmptyArrayMap emptyArrayMap = EmptyArrayMap.INSTANCE;
        Intrinsics.checkNotNull(emptyArrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(emptyArrayMap);
    }
}
