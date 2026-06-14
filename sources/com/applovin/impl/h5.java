package com.applovin.impl;

import androidx.arch.core.util.Function;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f8983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8984b = new Object();

    public h5(JSONObject jSONObject) {
        this.f8983a = jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.f8984b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f8983a);
        }
        return jSONObjectDeepCopy;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f8984b) {
            stringList = JsonUtils.getStringList(this.f8983a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f8984b) {
            this.f8983a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f8984b) {
            string = this.f8983a.toString();
        }
        return string;
    }

    public boolean a(String str) {
        boolean zHas;
        synchronized (this.f8984b) {
            zHas = this.f8983a.has(str);
        }
        return zHas;
    }

    public Object b(String str) {
        Object objOpt;
        synchronized (this.f8984b) {
            objOpt = this.f8983a.opt(str);
        }
        return objOpt;
    }

    public void a(Consumer consumer) {
        synchronized (this.f8984b) {
            consumer.accept(this);
        }
    }

    public void b(String str, int i10) {
        synchronized (this.f8984b) {
            JsonUtils.putInt(this.f8983a, str, i10);
        }
    }

    public Object a(Function function) {
        Object objApply;
        synchronized (this.f8984b) {
            objApply = function.apply(this);
        }
        return objApply;
    }

    public void b(String str, long j10) {
        synchronized (this.f8984b) {
            JsonUtils.putLong(this.f8983a, str, j10);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f8984b) {
            bool2 = JsonUtils.getBoolean(this.f8983a, str, bool);
        }
        return bool2;
    }

    public void b(String str, String str2) {
        synchronized (this.f8984b) {
            JsonUtils.putString(this.f8983a, str, str2);
        }
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f8984b) {
            f11 = JsonUtils.getFloat(this.f8983a, str, f10);
        }
        return f11;
    }

    public int a(String str, int i10) {
        int i11;
        synchronized (this.f8984b) {
            i11 = JsonUtils.getInt(this.f8983a, str, i10);
        }
        return i11;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f8984b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f8983a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f8984b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f8983a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j10) {
        long j11;
        synchronized (this.f8984b) {
            j11 = JsonUtils.getLong(this.f8983a, str, j10);
        }
        return j11;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f8984b) {
            string = JsonUtils.getString(this.f8983a, str, str2);
        }
        return string;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f8984b) {
            integerList = JsonUtils.getIntegerList(this.f8983a, str, list);
        }
        return integerList;
    }

    public void a(String str, boolean z10) {
        synchronized (this.f8984b) {
            JsonUtils.putBoolean(this.f8983a, str, z10);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f8984b) {
            JsonUtils.putObject(this.f8983a, str, obj);
        }
    }
}
