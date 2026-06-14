package com.my.tracker;

import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.tracker.obfuscated.b3;
import com.my.tracker.obfuscated.l;
import com.my.tracker.obfuscated.s;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class MyTrackerParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f61203a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f61204b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile b3 f61205c = b3.f61279j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map f61206d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile String f61207e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile String f61208f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile String f61209g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    volatile String f61210h = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Gender {
        public static final int FEMALE = 2;
        public static final int MALE = 1;
        public static final int UNKNOWN = 0;
        public static final int UNSPECIFIED = -1;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f61213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f61214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Map f61215e;

        public a(String str, String str2, String str3, String str4, Map map) {
            this.f61211a = str;
            this.f61212b = str2;
            this.f61213c = str3;
            this.f61214d = str4;
            this.f61215e = new HashMap(map);
        }
    }

    private static String[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new String[]{str};
    }

    private static String b(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    @AnyThread
    public int getAge() {
        return this.f61205c.f61280a;
    }

    @Nullable
    @AnyThread
    public String getCustomParam(@NonNull String str) {
        return (String) this.f61206d.get(str.toLowerCase(Locale.ROOT));
    }

    @Nullable
    @AnyThread
    public String getCustomUserId() {
        return b(this.f61205c.f61286g);
    }

    @Nullable
    @AnyThread
    public String[] getCustomUserIds() {
        return a(this.f61205c.f61286g);
    }

    @Nullable
    @AnyThread
    public String getEmail() {
        return b(this.f61205c.f61284e);
    }

    @Nullable
    @AnyThread
    public String[] getEmails() {
        return a(this.f61205c.f61284e);
    }

    @AnyThread
    public int getGender() {
        return this.f61205c.f61281b;
    }

    @Nullable
    @AnyThread
    public String getIcqId() {
        return b(this.f61205c.f61285f);
    }

    @Nullable
    @AnyThread
    public String[] getIcqIds() {
        return a(this.f61205c.f61285f);
    }

    @Nullable
    @AnyThread
    public String getLang() {
        return this.f61207e;
    }

    @Nullable
    @AnyThread
    public String getMrgsAppId() {
        return this.f61208f;
    }

    @Nullable
    @AnyThread
    public String getMrgsId() {
        return this.f61210h;
    }

    @Nullable
    @AnyThread
    public String getMrgsUserId() {
        return this.f61209g;
    }

    @Nullable
    @AnyThread
    public String getOkId() {
        return b(this.f61205c.f61282c);
    }

    @Nullable
    @AnyThread
    public String[] getOkIds() {
        return a(this.f61205c.f61282c);
    }

    @Nullable
    @AnyThread
    public String getPhone() {
        return b(this.f61205c.f61287h);
    }

    @Nullable
    @AnyThread
    public String[] getPhones() {
        return a(this.f61205c.f61287h);
    }

    @Nullable
    @AnyThread
    public String getVkConnectId() {
        return b(this.f61205c.f61288i);
    }

    @Nullable
    @AnyThread
    public String[] getVkConnectIds() {
        return a(this.f61205c.f61288i);
    }

    @Nullable
    @AnyThread
    public String getVkId() {
        return b(this.f61205c.f61283d);
    }

    @Nullable
    @AnyThread
    public String[] getVkIds() {
        return a(this.f61205c.f61283d);
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setAge(int i10) {
        synchronized (this.f61204b) {
            try {
                if (this.f61205c.f61280a != i10) {
                    b3 b3Var = new b3(i10, this.f61205c.f61281b, this.f61205c.f61282c, this.f61205c.f61283d, this.f61205c.f61284e, this.f61205c.f61285f, this.f61205c.f61286g, this.f61205c.f61287h, this.f61205c.f61288i);
                    a(b3Var);
                    this.f61205c = b3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setCustomParam(@NonNull String str, @Nullable String str2) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (str2 == null) {
            this.f61206d.remove(lowerCase);
            return this;
        }
        this.f61206d.put(lowerCase, str2);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setCustomUserId(@Nullable String str) {
        return setCustomUserIds(a(str));
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setCustomUserIds(@Nullable String[] strArr) {
        synchronized (this.f61204b) {
            try {
                String[] strArrA = a(strArr);
                if (l.a(this.f61205c.f61286g, strArr) != 0) {
                    b3 b3Var = new b3(this.f61205c.f61280a, this.f61205c.f61281b, this.f61205c.f61282c, this.f61205c.f61283d, this.f61205c.f61284e, this.f61205c.f61285f, strArrA, this.f61205c.f61287h, this.f61205c.f61288i);
                    a(b3Var);
                    this.f61205c = b3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setEmail(@Nullable String str) {
        return setEmails(a(str));
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setEmails(@Nullable String[] strArr) {
        synchronized (this.f61204b) {
            try {
                String[] strArrA = a(strArr);
                if (l.a(this.f61205c.f61284e, strArr) != 0) {
                    b3 b3Var = new b3(this.f61205c.f61280a, this.f61205c.f61281b, this.f61205c.f61282c, this.f61205c.f61283d, strArrA, this.f61205c.f61285f, this.f61205c.f61286g, this.f61205c.f61287h, this.f61205c.f61288i);
                    a(b3Var);
                    this.f61205c = b3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setGender(int i10) {
        synchronized (this.f61204b) {
            try {
                if (this.f61205c.f61281b != i10) {
                    b3 b3Var = new b3(this.f61205c.f61280a, i10, this.f61205c.f61282c, this.f61205c.f61283d, this.f61205c.f61284e, this.f61205c.f61285f, this.f61205c.f61286g, this.f61205c.f61287h, this.f61205c.f61288i);
                    a(b3Var);
                    this.f61205c = b3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setIcqId(@Nullable String str) {
        return setIcqIds(a(str));
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setIcqIds(@Nullable String[] strArr) {
        synchronized (this.f61204b) {
            try {
                String[] strArrA = a(strArr);
                if (l.a(this.f61205c.f61285f, strArr) != 0) {
                    b3 b3Var = new b3(this.f61205c.f61280a, this.f61205c.f61281b, this.f61205c.f61282c, this.f61205c.f61283d, this.f61205c.f61284e, strArrA, this.f61205c.f61286g, this.f61205c.f61287h, this.f61205c.f61288i);
                    a(b3Var);
                    this.f61205c = b3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setLang(@Nullable String str) {
        this.f61207e = str;
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setMrgsAppId(@Nullable String str) {
        this.f61208f = str;
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setMrgsId(@Nullable String str) {
        this.f61210h = str;
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setMrgsUserId(@Nullable String str) {
        this.f61209g = str;
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setOkId(@Nullable String str) {
        return setOkIds(a(str));
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setOkIds(@Nullable String[] strArr) {
        synchronized (this.f61204b) {
            try {
                String[] strArrA = a(strArr);
                if (l.a(this.f61205c.f61282c, strArr) != 0) {
                    b3 b3Var = new b3(this.f61205c.f61280a, this.f61205c.f61281b, strArrA, this.f61205c.f61283d, this.f61205c.f61284e, this.f61205c.f61285f, this.f61205c.f61286g, this.f61205c.f61287h, this.f61205c.f61288i);
                    a(b3Var);
                    this.f61205c = b3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setPhone(@Nullable String str) {
        return setPhones(a(str));
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setPhones(@Nullable String[] strArr) {
        synchronized (this.f61204b) {
            try {
                String[] strArrA = a(strArr);
                if (l.a(this.f61205c.f61287h, strArr) != 0) {
                    b3 b3Var = new b3(this.f61205c.f61280a, this.f61205c.f61281b, this.f61205c.f61282c, this.f61205c.f61283d, this.f61205c.f61284e, this.f61205c.f61285f, this.f61205c.f61286g, strArrA, this.f61205c.f61288i);
                    a(b3Var);
                    this.f61205c = b3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setVkConnectId(@Nullable String str) {
        return setVkConnectIds(a(str));
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setVkConnectIds(@Nullable String[] strArr) {
        synchronized (this.f61204b) {
            try {
                String[] strArrA = a(strArr);
                if (l.a(this.f61205c.f61288i, strArr) != 0) {
                    b3 b3Var = new b3(this.f61205c.f61280a, this.f61205c.f61281b, this.f61205c.f61282c, this.f61205c.f61283d, this.f61205c.f61284e, this.f61205c.f61285f, this.f61205c.f61286g, this.f61205c.f61287h, strArrA);
                    a(b3Var);
                    this.f61205c = b3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setVkId(@Nullable String str) {
        return setVkIds(a(str));
    }

    @NonNull
    @AnyThread
    public MyTrackerParams setVkIds(@Nullable String[] strArr) {
        synchronized (this.f61204b) {
            try {
                String[] strArrA = a(strArr);
                if (l.a(this.f61205c.f61283d, strArr) != 0) {
                    b3 b3Var = new b3(this.f61205c.f61280a, this.f61205c.f61281b, this.f61205c.f61282c, strArrA, this.f61205c.f61284e, this.f61205c.f61285f, this.f61205c.f61286g, this.f61205c.f61287h, this.f61205c.f61288i);
                    a(b3Var);
                    this.f61205c = b3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    private static String[] a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public void a(s sVar, s sVar2) {
        synchronized (this.f61204b) {
            synchronized (this.f61203a) {
                sVar.a(this.f61205c);
                this.f61203a.add(sVar2);
            }
        }
    }

    private void a(b3 b3Var) {
        synchronized (this.f61203a) {
            try {
                Iterator it = this.f61203a.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).a(b3Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a a() {
        return new a(this.f61208f, this.f61209g, this.f61210h, this.f61207e, this.f61206d);
    }
}
