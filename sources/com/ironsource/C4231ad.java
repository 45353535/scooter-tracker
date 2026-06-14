package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4231ad extends AbstractC4511r3 {

    @NotNull
    public static final C4231ad P;

    /* JADX INFO: renamed from: com.ironsource.ad$a */
    public static final class a {
        public final void a() throws JSONException {
            new U9().b(ContextProvider.getInstance().getApplicationContext());
            C4231ad.P.a(new C4649z5(A5.INIT_DEFERRED_DATA, new C4227a9().a()));
        }
    }

    static {
        C4231ad c4231ad = new C4231ad();
        P = c4231ad;
        c4231ad.H = "outcome";
        c4231ad.G = 0;
        c4231ad.I = IronSourceConstants.PIXEL_EVENT_TYPE;
        c4231ad.e();
    }

    private C4231ad() {
    }

    @Override // com.ironsource.AbstractC4511r3
    protected void a(@Nullable ArrayList<C4649z5> arrayList) {
    }

    @Override // com.ironsource.AbstractC4511r3
    protected int c(@Nullable C4649z5 c4649z5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC4511r3
    protected void d() {
    }

    @Override // com.ironsource.AbstractC4511r3
    @NotNull
    protected String e(int i10) {
        return "";
    }

    @Override // com.ironsource.AbstractC4511r3
    protected void f(@Nullable C4649z5 c4649z5) {
    }

    @Override // com.ironsource.AbstractC4511r3
    protected boolean g(@Nullable C4649z5 c4649z5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4511r3
    protected boolean h(@Nullable C4649z5 c4649z5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4511r3
    protected boolean j(@Nullable C4649z5 c4649z5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4511r3
    protected boolean d(@Nullable C4649z5 c4649z5) {
        return true;
    }
}
