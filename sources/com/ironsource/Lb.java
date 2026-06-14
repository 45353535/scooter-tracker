package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class Lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41285a;

    public Lb(String str) {
        this.f41285a = str;
    }

    private C4652z8 a() throws Exception {
        C4652z8 c4652z8 = new C4652z8(this.f41285a, "metadata.json");
        if (!c4652z8.exists()) {
            a(c4652z8);
        }
        return c4652z8;
    }

    synchronized JSONObject b() throws Exception {
        return new JSONObject(IronSourceStorageUtils.readFile(a()));
    }

    private void a(C4652z8 c4652z8) throws Exception {
        IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), c4652z8.getPath());
    }

    synchronized boolean b(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectB;
        try {
            jSONObjectB = b();
            JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectOptJSONObject.putOpt(next, jSONObject.opt(next));
                }
            } else {
                jSONObjectB.putOpt(str, jSONObject);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a(jSONObjectB);
    }

    private boolean a(JSONObject jSONObject) throws Exception {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }

    synchronized boolean a(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectB;
        jSONObjectB = b();
        jSONObjectB.put(str, jSONObject);
        return a(jSONObjectB);
    }

    synchronized boolean a(String str) throws Exception {
        JSONObject jSONObjectB = b();
        if (!jSONObjectB.has(str)) {
            return true;
        }
        jSONObjectB.remove(str);
        return a(jSONObjectB);
    }

    boolean a(ArrayList<C4652z8> arrayList) throws Exception {
        Iterator<C4652z8> it = arrayList.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z10 = false;
            }
        }
        return z10;
    }
}
