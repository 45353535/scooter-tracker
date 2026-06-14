package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes10.dex */
public class c extends FutureTask<h> implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f46948a;

    c(h hVar) {
        super(hVar, null);
        this.f46948a = hVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        h hVar = this.f46948a;
        com.mbridge.msdk.config.component.load.downloader.c cVar2 = hVar.f47004a;
        h hVar2 = cVar.f46948a;
        com.mbridge.msdk.config.component.load.downloader.c cVar3 = hVar2.f47004a;
        return cVar2 == cVar3 ? hVar.f47005b - hVar2.f47005b : cVar3.ordinal() - cVar2.ordinal();
    }
}
