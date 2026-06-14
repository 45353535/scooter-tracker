package com.fyber.inneractive.sdk.metrics;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21125a;

    public a(String str) {
        this.f21125a = str;
    }

    public static boolean a(int i10, int i11, JSONArray jSONArray, CopyOnWriteArrayList copyOnWriteArrayList) {
        if (i10 > 0 && i11 > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(i10);
            int i12 = 0;
            for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                long jOptLong = jSONArray.optLong(i13, 0L);
                if (jOptLong > jCurrentTimeMillis) {
                    i12++;
                    copyOnWriteArrayList.add(Long.valueOf(jOptLong));
                }
            }
            if (i12 >= i11) {
                return true;
            }
        }
        return false;
    }
}
