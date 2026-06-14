package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4092v extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4117w f39708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f39709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Cj f39710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4092v(C4117w c4117w, String str, Cj cj, Continuation continuation) {
        super(2, continuation);
        this.f39708b = c4117w;
        this.f39709c = str;
        this.f39710d = cj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4092v(this.f39708b, this.f39709c, this.f39710d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4092v) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39707a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        C4117w c4117w = this.f39708b;
        String str = this.f39709c;
        Cj cj = this.f39710d;
        this.f39707a = 1;
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(this), 1);
        eVar.I();
        eVar.v(new C4042t(c4117w));
        Picasso picasso = Qf.f37593a;
        Qf.b(c4117w.f39807a).load(str).tag(c4117w.f39811e).transform(new Lf(Bitmap.Config.RGB_565)).into(cj, new C4067u(c4117w, eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(this);
        }
        return objC == objG ? objG : objC;
    }
}
