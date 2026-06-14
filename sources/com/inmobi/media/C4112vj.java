package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: renamed from: com.inmobi.media.vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4112vj extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Image f39791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4137wj f39792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4112vj(Image image, C4137wj c4137wj, Continuation continuation) {
        super(2, continuation);
        this.f39791b = image;
        this.f39792c = c4137wj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4112vj(this.f39791b, this.f39792c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4112vj(this.f39791b, this.f39792c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39790a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            ArrayList arrayListA = AbstractC4197z4.a("click", this.f39791b.getTrackers());
            MutableSharedFlow mutableSharedFlow = this.f39792c.f39868d;
            Link link = this.f39791b.getLink();
            C3788ij c3788ij = new C3788ij(link != null ? link.getUrl() : null, arrayListA);
            this.f39790a = 1;
            if (mutableSharedFlow.emit(c3788ij, this) == objG) {
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
