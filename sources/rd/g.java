package rd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends a {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // rd.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String b(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // rd.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }
}
