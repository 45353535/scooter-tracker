package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC5017cf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f76969c = "cf";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Oa f76970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76971b;

    public AbstractC5017cf(Oa oa2, String str) {
        this.f76970a = oa2;
        this.f76971b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC5017cf> T a(String str, float f10) {
        synchronized (this) {
            this.f76970a.a(str, f10);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC5017cf> T b(String str, String str2) {
        synchronized (this) {
            this.f76970a.a(str, str2);
        }
        return this;
    }

    public final C5043df c(String str) {
        return new C5043df(str, this.f76971b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC5017cf> T d(String str) {
        synchronized (this) {
            this.f76970a.remove(str);
        }
        return this;
    }

    @NonNull
    public Set<String> c() {
        return this.f76970a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC5017cf> T a(String str, String[] strArr) {
        String string;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : strArr) {
                jSONArray.put(str2);
            }
            string = jSONArray.toString();
        } catch (Throwable unused) {
            string = null;
        }
        this.f76970a.a(str, string);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC5017cf> T b(String str, long j10) {
        synchronized (this) {
            this.f76970a.a(str, j10);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <T extends AbstractC5017cf> T b(String str, int i10) {
        synchronized (this) {
            this.f76970a.a(i10, str);
        }
        return this;
    }

    public final <T extends AbstractC5017cf> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j10) {
        return this.f76970a.getLong(str, j10);
    }

    public final int a(@NonNull String str, int i10) {
        return this.f76970a.getInt(str, i10);
    }

    @Nullable
    public final String a(@NonNull String str, @Nullable String str2) {
        return this.f76970a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC5017cf> T b(String str, boolean z10) {
        synchronized (this) {
            this.f76970a.a(str, z10);
        }
        return this;
    }

    public final boolean a(String str, boolean z10) {
        return this.f76970a.getBoolean(str, z10);
    }

    public final void b() {
        synchronized (this) {
            this.f76970a.b();
        }
    }

    public final boolean b(@NonNull String str) {
        return this.f76970a.a(str);
    }
}
