package com.fyber.inneractive.sdk.cache.session;

import android.app.Application;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.r;
import com.fyber.inneractive.sdk.util.v;
import java.io.Closeable;
import java.io.FileInputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f20233a;

    public c(e eVar) {
        this.f20233a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileInputStream fileInputStreamOpenFileInput;
        String str;
        Application application = o.f23888a;
        JSONObject jSONObject = null;
        try {
            fileInputStreamOpenFileInput = application.openFileInput("session_details.json");
            try {
                int iAvailable = fileInputStreamOpenFileInput.available();
                byte[] bArr = new byte[iAvailable];
                str = fileInputStreamOpenFileInput.read(bArr) == iAvailable ? new String(bArr, "UTF-8") : null;
            } catch (Throwable unused) {
                try {
                    IAlog.a("readFileFromContext failed reading %s", "session_details.json");
                    v.a((Closeable) fileInputStreamOpenFileInput);
                    str = null;
                } finally {
                    v.a((Closeable) fileInputStreamOpenFileInput);
                }
            }
        } catch (Throwable unused2) {
            fileInputStreamOpenFileInput = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f20233a.getClass();
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable unused3) {
            IAlog.f("Failed parsing SessionCache", new Object[0]);
        }
        if (jSONObject != null) {
            r.f23896b.post(new b(this, jSONObject));
        } else {
            application.deleteFile("session_details.json");
            this.f20233a.getClass();
        }
    }
}
