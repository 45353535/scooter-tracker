package rd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends a {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // rd.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Float b(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value instanceof Integer ? Float.valueOf(((Number) value).intValue()) : value instanceof Long ? Float.valueOf(((Number) value).longValue()) : value instanceof String ? (Float) h.a(this, (String) value, null, 2, null) : c(value.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // rd.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return Float.valueOf(Float.parseFloat(value));
        } catch (Throwable unused) {
            return null;
        }
    }
}
