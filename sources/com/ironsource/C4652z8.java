package com.ironsource;

import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4652z8 extends File {
    public C4652z8(String str, String str2) {
        super(str, str2);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", getName());
        jSONObject.put("path", getPath());
        jSONObject.put("lastModified", lastModified());
        if (isFile()) {
            jSONObject.put("size", length());
        }
        return jSONObject;
    }

    @Override // java.io.File
    public String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }

    public C4652z8(String str) {
        super(str);
    }
}
