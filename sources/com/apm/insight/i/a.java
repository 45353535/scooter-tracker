package com.apm.insight.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile UUID f7843a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f7844b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        String string;
        if (f7843a == null) {
            synchronized (a.class) {
                if (f7843a == null) {
                    String strC = o.a().c();
                    if (strC != null) {
                        f7843a = UUID.fromString(strC);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                f7843a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f7843a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(f7843a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        try {
            if (TextUtils.isEmpty(f7844b)) {
                new a(context);
                UUID uuid = f7843a;
                if (uuid != null) {
                    f7844b = uuid.toString();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f7844b;
    }
}
