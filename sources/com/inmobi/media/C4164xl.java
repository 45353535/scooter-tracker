package com.inmobi.media;

import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.inmobi.media.xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4164xl extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f39945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f39946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fl f39947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4164xl(Fl fl, Continuation continuation, Ref$BooleanRef ref$BooleanRef, XmlPullParser xmlPullParser) {
        super(1, continuation);
        this.f39945b = xmlPullParser;
        this.f39946c = ref$BooleanRef;
        this.f39947d = fl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        XmlPullParser xmlPullParser = this.f39945b;
        return new C4164xl(this.f39947d, continuation, this.f39946c, xmlPullParser);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4164xl) create((Continuation) obj)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws XmlPullParserException, C4064tl, IOException {
        Object objG = pf.b.g();
        int i10 = this.f39944a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            String name = this.f39945b.getName();
            if (Intrinsics.areEqual(name, com.taurusx.tax.f.w.f66048w)) {
                Ref$BooleanRef ref$BooleanRef = this.f39946c;
                if (!ref$BooleanRef.f93279b) {
                    ref$BooleanRef.f93279b = true;
                    this.f39947d.g(this.f39945b);
                }
            } else if (Intrinsics.areEqual(name, com.taurusx.tax.f.w.f66049y)) {
                Ref$BooleanRef ref$BooleanRef2 = this.f39946c;
                if (!ref$BooleanRef2.f93279b) {
                    ref$BooleanRef2.f93279b = true;
                    Fl fl = this.f39947d;
                    XmlPullParser xmlPullParser = this.f39945b;
                    this.f39944a = 1;
                    if (Fl.c(fl, xmlPullParser, this) == objG) {
                        return objG;
                    }
                }
            } else {
                Fl fl2 = this.f39947d;
                XmlPullParser xmlPullParser2 = this.f39945b;
                fl2.getClass();
                Fl.w(xmlPullParser2);
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
