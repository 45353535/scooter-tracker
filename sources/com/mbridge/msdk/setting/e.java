package com.mbridge.msdk.setting;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, f> f50594b;

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final e f50595a = new e();
    }

    public static e a() {
        return b.f50595a;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f50594b == null) {
                this.f50594b = new HashMap<>();
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                f fVar = new f();
                fVar.a(next);
                fVar.b(string);
                this.f50594b.put(next, fVar);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private e() {
        this.f50593a = 6;
        this.f50594b = new HashMap<>();
    }

    public int a(String str) {
        HashMap<String, f> map;
        f fVar;
        if (TextUtils.isEmpty(str) || (map = this.f50594b) == null || !map.containsKey(str) || (fVar = this.f50594b.get(str)) == null) {
            return 0;
        }
        int i10 = fVar.b() ? 1 : fVar.a() >= this.f50593a ? 2 : 0;
        fVar.a(false);
        return i10;
    }
}
