package sg.bigo.ads.ad.c;

import sg.bigo.ads.api.core.f;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f100405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f100406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f100407c;

    public c(f fVar) {
        this.f100405a = 2;
        this.f100406b = 0;
        this.f100407c = 1;
        if (fVar == null) {
            return;
        }
        this.f100405a = fVar.f102174a.ao();
        this.f100406b = fVar.f102174a.ap();
        this.f100407c = fVar.f102174a.aq();
    }
}
