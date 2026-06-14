package com.inmobi.media;

import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.inmobi.media.ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4089ul extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XmlPullParser f39696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f39697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function1 f39698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f39699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fl f39700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39701f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4089ul(Fl fl, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39700e = fl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39699d = obj;
        this.f39701f |= Integer.MIN_VALUE;
        return this.f39700e.a((XmlPullParser) null, (String) null, (Function1) null, this);
    }
}
