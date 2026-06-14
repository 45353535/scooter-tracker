package kc;

import android.content.Context;
import android.view.View;
import fd.b;
import ic.v;
import jc.c;
import jd.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends jc.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b f93152t;

    /* JADX INFO: renamed from: kc.a$a, reason: collision with other inner class name */
    private final class C1062a implements b.d {
        public C1062a() {
        }

        @Override // fd.b.d
        public void a() {
            a.this.s().a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, ec.b repository, id.a adElementParams, c adFormListener, yc.b eventCallback, wc.a aVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        b bVar = new b(context);
        bVar.setListener(new C1062a());
        this.f93152t = bVar;
    }

    @Override // jc.a
    public View H() {
        return this.f93152t;
    }

    @Override // jc.a
    protected void J() {
        this.f93152t.h();
    }

    @Override // ic.f0, ic.e0
    public void a(String str) {
        if (l.b(str) == null) {
            v.c("Can't obtain time to start", new Object[0]);
        } else {
            this.f93152t.setDuration(r4.intValue());
            this.f93152t.n();
        }
    }

    @Override // ic.f
    public void c() {
        C().a(this);
    }

    @Override // jc.a, ic.f
    public void d() {
        this.f93152t.m();
        super.d();
    }

    @Override // jc.a, ic.f
    public void f() {
        super.f();
        this.f93152t.o();
    }
}
