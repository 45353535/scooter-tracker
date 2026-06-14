package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public final class f2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f64478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f64479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f64480c;

    public f2(String str, Bitmap bitmap, Context context) {
        this.f64478a = str;
        this.f64479b = bitmap;
        this.f64480c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th2;
        FileOutputStream fileOutputStream;
        g2.f64542a.put(this.f64478a.concat(".png"), this.f64479b);
        try {
            fileOutputStream = new FileOutputStream(this.f64480c.getFilesDir().getPath() + "/" + this.f64478a + ".png");
        } catch (Throwable th3) {
            th2 = th3;
            fileOutputStream = null;
        }
        try {
            this.f64479b.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        } catch (Throwable th4) {
            th2 = th4;
            try {
                g9.a(th2);
            } finally {
                vi.a(fileOutputStream);
            }
        }
    }
}
