package kotlin.properties;

import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public interface e extends d {
    @Override // kotlin.properties.d
    Object getValue(Object obj, KProperty kProperty);

    void setValue(Object obj, KProperty kProperty, Object obj2);
}
