package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<Integer, b<String, List<Campaign>>> f49503a = new HashMap();

    public static b<String, List<Campaign>> a(int i10) {
        if (f49503a.containsKey(Integer.valueOf(i10))) {
            return f49503a.get(Integer.valueOf(i10));
        }
        a aVar = new a(i10);
        f49503a.put(Integer.valueOf(i10), aVar);
        return aVar;
    }
}
