package com.my.target;

import android.os.Build;
import com.ironsource.C4240b4;
import java.lang.reflect.Field;
import java.net.HttpCookie;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class w6 {
    public String a(HttpCookie httpCookie) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", httpCookie.getName());
            jSONObject.putOpt("value", httpCookie.getValue());
            jSONObject.putOpt("comment", httpCookie.getComment());
            jSONObject.putOpt("commentUrl", httpCookie.getCommentURL());
            jSONObject.putOpt(C4240b4.j.D, httpCookie.getDomain());
            jSONObject.putOpt("maxage", Long.valueOf(httpCookie.getMaxAge()));
            jSONObject.putOpt("path", httpCookie.getPath());
            jSONObject.putOpt("portlist", httpCookie.getPortlist());
            jSONObject.putOpt("version", Integer.valueOf(httpCookie.getVersion()));
            jSONObject.putOpt("secure", Boolean.valueOf(httpCookie.getSecure()));
            jSONObject.putOpt("discard", Boolean.valueOf(httpCookie.getDiscard()));
            if (Build.VERSION.SDK_INT >= 24) {
                jSONObject.putOpt("httpOnly", Boolean.valueOf(httpCookie.isHttpOnly()));
            } else {
                try {
                    Field declaredField = httpCookie.getClass().getDeclaredField("httpOnly");
                    declaredField.setAccessible(true);
                    jSONObject.putOpt("httpOnly", declaredField.get(httpCookie));
                } catch (Throwable unused) {
                }
            }
            return jSONObject.toString();
        } catch (Throwable th2) {
            gb.a("MyTargetJSONCookie: Exception encoding cookie - " + th2.getMessage());
            return null;
        }
    }

    public HttpCookie a(String str) {
        Throwable th2;
        HttpCookie httpCookie;
        try {
            JSONObject jSONObject = new JSONObject(str);
            httpCookie = new HttpCookie(jSONObject.getString("name"), jSONObject.optString("value"));
            try {
                httpCookie.setComment(jSONObject.optString("comment"));
                httpCookie.setCommentURL(jSONObject.optString("commentUrl"));
                httpCookie.setDomain(jSONObject.optString(C4240b4.j.D));
                httpCookie.setMaxAge(jSONObject.optInt("maxage"));
                httpCookie.setPath(jSONObject.optString("path"));
                httpCookie.setPortlist(jSONObject.optString("portlist"));
                httpCookie.setVersion(jSONObject.optInt("version"));
                httpCookie.setSecure(jSONObject.optBoolean("secure"));
                httpCookie.setDiscard(jSONObject.optBoolean("discard"));
                if (Build.VERSION.SDK_INT >= 24) {
                    httpCookie.setHttpOnly(jSONObject.optBoolean("httpOnly"));
                } else {
                    try {
                        Field declaredField = httpCookie.getClass().getDeclaredField("httpOnly");
                        declaredField.setAccessible(true);
                        declaredField.set(httpCookie, Boolean.valueOf(jSONObject.optBoolean("httpOnly")));
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th3) {
                th2 = th3;
                gb.a("MyTargetJSONCookie: Exception decoding cookie - " + th2.getMessage());
            }
        } catch (Throwable th4) {
            th2 = th4;
            httpCookie = null;
        }
        return httpCookie;
    }
}
