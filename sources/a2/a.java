package a2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;
import org.json.JSONException;
import p1.b;
import p1.d;
import y1.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3771b = new c();

    public a(Context context) {
        this.f3770a = context.getSharedPreferences("odt_storage", 0);
    }

    public final String a() {
        String string = this.f3770a.getString("odt", null);
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            String string2 = jSONArray.getString(0);
            return this.f3771b.b(jSONArray.getString(1), Base64.decode(string2, 0));
        } catch (IOException e10) {
            e = e10;
            b.b(d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (InvalidAlgorithmParameterException e11) {
            e = e11;
            b.b(d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (InvalidKeyException e12) {
            e = e12;
            b.b(d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            b.b(d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (NoSuchPaddingException e14) {
            e = e14;
            b.b(d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (JSONException e15) {
            e = e15;
            b.b(d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (Exception e16) {
            b.b(d.ENCRYPTION_EXCEPTION, x1.a.a(e16, p1.c.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        }
    }

    public final void b(String str) {
        try {
            Pair pairA = this.f3771b.a(str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(pairA.first).put(pairA.second);
            this.f3770a.edit().putString("odt", jSONArray.toString()).apply();
        } catch (IOException e10) {
            e = e10;
            b.b(d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (InvalidAlgorithmParameterException e11) {
            e = e11;
            b.b(d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (InvalidKeyException e12) {
            e = e12;
            b.b(d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            b.b(d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (NoSuchPaddingException e14) {
            e = e14;
            b.b(d.ENCRYPTION_EXCEPTION, x1.a.a(e, p1.c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (Exception e15) {
            b.b(d.ENCRYPTION_EXCEPTION, x1.a.a(e15, p1.c.FAILED_STORE_ENCRYPTED_DATA));
        }
    }
}
