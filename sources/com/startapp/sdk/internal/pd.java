package com.startapp.sdk.internal;

import com.ironsource.D5;
import com.startapp.sdk.common.SDKException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class pd extends ve {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f65108b;

    public pd(Set set) {
        super(set);
        this.f65108b = new LinkedHashMap();
    }

    @Override // com.startapp.sdk.internal.ve
    public final void a(String str, Object obj, boolean z10, boolean z11) throws SDKException {
        if (this.f65402a.contains(str)) {
            return;
        }
        try {
            String strB = obj instanceof ue ? ((ue) obj).b() : obj != null ? obj.toString() : null;
            if (strB == null) {
                if (z10) {
                    throw new SDKException(str);
                }
            } else {
                if (z11) {
                    strB = URLEncoder.encode(strB, "UTF-8");
                }
                this.f65108b.put(str, strB);
            }
        } catch (UnsupportedEncodingException e10) {
            if (z10) {
                throw new SDKException(str, e10);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('?');
        for (Map.Entry entry : this.f65108b.entrySet()) {
            if (entry.getValue() instanceof String) {
                sb2.append((String) entry.getKey());
                sb2.append(D5.T);
                sb2.append(entry.getValue());
                sb2.append('&');
            } else if (entry.getValue() instanceof Set) {
                for (Object obj : (Set) entry.getValue()) {
                    if (obj instanceof String) {
                        sb2.append((String) entry.getKey());
                        sb2.append(D5.T);
                        sb2.append(obj);
                        sb2.append('&');
                    }
                }
            }
        }
        if (sb2.length() != 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString().replace("+", "%20");
    }

    @Override // com.startapp.sdk.internal.ve
    public final void a(String str, Set set) {
        if (this.f65402a.contains(str) || set == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(URLEncoder.encode((String) it.next(), "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.f65108b.put(str, hashSet);
    }
}
