package com.bytedance.sdk.component.qdl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
class wd {
    private to qdl;

    private wd(to toVar) {
        this.qdl = toVar;
    }

    static wd qdl(to toVar) {
        return new wd(toVar);
    }

    <T> T qdl(String str, Type type) throws JSONException {
        qdl(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.qdl.qdl(str, type);
    }

    <T> String qdl(T t10) {
        String string;
        if (t10 == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if (!(t10 instanceof JSONObject) && !(t10 instanceof JSONArray)) {
            string = this.qdl.qdl(t10);
        } else {
            string = t10.toString();
        }
        qdl(string);
        return string;
    }

    private static void qdl(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        jpc.qdl(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
