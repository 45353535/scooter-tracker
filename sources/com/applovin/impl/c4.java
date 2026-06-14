package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f8491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f8493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f8494e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Deque f8495f = new ArrayDeque();

    public c4(com.applovin.impl.sdk.k kVar) {
        this.f8490a = (String) kVar.a(x4.f11436u4);
        this.f8491b = kVar.c(x4.f11444v4);
        this.f8492c = ((Integer) kVar.a(x4.f11452w4)).intValue();
    }

    public Long a() {
        return this.f8493d;
    }

    public Deque b() {
        return this.f8495f;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || this.f8492c <= 0) {
            return;
        }
        Map map = (Map) this.f8494e.remove(str);
        if (CollectionUtils.isEmpty(map)) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("cc_ms", Long.valueOf(System.currentTimeMillis()));
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (!CollectionUtils.isEmpty(list)) {
                Iterator it = list.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                map2.put((String) entry.getKey(), Long.valueOf(jLongValue / ((long) list.size())));
            }
        }
        if (this.f8495f.size() == this.f8492c) {
            this.f8495f.pollLast();
        }
        this.f8495f.addFirst(map2);
    }

    public void b(long j10, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!CollectionUtils.isEmpty(this.f8491b) && this.f8492c > 0) {
            Iterator it = this.f8491b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (StringUtils.isValidString(str3) && str.endsWith(str3)) {
                    a(j10, str3, str2);
                    break;
                }
            }
        }
        if (StringUtils.isValidString(this.f8490a) && str.endsWith(this.f8490a)) {
            this.f8493d = Long.valueOf(j10);
        }
    }

    private void a(long j10, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f8494e.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f8494e.put(str2, map);
        }
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j10));
    }
}
