package com.inmobi.media;

import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes9.dex */
public final class Bl extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f36636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fl f36637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f36638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f36639e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bl(XmlPullParser xmlPullParser, Fl fl, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, Continuation continuation) {
        super(1, continuation);
        this.f36636b = xmlPullParser;
        this.f36637c = fl;
        this.f36638d = ref$BooleanRef;
        this.f36639e = ref$BooleanRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Bl(this.f36636b, this.f36637c, this.f36638d, this.f36639e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Bl) create((Continuation) obj)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
        boolean z10;
        Object objG = pf.b.g();
        int i10 = this.f36635a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            String name = this.f36636b.getName();
            if (Intrinsics.areEqual(name, "Error")) {
                C4107ve c4107veA = this.f36637c.a("error", this.f36636b);
                if (c4107veA != null) {
                    this.f36637c.f36880h.add(c4107veA);
                }
            } else if (Intrinsics.areEqual(name, com.taurusx.tax.f.t.f66040o)) {
                Fl fl = this.f36637c;
                XmlPullParser xmlPullParser = this.f36636b;
                fl.getClass();
                try {
                    z10 = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "conditionalAd"));
                } catch (Exception unused) {
                    z10 = false;
                }
                if (z10) {
                    this.f36638d.f93279b = true;
                    Fl fl2 = this.f36637c;
                    XmlPullParser xmlPullParser2 = this.f36636b;
                    fl2.getClass();
                    Fl.w(xmlPullParser2);
                    return Unit.f93236a;
                }
                Ref$BooleanRef ref$BooleanRef = this.f36639e;
                if (ref$BooleanRef.f93279b) {
                    Fl fl3 = this.f36637c;
                    XmlPullParser xmlPullParser3 = this.f36636b;
                    fl3.getClass();
                    Fl.w(xmlPullParser3);
                    return Unit.f93236a;
                }
                ref$BooleanRef.f93279b = true;
                Fl fl4 = this.f36637c;
                XmlPullParser xmlPullParser4 = this.f36636b;
                this.f36635a = 1;
                if (Fl.a(fl4, xmlPullParser4, this) == objG) {
                    return objG;
                }
            } else {
                Fl fl5 = this.f36637c;
                XmlPullParser xmlPullParser5 = this.f36636b;
                fl5.getClass();
                Fl.w(xmlPullParser5);
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
