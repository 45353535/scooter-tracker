package rd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // rd.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Double b(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value instanceof Integer ? Double.valueOf(((Number) value).intValue()) : value instanceof Long ? Double.valueOf(((Number) value).longValue()) : value instanceof String ? (Double) h.a(this, (String) value, null, 2, null) : c(value.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // rd.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Double c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return Double.valueOf(Double.parseDouble(value));
        } catch (Throwable unused) {
            return null;
        }
    }
}
