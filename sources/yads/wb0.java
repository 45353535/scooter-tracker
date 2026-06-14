package yads;

import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class wb0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wb0 f117383c = new wb0(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f117384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f117385b;

    public wb0(Map map) {
        this.f117385b = DesugarCollections.unmodifiableMap(map);
    }

    public final wb0 a(dz dzVar) {
        byte[] bytes;
        HashMap map = new HashMap(this.f117385b);
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(dzVar.f110113b));
        for (int i10 = 0; i10 < listUnmodifiableList.size(); i10++) {
            map.remove(listUnmodifiableList.get(i10));
        }
        for (Map.Entry entry : dzVar.a().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bytes = ((String) value).getBytes(st.f115925c);
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value;
            }
            map.put(str, bytes);
        }
        Map map2 = this.f117385b;
        if (map2.size() == map.size()) {
            for (Map.Entry entry2 : map2.entrySet()) {
                if (!Arrays.equals((byte[]) entry2.getValue(), (byte[]) map.get(entry2.getKey()))) {
                }
            }
            return this;
        }
        return new wb0(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wb0.class != obj.getClass()) {
            return false;
        }
        Map map = this.f117385b;
        Map map2 = ((wb0) obj).f117385b;
        if (map.size() == map2.size()) {
            for (Map.Entry entry : map.entrySet()) {
                if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f117384a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f117385b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f117384a = iHashCode;
        }
        return this.f117384a;
    }

    public final String a() {
        byte[] bArr = (byte[]) this.f117385b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, st.f115925c);
        }
        return null;
    }
}
