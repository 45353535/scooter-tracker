package yads;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ff1 implements df1, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bw2 f110704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f110705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f110706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f110707e;

    public ff1(Context context, String str, bw2 bw2Var) {
        this.f110703a = str;
        this.f110704b = bw2Var;
        Context applicationContext = context.getApplicationContext();
        this.f110705c = applicationContext != null ? applicationContext : context;
        this.f110706d = lf.i.a(new ef1(this));
        this.f110707e = new LinkedHashSet();
    }

    public final void a() {
        ((SharedPreferences) this.f110706d.getValue()).edit().clear().apply();
    }

    public final long b(String str) {
        return ((SharedPreferences) this.f110706d.getValue()).getLong(str, 0L);
    }

    public final String c(String str) {
        return ((SharedPreferences) this.f110706d.getValue()).getString(str, null);
    }

    public final void d(String str) {
        ((SharedPreferences) this.f110706d.getValue()).edit().remove(str).apply();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            Iterator it = this.f110707e.iterator();
            while (it.hasNext()) {
                cf1 cf1Var = (cf1) ((WeakReference) it.next()).get();
                if (cf1Var != null) {
                    jw jwVar = (jw) cf1Var;
                    synchronized (jw.f112475j) {
                        try {
                            sw swVarA = jwVar.f112477c.a(this, str);
                            if (swVarA == null) {
                                swVarA = jwVar.f112476b.a(this, str);
                            }
                            if (swVarA != null) {
                                jwVar.a(swVarA);
                            }
                            Unit unit = Unit.f93236a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public final boolean a(String str) {
        return ((SharedPreferences) this.f110706d.getValue()).contains(str);
    }

    public final void b(String str, boolean z10) {
        ((SharedPreferences) this.f110706d.getValue()).edit().putBoolean(str, z10).apply();
    }

    public final boolean a(String str, boolean z10) {
        return ((SharedPreferences) this.f110706d.getValue()).getBoolean(str, z10);
    }

    public final void b(int i10, String str) {
        ((SharedPreferences) this.f110706d.getValue()).edit().putInt(str, i10).apply();
    }

    public final int a(int i10, String str) {
        ((SharedPreferences) this.f110706d.getValue()).contains(str);
        return ((SharedPreferences) this.f110706d.getValue()).getInt(str, i10);
    }

    public final Set a(String str, Set set) {
        return ((SharedPreferences) this.f110706d.getValue()).getStringSet(str, set);
    }

    public final void a(String str, long j10) {
        ((SharedPreferences) this.f110706d.getValue()).edit().putLong(str, j10).apply();
    }

    public final void a(String str, String str2) {
        ((SharedPreferences) this.f110706d.getValue()).edit().putString(str, str2).apply();
    }

    public final void a(String str, HashSet hashSet) {
        ((SharedPreferences) this.f110706d.getValue()).edit().putStringSet(str, hashSet).apply();
    }

    public final void a(cf1 cf1Var) {
        if (this.f110707e.isEmpty()) {
            ((SharedPreferences) this.f110706d.getValue()).registerOnSharedPreferenceChangeListener(this);
        }
        this.f110707e.add(new WeakReference(cf1Var));
    }
}
