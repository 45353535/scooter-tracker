package sg.bigo.ads.common.u.c;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.g;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements c<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f102764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f102765b;

    public d(@NonNull a aVar) {
        this.f102764a = aVar;
        this.f102765b = g.a(aVar.f102757b);
    }

    @NonNull
    public final String a() {
        return this.f102765b;
    }

    @Nullable
    public final String a(String str) {
        return this.f102764a.a(str);
    }
}
