package com.inmobi.media;

import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: com.inmobi.media.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4058tf extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Je f39597b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4058tf(Je je2, Continuation continuation) {
        super(2, continuation);
        this.f39597b = je2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4058tf(this.f39597b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4058tf(this.f39597b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objG = pf.b.g();
        int i10 = this.f39596a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C4077u9 c4077u9 = (C4077u9) He.f37018c.getValue();
            Je je2 = this.f39597b;
            this.f39596a = 1;
            obj = c4077u9.f39655a.a(je2, this);
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
        if (!AbstractC3741gl.a(ne2)) {
            throw new IOException();
        }
        IntRange intRange = Se.f37724a;
        Intrinsics.checkNotNullParameter(ne2, "<this>");
        return ne2.d().M(Charsets.UTF_8);
    }
}
