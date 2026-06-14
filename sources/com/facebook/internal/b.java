package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.appevents.m0;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b f19852c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19851b = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f19853d = "com.parse.bolts.measurement_event";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (b.a() != null) {
                return b.a();
            }
            b bVar = new b(context, null);
            b.b(bVar);
            b.c(bVar);
            return b.a();
        }

        private a() {
        }
    }

    public /* synthetic */ b(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public static final /* synthetic */ b a() {
        if (e3.a.d(b.class)) {
            return null;
        }
        try {
            return f19852c;
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(b bVar) {
        if (e3.a.d(b.class)) {
            return;
        }
        try {
            bVar.e();
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
        }
    }

    public static final /* synthetic */ void c(b bVar) {
        if (e3.a.d(b.class)) {
            return;
        }
        try {
            f19852c = bVar;
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
        }
    }

    private final void d() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.f19854a);
            Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
            localBroadcastManager.unregisterReceiver(this);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final void e() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.f19854a);
            Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
            localBroadcastManager.registerReceiver(this, new IntentFilter(f19853d));
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final void finalize() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            d();
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            m0 m0Var = new m0(context);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bf_");
            sb2.append(intent != null ? intent.getStringExtra(com.taurusx.tax.w.s.s.I) : null);
            String string = sb2.toString();
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
            Bundle bundle = new Bundle();
            Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
            if (setKeySet != null) {
                for (String key : setKeySet) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(key, TokenBuilder.TOKEN_DELIMITER), ""), ""), (String) bundleExtra.get(key));
                }
            }
            m0Var.d(string, bundle);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private b(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f19854a = applicationContext;
    }
}
