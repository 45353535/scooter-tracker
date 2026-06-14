package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4143x0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdQualityResult f39885b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4143x0(AdQualityResult adQualityResult, Continuation continuation) {
        super(2, continuation);
        this.f39885b = adQualityResult;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4143x0(this.f39885b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4143x0(this.f39885b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39884a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            H0 h02 = (H0) E0.f36762a.getValue();
            String imageLocation = this.f39885b.getImageLocation();
            this.f39884a = 1;
            Object objA = h02.f36972a.a("ad_quality_db", "image_location=?", new String[]{imageLocation}, this);
            if (objA != pf.b.g()) {
                objA = Unit.f93236a;
            }
            if (objA == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }
}
