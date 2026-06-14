package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class U9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    R6 f41839a = new R6();

    class a extends AbstractRunnableC4232ae {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC4402ke f41840b;

        a(EnumC4402ke enumC4402ke) {
            this.f41840b = enumC4402ke;
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            U9.this.f41839a.a(N6.f41384g0, new JSONArray().put(this.f41840b.b()));
        }
    }

    public void a(JSONObject jSONObject) {
        this.f41839a.a("md", (Object) jSONObject);
    }

    public void b(JSONObject jSONObject) {
        this.f41839a.a(N6.f41382f1, (Object) jSONObject);
    }

    public void c(String str) {
        this.f41839a.a(N6.K0, str);
    }

    public void d(String str) {
        this.f41839a.a(N6.M0, str);
    }

    public void e(String str) {
        this.f41839a.a(com.ironsource.mediationsdk.metadata.a.f44110i, str);
    }

    public void f(String str) {
        this.f41839a.a(N6.f41367a1, str);
    }

    public void g(String str) {
        this.f41839a.a(N6.A, str);
    }

    public void h(String str) {
        this.f41839a.a("sid", str);
    }

    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f41839a.a(N6.f41378e0, str);
    }

    public void a(boolean z10) {
        this.f41839a.a(N6.R0, Boolean.valueOf(z10));
    }

    public void b(boolean z10) {
        this.f41839a.a("gpi", Boolean.valueOf(z10));
    }

    public void c(int i10) {
        this.f41839a.a(N6.f41381f0, Integer.valueOf(i10));
    }

    public void a(Context context) {
        this.f41839a.a(context);
    }

    public void b(int i10) {
        if (i10 >= 0) {
            this.f41839a.a(N6.T0, Integer.valueOf(i10));
        }
    }

    public void a(Boolean bool) {
        this.f41839a.a(N6.U0, bool);
    }

    public void b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f41839a.a(N6.D1, str);
    }

    public void a(EnumC4402ke enumC4402ke) {
        new Thread(new a(enumC4402ke)).start();
    }

    public void b(Context context) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        ActivityManager.MemoryInfo memoryInfoN = interfaceC4634y7I.n(context);
        this.f41839a.a(N6.f41431w, interfaceC4634y7I.c(memoryInfoN));
        this.f41839a.a(N6.f41434x, interfaceC4634y7I.b(memoryInfoN));
    }

    public void a(@NotNull R7 r72) {
        try {
            HashMap map = new HashMap();
            map.put(N6.E, r72.a());
            map.put(N6.D, r72.b());
            map.put(N6.V, r72.c());
            this.f41839a.a(map);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f41839a.a("abt", str);
    }

    public void a(int i10) {
        this.f41839a.a(N6.f41393j0, Integer.valueOf(i10));
    }
}
