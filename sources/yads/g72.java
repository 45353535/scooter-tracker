package yads;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: loaded from: classes4.dex */
public final class g72 implements s21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f111090a;

    public g72(i72 i72Var) {
        this.f111090a = i72Var;
    }

    public final Bitmap a(String str) {
        return (Bitmap) this.f111090a.get(str);
    }

    public final void a(String str, Bitmap bitmap) {
        this.f111090a.put(str, bitmap);
    }
}
