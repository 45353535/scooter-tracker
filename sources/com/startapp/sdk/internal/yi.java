package com.startapp.sdk.internal;

import android.text.TextUtils;
import com.ironsource.D5;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.ByteArrayOutputStream;
import java.util.WeakHashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class yi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f65618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONArray f65620c = new JSONArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f65621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f65622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f65623f;

    public yi(lb lbVar, String str, String str2, String str3, boolean z10) {
        this.f65618a = lbVar;
        this.f65619b = str;
        this.f65621d = str2;
        this.f65622e = str3;
        this.f65623f = z10;
    }

    public final void a(VASTErrorCodes vASTErrorCodes) {
        if (this.f65620c.length() == 0) {
            return;
        }
        if (!this.f65623f || vASTErrorCodes == VASTErrorCodes.ErrorNone) {
            try {
                String strB = b(vASTErrorCodes);
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                p8 p8Var = new p8((q8) this.f65618a.a(), this.f65619b);
                byte[] bytes = strB.getBytes();
                WeakHashMap weakHashMap = vi.f65408a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                p8Var.f65092c = new s8(byteArrayOutputStream.toByteArray(), D5.L, "gzip");
                p8Var.b();
            } catch (Throwable th2) {
                g9.a(th2);
            }
        }
    }

    public final String b(VASTErrorCodes vASTErrorCodes) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("vastDocs", this.f65620c);
        String str = this.f65621d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("partnerResponse", str);
        String str2 = this.f65622e;
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER, str2 != null ? str2 : "");
        jSONObject.put("error", vASTErrorCodes.a());
        return jSONObject.toString();
    }
}
