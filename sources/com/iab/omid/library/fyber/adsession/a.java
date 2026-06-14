package com.iab.omid.library.fyber.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.fyber.internal.c;
import com.iab.omid.library.fyber.internal.e;
import com.iab.omid.library.fyber.internal.f;
import com.iab.omid.library.fyber.internal.i;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import com.iab.omid.library.fyber.publisher.b;
import com.iab.omid.library.fyber.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f34993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f34994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f34995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.fyber.weakreference.a f34996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f34997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f34998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f35000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f35003k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f35001i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f35002j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f34999g) {
            return;
        }
        this.f34995c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f35000h;
    }

    public AdSessionStatePublisher d() {
        return this.f34997e;
    }

    public View e() {
        return this.f34996d.get();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f34999g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f34995c.a();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void finish() {
        if (this.f34999g) {
            return;
        }
        this.f34996d.clear();
        removeAllFriendlyObstructions();
        this.f34999g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f34997e = null;
        this.f35003k = null;
    }

    public boolean g() {
        return this.f35003k != null;
    }

    public boolean h() {
        return this.f34998f && !this.f34999g;
    }

    public boolean i() {
        return this.f34999g;
    }

    public boolean j() {
        return this.f34994b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f34994b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f34998f;
    }

    void m() {
        a();
        d().g();
        this.f35001i = true;
    }

    void n() {
        b();
        d().h();
        this.f35002j = true;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f34999g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f34999g) {
            return;
        }
        this.f34995c.b();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f34999g) {
            return;
        }
        this.f34995c.c(view);
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f35003k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void start() {
        if (this.f34998f || this.f34997e == null) {
            return;
        }
        this.f34998f = true;
        c.c().c(this);
        this.f34997e.a(i.c().b());
        this.f34997e.a(com.iab.omid.library.fyber.internal.a.a().b());
        this.f34997e.a(this, this.f34993a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f34995c = new f();
        this.f34998f = false;
        this.f34999g = false;
        this.f34994b = adSessionConfiguration;
        this.f34993a = adSessionContext;
        this.f35000h = str;
        b(null);
        this.f34997e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.fyber.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f34997e.i();
        c.c().a(this);
        this.f34997e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f34996d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f34996d = new com.iab.omid.library.fyber.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.fyber.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.fyber.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f35003k.onPossibleObstructionsDetected(this.f35000h, arrayList);
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f35002j = true;
    }
}
