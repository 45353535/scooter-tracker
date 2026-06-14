package rd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends a {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // rd.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Long b(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Number) {
            return Long.valueOf(((Number) value).longValue());
        }
        if (value instanceof String) {
            return (Long) h.a(this, (String) value, null, 2, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // rd.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Long c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return Long.valueOf(Long.parseLong(value));
        } catch (Throwable unused) {
            return null;
        }
    }
}
