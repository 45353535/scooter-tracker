package x4;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes10.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f108152a;

    public y(Context context) {
        this.f108152a = context;
    }

    public void a() {
        e(-1);
    }

    public int b() {
        return this.f108152a.getSharedPreferences("PREF_FILE", 0).getInt("rating", 3);
    }

    public void c() {
        int iB = b();
        if (iB != -1) {
            e(iB + 1);
        }
    }

    public void d() {
        e(0);
    }

    public void e(int i10) {
        SharedPreferences.Editor editorEdit = this.f108152a.getSharedPreferences("PREF_FILE", 0).edit();
        editorEdit.putInt("rating", i10);
        editorEdit.apply();
    }

    public boolean f() {
        return b() >= 3;
    }
}
