package rd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // rd.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean b(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        if (value instanceof String) {
            return c((String) value);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // rd.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return Boolean.valueOf(Boolean.parseBoolean(value));
    }
}
