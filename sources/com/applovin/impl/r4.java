package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.p0;
import com.applovin.impl.r2;

/* JADX INFO: loaded from: classes6.dex */
public class r4 extends r2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p0.a f10348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f10349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f10350p;

    public r4(p0.a aVar, boolean z10, Context context) {
        super(r2.c.RIGHT_DETAIL);
        this.f10348n = aVar;
        this.f10349o = context;
        this.f10276c = new SpannedString(aVar.a());
        this.f10350p = z10;
    }

    @Override // com.applovin.impl.r2
    public SpannedString f() {
        return new SpannedString(this.f10348n.a(this.f10349o));
    }

    @Override // com.applovin.impl.r2
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.r2
    public boolean p() {
        Boolean boolB = this.f10348n.b(this.f10349o);
        if (boolB != null) {
            return boolB.equals(Boolean.valueOf(this.f10350p));
        }
        return false;
    }
}
