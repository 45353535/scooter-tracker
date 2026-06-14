package com.iab.omid.library.vungle.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.internal.c;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.internal.f;
import com.iab.omid.library.vungle.internal.i;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import com.iab.omid.library.vungle.publisher.b;
import com.iab.omid.library.vungle.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f36335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f36336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f36337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.vungle.weakreference.a f36338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f36339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f36342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f36344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f36345k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f36343i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f36344j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f36341g) {
            return;
        }
        this.f36337c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f36342h;
    }

    public AdSessionStatePublisher d() {
        return this.f36339e;
    }

    public View e() {
        return this.f36338d.get();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f36341g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f36337c.a();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void finish() {
        if (this.f36341g) {
            return;
        }
        this.f36338d.clear();
        removeAllFriendlyObstructions();
        this.f36341g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f36339e = null;
        this.f36345k = null;
    }

    public boolean g() {
        return this.f36345k != null;
    }

    public boolean h() {
        return this.f36340f && !this.f36341g;
    }

    public boolean i() {
        return this.f36341g;
    }

    public boolean j() {
        return this.f36336b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f36336b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f36340f;
    }

    void m() {
        a();
        d().g();
        this.f36343i = true;
    }

    void n() {
        b();
        d().h();
        this.f36344j = true;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f36341g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f36341g) {
            return;
        }
        this.f36337c.b();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f36341g) {
            return;
        }
        this.f36337c.c(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f36345k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void start() {
        if (this.f36340f || this.f36339e == null) {
            return;
        }
        this.f36340f = true;
        c.c().c(this);
        this.f36339e.a(i.c().b());
        this.f36339e.a(com.iab.omid.library.vungle.internal.a.a().b());
        this.f36339e.a(this, this.f36335a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f36337c = new f();
        this.f36340f = false;
        this.f36341g = false;
        this.f36336b = adSessionConfiguration;
        this.f36335a = adSessionContext;
        this.f36342h = str;
        b(null);
        this.f36339e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.vungle.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f36339e.i();
        c.c().a(this);
        this.f36339e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f36338d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f36338d = new com.iab.omid.library.vungle.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.vungle.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.vungle.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f36345k.onPossibleObstructionsDetected(this.f36342h, arrayList);
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f36344j = true;
    }
}
