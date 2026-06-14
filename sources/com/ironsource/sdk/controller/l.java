package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4500q8;
import com.ironsource.InterfaceC4546t4;
import com.ironsource.InterfaceC4563u4;
import com.ironsource.InterfaceC4580v4;
import com.ironsource.Kb;
import com.ironsource.V4;
import com.ironsource.sdk.controller.f;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface l {

    public interface a {
        void a(@NotNull f.a aVar);
    }

    public interface b {
        void a(@NotNull Kb kb2);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(V4 v42);

    void a(V4 v42, Map<String, String> map, InterfaceC4546t4 interfaceC4546t4);

    void a(V4 v42, Map<String, String> map, InterfaceC4563u4 interfaceC4563u4);

    void a(f.c cVar, @Nullable a aVar);

    void a(String str, InterfaceC4563u4 interfaceC4563u4);

    void a(String str, String str2, V4 v42, InterfaceC4546t4 interfaceC4546t4);

    void a(String str, String str2, V4 v42, InterfaceC4563u4 interfaceC4563u4);

    void a(String str, String str2, V4 v42, InterfaceC4580v4 interfaceC4580v4);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, InterfaceC4546t4 interfaceC4546t4);

    void a(JSONObject jSONObject, InterfaceC4563u4 interfaceC4563u4);

    void a(JSONObject jSONObject, InterfaceC4580v4 interfaceC4580v4);

    boolean a(String str);

    void b();

    void b(Context context);

    void b(V4 v42);

    void b(V4 v42, Map<String, String> map, InterfaceC4563u4 interfaceC4563u4);

    void b(JSONObject jSONObject);

    void e();

    @Deprecated
    void f();

    void g();

    C4500q8.c h();
}
