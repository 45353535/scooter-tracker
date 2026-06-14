package com.my.target.common;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.N6;
import com.my.target.a2;
import com.my.target.e0;
import com.my.target.gb;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class CustomParams {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile String[] f59405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile String[] f59406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile String[] f59407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile String[] f59408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile String[] f59409g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f59403a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f59404b = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a2.a f59410h = a2.f59082f;

    public interface Gender {
        public static final int FEMALE = 2;
        public static final int MALE = 1;
        public static final int UNKNOWN = 0;
        public static final int UNSPECIFIED = -1;
    }

    public final synchronized void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            this.f59404b.remove(str);
        } else {
            this.f59404b.put(str, str2);
        }
    }

    public final boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this) {
            try {
                if ("exb".equals(str)) {
                    this.f59410h = a2.f59081e.a(str2);
                }
                if (str2 == null) {
                    return b(str);
                }
                this.f59403a.put(str, str2);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getAge() {
        String strA = a("ea");
        if (strA == null) {
            return 0;
        }
        try {
            return Integer.parseInt(strA);
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Nullable
    public String getCustomParam(@NonNull String str) {
        return a(str);
    }

    @Nullable
    public String getCustomUserId() {
        String[] strArr = this.f59409g;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    @Nullable
    public String[] getCustomUserIds() {
        String[] strArr = this.f59409g;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    @Nullable
    public String getEmail() {
        String[] strArr = this.f59405c;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    @Nullable
    public String[] getEmails() {
        String[] strArr = this.f59405c;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public int getGender() {
        String strA = a("eg");
        if (strA == null) {
            return -1;
        }
        try {
            return Integer.parseInt(strA);
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Nullable
    public String getIcqId() {
        String[] strArr = this.f59408f;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    @Nullable
    public String[] getIcqIds() {
        String[] strArr = this.f59408f;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    @Nullable
    public String getLang() {
        return a(N6.f41413q);
    }

    @Nullable
    public String getMrgsAppId() {
        return a("mrgs_app_id");
    }

    @Nullable
    public String getMrgsId() {
        return a("mrgs_device_id");
    }

    @Nullable
    public String getMrgsUserId() {
        return a("mrgs_user_id");
    }

    @Nullable
    public String getOkId() {
        String[] strArr = this.f59406d;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    @Nullable
    public String[] getOkIds() {
        String[] strArr = this.f59406d;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    @Nullable
    public String getVKId() {
        String[] strArr = this.f59407e;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    @Nullable
    public String[] getVKIds() {
        String[] strArr = this.f59407e;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public void putCustomDataToMap(@NonNull Map<String, String> map) {
        map.putAll(this.f59404b);
    }

    public void putDataTo(@NonNull Map<String, String> map) {
        synchronized (this) {
            map.putAll(this.f59403a);
        }
    }

    public void setAge(int i10) {
        if (i10 < 0) {
            gb.a("CustomParams: Age param removed");
            b("ea");
            return;
        }
        gb.a("CustomParams: Age param set to " + i10);
        b("ea", String.valueOf(i10));
    }

    public void setCustomParam(@NonNull String str, @Nullable String str2) {
        b(str, str2);
        a(str, str2);
    }

    public void setCustomUserId(@Nullable String str) {
        if (str == null) {
            this.f59409g = null;
        } else {
            this.f59409g = new String[]{str};
        }
        b("custom_user_id", str);
    }

    public void setCustomUserIds(@Nullable String[] strArr) {
        if (strArr == null) {
            this.f59409g = null;
            b("custom_user_id");
        } else {
            this.f59409g = (String[]) Arrays.copyOf(strArr, strArr.length);
            b("custom_user_id", e0.a(strArr));
        }
    }

    public void setEmail(@Nullable String str) {
        if (str == null) {
            this.f59405c = null;
        } else {
            this.f59405c = new String[]{str};
        }
        b("email", str);
    }

    public void setEmails(@Nullable String[] strArr) {
        if (strArr == null) {
            this.f59405c = null;
            b("email");
        } else {
            this.f59405c = (String[]) Arrays.copyOf(strArr, strArr.length);
            b("email", e0.a(strArr));
        }
    }

    public void setGender(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            b("eg");
            gb.a("CustomParams: Gender param removed");
            return;
        }
        gb.a("CustomParams: Gender param is set to " + i10);
        b("eg", String.valueOf(i10));
    }

    public void setIcqId(@Nullable String str) {
        if (str == null) {
            this.f59408f = null;
        } else {
            this.f59408f = new String[]{str};
        }
        b("icq_id", str);
    }

    public void setIcqIds(@Nullable String[] strArr) {
        if (strArr == null) {
            this.f59408f = null;
            b("icq_id");
        } else {
            this.f59408f = (String[]) Arrays.copyOf(strArr, strArr.length);
            b("icq_id", e0.a(strArr));
        }
    }

    public void setLang(@Nullable String str) {
        b(N6.f41413q, str);
    }

    public void setMrgsAppId(@Nullable String str) {
        b("mrgs_app_id", str);
    }

    public void setMrgsId(@Nullable String str) {
        b("mrgs_device_id", str);
    }

    public void setMrgsUserId(@Nullable String str) {
        b("mrgs_user_id", str);
    }

    public void setOkId(@Nullable String str) {
        if (str == null) {
            this.f59406d = null;
        } else {
            this.f59406d = new String[]{str};
        }
        b("ok_id", str);
    }

    public void setOkIds(@Nullable String[] strArr) {
        if (strArr == null) {
            this.f59406d = null;
            b("ok_id");
        } else {
            this.f59406d = (String[]) Arrays.copyOf(strArr, strArr.length);
            b("ok_id", e0.a(strArr));
        }
    }

    public void setVKId(@Nullable String str) {
        if (str == null) {
            this.f59407e = null;
        } else {
            this.f59407e = new String[]{str};
        }
        b("vk_id", str);
    }

    public void setVKIds(@Nullable String[] strArr) {
        if (strArr == null) {
            this.f59407e = null;
            b("vk_id");
        } else {
            this.f59407e = (String[]) Arrays.copyOf(strArr, strArr.length);
            b("vk_id", e0.a(strArr));
        }
    }

    public final String a(String str) {
        String str2;
        synchronized (this) {
            str2 = (String) this.f59403a.get(str);
        }
        return str2;
    }

    public final boolean b(String str) {
        synchronized (this) {
            try {
                if (!this.f59403a.containsKey(str)) {
                    return false;
                }
                this.f59403a.remove(str);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
