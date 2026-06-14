package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.inmobi.media.zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4214zl extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f40075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f40076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fl f40077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4214zl(Fl fl, Continuation continuation, Ref$BooleanRef ref$BooleanRef, XmlPullParser xmlPullParser) {
        super(1, continuation);
        this.f40075b = xmlPullParser;
        this.f40076c = ref$BooleanRef;
        this.f40077d = fl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        XmlPullParser xmlPullParser = this.f40075b;
        return new C4214zl(this.f40077d, continuation, this.f40076c, xmlPullParser);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4214zl) create((Continuation) obj)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f40074a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            if (Intrinsics.areEqual(this.f40075b.getName(), "VAST")) {
                this.f40076c.f93279b = true;
                Fl fl = this.f40077d;
                XmlPullParser xmlPullParser = this.f40075b;
                this.f40074a = 1;
                if (Fl.b(fl, xmlPullParser, this) == objG) {
                    return objG;
                }
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
