package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4533s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f44906a = new HashMap<>();

    public HashMap<String, Object> a() {
        return this.f44906a;
    }

    public C4533s8 a(String str, Object obj) {
        if (obj != null) {
            this.f44906a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
