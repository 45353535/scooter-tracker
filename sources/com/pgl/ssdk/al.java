package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ironsource.X1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile al f62078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f62079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f62080c = new ArrayList();

    private al(Context context) {
        this.f62079b = null;
        this.f62079b = context;
    }

    public static al a(Context context) {
        if (f62078a == null) {
            synchronized (al.class) {
                try {
                    if (f62078a == null) {
                        f62078a = new al(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f62078a;
    }

    public int b() {
        Intent intentRegisterReceiver = this.f62079b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return intentRegisterReceiver.getIntExtra("plugged", 0);
    }

    public int c() {
        if (this.f62079b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            return 0;
        }
        return Math.round(((r0.getIntExtra("level", 0) / r0.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    public synchronized String d() {
        if (this.f62080c.size() <= 0) {
            return X1.f42014f;
        }
        return String.valueOf(this.f62080c.get(r0.size() - 1).intValue() % 10000);
    }

    public synchronized String e() {
        return new JSONArray((Collection) this.f62080c).toString();
    }

    @SuppressLint({"DefaultLocale"})
    public int f() {
        int iC;
        int iB = 0;
        try {
            synchronized (this) {
                iB = b();
                iC = c();
            }
            return (iB * 10000) + iC;
        } catch (Exception unused) {
            return iB * 10000;
        }
    }

    public void a() {
        int iF = f();
        if (iF == -1) {
            return;
        }
        this.f62080c.add(Integer.valueOf(iF));
        try {
            int size = this.f62080c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f62080c.subList(size - 10, size));
                this.f62080c.clear();
                this.f62080c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }
}
