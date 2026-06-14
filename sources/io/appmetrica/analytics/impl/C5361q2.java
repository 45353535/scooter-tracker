package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5361q2 extends Wg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zo f78023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5022ck f78024c;

    public C5361q2(@NonNull C5058e5 c5058e5) {
        this(c5058e5, c5058e5.u(), C5022ck.c());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NonNull W5 w52) {
        C5058e5 c5058e5 = this.f76636a;
        if (!this.f78023b.c() && !this.f78023b.d()) {
            if (((C5351ph) c5058e5.f77072k.a()).f77984e) {
                this.f78024c.b();
            }
            R8 r82 = this.f76636a.f77073l;
            if (r82.f76344c == null) {
                r82.a();
            }
            T8 t82 = r82.f76344c;
            t82.getClass();
            t82.f76491b = new HashSet();
            t82.f76493d = 0;
            T8 t83 = r82.f76344c;
            t83.f76490a = true;
            W8 w82 = r82.f76343b;
            IBinaryDataHelper iBinaryDataHelper = w82.f76632c;
            V8 v82 = w82.f76631b;
            w82.f76630a.getClass();
            iBinaryDataHelper.insert("event_hashes", v82.toByteArray(U8.a(t83)));
        }
        return false;
    }

    public C5361q2(C5058e5 c5058e5, zo zoVar, C5022ck c5022ck) {
        super(c5058e5);
        this.f78023b = zoVar;
        this.f78024c = c5022ck;
    }
}
