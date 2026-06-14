package com.inmobi.media;

import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.coroutines.Deferred;

/* JADX INFO: renamed from: com.inmobi.media.fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3718fo extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3878m9 f38605c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3718fo(String str, InterfaceC3878m9 interfaceC3878m9, Continuation continuation) {
        super(2, continuation);
        this.f38604b = str;
        this.f38605c = interfaceC3878m9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3718fo(this.f38604b, this.f38605c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3718fo(this.f38604b, this.f38605c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C3615bo c3615bo;
        Object objG = pf.b.g();
        int i10 = this.f38603a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            jo joVar = jo.f38842a;
            Deferred deferredA = jo.a(this.f38604b, this.f38605c);
            this.f38603a = 1;
            obj = deferredA.await(this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        Ne ne2 = (Ne) obj;
        jo joVar2 = jo.f38842a;
        if (ne2 != null && AbstractC3741gl.a(ne2)) {
            vh.h hVarD = ne2.d();
            Charset charset = Charsets.UTF_8;
            if (hVarD.M(charset).length() > 0 && (c3615bo = jo.f38844c) != null) {
                String str = this.f38604b;
                IntRange intRange = Se.f37724a;
                Intrinsics.checkNotNullParameter(ne2, "<this>");
                String strM = ne2.d().M(charset);
                InterfaceC3878m9 interfaceC3878m9 = this.f38605c;
                String str2 = this.f38604b;
                if (interfaceC3878m9 != null) {
                    ((C3903n9) interfaceC3878m9).c("WebResourceHandler", "downloadResourceAndSaveToCache() response received: " + str2);
                }
                Unit unit = Unit.f93236a;
                kotlin.coroutines.jvm.internal.b.a(c3615bo.a(str, strM, this.f38605c));
            }
        }
        return ne2;
    }
}
