package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class Ai extends C5332on {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RunnableC5601zi f75528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ICommonExecutor f75529e;

    public Ai(@NonNull C5058e5 c5058e5, @NonNull Ol ol, @NonNull ICommonExecutor iCommonExecutor) {
        super(c5058e5, ol);
        this.f75528d = new RunnableC5601zi(this);
        this.f75529e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C5332on
    public final void a() {
        this.f75529e.remove(this.f75528d);
    }

    @Override // io.appmetrica.analytics.impl.C5332on
    public final void f() {
        this.f77930b.a();
        C5351ph c5351ph = (C5351ph) ((C5058e5) this.f77929a).f77072k.a();
        if (c5351ph.f77990k.a(c5351ph.f77989j)) {
            String str = c5351ph.f77992m;
            if (TextUtils.isEmpty(str) || com.ironsource.X1.f42014f.equals(str)) {
                return;
            }
            try {
                a(C5016ce.a((C5058e5) this.f77929a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C5332on
    public final void g() {
        this.f75529e.executeDelayed(this.f75528d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f77931c.get()) {
            return;
        }
        this.f75529e.remove(this.f75528d);
        if (((C5351ph) ((C5058e5) this.f77929a).f77072k.a()).f77986g > 0) {
            this.f75529e.executeDelayed(this.f75528d, TimeUnit.SECONDS.toMillis(((C5351ph) ((C5058e5) this.f77929a).f77072k.a()).f77986g));
        }
    }
}
