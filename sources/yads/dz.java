package yads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class dz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f110112a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f110113b = new ArrayList();

    public final Map a() {
        HashMap map = new HashMap(this.f110112a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return DesugarCollections.unmodifiableMap(map);
    }
}
