package com.inmobi.media;

import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes9.dex */
public final class Al extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ref$BooleanRef f36583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ref$BooleanRef f36584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f36585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fl f36586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36587e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Al(Fl fl, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f36586d = fl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36585c = obj;
        this.f36587e |= Integer.MIN_VALUE;
        return Fl.b(this.f36586d, (XmlPullParser) null, this);
    }
}
