package rd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends a {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // rd.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Integer b(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Number) {
            return Integer.valueOf(((Number) value).intValue());
        }
        if (value instanceof String) {
            return (Integer) h.a(this, (String) value, null, 2, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // rd.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return Integer.valueOf(Integer.parseInt(value));
        } catch (Throwable unused) {
            return null;
        }
    }
}
