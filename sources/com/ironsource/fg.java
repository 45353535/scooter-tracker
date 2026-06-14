package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class fg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43129b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43130c = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Boolean> f43128a = new a();

    class a extends HashMap<String, Boolean> {
        a() {
            put(C4329g8.f43166k, Boolean.valueOf(fg.this.f43129b == 0));
            put(C4329g8.f43167l, Boolean.valueOf(fg.this.f43130c == 0));
            Boolean bool = Boolean.FALSE;
            put(C4329g8.f43168m, bool);
            put(C4329g8.f43169n, bool);
        }
    }

    fg() {
    }

    void a(String str, int i10, boolean z10) {
        boolean z11 = false;
        if (this.f43128a.containsKey(str)) {
            this.f43128a.put(str, Boolean.valueOf(i10 == 0));
        }
        this.f43128a.put(C4329g8.f43168m, Boolean.valueOf(z10));
        if ((this.f43128a.get(C4329g8.f43167l).booleanValue() || this.f43128a.get(C4329g8.f43166k).booleanValue()) && this.f43128a.get(C4329g8.f43168m).booleanValue()) {
            z11 = true;
        }
        this.f43128a.put(C4329g8.f43169n, Boolean.valueOf(z11));
    }

    public JSONObject a() {
        return new JSONObject(this.f43128a);
    }
}
