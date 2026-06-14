package com.inmobi.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class Fm extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaPlayer f36887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3878m9 f36888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f36889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f36891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36892f;

    public Fm(kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36891e = obj;
        this.f36892f |= Integer.MIN_VALUE;
        return Mm.a((MediaPlayer) null, (ArrayList) null, (C3903n9) null, this);
    }
}
