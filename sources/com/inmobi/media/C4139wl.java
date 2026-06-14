package com.inmobi.media;

import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.inmobi.media.wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4139wl extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ref$BooleanRef f39874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fl f39876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4139wl(Fl fl, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39876c = fl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39875b = obj;
        this.f39877d |= Integer.MIN_VALUE;
        return Fl.a(this.f39876c, (XmlPullParser) null, this);
    }
}
