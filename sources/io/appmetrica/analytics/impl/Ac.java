package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class Ac implements K8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vg f75517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4991bf f75518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75519c = "activation_unlock_event_sending";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f75520d;

    public Ac(@NotNull Vg vg2, @NotNull C5487v4 c5487v4, @NotNull C4991bf c4991bf) {
        this.f75517a = vg2;
        this.f75518b = c4991bf;
        this.f75520d = new AtomicBoolean(c4991bf.a(false) || a(c5487v4));
    }

    public final void a(String str) {
        try {
            Vj vj = AbstractC5452tj.f78304a;
            String str2 = this.f75519c;
            JSONObject jSONObjectPut = new JSONObject().put("source", str).put("framework", FrameworkDetector.framework());
            T9 t9I = C5468ua.H.i();
            Bundle applicationMetaData = t9I.f76497d.getApplicationMetaData(t9I.f76494a);
            JSONObject jSONObjectPut2 = jSONObjectPut.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C5379qk c5379qk = C5468ua.H.D;
            String string = jSONObjectPut2.put("activation_offset", TimeUnit.SECONDS.convert(c5379qk.f78090a.currentTimeMillis() - c5379qk.f78091b, TimeUnit.MILLISECONDS)).toString();
            vj.getClass();
            vj.a(new Tj(str2, string));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.K8
    public final boolean b() {
        String str;
        if (!this.f75520d.get() && (str = ((C5351ph) this.f75517a.a()).f77992m) != null && !Intrinsics.areEqual(str, "629a824d-c717-4ba5-bc0f-3f3968554d01") && this.f75520d.compareAndSet(false, true)) {
            this.f75518b.b(true);
            a("activation");
        }
        return this.f75520d.get();
    }

    public final void a() {
        if (this.f75520d.compareAndSet(false, true)) {
            this.f75518b.b(true);
            a("timer");
        }
    }

    public static boolean a(C5487v4 c5487v4) {
        String str = c5487v4.f78409a;
        return (str == null || Intrinsics.areEqual(str, "629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
