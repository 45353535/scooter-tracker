package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes9.dex */
public final class El extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f36810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fl f36811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f36812d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public El(Fl fl, Continuation continuation, Ref$BooleanRef ref$BooleanRef, XmlPullParser xmlPullParser) {
        super(1, continuation);
        this.f36810b = xmlPullParser;
        this.f36811c = fl;
        this.f36812d = ref$BooleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new El(this.f36811c, continuation, this.f36812d, this.f36810b);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((El) create((Continuation) obj)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        if (r1.a((java.lang.String) r5, r4) != r0) goto L55;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws org.xmlpull.v1.XmlPullParserException, com.inmobi.media.C4064tl, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.El.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
