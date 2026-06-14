package sg.bigo.ads.common.u.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.u.a;
import sg.bigo.ads.common.u.f;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c<T extends sg.bigo.ads.common.u.a> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f102747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final T f102748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Executor f102749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f102750m = 15000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map<String, Set<String>> f102751n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f102752o;

    public c(int i10, @NonNull T t10, boolean z10, Context context) {
        this.f102747j = i10;
        this.f102748k = t10;
        this.f102752o = z10;
        a("BIGO-Ad-Request-Id", String.valueOf(i10));
        a("User-Agent", sg.bigo.ads.common.aa.c.c(context));
    }

    @NonNull
    private Set<String> b(@NonNull String str) {
        Set<String> set = this.f102751n.get(str);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.f102751n.put(str, hashSet);
        return hashSet;
    }

    @NonNull
    public String a() {
        return "GET";
    }

    @Nullable
    public byte[] c() {
        return null;
    }

    @Nullable
    public String d() {
        return null;
    }

    public int e() {
        return -1;
    }

    public boolean f() {
        return false;
    }

    @NonNull
    public final String g() {
        return this.f102748k.a();
    }

    public void h() {
    }

    public final void a(String str) {
        b(str).clear();
    }

    @Nullable
    public f b() {
        return null;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        b(str).add(str2);
    }
}
