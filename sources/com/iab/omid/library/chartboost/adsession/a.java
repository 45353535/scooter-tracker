package com.iab.omid.library.chartboost.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.chartboost.internal.c;
import com.iab.omid.library.chartboost.internal.e;
import com.iab.omid.library.chartboost.internal.f;
import com.iab.omid.library.chartboost.internal.i;
import com.iab.omid.library.chartboost.publisher.AdSessionStatePublisher;
import com.iab.omid.library.chartboost.publisher.b;
import com.iab.omid.library.chartboost.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f34738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f34739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f34740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.chartboost.weakreference.a f34741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f34742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f34743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f34745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f34748k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f34746i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f34747j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f34744g) {
            return;
        }
        this.f34740c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f34745h;
    }

    public AdSessionStatePublisher d() {
        return this.f34742e;
    }

    public View e() {
        return this.f34741d.get();
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f34744g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f34740c.a();
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void finish() {
        if (this.f34744g) {
            return;
        }
        this.f34741d.clear();
        removeAllFriendlyObstructions();
        this.f34744g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f34742e = null;
        this.f34748k = null;
    }

    public boolean g() {
        return this.f34748k != null;
    }

    public boolean h() {
        return this.f34743f && !this.f34744g;
    }

    public boolean i() {
        return this.f34744g;
    }

    public boolean j() {
        return this.f34739b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f34739b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f34743f;
    }

    void m() {
        a();
        d().g();
        this.f34746i = true;
    }

    void n() {
        b();
        d().h();
        this.f34747j = true;
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f34744g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f34744g) {
            return;
        }
        this.f34740c.b();
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f34744g) {
            return;
        }
        this.f34740c.c(view);
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f34748k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.chartboost.adsession.AdSession
    public void start() {
        if (this.f34743f || this.f34742e == null) {
            return;
        }
        this.f34743f = true;
        c.c().c(this);
        this.f34742e.a(i.c().b());
        this.f34742e.a(com.iab.omid.library.chartboost.internal.a.a().b());
        this.f34742e.a(this, this.f34738a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f34740c = new f();
        this.f34743f = false;
        this.f34744g = false;
        this.f34739b = adSessionConfiguration;
        this.f34738a = adSessionContext;
        this.f34745h = str;
        b(null);
        this.f34742e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.chartboost.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f34742e.i();
        c.c().a(this);
        this.f34742e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f34741d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f34741d = new com.iab.omid.library.chartboost.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.chartboost.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.chartboost.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f34748k.onPossibleObstructionsDetected(this.f34745h, arrayList);
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f34747j = true;
    }
}
