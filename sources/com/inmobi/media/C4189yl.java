package com.inmobi.media;

import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.inmobi.media.yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4189yl extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ref$BooleanRef f40016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fl f40018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4189yl(Fl fl, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f40018c = fl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f40017b = obj;
        this.f40019d |= Integer.MIN_VALUE;
        return this.f40018c.a((XmlPullParser) null, this);
    }
}
