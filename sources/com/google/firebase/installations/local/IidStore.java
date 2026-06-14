package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.stats.CodePackage;
import com.google.common.base.Ascii;
import com.google.firebase.FirebaseApp;
import com.taurusx.tax.y.s.w;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class IidStore {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f32891c = {ProxyConfig.MATCH_ALL_SCHEMES, "FCM", CodePackage.GCM, ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f32892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32893b;

    public IidStore(@NonNull FirebaseApp firebaseApp) {
        this.f32892a = firebaseApp.getApplicationContext().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f32893b = b(firebaseApp);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:") && !applicationId.startsWith("2:")) {
            return applicationId;
        }
        String[] strArrSplit = applicationId.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(w.f67666t).digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & Ascii.SI) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    private String f() {
        String string;
        synchronized (this.f32892a) {
            string = this.f32892a.getString("|S|id", null);
        }
        return string;
    }

    private String g() {
        synchronized (this.f32892a) {
            try {
                String string = this.f32892a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyE = e(string);
                if (publicKeyE == null) {
                    return null;
                }
                return c(publicKeyE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public String readIid() {
        synchronized (this.f32892a) {
            try {
                String strF = f();
                if (strF != null) {
                    return strF;
                }
                return g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public String readToken() {
        synchronized (this.f32892a) {
            try {
                for (String str : f32891c) {
                    String string = this.f32892a.getString(a(this.f32893b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public IidStore(@NonNull SharedPreferences sharedPreferences, @Nullable String str) {
        this.f32892a = sharedPreferences;
        this.f32893b = str;
    }
}
