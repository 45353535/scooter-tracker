package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Cj f39413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4117w f39415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f39416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f39418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f39419g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C4117w c4117w, String str, int i10, int i11, int i12, Continuation continuation) {
        super(2, continuation);
        this.f39415c = c4117w;
        this.f39416d = str;
        this.f39417e = i10;
        this.f39418f = i11;
        this.f39419g = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.f39415c, this.f39416d, this.f39417e, this.f39418f, this.f39419g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws C3655dc {
        Cj cj;
        Object objG = pf.b.g();
        int i10 = this.f39414b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            Cj cj2 = new Cj(this.f39415c.f39807a);
            cj2.setLayoutParams(new ViewGroup.LayoutParams(this.f39418f, this.f39419g));
            C4117w c4117w = this.f39415c;
            String str = this.f39416d;
            int i11 = this.f39417e;
            this.f39413a = cj2;
            this.f39414b = 1;
            Object objA = C4117w.a(c4117w, cj2, str, i11, this);
            if (objA == objG) {
                return objG;
            }
            cj = cj2;
            obj = objA;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cj = this.f39413a;
            kotlin.d.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return cj;
        }
        throw new C3655dc();
    }
}
