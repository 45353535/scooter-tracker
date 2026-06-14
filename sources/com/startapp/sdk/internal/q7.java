package com.startapp.sdk.internal;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q7 implements k0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f65138f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f65140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f65141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f65142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f65143e;

    static {
        Intrinsics.checkNotNullExpressionValue(q7.class.getSimpleName(), "getSimpleName(...)");
        f65138f = new Object();
    }

    public q7(Context context, lb executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f65139a = context;
        this.f65140b = executor;
        this.f65143e = new ArrayList();
    }

    @Override // com.startapp.sdk.internal.k0
    public final void a() {
        b(new Function1() { // from class: com.startapp.sdk.internal.tm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q7.a(((Boolean) obj).booleanValue());
            }
        });
    }

    public final void b(Function1 function1) {
        synchronized (f65138f) {
            try {
                if (this.f65142d) {
                    Unit unit = Unit.f93236a;
                    function1.invoke(Boolean.TRUE);
                } else {
                    if (!this.f65141c) {
                        this.f65141c = true;
                        ((Executor) this.f65140b.a()).execute(new Runnable() { // from class: com.startapp.sdk.internal.vm
                            @Override // java.lang.Runnable
                            public final void run() {
                                q7.a(this.f65416b);
                            }
                        });
                    }
                    a(function1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final Unit a(boolean z10) {
        return Unit.f93236a;
    }

    public static final void a(final q7 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            MobileAds.initialize(this$0.f65139a, new OnInitializationCompleteListener() { // from class: com.startapp.sdk.internal.um
                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public final void onInitializationComplete(InitializationStatus initializationStatus) {
                    q7.a(this.f65360a, initializationStatus);
                }
            });
        } catch (Throwable unused) {
            this$0.getClass();
            synchronized (f65138f) {
                List list = CollectionsKt.toList(this$0.f65143e);
                this$0.f65143e.clear();
                this$0.f65141c = false;
                Unit unit = Unit.f93236a;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(Boolean.FALSE);
                }
            }
        }
    }

    public static final Unit b(Function1 listener, q7 this$0, AdUnitConfig config, boolean z10) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(config, "$config");
        listener.invoke(z10 ? new s7(this$0.f65139a, config) : null);
        return Unit.f93236a;
    }

    public static final void a(q7 this$0, InitializationStatus it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getClass();
        synchronized (f65138f) {
            try {
                List list = CollectionsKt.toList(this$0.f65143e);
                this$0.f65143e.clear();
                this$0.f65141c = false;
                this$0.f65142d = true;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((Function1) it2.next()).invoke(Boolean.TRUE);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.startapp.sdk.internal.k0
    public final void b(final AdUnitConfig config, final Function1 listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b(new Function1() { // from class: com.startapp.sdk.internal.wm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q7.a(listener, this, config, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void a(Function1 function1) {
        synchronized (f65138f) {
            this.f65143e.add(function1);
        }
    }

    @Override // com.startapp.sdk.internal.k0
    public final void a(final AdUnitConfig config, final Function1 listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b(new Function1() { // from class: com.startapp.sdk.internal.sm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q7.b(listener, this, config, ((Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit a(Function1 listener, q7 this$0, AdUnitConfig config, boolean z10) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(config, "$config");
        listener.invoke(z10 ? new p7(this$0.f65139a, config) : null);
        return Unit.f93236a;
    }
}
