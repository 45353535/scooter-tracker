package com.inmobi.media;

import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3775i5 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3799j5 f38742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f38747g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3775i5(C3799j5 c3799j5, int i10, int i11, int i12, int i13, int i14, Continuation continuation) {
        super(2, continuation);
        this.f38742b = c3799j5;
        this.f38743c = i10;
        this.f38744d = i11;
        this.f38745e = i12;
        this.f38746f = i13;
        this.f38747g = i14;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3775i5 c3775i5 = new C3775i5(this.f38742b, this.f38743c, this.f38744d, this.f38745e, this.f38746f, this.f38747g, continuation);
        c3775i5.f38741a = obj;
        return c3775i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3775i5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Drawable drawable = ContextCompat.getDrawable(this.f38742b.getContext(), this.f38743c);
        if (drawable != null) {
            this.f38742b.a(drawable, this.f38744d, this.f38745e, this.f38746f, this.f38747g);
            return Unit.f93236a;
        }
        C3799j5 c3799j5 = this.f38742b;
        InterfaceC3878m9 interfaceC3878m9 = c3799j5.f38793b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("CustomView", "CustomView drawable for " + ((int) c3799j5.f38792a) + " cannot be created");
        }
        return Unit.f93236a;
    }
}
