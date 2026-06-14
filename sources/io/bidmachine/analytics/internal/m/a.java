package io.bidmachine.analytics.internal.m;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import io.bidmachine.analytics.internal.g.e;
import io.bidmachine.analytics.internal.i.a;
import io.bidmachine.analytics.internal.j.a;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends io.bidmachine.analytics.internal.j.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j f79642k = new j(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Lazy f79643l = lf.i.a(C0954a.f79655a);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Lazy f79644m = lf.i.a(e.f79659a);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Lazy f79645n = lf.i.a(d.f79658a);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Lazy f79646o = lf.i.a(b.f79656a);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Lazy f79647p = lf.i.a(c.f79657a);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Lazy f79648q = lf.i.a(g.f79661a);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Lazy f79649r = lf.i.a(h.f79662a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Lazy f79650s = lf.i.a(i.f79663a);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Lazy f79651t = lf.i.a(f.f79660a);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m f79653i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f79652h = "mimp";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Lazy f79654j = lf.i.a(n.f79669a);

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$a, reason: collision with other inner class name */
    static final class C0954a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0954a f79655a = new C0954a();

        C0954a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("QkFOTkVS");
        }
    }

    static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f79656a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("SU5URVI=");
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f79657a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("SU5URVJTVElUSUFM");
        }
    }

    static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f79658a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("TEVBREVS");
        }
    }

    static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f79659a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("TVJFQw==");
        }
    }

    static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f79660a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("TkFUSVZF");
        }
    }

    static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f79661a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("UkVXQVJE");
        }
    }

    static final class h extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f79662a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("UkVXQVJERUQ=");
        }
    }

    static final class i extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f79663a = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("UkVXQVJERURfSU5URVJTVElUSUFM");
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return (String) a.f79643l.getValue();
        }

        public final String b() {
            return (String) a.f79646o.getValue();
        }

        public final String c() {
            return (String) a.f79647p.getValue();
        }

        public final String d() {
            return (String) a.f79645n.getValue();
        }

        public final String e() {
            return (String) a.f79644m.getValue();
        }

        public final String f() {
            return (String) a.f79651t.getValue();
        }

        public final String g() {
            return (String) a.f79648q.getValue();
        }

        public final String h() {
            return (String) a.f79649r.getValue();
        }

        public final String i() {
            return (String) a.f79650s.getValue();
        }

        private j() {
        }
    }

    private static final class k implements AppLovinCommunicatorSubscriber {
        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return "";
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        }
    }

    private static final class l implements AppLovinCommunicatorSubscriber {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.bidmachine.analytics.internal.h.b f79664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lazy f79665b = lf.i.a(C0955a.f79666a);

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.m.a$l$a, reason: collision with other inner class name */
        static final class C0955a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0955a f79666a = new C0955a();

            C0955a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return UUID.randomUUID().toString();
            }
        }

        public l(io.bidmachine.analytics.internal.h.b bVar) {
            this.f79664a = bVar;
        }

        private final String a() {
            return (String) this.f79665b.getValue();
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return a();
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
            Object eVar;
            try {
                Result.Companion companion = Result.f93230c;
                if (appLovinCommunicatorMessage != null && Intrinsics.areEqual("max_revenue_events", appLovinCommunicatorMessage.getTopic())) {
                    Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                    if (messageData == null || messageData.size() <= 0) {
                        this.f79664a.a(new io.bidmachine.analytics.internal.g.e("mimp", e.a.MONITOR_NO_CONTENT, null, 4, null));
                        return;
                    }
                    try {
                        this.f79664a.a(io.bidmachine.analytics.internal.a.e.a(messageData));
                        eVar = Unit.f93236a;
                    } catch (Throwable th2) {
                        eVar = new io.bidmachine.analytics.internal.g.e("mimp", e.a.MONITOR_BAD_CONTENT, io.bidmachine.analytics.internal.a.e.a(th2));
                    }
                    Result.b(eVar);
                }
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.f93230c;
                Result.b(kotlin.d.a(th3));
            }
        }
    }

    public static final class m implements AppLovinBroadcastManager.Receiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f79667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile AppLovinCommunicatorSubscriber f79668b;

        public final void a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
            this.f79668b = appLovinCommunicatorSubscriber;
        }

        @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
        public void onReceive(Intent intent, Map map) {
            AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber;
            if (this.f79667a && (intent instanceof AppLovinCommunicatorMessage) && (appLovinCommunicatorSubscriber = this.f79668b) != null) {
                appLovinCommunicatorSubscriber.onMessageReceived((AppLovinCommunicatorMessage) intent);
            }
        }

        public final void a(boolean z10) {
            this.f79667a = z10;
        }
    }

    static final class n extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f79669a = new n();

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return new k();
        }
    }

    private final AppLovinCommunicatorSubscriber l() {
        return (AppLovinCommunicatorSubscriber) this.f79654j.getValue();
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f79652h;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    /* JADX INFO: renamed from: a */
    public void b(a.C0950a c0950a) {
        super.b(c0950a);
        m mVar = this.f79653i;
        if (mVar == null) {
            return;
        }
        mVar.a(new l(this));
    }

    @Override // io.bidmachine.analytics.internal.j.a
    public a.b b(Map map) {
        Object obj;
        String string;
        Float fA = io.bidmachine.analytics.internal.a.b.a(map.get("revenue"));
        if (fA == null || (obj = map.get("network_name")) == null || (string = obj.toString()) == null) {
            return null;
        }
        return new a.b(null, 0, fA, string, null, false, 51, null);
    }

    @Override // io.bidmachine.analytics.internal.j.a
    public a.EnumC0951a c(Map map) {
        String string;
        String upperCase;
        Object obj = map.get("ad_format");
        if (obj != null && (string = obj.toString()) != null && (upperCase = string.toUpperCase(Locale.US)) != null) {
            j jVar = f79642k;
            if (Intrinsics.areEqual(upperCase, jVar.a()) ? true : Intrinsics.areEqual(upperCase, jVar.e()) ? true : Intrinsics.areEqual(upperCase, jVar.d())) {
                return a.EnumC0951a.BANNER;
            }
            if (Intrinsics.areEqual(upperCase, jVar.b()) ? true : Intrinsics.areEqual(upperCase, jVar.c())) {
                return a.EnumC0951a.INTERSTITIAL;
            }
            if (Intrinsics.areEqual(upperCase, jVar.g()) ? true : Intrinsics.areEqual(upperCase, jVar.h()) ? true : Intrinsics.areEqual(upperCase, jVar.i())) {
                return a.EnumC0951a.REWARDED;
            }
            if (Intrinsics.areEqual(upperCase, jVar.f())) {
                return a.EnumC0951a.NATIVE;
            }
        }
        return null;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
        m mVar = new m();
        AppLovinBroadcastManager.registerReceiver(mVar, new IntentFilter("max_revenue_events"));
        this.f79653i = mVar;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void e(Context context) {
        m mVar = this.f79653i;
        if (mVar != null) {
            mVar.a(false);
        }
        AppLovinCommunicator.getInstance(context).unsubscribe(l(), "max_revenue_events");
    }

    @Override // io.bidmachine.analytics.internal.j.a, io.bidmachine.analytics.internal.h.d
    public void f(Context context) {
        super.f(context);
        m mVar = this.f79653i;
        if (mVar != null) {
            mVar.a(true);
        }
        AppLovinCommunicator.getInstance(context).subscribe(l(), "max_revenue_events");
    }
}
