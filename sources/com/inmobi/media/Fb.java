package com.inmobi.media;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class Fb extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f36839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f36840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f36841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Jb f36842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36843e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fb(Jb jb2, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f36842d = jb2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36841c = obj;
        this.f36843e |= Integer.MIN_VALUE;
        return this.f36842d.a((Context) null, this);
    }
}
