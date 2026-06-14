package io.bidmachine.analytics.internal.p;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.n.a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends io.bidmachine.analytics.internal.n.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f79710j = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f79711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f79712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f79713i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(e eVar, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i10 & 2) != 0 ? new d(eVar, null, 2, null) : dVar);
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f79713i;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
    }

    @Override // io.bidmachine.analytics.internal.n.a, io.bidmachine.analytics.internal.h.d
    public void e(Context context) {
        super.e(context);
        this.f79712h.a();
    }

    @Override // io.bidmachine.analytics.internal.n.a, io.bidmachine.analytics.internal.h.d
    public void f(Context context) {
        this.f79712h.b();
        super.f(context);
    }

    @Override // io.bidmachine.analytics.internal.n.a, io.bidmachine.analytics.internal.h.d
    /* JADX INFO: renamed from: a */
    public void b(a.C0956a c0956a) {
        super.b(c0956a);
        this.f79712h.a(c0956a);
    }

    public c(e eVar, d dVar) {
        this.f79711g = eVar;
        this.f79712h = dVar;
        this.f79713i = "alog";
    }

    @Override // io.bidmachine.analytics.internal.n.a
    public Object a(ReaderConfig.Rule rule, Continuation continuation) {
        return this.f79712h.a(rule);
    }
}
